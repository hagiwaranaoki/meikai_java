package exec07;

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
		// int型の変数を定義
		int integerNumber = -82;
		// long型の変数を定義
		long longNumber = -71;
		// float型の変数を定義
		float floatNumber = -8.873f;
		// double型の変数を定義
		double doubleNumber = -4.8;
		// int型の数値の絶対値を求め、結果を出力
		System.out.println("int型の絶対値:" + absolute(integerNumber));
		// long型の数値の絶対値を求め、結果を出力
		System.out.println("long型の絶対値:" + absolute(longNumber));
		// float型の数値の絶対値を求め、結果を出力
		System.out.println("float型の絶対値:" + absolute(floatNumber));
		// double型の数値の絶対値を求め、結果を出力
		System.out.println("double型の絶対値:" + absolute(doubleNumber));
	}

}
