package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_7
 * 概要:3で割った際の結果を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_7 {
	/*
	 * 関数名:main
	 * 概要:3で割った際の結果を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		// 改行なしで文字列を出力
		System.out.print("整数値：");
		// 入力された整数値をコンソールで受け付け
		int integerNumber = standardInput.nextInt();
		
		// 入力された整数値が0より大きいとき
		if (integerNumber > 0) {
			// 入力された整数値が3で割り切れるとき
			if (integerNumber % 3 == 0) {
				// 文字列を改行ありで出力
				System.out.println("その値は3で割り切れます。");
				// 入力された整数値が3で割って1余るとき
			} else if (integerNumber % 3 == 1) {
				// 文字列を改行ありで出力
				System.out.println("その値を3で割った余りは1です。");
				// 入力された整数値が3で割って2余るとき
			} else {
				// 文字列を改行ありで出力
				System.out.println("その値を3で割った余りは2です。");
			}
			// 入力された整数値が0より小さいまたは等しいとき
		} else {
			// 文字列を改行ありで出力
			System.out.println("正でない値が入力されました。");
		}
		//standardInputの受付を終了
		standardInput.close();
	}
}