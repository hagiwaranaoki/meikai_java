package exec13;

/*
 * クラス名:Exercise13_3
 * 概要:人間とコンピュータでじゃんけんをする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Exercise13_3 {
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
		if ((humanNumber == 1 && computerNumber == 1) || (humanNumber == 2 && computerNumber == 2)
				|| (humanNumber == 3 && computerNumber == 0)) {
			// 勝ちメッセージ表示
			System.out.println("あなたの勝ちです！");
			// 人間が負けの場合
		} else if ((humanNumber == 1 && computerNumber == 2) || (humanNumber == 2 && computerNumber == 0)
				|| (humanNumber == 3 && computerNumber == 1)) {
			// 負けメッセージ表示
			System.out.println("あなたの負けです…");
			// それ以外の場合
		} else {
			// あいこメッセージ表示
			System.out.println("あいこです。");
		}
	}
}
