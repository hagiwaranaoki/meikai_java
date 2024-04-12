package exec07;

/*
 * クラス名:Exercise7_32
 * 概要:byte,short,int,long型の内部のビットを表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Exercise7_32 {
	/*
	 * 関数名:printBits
	 * 概要:byte型の数値のビット構成を表示する
	 * 引数:byte型の変数x
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	static void printBits(byte x) {
		// byte型というタイトル出力
		System.out.printf("\nbyte型\n");
		// 32ビット全てを順に調べる
		for (int i = 31; i >= 0; i--) {
			// 各ビットが1か0かを判定し、その結果を出力
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:printBits
	 * 概要:short型の数値のビット構成を表示する
	 * 引数:short型の変数x
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	static void printBits(short x) {
		// short型というタイトル出力
		System.out.printf("\nshort型\n");
		// 32ビット全てを順に調べる
		for (int i = 31; i >= 0; i--) {
			// 各ビットが1か0かを判定
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:printBits
	 * 概要:int型の数値のビット構成を表示する
	 * 引数:int型の変数x
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	static void printBits(int x) {
		// int型というタイトル出力
		System.out.printf("\nint型\n");
		// 32ビット全てを順に調べる
		for (int i = 31; i >= 0; i--) {
			// 各ビットが1か0かを判定し、その結果を出力
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:printBits
	 * 概要:long型の数値のビット構成を表示する
	 * 引数:long型の変数x
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	static void printBits(long x) {
		// long型というタイトル出力
		System.out.printf("\nlong型\n");
		// 32ビット全てを順に調べる
		for (int i = 31; i >= 0; i--) {
			// 各ビットが1か0かを判定し、その結果を出力
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/*
	 * 関数名:main
	 * 概要:byte,short,int,long型の内部のビットを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static void main(String[] args) {
		// byte型の変数を定義
		byte byteNumber = -7;
		// short型の変数を定義
		short shortNumber = 8;
		// int型の変数を定義
		int integerNumber = 8;
		// long型の変数を定義
		long longNumber = 8;
		// byte型のビット構成を表示
		printBits(byteNumber);
		// short型のビット構成を表示
		printBits(shortNumber);
		// int型のビット構成を表示
		printBits(integerNumber);
		// long型のビット構成を表示
		printBits(longNumber);

	}

}
