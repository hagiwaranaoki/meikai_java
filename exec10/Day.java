package exec10;

// GregorianCalendarクラスをインポート
import static java.util.Calendar.*;

// GregorianCalendarクラスをインポート
import java.util.GregorianCalendar;

/*
* クラス名:Day
* 概要:日付を管理する
* 作成者:N.Hagiwara
* 作成日:2024/04/10
*/
public class Day {
	// GregorianCalendarオブジェクトを生成
	static GregorianCalendar today = new GregorianCalendar();
	// 年を表すフィールド（初期値は本年）
	private int year = today.get(YEAR);
	// 月を表すフィールド（初期値は本月）
	private int month = today.get(MONTH) + 1;
	// 日を表すフィールド（初期値は本日）
	private int date = today.get(DATE);

	// 1月を表す定数
	static final int JANUARY_CONSTANT = 1;
	// 2月を表す定数
	static final int FEBRUARY_CONSTANT = 2;
	// 3月を表す定数
	static final int MARCH_CONSTANT = 3;
	// 4月を表す定数
	static final int APRIL_CONSTANT = 4;
	// 5月を表す定数
	static final int MAY_CONSTANT = 5;
	// 6月を表す定数
	static final int JUNE_CONSTANT = 6;
	// 7月を表す定数
	static final int JULY_CONSTANT = 7;
	// 8月を表す定数
	static final int AUGUST_CONSTANT = 8;
	// 9月を表す定数
	static final int SEPTEMBER_CONSTANT = 9;
	// 10月を表す定数
	static final int OCTOBER_CONSTANT = 10;
	// 11月を表す定数
	static final int NOVEMBER_CONSTANT = 11;
	// 12月を表す定数
	static final int DECEMBER_CONSTANT = 12;
	// 年の最小値を表す定数
	static final int MINIMUM_YEAR = 1;
	// 日の最小値を表す定数
	static final int MINIMUM_DATE = 1;
	// 最大日数30を表す定数
	static final int DAYS_IN_MONTH_WITH_THIRTY_DAYS = 30;
	// 閏年の2月の最大日数を表す定数
	static final int DAYS_IN_FEBRUARY_LEAP_YEAR = 29;
	// 閏年ではない2月の最大日数を表す定数
	static final int DAYS_IN_FEBRUARY_NON_LEAP_YEAR = 28;
	// 最大日数31を表す定数
	static final int DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS = 31;
	// 一週間の日数を表す定数
	static final int DAY_IN_WEEK = 7;
	// うるう年の判定に使用する数値で、4で割り切れる年を表す
	static final int LEAP_YEAR_DIVISIBLE_BY_FOUR = 4;
	// うるう年の判定に使用する数値で、100で割り切れる年を表す
	static final int LEAP_YEAR_DIVISIBLE_BY_HANDRED = 100;
	// うるう年の判定に使用する数値で、400で割り切れる年を表す
	static final int LEAP_YEAR_DIVISIBLE_BY_FOUR_HANDRED = 400;

