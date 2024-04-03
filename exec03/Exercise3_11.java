package exec03;

// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_11 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値の値の差が10以下かどうかを調べる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数A：");
		// int型の変数aにコンソールから値を受け付け
		int a = scanner.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数B：");
		// int型の変数bにコンソールから値を受け付け
		int b = scanner.nextInt();
		
		// bよりaのほうが大きければnumberにa-bの値を代入、逆であればb-aの値を代入
		int number = a > b ? a - b : b - a;
		// numberの値が10以下の時
		if (number <= 10) {
			// 文字列を改行ありで出力
			System.out.println("それらの差は10以下です。");
		} else { // それ以外の時
			// 文字列を改行ありで出力
			System.out.println("それらの差は11以上です。");
		}
		// scannerの受付を終了
		scanner.close();
	}
}
