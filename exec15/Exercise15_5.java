package exec15;

// コンピュータプレーヤクラスをインポート
import exec13.ComputerPlayer;
// プレーヤクラスをインポート
import exec13.HumanPlayer;

/*
 * クラス名:Exercise15_5
 * 概要:三人でじゃんけんをする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_5 {
	/*
	 * 関数名:main
	 * 概要:三人でじゃんけんをする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {

		// 人間プレーヤの作成
		HumanPlayer humanPlayer = new HumanPlayer();
		// コンピュータプレーヤ1の作成
		ComputerPlayer firstComputerPlayer = new ComputerPlayer();
		// コンピュータプレーヤ2の作成
		ComputerPlayer secondComputerPlayer = new ComputerPlayer();

		// ユーザーの手を取得
		int userHands = humanPlayer.getNumber() - 1;
		// コンピュータ1の手を取得
		int firstComputerHands = firstComputerPlayer.getNumber();
		// コンピュータ2の手を取得
		int secondComputerHands = secondComputerPlayer.getNumber();

		// 結果判定をする
		int handsResult = (userHands + firstComputerHands + secondComputerHands) % 3;
		// 結果メッセージを初期化
		String resultMessage = null;

		// 結果判定によって分岐
		switch (handsResult) {

		// あいこの場合
		case 0:
			// 結果メッセージにあいこを入れる
			resultMessage = "あいこです";
			// 分岐から抜け出す
			break;
		// 1人だけ負け（2人勝ち）
		case 1:
			// ユーザーの手とコンピュータ1の手が同じとき
			if (userHands == firstComputerHands) {
				// ユーザとコンピュータ1の勝ちをメッセージに入れる
				resultMessage = "あなたとコンピュータ1の勝ちです";
				// ユーザーの手とコンピュータ2の手が同じとき
			} else if (userHands == secondComputerHands) {
				// ユーザとコンピュータ2の勝ちをメッセージに入れる
				resultMessage = "あなたとコンピュータ2の勝ちです";
				// それ以外の時
			} else {
				// コンピュータ二人の勝ちをメッセージに入れる
				resultMessage = "コンピュータ1とコンピュータ2の勝ちです";
			}
			// 分岐から抜ける
			break;
		// 2人だけ負け（1人勝ち）
		case 2:
			// ユーザーの手とコンピュータ1の手が同じとき
			if (userHands == firstComputerHands) {
				// コンピュータ2の勝ちをメッセージに入れる
				resultMessage = "コンピュータ2の勝ちです";
				// ユーザーの手とコンピュータ2の手が同じとき
			} else if (userHands == secondComputerHands) {
				// コンピュータ2の勝ちをメッセージに入れる
				resultMessage = "コンピュータ1の勝ちです";
				// それ以外の時
			} else {
				// ユーザの価値をメッセージに入れる
				resultMessage = "あなたの勝ちです";
			}
			// 分岐から抜ける
			break;
		// 予期せぬ値が入ったとき
		default:
			// 分岐から抜ける
			break;
		}

		// ユーザの手を表示
		humanPlayer.print();
		// コンピュータ1の手を表示
		firstComputerPlayer.print();
		// コンピュータ2の手を表示
		secondComputerPlayer.print();

		// 判定結果の表示
		System.out.println("結果：" + resultMessage);
	}

}