	/*
	 * 関数名:isLeap
	 * 概要:うるう年かどうかを静的に判別
	 * 引数:なし
	 * 戻り値:うるう年か否か
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static boolean isLeap(int yearValue) {
		// うるう年を計算して返す
		return yearValue % LEAP_YEAR_DIVISIBLE_BY_FOUR == 0 && yearValue % LEAP_YEAR_DIVISIBLE_BY_HANDRED != 0
				|| yearValue % LEAP_YEAR_DIVISIBLE_BY_FOUR_HANDRED == 0;
	}

	/*
	* コンストラクタ名:Day
	* 概要:Dayオブジェクトを初期化子で初期化
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Day() {
	}

	/*
	* コンストラクタ名:Day
	* 概要:年と月を指定するコンストラクタ
	* 引数:int型[year(年)]
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Day(int year) {
		// 年が1より下だった場合
		if (year < MINIMUM_YEAR) {
			// 年を1に指定
			year = MINIMUM_YEAR;
			// 年を1に指定
			this.year = MINIMUM_YEAR;
			// 年が1より下ではなかった場合
		} else {
			// 引数の年を使用
			this.year = year;
		}
	}

	/*
	* コンストラクタ名:Day
	* 概要:年を指定するコンストラクタ
	* 引数:int型[year(年)]、int型[month(月)]
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Day(int year, int month) {
		// 年指定コンストラクタの呼び出し
		this(year);
		// 12月より上だった場合
		if (month > DECEMBER_CONSTANT) {
			// 12月に設定
			month = DECEMBER_CONSTANT;
			// 12月に設定
			this.month = DECEMBER_CONSTANT;
			// 1月より下だった場合
		} else if (month < JANUARY_CONSTANT) {
			// 1月に設定
			month = JANUARY_CONSTANT;
			// 1月に設定
			this.month = JANUARY_CONSTANT;
			// それ以外の場合
		} else {
			// 引数で受け取った月でフィールドに設定
			this.month = month;
		}
	}

	/*
	* コンストラクタ名:Day
	* 概要:年、月、日を指定するコンストラクタ
	* 引数:int型[year(年)]、int型[month(月)]、int型[date(日)]
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Day(int year, int month, int date) {
		// 年のチェックと設定
		if (year < MINIMUM_YEAR) {
			// 年が1未満の場合、1年に設定
			this.year = MINIMUM_YEAR;
			// それ以外の場合
		} else {
			//引数の年で指定
			this.year = year;
		}

		// 1月未満の場合
		if (month < JANUARY_CONSTANT) {
			// 1月に設定
			this.month = JANUARY_CONSTANT;
			// 12月を超える場合
		} else if (month > DECEMBER_CONSTANT) {
			// 12月に設定
			this.month = DECEMBER_CONSTANT;
			// それ以外の場合
		} else {
			// 月をそのまま指定
			this.month = month;
		}

		// 月の日数を取得
		int maxDate = getMaxDate(this.year, this.month);
		// 日が1未満の場合
		if (date < MINIMUM_DATE) {
			// 1日に設定
			this.date = MINIMUM_DATE;
			// 日がその月の最大日数を超える場合
		} else if (date > maxDate) {
			//その月の最大日に設定
			this.date = maxDate;
			// 日が1未満ではない場合
		} else {
			// 日を引数で設定
			this.date = date;
		}
	}

	/*
	 * 関数名:getMaxDate
	 * 概要:月の最大日数を返す
	 * 引数:なし
	 * 戻り値:月の最大日数
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/26
	 */
	private int getMaxDate(int yearVariable, int monthVariable) {
		// 月によって返す値を変える
		switch (monthVariable) {
		// 4月の場合
		case APRIL_CONSTANT:
			// 6月の場合
		case JUNE_CONSTANT:
			// 9月の場合
		case SEPTEMBER_CONSTANT:
			// 11月の場合
		case NOVEMBER_CONSTANT:
			// 30を返す
			return DAYS_IN_MONTH_WITH_THIRTY_DAYS;
		// 2月の場合
		case FEBRUARY_CONSTANT:
			// 閏年であれば29を返し、そうでなければ28を返す
			return isLeap(yearVariable) ? DAYS_IN_FEBRUARY_LEAP_YEAR : DAYS_IN_FEBRUARY_NON_LEAP_YEAR;
		// それ以外は31を返す
		default:
			// 31を返す
			return DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS;
		}
	}

