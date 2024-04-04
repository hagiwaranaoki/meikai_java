package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_5
 * 概要:5で割り切れるかどうかを判別する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_5 {
	/*
	 * 関数名:main
	 * 概要:5で割り切れるかどうかを判別する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数値：");
		// 整数値をコンソールで受け付け
		int integerNumber =standardInput.nextInt();
		
		// 入力された整数値が0より大きいとき
		if (integerNumber > 0) {
			// 入力された整数値が5で割り切れるとき
			if (integerNumber % 5 == 0) {
				// 文字列を改行ありで出力
				System.out.println("その値は5で割り切れます。");
				// 入力された整数値が5で割り切れないとき
			} else {
				// 文字列を改行ありで出力
				System.out.println("その値は5で割り切れません。");
			}
			// 入力された整数値が0より下または0の時
		} else {
			// 文字列を改行ありで出力
			System.out.println("正でない値が入力されました。");
		}
		//scannerの受付を終了
		standardInput.close();
	}
}