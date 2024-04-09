package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_13
 * 概要:1からnまでの和を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_13 {
	/*
	 * 関数名:main
	 * 概要:1からnまでの和を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);

		// ユーザーに1からnまでの和を求めることを告げる
		System.out.println("1からnまでの和を求めます");

		// 和を計算するための変数を定義
		int integerSum = 0;

		// nの値を初期化
		int n = 0;
		// ユーザーから正の整数値を入力してもらうまで繰り返す
		for (;;) {
			// nの値を求める
			System.out.print("nの値：");
			// ユーザーからのコンソールへの入力を待機
			n = standardInput.nextInt();
			// nが0以上ならば
			if (n > 0) {
				// ループから抜ける
				break;
			}
		}

		// 1からnまでの和を計算
		for (int i = 1; i <= n; i++) {
			// 合計を足していく
			integerSum += i;
		}

		// 1からnまでの和を出力
		System.out.println("1から" + n + "までの和は" + integerSum + "です");
		// scannerの受付を終了
		standardInput.close();
	}
}