	/*
	* コンストラクタ名:Day
	* 概要:年、月、日を呼び出すコンストラクタ
	* 引数:Day型[d]
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Day(Day d) {
		//引数のオブジェクトの年、月、日をコンストラクタから呼び出し
		this(d.year, d.month, d.date);
	}

	/*
	 * 関数名:getYear
	 * 概要:現在の年を取得
	 * 引数:なし
	 * 戻り値:現在の年の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public int getYear() {
		// 年を返す
		return year;
	}

	/*
	 * 関数名:getMonth
	 * 概要:現在の月を獲得
	 * 引数:なし
	 * 戻り値:現在の月の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public int getMonth() {
		// 月を返す
		return month;
	}

	/*
	 * 関数名:getDate
	 * 概要:現在の日を獲得
	 * 引数:なし
	 * 戻り値:現在の日の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public int getDate() {
		// 日を返す
		return date;
	}

	/*
	 * 関数名:getYear
	 * 概要:年を設定
	 * 引数:int型[year(年)]
	 * 戻り値:無し
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public void setYear(int year) {
		// 1年より下だった場合
		if (year < MINIMUM_YEAR) {
			// 1年に指定
			this.year = MINIMUM_YEAR;
			// 1年より下ではなかった場合
		} else {
			// 引数の年を使用
			this.year = year;
		}
	}

	/*
	 * 関数名:getMonth
	 * 概要:月を設定
	 * 引数:int型[month(月)]
	 * 戻り値:無し
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public void setMonth(int month) {
		// 12月より上だった場合
		if (month > DECEMBER_CONSTANT) {
			// 12月に指定
			this.month = DECEMBER_CONSTANT;
			// 1月より下だった場合
		} else if (month < JANUARY_CONSTANT) {
			// 1月に設定
			this.month = JANUARY_CONSTANT;
			// それ以外の場合
		} else {
			// 引数で受け取った月でフィールドに設定
			this.month = month;
		}

		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == JANUARY_CONSTANT || month == MARCH_CONSTANT || month == MAY_CONSTANT || month == JULY_CONSTANT
				|| month == AUGUST_CONSTANT || month == OCTOBER_CONSTANT || month == DECEMBER_CONSTANT)
				&& date > DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS) {
			// 日を31に設定
			date = DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS;
			// 日を31に設定
			this.date = DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == APRIL_CONSTANT || month == JUNE_CONSTANT || month == SEPTEMBER_CONSTANT
				|| month == NOVEMBER_CONSTANT)
				&& date > DAYS_IN_MONTH_WITH_THIRTY_DAYS) {
			// 日にちを30日に設定
			date = DAYS_IN_MONTH_WITH_THIRTY_DAYS;
			// 日にちを30日に設定
			this.date = DAYS_IN_MONTH_WITH_THIRTY_DAYS;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == true && date > DAYS_IN_FEBRUARY_LEAP_YEAR) {
			// 日を29に設定
			date = DAYS_IN_FEBRUARY_LEAP_YEAR;
			// 日を29に設定
			this.date = DAYS_IN_FEBRUARY_LEAP_YEAR;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == false && date > DAYS_IN_FEBRUARY_NON_LEAP_YEAR) {
			// 日を28に設定
			date = DAYS_IN_FEBRUARY_NON_LEAP_YEAR;
			// 日を28に設定
			this.date = DAYS_IN_FEBRUARY_NON_LEAP_YEAR;
			// 日が1未満の場合
		} else if (date < MINIMUM_DATE) {
			// 日を1に設定
			date = MINIMUM_DATE;
			// 日を1に設定
			this.date = MINIMUM_DATE;
		}

	}

	/*
	 * 関数名:getDate
	 * 概要:日を設定
	 * 引数:int型[date(日)]
	 * 戻り値:無し
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public void setDate(int date) {
		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == JANUARY_CONSTANT || month == MARCH_CONSTANT || month == MAY_CONSTANT || month == JULY_CONSTANT
				|| month == AUGUST_CONSTANT || month == OCTOBER_CONSTANT || month == DECEMBER_CONSTANT)
				&& date > DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS) {
			// 日を31に設定
			this.date = DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == APRIL_CONSTANT || month == JUNE_CONSTANT || month == SEPTEMBER_CONSTANT
				|| month == NOVEMBER_CONSTANT)
				&& date > DAYS_IN_MONTH_WITH_THIRTY_DAYS) {
			// 日にちを30日に設定
			this.date = DAYS_IN_MONTH_WITH_THIRTY_DAYS;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == true && date > DAYS_IN_FEBRUARY_LEAP_YEAR) {
			// 日を29に設定
			this.date = DAYS_IN_FEBRUARY_LEAP_YEAR;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == false && date > DAYS_IN_FEBRUARY_NON_LEAP_YEAR) {
			// 日を28に設定
			this.date = DAYS_IN_FEBRUARY_NON_LEAP_YEAR;
			// 日が1未満の場合
		} else if (date < MINIMUM_DATE) {
			// 日を1に設定
			this.date = MINIMUM_DATE;
			// それ以外の場合
		} else {
			// 日を引数の日に設定
			this.date = date;
		}
	}

	/*
	 * 関数名:set
	 * 概要:年、月、日を設定
	 * 引数:int型[year(年)]、int型[month(月)]、int型[date(日)]
	 * 戻り値:無し
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public void set(int year, int month, int date) {
		// 12月より上だった場合
		if (month > DECEMBER_CONSTANT) {
			// 12月に指定
			month = DECEMBER_CONSTANT;
			// 12月に指定
			this.month = DECEMBER_CONSTANT;
			// 1月より下だった場合
		} else if (month < JANUARY_CONSTANT) {
			// 1月に設定
			month = JANUARY_CONSTANT;
			// 1月に設定
			this.month = JANUARY_CONSTANT;
			// それ以外の場合
		} else {
			// 引数で受け取った月でフィールドに設定
			this.month = month;
		}

		// 1年より下だった場合
		if (year < JANUARY_CONSTANT) {
			// 1年に指定
			year = JANUARY_CONSTANT;
			// 1年に指定
			this.year = JANUARY_CONSTANT;
			// 1年より下ではなかった場合
		} else {
			// 引数の年を使用
			this.year = year;
		}

		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == JANUARY_CONSTANT || month == MARCH_CONSTANT || month == MAY_CONSTANT || month == JULY_CONSTANT
				|| month == AUGUST_CONSTANT || month == OCTOBER_CONSTANT || month == DECEMBER_CONSTANT)
				&& date > DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS) {
			// 日を31に設定
			date = DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS;
			// 日を31に設定
			this.date = DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == APRIL_CONSTANT || month == JUNE_CONSTANT || month == SEPTEMBER_CONSTANT
				|| month == NOVEMBER_CONSTANT)
				&& date > DAYS_IN_MONTH_WITH_THIRTY_DAYS) {
			// 日にちを30日に設定
			date = DAYS_IN_MONTH_WITH_THIRTY_DAYS;
			// 日にちを30日に設定
			this.date = DAYS_IN_MONTH_WITH_THIRTY_DAYS;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == true && date > DAYS_IN_FEBRUARY_LEAP_YEAR) {
			// 日を29に設定
			date = DAYS_IN_FEBRUARY_LEAP_YEAR;
			// 日を29に設定
			this.date = DAYS_IN_FEBRUARY_LEAP_YEAR;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == false && date > DAYS_IN_FEBRUARY_NON_LEAP_YEAR) {
			// 日を28に設定
			date = DAYS_IN_FEBRUARY_NON_LEAP_YEAR;
			// 日を28に設定
			this.date = DAYS_IN_FEBRUARY_NON_LEAP_YEAR;
			// 日が1未満の場合
		} else if (date < MINIMUM_DATE) {
			// 日を1に設定
			date = MINIMUM_DATE;
			// 日を1に設定
			this.date = MINIMUM_DATE;
			// それ以外の場合
		} else {
			// 日を引数の日に設定
			this.date = date;
		}
	}

	/*
	 * 関数名:isLeap
	 * 概要:うるう年を判別する静的メソッドの呼び出し
	 * 引数:なし
	 * 戻り値:うるう年を判別する静的メソッド
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public boolean isLeap() {
		// うるう年を判別する静的メソッドを返す
		return isLeap(year);
	}

	/*
	 * 関数名:dayOfWeek
	 * 概要:曜日を計算する
	 * 引数:なし
	 * 戻り値:0~6の曜日の数値を返却
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public int dayOfWeek() {
		// 月の計算で使用するオフセットの定数
		final int MONTH_OFFSET = 8;
		// 月の計算で使用する除数の定数
		final int MONTH_DIVISOR = 5;
		// 現在の年を代入
		int y = year;
		// 現在の付を代入
		int m = month;
		// 1月または2月のとき
		if (m == JANUARY_CONSTANT || m == FEBRUARY_CONSTANT) {
			// 年をデクリメント
			y--;
			// 月に12を足す
			m += DECEMBER_CONSTANT;
		}
		// 年と月を使って曜日を計算して返す
		return (y + y / LEAP_YEAR_DIVISIBLE_BY_FOUR - y / LEAP_YEAR_DIVISIBLE_BY_HANDRED
				+ y / LEAP_YEAR_DIVISIBLE_BY_FOUR_HANDRED
				+ (DAYS_IN_MONTH_WITH_THIRTY_DAYS * m + MONTH_OFFSET) / MONTH_DIVISOR + date) % DAY_IN_WEEK;
	}

	/*
	 * 関数名:daysPost
	 * 概要:年内での経過日数を計算
	 * 引数:なし
	 * 戻り値:年内での経過日数
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public int elapseDays() {
		// 経過日数を初期化
		int elapsedDays = 0;

		// 1月から現在の月の前月までの日数を加算
		for (int i = JANUARY_CONSTANT; i < month; i++) {
			// 4,6,9,11月の場合
			if (i == APRIL_CONSTANT || i == JUNE_CONSTANT || i == SEPTEMBER_CONSTANT || i == NOVEMBER_CONSTANT) {
				// 30を足す
				elapsedDays += DAYS_IN_MONTH_WITH_THIRTY_DAYS;
				// 2月の場合
			} else if (i == FEBRUARY_CONSTANT) {
				// 閏年であれば
				if (isLeap(year)) {
					// 29日を足す
					elapsedDays += DAYS_IN_FEBRUARY_LEAP_YEAR;
					// 閏年では無ければ
				} else {
					// 28を足す
					elapsedDays += DAYS_IN_FEBRUARY_NON_LEAP_YEAR;
				}
				// 2,4,6,9,11月以外であれば
			} else {
				// 31を足す
				elapsedDays += DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS;
			}
		}

		// 現在の日を加算
		elapsedDays += date - MINIMUM_DATE;

		// 経過日数を返す
		return elapsedDays;
	}

	/*
	 * 関数名:remainDays
	 * 概要:年内の残り日数を計算
	 * 引数:なし
	 * 戻り値:年内の残り日数
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public int remainDays(Day dayObject) {
		// 1年の日数を表す定数
		final int ONE_YEARS_DAYS = 365;
		// 閏年の1年の日数を表す定数
		final int ONE_LEAP_YEARS_DAYS = 366;
		// 残り日数を初期化
		int remainingDays = 0;
		// 閏年であるとき
		if (isLeap(dayObject.year) == true) {
			// 366日から経過日数を引く
			remainingDays = ONE_LEAP_YEARS_DAYS - dayObject.elapseDays();
			// 閏年ではないとき
		} else {
			// 365日から経過日数を引く
			remainingDays = ONE_YEARS_DAYS - dayObject.elapseDays();
		}
		// 残り日数を返す
		return remainingDays;
	}

	/*
	 * 関数名:equalTo
	 * 概要:他のDayオブジェクトと等しいかを判定する
	 * 引数:Dayオブジェクト[d]
	 * 戻り値:等しければtrue,等しくなければfalse
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public boolean equalTo(Day d) {
		// オブジェクト内のフィールドをすべて確認して一致しているかどうかを返す
		return year == d.year && month == d.month && date == d.date;
	}

	/*
	 * 関数名:toString
	 * 概要:オブジェクトの文字列表現を返す
	 * 引数:なし
	 * 戻り値:何年何月(曜日)の形式の文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public String toString() {
		// 曜日を格納する配列
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		// 何年何月(曜日)の形式の文字列を返す
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

	/*
	  * 関数名:compareDate
	  * 概要:前後関係を比較する
	  * 引数:Dayオブジェクト[dayValue]
	  * 戻り値:比較の文字列
	  * 作成者:N.Hagiwara
	  * 作成日:2024/04/11
	  * 修正者:Assistant
	  * 修正日:2024/04/24
	  */
	public String compareDate(Day dayValue) {
		// 比較結果を格納する変数
		String compareResult = "";
		// 比較対象のDayオブジェクトの方が未来の場合
		if (isDateAfter(dayValue, this)) {
			// 結果に文字列を代入
			compareResult = "比較対象のDayオブジェクトのほうが未来にいます";
			// 比較対象のDayオブジェクトの方が過去の場合
		} else if (isDateBefore(dayValue, this)) {
			// 結果に文字列を代入
			compareResult = "比較対象のDayオブジェクトのほうが過去にいます";
			// 同じ日付の場合
		} else {
			// 結果に文字列を代入
			compareResult = "二つのDayオブジェクトは同じ日にいます";
		}
		// 結果を返す
		return compareResult;
	}

