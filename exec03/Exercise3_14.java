package exec03;
// Scannerライブラリの呼び出し
import java.util.Scanner;
/*
 * クラス名:Exercise3_14
 * 概要:二つの値の大小を調べる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_14 {
	/*
	 * 関数名:main
	 * 概要:二つの値の大小を調べる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */

	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 改行せずに文字列を出力
		System.out.print("整数a:");
		// int型の変数aにコンソールから値を受け付け
		int a = scanner.nextInt();
		
		// 改行せずに文字列を出力
		System.out.print("整数b:");
		// int型の変数bにコンソールから値を受け付け
		int b = scanner.nextInt();
		
		// int型の変数minimumValueを定義
		int minimumValue = 0;
		// int型の変数maximumValueを定義
		int maximumValue = 0;
		// aよりbのほうが大きいとき
		if (a < b) {
			// minimumValueにaを代入
			minimumValue = a;
			// maximumValueにbを代入
			maximumValue = b;
			// 改行ありで文字列を出力
			System.out.println("小さいほうの値は" + minimumValue + "です。");
			// 改行ありで文字列を出力
			System.out.println("大きいほうの値は" + maximumValue + "です。");
			// bよりaのほうが大きいとき
		} else if (b < a) {
			// minimumValueにbを代入
			minimumValue = b;
			// maximumValueにaを代入
			maximumValue = a;
			// 改行ありで文字列を出力
			System.out.println("小さいほうの値は" + minimumValue + "です。");
			// 改行ありで文字列を出力
			System.out.println("大きいほうの値は" + maximumValue + "です。");
		} else {
			// 改行ありで文字列を出力
			System.out.println("二つの値は同じです。");
		}
		scanner.close();
	}

}
