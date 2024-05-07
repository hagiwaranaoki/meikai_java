package exec13;

/*
 * クラス名:Exercise13_3
 * 概要:人間とコンピュータでじゃんけんをする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Exercise13_3 {
	// 人間プレーヤのグーを表す定数
	static final int HUMAN_ROCK = 1;
	// 人間プレーヤのチョキを表す定数
	static final int HUMAN_SCISSORS = 2;
	// 人間プレーヤのパーを表す定数
	static final int HUMAN_PAPER = 3;

	// コンピュータプレーヤのグーを表す定数
	static final int COMPUTER_ROCK = 0;
	// コンピュータプレーヤのチョキを表す定数
	static final int COMPUTER_SCISSORS = 1;
	// コンピュータプレーヤのパーを表す定数
	static final int COMPUTER_PAPER = 2;

	/*
	 * 関数名:main
	 * 概要:人間とコンピュータでじゃんけんをする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public static void main(String[] args) {
		// じゃんけんスタートの合図を表示
		System.out.println("じゃんけんスタート");
		// 人間プレーヤオブジェクトを生成
		HumanPlayer humanPlayer = new HumanPlayer();
		// 人間プレーヤ情報を出力
		humanPlayer.print();
		// コンピュータプレーヤオブジェクトを生成
		ComputerPlayer computerPlayer = new ComputerPlayer();
		// コンピュータプレーヤ情報を出力
		computerPlayer.print();
		// 人間プレーヤが出す手を取得
		int humanNumber = humanPlayer.getNumber();
		// コンピュータプレーヤが出す手を取得
		int computerNumber = computerPlayer.getNumber();

		// 人間プレーヤが勝ちの場合
		if (isHumanWin(humanNumber, computerNumber)) {
			// 勝ちメッセージ表示
			System.out.println("あなたの勝ちです！");
			// 人間が負けの場合
		} else if (isHumanLose(humanNumber, computerNumber)) {
			// 負けメッセージ表示
			System.out.println("あなたの負けです…");
			// あいこの場合
		} else if (isDrawn(humanNumber, computerNumber)) {
			// あいこメッセージ表示
			System.out.println("あいこです。");
		}
	}

	/*
	 * 関数名:isHumanWin
	 * 概要:人間プレーヤが勝ちかどうかを判定する
	 * 引数:人間の手、コンピュータの手
	 * 戻り値:人間プレーヤが勝っていたらtrue,負けていたらfalse
	 * 作成者:N.Hagiwara
	 * 作成日:2024/05/07
	 */
	private static boolean isHumanWin(int humanNumber, int computerNumber) {
		// 人間が勝っているかどうかの判定結果を返す
		return (humanNumber == HUMAN_ROCK && computerNumber == COMPUTER_SCISSORS)
				|| (humanNumber == HUMAN_SCISSORS && computerNumber == COMPUTER_PAPER)
				|| (humanNumber == HUMAN_PAPER && computerNumber == COMPUTER_ROCK);
	}

	/*
	 * 関数名:isHumanLose
	 * 概要:人間プレーヤが負けかどうかを判定する
	 * 引数:人間の手、コンピュータの手
	 * 戻り値:人間プレーヤが負けていたらtrue,負けていたらfalse
	 * 作成者:N.Hagiwara
	 * 作成日:2024/05/07
	 */
	private static boolean isHumanLose(int humanNumber, int computerNumber) {
		// 人間が負けているかどうかの判定を返す
		return (humanNumber == HUMAN_ROCK && computerNumber == COMPUTER_PAPER)
				|| (humanNumber == HUMAN_SCISSORS && computerNumber == COMPUTER_ROCK)
				|| (humanNumber == HUMAN_PAPER && computerNumber == COMPUTER_SCISSORS);
	}

	/*
	 * 関数名:isDrawn
	 * 概要:あいこかどうかを判定する
	 * 引数:人間の手、コンピュータの手
	 * 戻り値:あいこだったらtrue,それ以外ならfalse
	 * 作成者:N.Hagiwara
	 * 作成日:2024/05/07
	 */
	private static boolean isDrawn(int humanNumber, int computerNumber) {
		// あいこかどうかの判定を返す
		return (humanNumber == HUMAN_ROCK && computerNumber == COMPUTER_ROCK)
				|| (humanNumber == HUMAN_SCISSORS && computerNumber == COMPUTER_SCISSORS)
				|| (humanNumber == HUMAN_PAPER && computerNumber == COMPUTER_PAPER);
	}
}