	/*
	  * 関数名:isDateAfter
	  * 概要:day1がday2より未来かどうかを判定する
	  * 引数:Dayオブジェクト[day1], Dayオブジェクト[day2]
	  * 戻り値:day1がday2より未来ならtrue, そうでなければfalse
	  * 作成者:Assistant
	  * 作成日:2024/04/24
	  */
	public static boolean isDateAfter(Day day1, Day day2) {
		// 過去かどうかを判断する用の変数
		boolean temporaryVariable = false;
		// day1の年がday2の年より大きい場合
		if (day1.year > day2.year) {
			// trueを格納
			temporaryVariable = true;
			// day1の年がday2の年と等しい場合
		} else if (day1.year == day2.year) {
			// day1の月がday2の月より大きい場合
			if (day1.month > day2.month) {
				// trueを格納
				temporaryVariable = true;
				// day1の月がday2の月と等しい場合
			} else if (day1.month == day2.month) {
				// day1の日がday2の日より大きい場合
				if (day1.date > day2.date) {
					// trueを格納
					temporaryVariable = true;
				}
			}
		}
		// 上記以外の場合はfalseを返す
		return temporaryVariable;
	}

	/*
	  * 関数名:isDateBefore
	  * 概要:day1がday2より過去かどうかを判定する
	  * 引数:Dayオブジェクト[day1], Dayオブジェクト[day2]
	  * 戻り値:day1がday2より過去ならtrue, そうでなければfalse
	  * 作成者:Assistant
	  * 作成日:2024/04/24
	  */
	public static boolean isDateBefore(Day firstDay, Day secondDay) {
		// 過去かどうかを判断する用の変数
		boolean temporaryVariable = false;
		// day1の年がday2の年より小さい場合
		if (firstDay.year < secondDay.year) {
			// trueを格納
			temporaryVariable = true;
			// day1の年がday2の年と等しい場合
		} else if (firstDay.year == secondDay.year) {
			// day1の月がday2の月より小さい場合
			if (firstDay.month < secondDay.month) {
				// trueを格納
				temporaryVariable = true;
				// day1の月がday2の月と等しい場合
			} else if (firstDay.month == secondDay.month) {
				// day1の日がday2の日より小さい場合
				if (firstDay.date < secondDay.date) {
					/// trueを格納
					temporaryVariable = true;
				}
			}
		}
		// 上記以外の場合はfalseを返す
		return temporaryVariable;
	}

