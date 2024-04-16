package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_12
 * 概要:xをnビット右に回転シフトした値とxをnビット左に回転シフトした値を表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_12 {
	/*
	 * 関数名:printBits
	 * 概要:受け取った数値をビット表記する
	 * 引数:受け取った数値格納するint型変数[bitValue]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void printBits(int bitValue) {
		//ビット数を格納する定数を宣言
		final int BITS_NUMBER = 32;
		//カウントが0を下回ったらループ抜け
		for (int i = BITS_NUMBER - 1; i >= 0; i--) {
			//1/0を表示
			System.out.print(((bitValue >>> i & 1) == 1) ? '1' : '0');
		}
		//改行を出力
		System.out.println();
	}

	/*
	 * 関数名:rRotate
	 * 概要:受け取ったxとnをもとにxをnビット右に回転シフトした値を返す
	 * 引数:整数値を受け取るint型変数[x] シフトするビット数を受け取るint型変数[n]
	 * 戻り値:xをnビット右シフトした変数とxを32-nビット左シフトした変数の合計 int型変数[returnValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int rRotate(int x, int n) {
		//ビット数を格納する定数を宣言
		final int BITS_NUMBER = 32;
		//nを32ビットで割った剰余を取得
		int shiftBits = n % BITS_NUMBER;
		//xをshiftBitsビット右シフトした変数とxを32-shiftBitsビット左シフトした変数の合計を代入する
		int returnValue = (x >>> shiftBits) | (x << (BITS_NUMBER - shiftBits));
		//合計を返す
		return returnValue;
	}

	/*
	 * 関数名:lRotate
	 * 概要:受け取ったxとnをもとにxをnビット左に回転シフトした値を返す
	 * 引数:整数値を受け取るint型変数[x] シフトするビット数を受け取るint型変数[n]
	 * 戻り値:xをnビット左シフトした変数とxを32-nビット右シフトした変数の合計 int型変数[returnValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int lRotate(int x, int n) {
		//ビット数を格納する定数を宣言
		final int BITS_NUMBER = 32;
		//nを32ビットで割った剰余を取得
		int shiftBits = n % BITS_NUMBER;
		//xをshiftBitsビット左シフトした変数とxを32-shiftBitsビット右シフトした変数の合計を代入する
		int returnValue = (x << shiftBits) | (x >>> (BITS_NUMBER - shiftBits));
		//合計を返す
		return returnValue;
	}

	/*
	 * 関数名:main
	 * 概要:整数値とシフトするビット数を入力させrRotateメソッドとlRotateメソッドを呼び出して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue = 0;
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		inputValue = scanner.nextInt();
		//シフトするビット数を格納する変数を宣言
		int shiftValue = 0;
		//後判定ループ文
		do {
			//ビット数の入力を促す
			System.out.print("シフトするビット数:");
			//インスタンスから入力された値を受け取る
			shiftValue = scanner.nextInt();
			//正の数が入力されたらループ抜け
		} while (shiftValue <= 0);

		//入力した値をビット表記にする
		System.out.print("入力した整数値のビット表記: ");
		// 現在のビット数を表示
		printBits(inputValue);
		//右シフトの結果を表示
		System.out.println(inputValue + "を右に" + shiftValue + "ビットシフトした値は" + rRotate(inputValue, shiftValue));
		//右シフトの数値をビット表記にする
		System.out.print("右シフト後のビット表記:      ");
		// 右シフトのビットを表示
		printBits(rRotate(inputValue, shiftValue));
		//左シフトの結果を表示
		System.out.println(inputValue + "を左に" + shiftValue + "ビットシフトした値は" + lRotate(inputValue, shiftValue));
		// 左シフトの結果をビット表記にする
		System.out.print("左シフト後のビット表記:      ");
		// 左シフトのビットを表示
		printBits(lRotate(inputValue, shiftValue));
	}
}