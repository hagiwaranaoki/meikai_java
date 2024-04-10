package exec04;

// Randomクラスをインポート
import java.util.Random;
// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_27
 * 概要:制限回数ありの乱数数当てゲーム
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_27 {
	/*
	 * 関数名:main
	 * 概要:制限回数ありの乱数数当てゲーム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Randomクラスのインスタンスを作成し、randomという名前をつける
		Random randomValue = new Random();
		// Scannerクラスのインスタンスを作成し、scannerという名前をつける
		Scanner standardInput = new Scanner(System.in);
		// ランダムの範囲用の定数を定義
		final int RANDOM_RANGE = 100;

		// 0~99のランダムな整数を生成
		int randomNumber = randomValue.nextInt(RANDOM_RANGE);

		// ゲーム開始のメッセージを出力
		System.out.println("数あてゲーム開始!!");
		// ゲーム開始のメッセージを出力
		System.out.println("0~99の数を当ててください。");

		// 制限回数を設定
		final int CONSOLE_LIMIT = 10;

		// 入力された数値を格納する変数を定義
		int integerNumber = 0;
		// 制限回数だけループを実行
		for (int i = 0; i < CONSOLE_LIMIT; i++) {
			// 文字列出力
			System.out.print("いくつかな：");
			// ユーザーからの入力を整数として受け取る
			integerNumber = standardInput.nextInt();

			// 入力値が正解より大きい場合、ヒントを出力
			if (integerNumber > randomNumber) {
				// 文字列出力
				System.out.println("もっと小さな数だよ");
				// 入力値が正解より小さい場合、ヒントを出力
			} else if (integerNumber < randomNumber) {
				// 文字列出力
				System.out.println("もっと大きな数だよ");
				// 入力値が正解と一致した場合、ループを抜ける
			} else if (integerNumber == randomNumber) {
				// 正解のメッセージを出力
				System.out.println("正解です。");
				// forから抜け出す
				break;
			}

			// 制限回数に達した場合、正解を表示してゲームを終了
			if (i == CONSOLE_LIMIT - 1) {
				// 出力
				System.out.println("制限回数に達しました。正解は" + randomNumber + "でした。");
			}
		}
	}
}
