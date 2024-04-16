package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_14
 * 概要:整数xのposビット目から連続するn個のビットを走査して表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_14 {
	//ビット数を格納する変数を宣言
	final static int BITS_NUMBER = 32;

	/*
	 * 関数名:printBits
	 * 概要:受け取った数値をビット表記する
	 * 引数:受け取った数値格納するint型変数[bitValue]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void printBits(int bitValue) {
		//カウントが0を下回ったらループ抜け
		for (int i = BITS_NUMBER - 1; i >= 0; i--) {
			//1/0を表示
			System.out.print(((bitValue >>> i & 1) == 1) ? '1' : '0');
		}
		//改行を出力
		System.out.println("\n");
	}

	/*
	 * 関数名:exponentiateBitShift
	 * 概要:受け取ったビット数bitRangeをもとに2のn乗-1を返す
	 * 引数:何ビット操作するかを受け取るint型変数[bitRange]
	 * 戻り値:2のn乗-1を返すint型変数[returnValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int exponentiateBitShift(int bitRange) {
		//戻り値を格納する変数を宣言
		int returnValue = 0;
		//操作するビット数が１の場合
		if (bitRange == 1) {
			//戻り値に１を代入
			returnValue = 1;
			//操作するビット数が２以上の場合
		} else {
			//２のべき乗値と合計値を格納する変数を宣言
			int exponentiationValue = 1, totalValue = 1;
			//カウントがビット数を受け取った引数と等しくなればループ抜け
			for (int i = 1; i < bitRange; i++) {
				//２のべき乗を計算
				exponentiationValue = exponentiationValue * 2;
				//２のべき乗を足し込む
				totalValue = totalValue + exponentiationValue;
			}
			//合計値を戻り値に代入
			returnValue = totalValue;
		}
		//戻り値を返す
		return returnValue;
	}

	/*
	 * 関数名:setN
	 * 概要:受け取った値をもとにxのposビット目からnビットを1にした値を返す
	 * 引数:整数を受け取るint型変数[x] 何ビット目かを受け取るint型変数[pos]
	 * 戻り値:xのposビット目の値を変化させた値を返すint型変数[returnValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int setN(int x, int pos, int n) {
		//exponentiateBitShiftメソッドを呼び出して返り値をnに代入
		n = exponentiateBitShift(n);
		//nをposビット左シフトした値とxの論理和を戻り値に代入
		int returnValue = (n << pos) | x;
		//戻り値を返す
		return returnValue;
	}

	/*
	 * 関数名:resetN
	 * 概要:受け取った値をもとにxのposビット目からnビットを0にした値を返す
	 * 引数:整数を受け取るint型変数[x] 何ビット目かを受け取るint型変数[pos]
	 * 戻り値:xのposビット目の値を変化させた値を返すint型変数[returnValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int resetN(int x, int pos, int n) {
		//exponentiateBitShiftメソッドを呼び出して返り値をnに代入
		n = exponentiateBitShift(n);
		//nをposビット左シフトした値を反転させた値とxの論理積を戻り値に代入
		int returnValue = (~(n << pos)) & x;
		//戻り値を返す
		return returnValue;
	}

	/*
	 * 関数名:inverseN
	 * 概要:受け取った値をもとにxのposビット目からnビットを反転した値を返す
	 * 引数:整数を受け取るint型変数[x] 何ビット目かを受け取るint型変数[pos]
	 * 戻り値:xのposビット目の値を変化させた値を返すint型変数[returnValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int inverseN(int x, int pos, int n) {
		//exponentiateBitShiftメソッドを呼び出して返り値をnに代入
		n = exponentiateBitShift(n);
		//nをposビット左シフトした値とxの排他的論理和を戻り値に代入
		int returnValue = (n << pos) ^ x;
		//戻り値を返す
		return returnValue;
	}

	/*
	 * 関数名:main
	 * 概要:整数値と操作するビットの場所とビット数を入力させsetN,resetN,inverseNメソッドを呼び出して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue = 0;
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		inputValue = scanInteger.nextInt();
		//printBitsメソッドを呼び出す
		printBits(inputValue);

		//を格納する変数を宣言ビット数を格納する変数を宣言
		int bitsCount = 0;
		//操作する最下位ビットを格納する変数を宣言
		int bitRange = 0;
		//後判定ループ文
		do {
			//ビット数の入力を促す
			System.out.print("操作する最下位ビット(最下位から0,1,2...):");
			//インスタンスから入力された値を受け取る
			bitsCount = scanInteger.nextInt();
			//31以下の正の数が入力されたらループ抜け
		} while (bitsCount < 0 || bitsCount >= BITS_NUMBER);
		//後判定ループ文
		do {
			//ビット数の入力を促す
			System.out.print("※" + bitsCount + "を最下位として連続するビットを操作\n操作するビット数:");
			//インスタンスから入力された値を受け取る
			bitRange = scanInteger.nextInt();
			//正の数が入力されたらループ抜け
		} while (bitRange < 1 || bitRange > BITS_NUMBER - bitsCount);

		//メソッドを呼び出して戻り値を表示
		System.out.println(
				inputValue + "の" + bitsCount + "ビット目から連続する" + bitRange + "ビットを1にした値は" + setN(inputValue, bitsCount, bitRange));
		//printBitsメソッドを呼び出す
		printBits(setN(inputValue, bitsCount, bitRange));
		//メソッドを呼び出して戻り値を表示
		System.out.println(inputValue + "の" + bitsCount + "ビット目から連続する" + bitRange + "ビットを0にした値は"
				+ resetN(inputValue, bitsCount, bitRange));
		//printBitsメソッドを呼び出す
		printBits(resetN(inputValue, bitsCount, bitRange));
		//メソッドを呼び出して戻り値を表示
		System.out.println(inputValue + "の" + bitsCount + "ビット目から連続する" + bitRange + "ビットを反転した値は"
				+ inverseN(inputValue, bitsCount, bitRange));
		//printBitsメソッドを呼び出す
		printBits(inverseN(inputValue, bitsCount, bitRange));

	}

}
