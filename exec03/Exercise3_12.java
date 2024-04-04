package exec03;
// Scannerライブラリの呼び出し
import java.util.Scanner;

public class Exercise3_12 {
	/*
	 * 関数名:main
	 * 概要:三つの整数値の最小値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数a：");
		// int型の変数aにコンソールから値を受け付け
		int a = scanner.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数b：");
		// int型の変数bにコンソールから値を受け付け
		int b = scanner.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数c：");
		// int型の変数cにコンソールから値を受け付け
		int c = scanner.nextInt();
		
		//int型の変数minimumにaを代入
		int minimum = a;
		// bよりもminimumが大きいとき
		if (b < minimum)
			// minimumにbを代入
			minimum = b;
		// cよりもminimumが大きいとき
		if (c < minimum)
			// minimumにcを代入
			minimum = c;
		// 最小値を出力
		System.out.println("最小値は" + minimum + "です。");
		// scannerの受付を終了
		scanner.close();
	}
}
