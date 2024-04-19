package exec09;

/*
 * クラス名:Period
 * 概要:開始日と終了日から構成される<期間>を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Period {
	// 開始日を表すフィールド
	private Day from;
	// 終了日を表すフィールド
	private Day to;

	/*
	* コンストラクタ名:Period
	* 概要:開始日と終了日を指定するコンストラクタ
	* 引数:Day型[dayFrom(開始日),dayTo(終了日)]
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Period(Day dayFrom, Day dayTo) {
		// 開始日を設定
		this.from = new Day(dayFrom);
		// 終了日を設定
		this.to = new Day(dayTo);
	}

	/*
	 * 関数名:getFrom
	 * 概要:開始日を取得
	 * 引数:なし
	 * 戻り値:開始日の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public Day getFrom() {
		// 開始日を返す
		return new Day(from);
	}

	/*
	 * 関数名:getTo
	 * 概要:終了を取得
	 * 引数:なし
	 * 戻り値:終了日の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public Day getTo() {
		// 終了日を返す
		return new Day(to);
	}

	/*
	 * 関数名:getSpec
	 * 概要:開始日と終了日を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public void putSpec() {
		// 開始日を表示
		System.out.println("開始日:" + from);
		// 終了日を表示
		System.out.println("終了日:" + to);
	}
}