	/*
	  * 関数名:compareDates
	  * 概要:二つのDayオブジェクトの前後関係を比較する
	  * 引数:Dayオブジェクト[day1], Dayオブジェクト[day2]
	  * 戻り値:day1がday2より未来なら1, 等しければ0, 過去なら-1
	  * 作成者:Assistant
	  * 作成日:2024/04/24
	  */
	public static int compareDates(Day firstDay, Day secondDay) {
		// 一つ目の日が二つ目の日より後の場合の定数
		final int FIRST_DAY_IS_AFTER_SECOND_DAY = 1;
		// 一つ目の日が二つ目の日より前の場合の定数
		final int FIRST_DAY_IS_BEFORE_SECOND_DAY = -1;
		// 前後関係の値を入れる用の変数
		int temporaryVariable = 0;
		// day1がday2より未来の場合
		if (isDateAfter(firstDay, secondDay)) {
			// 1を入れる
			temporaryVariable = FIRST_DAY_IS_AFTER_SECOND_DAY;
			// day1がday2より過去の場合
		} else if (isDateBefore(firstDay, secondDay)) {
			// -1を入れる
			temporaryVariable = FIRST_DAY_IS_BEFORE_SECOND_DAY;
		}
		// dayオブジェクトが前後どちらにいるかを返す
		return temporaryVariable;
	}

