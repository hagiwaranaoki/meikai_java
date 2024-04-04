package exec03;
// Scanner雷雨らりの読み込み
import java.util.Scanner;

public class Exercise3_4 {
	/*
	 * 関数名:main
	 * 概要:二つの値を比べるメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("aの値：");
		// double型の変数aにコンソールから値を受け付け
		double a = scanner.nextDouble();
		
		// 文字列を改行なしで出力
		System.out.print("bの値：");
		// double型の変数bにコンソールから値を受け付け
		double b = scanner.nextDouble();
		
		// bよりaのほうが大きいとき
		if (a > b) {
			// 文字列を改行ありで出力
			System.out.println("aの方が大きいです。");
			// aよりbのほうが大きいとき
		} else if (a < b) {
			// 文字列を改行ありで出力
			System.out.println("bの方が大きいです。");
			// それ以外の時(aとbが等しいとき)
		} else {
			// 文字列を改行ありで出力
			System.out.println("aとbは同じ値です。");
		}
		// 文字列を改行ありで出力
		scanner.close();
	}
}
