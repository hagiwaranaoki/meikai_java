package exec09;

/*
 * クラス名:Exercise9_5
 * 概要:Periodクラスの確認をする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise9_5 {
	/*
	 * 関数名:main
	 * 概要:Periodクラスの確認をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// 開始年の定数
		final int FROM_YEAR = 2000;
		// 開始月の定数
		final int FROM_MONTH = 1;
		// 開始日の定数
		final int FROM_DAY = 1;
		// 終了年の定数
		final int TO_YEAR = 2024;
		// 終了月の定数
		final int TO_MONTH = 4;
		// 終了日の定数
		final int TO_DAY = 10;
		
		// 開始日のDayオブジェクトを生成
		Day fromDay = new Day(FROM_YEAR, FROM_MONTH, FROM_DAY);
		// 終了日のDayオブジェクトを生成
		Day toDay = new Day(TO_YEAR, TO_MONTH, TO_DAY);
		// Periodオブジェクトを生成
		Period dayPeriod = new Period(fromDay, toDay);
		// 開始日と終了日を表示
		dayPeriod.putSpec();
	}
}
