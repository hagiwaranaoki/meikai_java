package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
* クラス名:Exercise7_31
* 概要:int,long,float,double型の絶対値を求める
* 作成者:N.Hagiwara
* 作成日:2024/04/09
*/
public class Exercise7_31 {

	/*
	 * 関数名:absolute
	 * 概要:int型の数値の絶対値を求める
	 * 引数:int型の変数x
	 * 戻り値:絶対値[x]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static int absolute(int x) {
		// xが負の場合
		if (x < 0) {
			// 符号の反転
			x = -x;
		}
		// 絶対値を返す
		return x;
	}

	/*
	 * 関数名:absolute
	 * 概要:long型の数値の絶対値を求める
	 * 引数:long型の変数x
	 * 戻り値:絶対値[x]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static long absolute(long x) {
		// xが負の場合
		if (x < 0) {
			// 符号を反転
			x = -x;
		}
		// 絶対値を返す
		return x;
	}

	/*
	 * 関数名:absolute
	 * 概要:float型の数値の絶対値を求める
	 * 引数:float型の変数x
	 * 戻り値:絶対値[x]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static float absolute(float x) {
		// xが負の場合
		if (x < 0) {
			// 符号を反転
			x = -x;
		}
		// 絶対値を返す
		return x;
	}

	/*
	 * 関数名:absolute
	 * 概要:double型の数値の絶対値を求める
	 * 引数:double型の変数x
	 * 戻り値:絶対値[x]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static double absolute(double x) {
		// xが負の場合
		if (x < 0) {
			// 符号を反転
			x = -x;
		}
		// 絶対値を返す
		return x;
	}

	/*
	 * 関数名:main
	 * 概要:int,long,float,double型の絶対値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// int型の数値の入力を促す
		System.out.print("int型の数値を入力してください: ");
		// int型の変数に入力値を代入
		int integerNumber = standardInput.nextInt();
		// int型の数値の絶対値を求め、結果を出力
		System.out.println("int型の絶対値: " + absolute(integerNumber));

		// long型の数値の入力を促す
		System.out.print("long型の数値を入力してください: ");
		// long型の変数に入力値を代入
		long longNumber = standardInput.nextLong();
		// long型の数値の絶対値を求め、結果を出力
		System.out.println("long型の絶対値: " + absolute(longNumber));

		// float型の数値の入力を促す
		System.out.print("float型の数値を入力してください: ");
		// float型の変数に入力値を代入
		float floatNumber = standardInput.nextFloat();
		// float型の数値の絶対値を求め、結果を出力
		System.out.println("float型の絶対値: " + absolute(floatNumber));

		// double型の数値の入力を促す
		System.out.print("double型の数値を入力してください: ");
		// double型の変数に入力値を代入
		double doubleNumber = standardInput.nextDouble();
		// double型の数値の絶対値を求め、結果を出力
		System.out.println("double型の絶対値: " + absolute(doubleNumber));
	}
}