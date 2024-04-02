package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_5 {
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数値：");
		// int型の変数numberにコンソールでタイを受け付け
		int number = scanner.nextInt();
		
		// numberが0より大きいとき
		if (number > 0) {
			// numberが5で割り切れるとき
			if (number % 5 == 0) {
				// 文字列を改行ありで出力
				System.out.println("その値は5で割り切れます。");
			} else {// numberが5で割り切れないとき
				// 文字列を改行ありで出力
				System.out.println("その値は5で割り切れません。");
			}
		} else {// numberが0より下または0の時
			// 文字列を改行ありで出力
			System.out.println("正でない値が入力されました。");
		}
		//scannerの受付を終了
		scanner.close();
	}
}