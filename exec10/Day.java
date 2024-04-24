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

	// 4月を表す定数
	static final int FOUR_NUMBER = 4;
	// 100を表す定数
	static final int HUNDRED_NUMBER = 100;
	// 400を表す定数
	static final int FOUR_HUNDRED_NUMBER = 400;
	// 1を表す定数
	static final int FIRST_NUMBER = 1;
	// 2を表す定数
	static final int SECOND_NUMBER = 2;
	// 3を表す定数
	static final int THIRD_NUMBER = 3;
	// 5を表す定数
	static final int FIFTH_NUMBER = 5;
	// 6を表す定数
	static final int SIXTH_NUMBER = 6;
	// 7を表す定数
	static final int SEVENTH_NUMBER = 7;
	// 8を表す定数
	static final int EIGHTH_NUMBER = 8;
	// 9を表す定数
	static final int NINTH_NUMBER = 9;
	// 10を表す定数
	static final int TENTH_NUMBER = 10;
	// 11を表す定数
	static final int ELEVENTH_NUMBER = 11;
	// 12を表す定数
	static final int TWELFTH_NUMBER = 12;
	// 13を表す定数
	static final int THIRTEENTH_NUMBER = 13;
	// 28を表す定数
	static final int TWENTY_EIGHTH_NUMBER = 28;
	// 29を表す定数
	static final int TWENTY_NINTH_NUMBER = 29;
	// 30を表す定数
	static final int THIRTIETH_NUMBER = 30;
	// 31を表す定数
	static final int THIRTY_FIRST_NUMBER = 31;

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
		return yearValue % FOUR_NUMBER == 0 && yearValue % HUNDRED_NUMBER != 0 || yearValue % FOUR_HUNDRED_NUMBER == 0;
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
		if (year < FIRST_NUMBER) {
			// 年を1に指定
			year = FIRST_NUMBER;
			// 年を1に指定
			this.year = FIRST_NUMBER;
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
		// 月が12より上だった場合
		if (month > TWELFTH_NUMBER) {
			// 月を12に指定
			month = TWELFTH_NUMBER;
			// 月を12に指定
			this.month = TWELFTH_NUMBER;
			// 月が1より下だった場合
		} else if (month < FIRST_NUMBER) {
			// 月を1に設定
			month = FIRST_NUMBER;
			// 月を1に設定
			this.month = FIRST_NUMBER;
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
		// 年、月指定コンストラクタの呼び出し
		this(year, month);
		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == FIRST_NUMBER || month == THIRD_NUMBER || month == FIFTH_NUMBER || month == SEVENTH_NUMBER
				|| month == EIGHTH_NUMBER || month == TENTH_NUMBER || month == TWELFTH_NUMBER)
				&& date > THIRTY_FIRST_NUMBER) {
			// 日を31に設定
			this.date = THIRTY_FIRST_NUMBER;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == FOUR_NUMBER || month == SIXTH_NUMBER || month == NINTH_NUMBER || month == ELEVENTH_NUMBER)
				&& date > THIRTIETH_NUMBER) {
			// 日にちを30日に設定
			this.date = THIRTIETH_NUMBER;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == true && date > TWENTY_NINTH_NUMBER) {
			// 日を29に設定
			this.date = TWENTY_NINTH_NUMBER;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == false && date > TWENTY_EIGHTH_NUMBER) {
			// 日を28に設定
			this.date = TWENTY_EIGHTH_NUMBER;
			// 日が1未満の場合
		} else if (date < FIRST_NUMBER) {
			// 日を1に設定
			this.date = FIRST_NUMBER;
			// それ以外の場合
		} else {
			// 日を引数の日に設定
			this.date = date;
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
		// 年が1より下だった場合
		if (year < FIRST_NUMBER) {
			// 年を1に指定
			this.year = FIRST_NUMBER;
			// 年が1より下ではなかった場合
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
		// 月が12より上だった場合
		if (month > TWELFTH_NUMBER) {
			// 月を12に指定
			this.month = TWELFTH_NUMBER;
			// 月が1より下だった場合
		} else if (month < FIRST_NUMBER) {
			// 月を1に設定
			this.month = FIRST_NUMBER;
			// それ以外の場合
		} else {
			// 引数で受け取った月でフィールドに設定
			this.month = month;
		}

		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == FIRST_NUMBER || month == THIRD_NUMBER || month == FIFTH_NUMBER || month == SEVENTH_NUMBER
				|| month == EIGHTH_NUMBER || month == TENTH_NUMBER || month == TWELFTH_NUMBER)
				&& date > THIRTY_FIRST_NUMBER) {
			// 日を31に設定
			date = THIRTY_FIRST_NUMBER;
			// 日を31に設定
			this.date = THIRTY_FIRST_NUMBER;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == FOUR_NUMBER || month == SIXTH_NUMBER || month == NINTH_NUMBER || month == ELEVENTH_NUMBER)
				&& date > THIRTIETH_NUMBER) {
			// 日にちを30日に設定
			date = THIRTIETH_NUMBER;
			// 日にちを30日に設定
			this.date = THIRTIETH_NUMBER;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == true && date > TWENTY_NINTH_NUMBER) {
			// 日を29に設定
			date = TWENTY_NINTH_NUMBER;
			// 日を29に設定
			this.date = TWENTY_NINTH_NUMBER;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == false && date > TWENTY_EIGHTH_NUMBER) {
			// 日を28に設定
			date = TWENTY_EIGHTH_NUMBER;
			// 日を28に設定
			this.date = TWENTY_EIGHTH_NUMBER;
			// 日が1未満の場合
		} else if (date < FIRST_NUMBER) {
			// 日を1に設定
			date = FIRST_NUMBER;
			// 日を1に設定
			this.date = FIRST_NUMBER;
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
		if ((month == FIRST_NUMBER || month == THIRD_NUMBER || month == FIFTH_NUMBER || month == SEVENTH_NUMBER
				|| month == EIGHTH_NUMBER || month == TENTH_NUMBER || month == TWELFTH_NUMBER)
				&& date > THIRTY_FIRST_NUMBER) {
			// 日を31に設定
			this.date = THIRTY_FIRST_NUMBER;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == FOUR_NUMBER || month == SIXTH_NUMBER || month == NINTH_NUMBER || month == ELEVENTH_NUMBER)
				&& date > THIRTIETH_NUMBER) {
			// 日にちを30日に設定
			this.date = THIRTIETH_NUMBER;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == true && date > TWENTY_NINTH_NUMBER) {
			// 日を29に設定
			this.date = TWENTY_NINTH_NUMBER;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == false && date > TWENTY_EIGHTH_NUMBER) {
			// 日を28に設定
			this.date = TWENTY_EIGHTH_NUMBER;
			// 日が1未満の場合
		} else if (date < FIRST_NUMBER) {
			// 日を1に設定
			this.date = FIRST_NUMBER;
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
		// 月が12より上だった場合
		if (month > TWELFTH_NUMBER) {
			// 月を12に指定
			month = TWELFTH_NUMBER;
			// 月を12に指定
			this.month = TWELFTH_NUMBER;
			// 月が1より下だった場合
		} else if (month < FIRST_NUMBER) {
			// 月を1に設定
			month = FIRST_NUMBER;
			// 月を1に設定
			this.month = FIRST_NUMBER;
			// それ以外の場合
		} else {
			// 引数で受け取った月でフィールドに設定
			this.month = month;
		}

		// 年が1より下だった場合
		if (year < FIRST_NUMBER) {
			// 年を1に指定
			year = FIRST_NUMBER;
			// 年を1に指定
			this.year = FIRST_NUMBER;
			// 年が1より下ではなかった場合
		} else {
			// 引数の年を使用
			this.year = year;
		}

		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == FIRST_NUMBER || month == THIRD_NUMBER || month == FIFTH_NUMBER || month == SEVENTH_NUMBER
				|| month == EIGHTH_NUMBER || month == TENTH_NUMBER || month == TWELFTH_NUMBER)
				&& date > THIRTY_FIRST_NUMBER) {
			// 日を31に設定
			date = THIRTY_FIRST_NUMBER;
			// 日を31に設定
			this.date = THIRTY_FIRST_NUMBER;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == FOUR_NUMBER || month == SIXTH_NUMBER || month == NINTH_NUMBER || month == ELEVENTH_NUMBER)
				&& date > THIRTIETH_NUMBER) {
			// 日にちを30日に設定
			date = THIRTIETH_NUMBER;
			// 日にちを30日に設定
			this.date = THIRTIETH_NUMBER;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == true && date > TWENTY_NINTH_NUMBER) {
			// 日を29に設定
			date = TWENTY_NINTH_NUMBER;
			// 日を29に設定
			this.date = TWENTY_NINTH_NUMBER;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == false && date > TWENTY_EIGHTH_NUMBER) {
			// 日を28に設定
			date = TWENTY_EIGHTH_NUMBER;
			// 日を28に設定
			this.date = TWENTY_EIGHTH_NUMBER;
			// 日が1未満の場合
		} else if (date < FIRST_NUMBER) {
			// 日を1に設定
			date = FIRST_NUMBER;
			// 日を1に設定
			this.date = FIRST_NUMBER;
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
		// 現在の年を代入
		int y = year;
		// 現在の付を代入
		int m = month;
		// 月が1または2のとき
		if (m == FIRST_NUMBER || m == SECOND_NUMBER) {
			// 年をデクリメント
			y--;
			// 月に12を足す
			m += TWELFTH_NUMBER;
		}
		// 年と月を使って曜日を計算して返す
		return (y + y / FOUR_NUMBER - y / HUNDRED_NUMBER + y / FOUR_HUNDRED_NUMBER
				+ (THIRTEENTH_NUMBER * m + EIGHTH_NUMBER) / FIFTH_NUMBER + date) % SEVENTH_NUMBER;
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
		for (int i = FIRST_NUMBER; i < month; i++) {
			// 4,6,9,11月の場合
			if (i == FOUR_NUMBER || i == SIXTH_NUMBER || i == NINTH_NUMBER || i == ELEVENTH_NUMBER) {
				// 30を足す
				elapsedDays += THIRTIETH_NUMBER;
				// 2月の場合
			} else if (i == SECOND_NUMBER) {
				// 閏年であれば
				if (isLeap(year)) {
					// 29日を足す
					elapsedDays += TWENTY_NINTH_NUMBER;
					// 閏年では無ければ
				} else {
					// 28を足す
					elapsedDays += TWENTY_EIGHTH_NUMBER;
				}
				// 2,4,6,9,11月以外であれば
			} else {
				// 31を足す
				elapsedDays += THIRTY_FIRST_NUMBER;
			}
		}

		// 現在の日を加算
		elapsedDays += date - FIRST_NUMBER;

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
		// 残り日数を初期化
		int remainingDays = 0;
		// 閏年であるとき
		if (isLeap(dayObject.year) == true) {
			// 366日から経過日数を引く
			remainingDays = 366 - dayObject.elapseDays();
			// 閏年ではないとき
		} else {
			// 365日から経過日数を引く
			remainingDays = 365 - dayObject.elapseDays();
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
		// 前後関係の値を入れる用の変数
		int temporaryVariable = 0;
		// day1がday2より未来の場合
		if (isDateAfter(firstDay, secondDay)) {
			// 1を入れる
			temporaryVariable = 1;
			// day1がday2より過去の場合
		} else if (isDateBefore(firstDay, secondDay)) {
			// -1を入れる
			temporaryVariable = -1;
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
		// 1月か3月か5月か7月か8月か10月に日にちが31日を受け取った場合
		if ((month == FIRST_NUMBER || month == THIRD_NUMBER || month == FIFTH_NUMBER || month == SEVENTH_NUMBER
				|| month == EIGHTH_NUMBER || month == TENTH_NUMBER)
				&& date == THIRTY_FIRST_NUMBER) {
			// 月に1足す
			this.month = month + FIRST_NUMBER;
			// 日を1に設定
			this.date = FIRST_NUMBER;
			// 4月か6月か9月か11月に日にちが30日を受け取った場合
		} else if ((month == FOUR_NUMBER || month == SIXTH_NUMBER || month == NINTH_NUMBER || month == ELEVENTH_NUMBER)
				&& date == THIRTIETH_NUMBER) {
			// 月に1足す
			this.month = month + FIRST_NUMBER;
			// 日にちを30日に設定
			this.date = FIRST_NUMBER;
			// うるう年の2月に日にちが29を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == true && date == TWENTY_NINTH_NUMBER) {
			// 月に1足す
			this.month = month + FIRST_NUMBER;
			// 日を29に設定
			this.date = FIRST_NUMBER;
			// うるう年ではない2月に日にちが28を受け取った場合
		} else if (month == SECOND_NUMBER && isLeap(year) == false && date == TWENTY_EIGHTH_NUMBER) {
			// 月に1足す
			this.month = month + FIRST_NUMBER;
			// 日を28に設定
			this.date = FIRST_NUMBER;
			// 12月31日の場合
		} else if (month == TWELFTH_NUMBER && date == THIRTY_FIRST_NUMBER) {
			//年に1を足す
			this.year = year + FIRST_NUMBER;
			// 月を1にする
			this.month = FIRST_NUMBER;
			// 日を28に設定
			this.date = FIRST_NUMBER;
			// それ以外の場合
		} else {
			// 日を1足す
			this.date = date + FIRST_NUMBER;
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
		// 日が1の時
		if (date == FIRST_NUMBER) {
			// 月が1の時
			if (month == FIRST_NUMBER) {
				// 年をデクリメント
				year--;
				//月を12にする
				month = TWELFTH_NUMBER;
				// 日を31にする
				date = THIRTY_FIRST_NUMBER;
				// 月が1以外の時
			} else {
				// 月をデクリメント
				month--;
				// 2月の時
				if (month == SECOND_NUMBER) {
					// 閏年であれば
					if (isLeap(year)) {
						// 日を29に設定
						date = TWENTY_NINTH_NUMBER;
						// 閏年でなければ
					} else {
						// 日を28に設定
						date = TWENTY_EIGHTH_NUMBER;
					}
					// 4,6,9,11月の時
				} else if (month == FOUR_NUMBER || month == SIXTH_NUMBER || month == NINTH_NUMBER || month == ELEVENTH_NUMBER) {
					// 日を30に設定
					date = THIRTIETH_NUMBER;
					// それ以外の月
				} else {
					// 日を31に設定
					date = THIRTY_FIRST_NUMBER;
				}
			}
			// 日が1ではない
		} else {
			// 日をデクリメント
			date--;
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
		// 一日戻す
		previousDay.retreatDate();
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
		// 引数の数分繰り返す
		for (int i = 0; i < dayNumber; i++) {
			// 一日戻す
			retreatDate();
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
		// n日前の日付を入れるオブジェクト
		Day pastDays = new Day(this);
		// n日戻す
		pastDays.retreatDays(dayNumber);
		// n日前の日付を返却
		return pastDays;
	}
}
