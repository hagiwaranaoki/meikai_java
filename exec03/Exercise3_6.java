package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_6
 * 概要:10の倍数かどうかを判別する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_6 {
	/*
	 * 関数名:main
	 * 概要:10の倍数かどうかを判別する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		// 改行なしで出力
		System.out.print("整数値：");
		// int型の変数にコンソールからの値を受け付け
		int integerNumber = standardInput.nextInt();
		// integerNumberが0より大きいとき
		if (integerNumber > 0) {
			// integerNumberが10で割り切れるとき
			if (integerNumber % 10 == 0) {
				// 文字列を改行ありで出力
				System.out.println("その値は10の倍数です。");
				// integerNumberが10で割り切れないとき
			} else {
				// 文字列を改行ありで出力
				System.out.println("その値は10の倍数ではありません。");
			}
			// integerNumberが0または0より小さいとき
		} else {
			// 文字列を改行ありで出力
			System.out.println("正でない値が入力されました。");
		}
		// scannerの受付を終了
		standardInput.close();
	}
}
