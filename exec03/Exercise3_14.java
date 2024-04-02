package exec03;
// Scannerライブラリの呼び出し
import java.util.Scanner;
public class Exercise3_14 {

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
		
		// int型の変数minimumとmaximumを定義
		int minimum, maximum;
		// aよりbのほうが大きいとき
		if (a < b) {
			// minimumにaを代入
			minimum = a;
			// maximumにbを代入
			maximum = b;
			// 改行ありで文字列を出力
			System.out.println("小さいほうの値は" + minimum + "です。");
			// 改行ありで文字列を出力
			System.out.println("大きいほうの値は" + maximum + "です。");
			// bよりaのほうが大きいとき
		} else if (b < a) {
			// minimumにbを代入
			minimum = b;
			// maximumにaを代入
			maximum = a;
			// 改行ありで文字列を出力
			System.out.println("小さいほうの値は" + minimum + "です。");
			// 改行ありで文字列を出力
			System.out.println("大きいほうの値は" + maximum + "です。");
		} else {
			// 改行ありで文字列を出力
			System.out.println("二つの値は同じです。");
		}
	}

}
