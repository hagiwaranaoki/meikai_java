package exec15;

/*
 * クラス名:Exercise15_5
 * 概要:三人でじゃんけんをする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_5 {
	// プレーヤがグーを出すときの定数
	static final int PLAYER_ROCK = 1;
	// プレーヤがチョキを出すときの定数
	static final int PLAYER_SCISSORS = 2;
	// プレーヤがパーを出すときの定数
	static final int PLAYER_PAPER = 3;
	// ComputerPlayerの手の補正値を表す定数
	// 人間プレーヤと同じ1,2,3で値が返るようにする
	static final int COMPUTER_HAND_ADJUSTMENT = 1;

	/*
	 * 関数名:main
	 * 概要:三人でじゃんけんをする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// HumanPlayerオブジェクトを生成
		HumanPlayer humanPlayer = new HumanPlayer();
		// ConputerPlayerオブジェクトを生成
		ComputerPlayer firstComputerPlayer = new ComputerPlayer();
		// ComputerPlayerオブジェクトを生成
		ComputerPlayer secondComputerPlayer = new ComputerPlayer();

		// 人間プレーヤの手を取得
		int humanChoice = humanPlayer.getNumber();
		// コンピュータ1の手を取得
		int firstComputerHands = firstComputerPlayer.getNumber() + COMPUTER_HAND_ADJUSTMENT;
		// コンピュータ2の手を取得
		int secondComputerHands = secondComputerPlayer.getNumber() + COMPUTER_HAND_ADJUSTMENT;

		// 人間プレーヤの手を表示
		System.out.println(humanPlayer);
		// コンピュータ１の手を表示
		System.out.println("コンピュータ1：" + getHand(firstComputerHands));
		// コンピュータ2の手を表示
		System.out.println("コンピュータ2：" + getHand(secondComputerHands));

		// じゃんけん結果を取得して表示
		getResult(humanChoice, firstComputerHands, secondComputerHands);
	}

	/*
	 * 関数名:getHand
	 * 概要:プレーヤ手を取得
	 * 引数:プレーヤが選択した手
	 * 戻り値:じゃんけんで出した手の文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/26
	 */
	private static String getHand(int userChoice) {
		// 手によって切り替える
		switch (userChoice) {
		// 手が1の時
		case PLAYER_ROCK:
			// グーを返す
			return "グー";
		// 手が2の時
		case PLAYER_SCISSORS:
			//チョキを返す
			return "チョキ";
		// 手が3の時
		case PLAYER_PAPER:
			// パーを返す
			return "パー";
		// どれでもない値が来たとき
		default:
			// 不明を返す
			return "不明";
		}
	}

	/*
	 * 関数名:getResult
	 * 概要:結果を出力
	 * 引数:人間、コンピュータ1、コンピュータ2が出した手
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/26
	 */
	private static void getResult(int humanPlayer, int firstComputer, int secondComputer) {
		// 引き分けの時のフラグ変数
		boolean isDraw = false;

		// 全員の手が同じ場合
		if (humanPlayer == firstComputer && firstComputer == secondComputer) {
			// あいこ判定にする
			isDraw = true;
		}

		// 全員の手が違う場合
		if (humanPlayer != firstComputer && firstComputer != secondComputer && humanPlayer != secondComputer) {
			// あいこ判定にする
			isDraw = true;
		}

		// あいこ判定になっている場合
		if (isDraw) {
			// あいこを出力
			System.out.println("あいこです");
			// あいこではない場合
		} else {
			// 人間が勝つ場合のフラグ変数
			boolean humanWins = isWinner(humanPlayer, firstComputer) || isWinner(humanPlayer, secondComputer);
			// コンピュータ1が勝つ場合のフラグ変数
			boolean firstComputerWins = isWinner(firstComputer, humanPlayer) || isWinner(firstComputer, secondComputer);
			// コンピュータ2が勝つ場合のフラグ変数
			boolean secondComputerWins = isWinner(secondComputer, humanPlayer) || isWinner(secondComputer, firstComputer);

			// 人間とコンピュータ1が勝つ場合
			if (humanWins && firstComputerWins && !secondComputerWins) {
				// 人間とコンピュータ1の勝ちを知らせる
				System.out.println("あなたとコンピュータ1の勝ちです");
				// 人間とコンピュータ2が勝つ場合
			} else if (humanWins && secondComputerWins && !firstComputerWins) {
				// 人間とコンピュータ2の勝ちを知らせる
				System.out.println("あなたとコンピュータ2の勝ちです");
				// コンピュータ１とコンピュータ2が勝つ場合
			} else if (firstComputerWins && secondComputerWins && !humanWins) {
				// コンピュータ１とコンピュータ2の勝ちを知らせる
				System.out.println("コンピュータ1とコンピュータ2の勝ちです");
				// 人間が勝つ場合
			} else if (humanWins) {
				// 人間の勝ちを知らせる
				System.out.println("あなたの勝ちです");
				// コンピュータ1が勝つ場合
			} else if (firstComputerWins) {
				// コンピュータ1の勝ちを知らせる
				System.out.println("コンピュータ1の勝ちです");
				// コンピュータ2が勝つ場合
			} else if (secondComputerWins) {
				// コンピュータ2の勝ちを知らせる
				System.out.println("コンピュータ2の勝ちです");
				// それ以外の場合
			} else {
				// あいこを知らせる
				System.out.println("あいこです");
			}
		}
	}

	/*
	 * 関数名:isWinner
	 * 概要:２人の勝敗を調べる
	 * 引数:２人のプレーヤが出した手
	 * 戻り値:一つ目の変数のプレーヤが勝ったらtrue
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/26
	 */
	private static boolean isWinner(int firstPlayer, int secondPlayer) {
		// じゃんけんの結果により、勝敗を返す
		return (firstPlayer == PLAYER_ROCK && secondPlayer == PLAYER_SCISSORS)
				|| (firstPlayer == PLAYER_SCISSORS && secondPlayer == PLAYER_PAPER)
				|| (firstPlayer == PLAYER_PAPER && secondPlayer == PLAYER_ROCK);
	}
}