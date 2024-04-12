package exec07;

//Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_9
 * 概要:正の整数を読み込み表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_9 {
	/*
	 * 関数名:readPlusInt
	 * 概要:負の数や0の場合は再入力させ正の整数を読み込み表示
	 * 引数:なし
	 * 戻り値:int型変数[inputValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static int readPlusInt() {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("正の整数値:");
			//インスタンスから入力された値を受け取る
			inputValue = scanInteger.nextInt();
			//正の数が入力されたらループ抜け
		} while (inputValue <= 0);
		//入力値を代入する変数を返す
		return inputValue;
	}

	/*
	 * 関数名:main
	 * 概要:readPlusIntメソッドを呼び出して返り値を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//readPlusIntメソッドを呼び出して返り値を表示
		System.out.println(readPlusInt());
	}

}
