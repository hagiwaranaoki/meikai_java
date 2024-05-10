package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

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
	public static void printBits(byte x) {
		// byte型のビット用の定数
		final int BYTE_BIT = 7;
		// byte型というタイトル出力
		System.out.printf("\nbyte型\n");
		// 8ビット全てを順に調べる
		for (int i = BYTE_BIT; i >= 0; i--) {
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
	public static void printBits(short x) {
		// short型のビット用の定数
		final int SHORT_BIT = 15;
		// short型というタイトル出力
		System.out.printf("\nshort型\n");
		// 16ビット全てを順に調べる
		for (int i = SHORT_BIT; i >= 0; i--) {
			// 各ビットが1か0かを判定し、その結果を出力
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
	public static void printBits(int x) {
		// int型のビット用の定数
		final int INTEGER_BIT = 31;
		// int型というタイトル出力
		System.out.printf("\nint型\n");
		// 32ビット全てを順に調べる
		for (int i = INTEGER_BIT; i >= 0; i--) {
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
	public static void printBits(long x) {
		// ロング型のビット用の定数
		final int LONG_BIT = 63;
		// long型というタイトル出力
		System.out.printf("\nlong型\n");
		// 64ビット全てを順に調べる
		for (int i = LONG_BIT; i >= 0; i--) {
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
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// byte型の数値の入力を促す
		System.out.print("byte型の数値を入力してください: ");
		// byte型の変数に入力値を代入
		byte byteNumber = standardInput.nextByte();
		// byte型のビット構成を表示
		printBits(byteNumber);

		// short型の数値の入力を促す
		System.out.print("\nshort型の数値を入力してください: ");
		// short型の変数に入力値を代入
		short shortNumber = standardInput.nextShort();
		// short型のビット構成を表示
		printBits(shortNumber);

		// int型の数値の入力を促す
		System.out.print("\nint型の数値を入力してください: ");
		// int型の変数に入力値を代入
		int integerNumber = standardInput.nextInt();
		// int型のビット構成を表示
		printBits(integerNumber);

		// long型の数値の入力を促す
		System.out.print("\nlong型の数値を入力してください: ");
		// long型の変数に入力値を代入
		long longNumber = standardInput.nextLong();
		// long型のビット構成を表示
		printBits(longNumber);
	}
}