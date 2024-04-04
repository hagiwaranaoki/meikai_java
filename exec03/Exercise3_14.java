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
		Scanner standardInput = new Scanner(System.in);
		
		// 改行せずに文字列を出力
		System.out.print("整数a:");
		// 整数aにコンソールから値を受け付け
		int a = standardInput.nextInt();
		
		// 改行せずに文字列を出力
		System.out.print("整数b:");
		// 整数bにコンソールから値を受け付け
		int b = standardInput.nextInt();
		
		// 最小値を初期化
		int minimumValue = 0;
		// 最大値を初期化
		int maximumValue = 0;
		// 整数aより整数bのほうが大きいとき
		if (a < b) {
			// 最小値にaを代入
			minimumValue = a;
			// 最大値にbを代入
			maximumValue = b;
			// 改行ありで文字列を出力
			System.out.println("小さいほうの値は" + minimumValue + "です。");
			// 改行ありで文字列を出力
			System.out.println("大きいほうの値は" + maximumValue + "です。");
			// bよりaのほうが大きいとき
		} else if (b < a) {
			// 最小値にbを代入
			minimumValue = b;
			// 最大値にaを代入
			maximumValue = a;
			// 改行ありで文字列を出力
			System.out.println("小さいほうの値は" + minimumValue + "です。");
			// 改行ありで文字列を出力
			System.out.println("大きいほうの値は" + maximumValue + "です。");
			// 二つの値が等しいとき
		} else {
			// 改行ありで文字列を出力
			System.out.println("二つの値は同じです。");
		}
		//scannerを閉じる
		standardInput.close();
	}

}