	/*
	 * 関数名:advanceDate
	 * 概要:日付を一日進める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public void advanceDate() {
		// 次の月を表す定数
		final int NEXT_MONTH = 1;
		// 次の年を表す定数
		final int NEXT_YEAR = 1;
		// 次の日を表す定数
		final int NEXT_DATE = 1;
		// 1月か3月か5月か7月か8月か10月に日にちが31日を受け取った場合
		if ((month == JANUARY_CONSTANT || month == MARCH_CONSTANT || month == MAY_CONSTANT || month == JULY_CONSTANT
				|| month == AUGUST_CONSTANT || month == OCTOBER_CONSTANT)
				&& date == DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS) {
			// 月に1足す
			this.month = month + NEXT_MONTH;
			// 日を1に設定
			this.date = MINIMUM_DATE;
			// 4月か6月か9月か11月に日にちが30日を受け取った場合
		} else if ((month == APRIL_CONSTANT || month == JUNE_CONSTANT || month == SEPTEMBER_CONSTANT
				|| month == NOVEMBER_CONSTANT)
				&& date == DAYS_IN_MONTH_WITH_THIRTY_DAYS) {
			// 月に1足す
			this.month = month + NEXT_MONTH;
			// 日にちを1日に設定
			this.date = MINIMUM_DATE;
			// うるう年の2月に日にちが29を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == true && date == DAYS_IN_FEBRUARY_LEAP_YEAR) {
			// 月に1足す
			this.month = month + NEXT_MONTH;
			// 日を1に設定
			this.date = MINIMUM_DATE;
			// うるう年ではない2月に日にちが28を受け取った場合
		} else if (month == FEBRUARY_CONSTANT && isLeap(year) == false && date == DAYS_IN_FEBRUARY_NON_LEAP_YEAR) {
			// 月に1足す
			this.month = month + NEXT_MONTH;
			// 日を1に設定
			this.date = MINIMUM_DATE;
			// 12月31日の場合
		} else if (month == DECEMBER_CONSTANT && date == DAYS_IN_MONTH_WITH_THIRTY_ONE_DAYS) {
			//年に1を足す
			this.year = year + NEXT_YEAR;
			// 月を1にする
			this.month = JANUARY_CONSTANT;
			// 日を1に設定
			this.date = MINIMUM_DATE;
			// それ以外の場合
		} else {
			// 日を1足す
			this.date = date + NEXT_DATE;
		}
	}

	/*
	* 関数名:nextDay
	* 概要:次の日の日付を返却する
	* 引数:なし
	* 戻り値:次の日のDayオブジェクト
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public Day getNextDay() {
		// 新しいdayオブジェクトに今のDayオブジェクトを持たせる
		Day nextDay = new Day(this);
		// 一日進める
		nextDay.advanceDate();
		// 新しいdayオブジェクトの日付を返す
		return nextDay;
	}

	/*
	* 関数名:retreatDate
	* 概要:日付を一つ前に戻す
	* 引数:なし
	* 戻り値:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public void retreatDate() {
		// 年が1年で月が1月で日が1日の場合
		if (year == MINIMUM_YEAR && month == JANUARY_CONSTANT && date == MINIMUM_DATE) {
			// 「1年1月1日より前に戻ることはできません」と表示
			System.out.println("1年1月1日より前に戻ることはできません。");
			// 1年1月1日に設定することを表示
			System.out.println("1年1月1日に設定します。");
			// 日付を戻すことができる場合
		} else {
			// 日付を1日戻す
			date--;
			// 日付が0になった場合
			if (date == 0) {
				// 月を1つ戻す
				month--;
				// 月が0になった場合
				if (month == 0) {
					// 年を1つ戻す
					year--;
					// 月を12月に設定
					month = DECEMBER_CONSTANT;
				}
				// 日付をその月の最終日に設定
				date = getMaxDate(year, month);
			}
		}
	}

	/*
	* 関数名:previousDay
	* 概要:前の日の日付を返却する
	* 引数:なし
	* 戻り値:前の日のDayオブジェクト
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public Day getPreviousDay() {
		// 前の日付を入れるdayオブジェクト
		Day previousDay = new Day(this);
		// 年が1年で月が1月で日が1日の場合
		if (previousDay.year == MINIMUM_YEAR && previousDay.month == JANUARY_CONSTANT
				&& previousDay.date == MINIMUM_DATE) {
			// 1年1月1日より前は存在しないことを表示
			System.out.println("1年1月1日より前の日付は存在しないため、現在の日付を表示します。");
			// 日付を戻すことができる場合
		} else {
			// 日付を1日戻す
			previousDay.date--;
			// 日付が0になった場合
			if (previousDay.date == 0) {
				// 月を1つ戻す
				previousDay.month--;
				// 月が0になった場合
				if (previousDay.month == 0) {
					// 年を1つ戻す
					previousDay.year--;
					// 月を12月に設定
					previousDay.month = DECEMBER_CONSTANT;
				}
				// 日付をその月の最終日に設定
				previousDay.date = getMaxDate(previousDay.year, previousDay.month);
			}
		}
		// 一日前の日付を返す
		return previousDay;
	}

	/*
	* 関数名:advanceDays
	* 概要:日付をn日分進める
	* 引数:int型[dayNumber(進める日数)]
	* 戻り値:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public void advanceDays(int dayNumber) {
		// 引数の数分繰り返す
		for (int i = 0; i < dayNumber; i++) {
			// 日付を一日進める
			advanceDate();
		}
	}

	/*
	* 関数名:futureDays
	* 概要:n日後の日付を返却する
	* 引数:int型[dayNumber(進める日数)]
	* 戻り値:n日後のDayオブジェクト
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public Day getFutureDays(int dayNumber) {
		// n日後の日付を入れるDayオブジェクト
		Day futureDays = new Day(this);
		// n日進める
		futureDays.advanceDays(dayNumber);
		// n日後の日付を返却
		return futureDays;
	}

	/*
	* 関数名:retreatDays
	* 概要:日付をn日前に戻す
	* 引数:int型[dayNumber(戻す日数)]
	* 戻り値:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public void retreatDays(int dayNumber) {
		// 指定日数分繰り返す
		for (int i = 0; i < dayNumber; i++) {
			// 年が1年で月が1月で日が1日の場合
			if (year == MINIMUM_YEAR && month == JANUARY_CONSTANT && date == MINIMUM_DATE) {
				// 「1年1月1日より前に戻ることはできません」と表示
				System.out.println("1年1月1日より前に戻ることはできません。");
				// 1年1月1日に設定することを表示
				System.out.println("1年1月1日に設定します。");
				// ループを抜ける
				break;
				// 日付を戻すことができる場合
			} else {
				// 日付を1日戻す
				retreatDate();
			}
		}
	}

	/*
	* 関数名:pastDays
	* 概要:n日前の日付を返却する
	* 引数:int型[dayNumber(戻す日数)]
	* 戻り値:n日前のDayオブジェクト
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public Day getPastDays(int dayNumber) {
		// 任意の日数前を入れるDayオブジェクトを生成
		Day pastDays = new Day(this);
		// 戻れるかどうかのフラグ
		boolean canRetreat = true;
		// 指定日数分繰り返す
		for (int i = 0; i < dayNumber; i++) {
			// 年が1年で月が1月で日が1日の場合
			if (pastDays.year == MINIMUM_YEAR && pastDays.month == JANUARY_CONSTANT
					&& pastDays.date == MINIMUM_DATE) {
				// 戻ることができないことを知らせる
				System.out.println("1年1月1日より前は存在しないので、現在の日付を返却します。");
				// フラグを戻ることができないことを表すfalseに変更
				canRetreat = false;
				// ループから抜ける
				break;
			}
			// もし戻ることができる場合
			if (canRetreat) {
				// 日付を1日戻す
				pastDays.retreatDate();
			}
		}
		// 任意の日数前の日付を返却
		return pastDays;
	}
}
