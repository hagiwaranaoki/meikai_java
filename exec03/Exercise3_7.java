package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_7 {
	/*
	 * 関数名:main
	 * 概要:3で割った際の結果を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
		//Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		// 改行なしで文字列を出力
		System.out.print("整数値：");
		// int型の変数numberにコンソールから値を受け付け
		int number = scanner.nextInt();
		
		// numberが0より大きいとき
		if (number > 0) {
			// numberが3で割り切れるとき
			if (number % 3 == 0) {
				// 文字列を改行ありで出力
				System.out.println("その値は3で割り切れます。");
			} else if (number % 3 == 1) {// numberが3で割って1余るとき
				// 文字列を改行ありで出力
				System.out.println("その値を3で割った余りは1です。");
			} else {// numberが3で割って2余るとき
				// 文字列を改行ありで出力
				System.out.println("その値を3で割った余りは2です。");
			}
		} else {// // numberが0より小さいまたは等しいとき
			// 文字列を改行ありで出力
			System.out.println("正でない値が入力されました。");
		}
		//scannerの受付を終了
		scanner.close();
	}
}