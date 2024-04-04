package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_6 {
	/*
	 * 関数名:main
	 * 概要:10の倍数かどうかを判別する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 改行なしで出力
		System.out.print("整数値：");
		// int型の整数numberにコンソールからの値を受け付け
		int number = scanner.nextInt();
		// numberが0より大きいとき
		if (number > 0) {
			// numberが10で割り切れるとき
			if (number % 10 == 0) {
				// 文字列を改行ありで出力
				System.out.println("その値は10の倍数です。");
			} else {// numberが10で割り切れないとき
				// 文字列を改行ありで出力
				System.out.println("その値は10の倍数ではありません。");
			}
		} else { // numberが0または0より小さいとき
			// 文字列を改行ありで出力
			System.out.println("正でない値が入力されました。");
		}
		// scannerの受付を終了
		scanner.close();
	}
}
