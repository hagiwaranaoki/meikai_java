package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_11
 * 概要:正の整数値を0までカウントする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_11 {
	/*
	 * 関数名:main
	 * 概要:正の整数値を0までカウントする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);

		// カウントダウンする数値を格納する変数を定義
		int countdownNumber = 0;

		// ユーザーから正の整数値を入力してもらうまで繰り返す
		for (;;) {
			// 正の整数値の入力を求める
			System.out.print("正の整数値：");
			// コンソールから入力を受け取り
			countdownNumber = standardInput.nextInt();
			// カウントダウンが0以上ならば
			if (countdownNumber > 0) {
				// 入力の受付終了
				standardInput.close();
				// for文を抜ける
				break;
			}
		}
		// カウントダウンが0以上の時繰り返す
		for (int i = countdownNumber; i >= 0; i--) {
			// カウントダウンを表示
			System.out.println(i);
		}
	}
}