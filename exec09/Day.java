package exec09;

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
	static GregorianCalendar today = new GregorianCalendar();
	// 年を表すフィールド（初期値は本年）
	private int year = today.get(YEAR);
	// 月を表すフィールド（初期値は本月）
	private int month = today.get(MONTH) + 1;
	// 日を表すフィールド（初期値は本日）
	private int date = today.get(DATE);

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
		return yearValue % 4 == 0 && yearValue % 100 != 0 || yearValue % 400 == 0;
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
		if (year < 1) {
			// 年を1に指定
			year = 1;
			// 年を1に指定
			this.year = 1;
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
		if (month > 12) {
			// 月を12に指定
			month = 12;
			// 月を12に指定
			this.month = 12;
			// 月が1より下だった場合
		} else if (month < 1) {
			// 月を1に設定
			month = 1;
			// 月を1に設定
			this.month = 1;
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
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& date > 31) {
			// 日を31に設定
			date = 31;
			// 日を31に設定
			this.date = 31;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
			// 日にちを30日に設定
			date = 30;
			// 日にちを30日に設定
			this.date = 30;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == true && date > 29) {
			// 日を29に設定
			date = 29;
			// 日を29に設定
			this.date = 29;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == false && date > 28) {
			// 日を28に設定
			date = 28;
			// 日を28に設定
			this.date = 28;
			// 日が1未満の場合
		} else if (date < 1) {
			// 日を1に設定
			date = 1;
			// 日を1に設定
			this.date = 1;
			// 月が12より上または1より下の時
		} else if (month > 12 || month < 1) {
			// 日を31に設定
			date = 31;
			// 日を1に設定
			this.date = 31;
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
		if (year < 1) {
			// 年を1に指定
			this.year = 1;
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
		if (month > 12) {
			// 月を12に指定
			this.month = 12;
			// 月が1より下だった場合
		} else if (month < 1) {
			// 月を1に設定
			this.month = 1;
			// それ以外の場合
		} else {
			// 引数で受け取った月でフィールドに設定
			this.month = month;
		}

		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& date > 31) {
			// 日を31に設定
			date = 31;
			// 日を31に設定
			this.date = 31;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
			// 日にちを30日に設定
			date = 30;
			// 日にちを30日に設定
			this.date = 30;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == true && date > 29) {
			// 日を29に設定
			date = 29;
			// 日を29に設定
			this.date = 29;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == false && date > 28) {
			// 日を28に設定
			date = 28;
			// 日を28に設定
			this.date = 28;
			// 日が1未満の場合
		} else if (date < 1) {
			// 日を1に設定
			date = 1;
			// 日を1に設定
			this.date = 1;
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
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& date > 31) {
			// 日を31に設定
			this.date = 31;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
			// 日にちを30日に設定
			this.date = 30;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == true && date > 29) {
			// 日を29に設定
			this.date = 29;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == false && date > 28) {
			// 日を28に設定
			this.date = 28;
			// 日が1未満の場合
		} else if (date < 1) {
			// 日を1に設定
			this.date = 1;
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
		if (month > 12) {
			// 月を12に指定
			month = 12;
			// 月を12に指定
			this.month = 12;
			// 月が1より下だった場合
		} else if (month < 1) {
			// 月を1に設定
			month = 1;
			// 月を1に設定
			this.month = 1;
			// それ以外の場合
		} else {
			// 引数で受け取った月でフィールドに設定
			this.month = month;
		}

		// 年が1より下だった場合
		if (year < 1) {
			// 年を1に指定
			year = 1;
			// 年を1に指定
			this.year = 1;
			// 年が1より下ではなかった場合
		} else {
			// 引数の年を使用
			this.year = year;
		}

		// 1月か3月か5月か7月か8月か10月か12月に日にちが31日より上を受け取った場合
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& date > 31) {
			// 日を31に設定
			date = 31;
			// 日を31に設定
			this.date = 31;
			// 4月か6月か9月か11月に日にちが30日より上を受け取った場合
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
			// 日にちを30日に設定
			date = 30;
			// 日にちを30日に設定
			this.date = 30;
			// うるう年の2月に日にちが29より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == true && date > 29) {
			// 日を29に設定
			date = 29;
			// 日を29に設定
			this.date = 29;
			// うるう年ではない2月に日にちが28より上の値を受け取った場合
		} else if (month == 2 && isLeap(year) == false && date > 28) {
			// 日を28に設定
			date = 28;
			// 日を28に設定
			this.date = 28;
			// 日が1未満の場合
		} else if (date < 1) {
			// 日を1に設定
			date = 1;
			// 日を1に設定
			this.date = 1;
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
		if (m == 1 || m == 2) {
			// 年をデクリメント
			y--;
			// 月に12を足す
			m += 12;
		}
		// 年と月を使って曜日を計算して返す
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	/*
	 * 関数名:daysPost
	 * 概要:年内での経過日数を計算
	 * 引数:なし
	 * 戻り値:年内での経過日数
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public int daysPast() {
		// 経過日数を初期化
		int elapsedDays = 0;
		// 年を初期化
		int yearValue = year;
		// 月を初期化
		int monthValue = month;
		// 日を初期化
		int dayValue = date;
		// 1月の時
		if (monthValue == 1) {
			// 経過日数を今日の日にちにする
			elapsedDays = dayValue;
			// 2月の時
		} else if (monthValue == 2) {
			// 今日の日にちに31を足す
			elapsedDays = dayValue + 31;
			// 3月の時
		} else if (monthValue == 3) {
			// 今日の日にちに60を足す
			elapsedDays = dayValue + 60;
			// 4月の時
		} else if (monthValue == 4) {
			// 今日の日にちに91を足す
			elapsedDays = dayValue + 91;
			// 5月の時
		} else if (monthValue == 5) {
			// 今日の日にちに121を足す
			elapsedDays = dayValue + 121;
			// 6月の時
		} else if (monthValue == 6) {
			// 今日の日にちに152を足す
			elapsedDays = dayValue + 152;
			// 7月の時
		} else if (monthValue == 7) {
			// 今日の日にちに182を足す
			elapsedDays = dayValue + 182;
			// 8月の時
		} else if (monthValue == 8) {
			// 今日の日にちに213を足す
			elapsedDays = dayValue + 213;
			// 9月の時
		} else if (monthValue == 9) {
			// 今日の日にちに244を足す
			elapsedDays = dayValue + 244;
			// 10月の時
		} else if (monthValue == 10) {
			// 今日の日にちに274を足す
			elapsedDays = dayValue + 274;
			// 11月の時
		} else if (monthValue == 11) {
			// 今日の日にちに305を足す
			elapsedDays = dayValue + 305;
			// 12月の時
		} else {
			// 今日の日にちに335を足す
			elapsedDays = dayValue + 335;
		}
		// 閏年ではないとき
		if (isLeap(yearValue) == false) {
			// 経過日数をデクリメント
			elapsedDays--;
		}
		// 経過日数を返す
		return elapsedDays;
	}

	/*
	 * 関数名:remainingDays
	 * 概要:年内の残り日数を計算
	 * 引数:なし
	 * 戻り値:年内の残り日数
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public int remainingDays(Day dayObject) {
		// 残り日数を初期化
		int remainingDays = 0;
		// 閏年であるとき
		if (isLeap(dayObject.year) == true) {
			// 366日から経過日数を引く
			remainingDays = 366 - dayObject.daysPast();
			// 閏年ではないとき
		} else {
			// 365日から経過日数を引く
			remainingDays = 365 - dayObject.daysPast();
		}
		// 残り日数を返す
		return remainingDays;
	}

	/*
	 * 関数名:set
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
	 * 引数:なし
	 * 戻り値:比較の文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public String compareDate(Day dayValue) {
		// 比較した後の文字列用変数を宣言
		String comparisonDate = " ";
		// Dayオブジェクトを生成
		Day nowVariable = new Day(year, month, date);
		// 比較対象が引数のdayオブジェクト以上の年の場合
		if (nowVariable.year >= dayValue.year) {
			// 経過日数が与えたDayオブジェクトのほうが大きいとき
			if (nowVariable.daysPast() > dayValue.daysPast()) {
				// 進んだ時間にいることを表示
				comparisonDate = "今日のDayオブジェクトのほうが未来にいます";
				// 経過日数が与えたDayオブジェクトのほうが小さいとき
			} else if (nowVariable.daysPast() < dayValue.daysPast()) {
				// 過去にいることを表示
				comparisonDate = "今日のDayオブジェクトのほうが過去にいます";
				// 経過日数が同じ場合
			} else {
				// 同じ日にいることを知らせる
				comparisonDate = "二つのDayオブジェクトは同じ日にいます";
			}
			// 比較対象が引数のdayオブジェクト未満の年の場合
		} else {
			// 過去にいることを表示
			comparisonDate = "今日のDayオブジェクトのほうが過去にいます";
		}
		// 前後比較の文字列を返す
		return comparisonDate;
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
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)
				&& date == 31) {
			// 月に1足す
			this.month = month + 1;
			// 日を1に設定
			this.date = 1;
			// 4月か6月か9月か11月に日にちが30日を受け取った場合
		} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date == 30) {
			// 月に1足す
			this.month = month + 1;
			// 日にちを30日に設定
			this.date = 1;
			// うるう年の2月に日にちが29を受け取った場合
		} else if (month == 2 && isLeap(year) == true && date == 29) {
			// 月に1足す
			this.month = month + 1;
			// 日を29に設定
			this.date = 1;
			// うるう年ではない2月に日にちが28を受け取った場合
		} else if (month == 2 && isLeap(year) == false && date == 28) {
			// 月に1足す
			this.month = month + 1;
			// 日を28に設定
			this.date = 1;
			// 12月31日の場合
		} else if (month == 12 && date == 31) {
			//年に1を足す
			this.year = year + 1;
			// 月を1にする
			this.month = 1;
			// 日を28に設定
			this.date = 1;
			// それ以外の場合
		} else {
			// 日を1足す
			this.date = date + 1;
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
	public Day nextDay() {
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
		if (date == 1) {
			// 月が1の時
			if (month == 1) {
				// 年をデクリメント
				year--;
				//月を12にする
				month = 12;
				// 日を31にする
				date = 31;
				// 月が1以外の時
			} else {
				// 月をデクリメント
				month--;
				// 2月の時
				if (month == 2) {
					// 閏年であれば
					if (isLeap(year)) {
						// 日を29に設定
						date = 29;
						// 閏年でなければ
					} else {
						// 日を28に設定
						date = 28;
					}
					// 4,6,9,11月の時
				} else if (month == 4 || month == 6 || month == 9 || month == 11) {
					// 日を30に設定
					date = 30;
					// それ以外の月
				} else {
					// 日を31に設定
					date = 31;
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
	public Day previousDay() {
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
	public Day futureDays(int dayNumber) {
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
	public Day pastDays(int dayNumber) {
		// n日前の日付を入れるオブジェクト
		Day pastDays = new Day(this);
		// n日戻す
		pastDays.retreatDays(dayNumber);
		// n日前の日付を返却
		return pastDays;
	}
}
