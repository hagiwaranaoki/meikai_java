package exec15;

//カレンダークラスをインポート
import java.util.Calendar;

/*
 * クラス名:Exercise15_8
 * 概要:コマンドライン引数の値でカレンダーの表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_8 {
	// 0番目の引数を表す定数
	public static final int ZERO_TH_ARGUMENT = 0;
	// 1番目の引数を表す定数
	public static final int FIRST_ARGUMENT = 1;
	
	// 引数が一つを表す定数
	public static final int ONE_ARGUMENT = 1;
	// 引数が二つを表す定数
	public static final int TWO_ARGUMENT = 2;
	
	// 月の最大値を表す定数
	public static final int MAXIMUM_MONTH = 11;
	// 月の最小値を表す定数
	public static final int MINIMUM_MONTH = 0;
	// 年の最小値を表す定数
	public static final int MINIMUM_YEAR = 1;
	
	// 1日を表す定数
	public static final int FIRST_DATE = 1;
	// 最初の曜日を表す定数
	public static final int FIRST_WEEKDAY = 1;
	
	// 1週間の日にちの最大値を表す定数
	public static final int MAXIMUM_WEEKDAY = 7;
	
	/*
	 * 関数名:main
	 * 概要:コマンドライン引数の値でカレンダーの表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// カレンダークラスのオブジェクトを生成
		Calendar calenderVariable = Calendar.getInstance();
		// 現在の年を取得して変数に入れる
		int currentYear = calenderVariable.get(Calendar.YEAR);
		// 現在の月を取得して変数に入れる
		int currentMonth = calenderVariable.get(Calendar.MONTH);
		// エラーフラグを初期化
		boolean hasError = false;

		// コマンドライン引数が一つの場合
		if (args.length == ONE_ARGUMENT) {
			// 年の値をコマンドラインの0番目の引数から受け取る
			int yearVariable = Integer.parseInt(args[ZERO_TH_ARGUMENT]);
			// 年が1未満の場合
			if (yearVariable < MINIMUM_YEAR) {
				// エラーメッセージを返す
				System.out.println("不正な値が入力されました: 年には正の値を指定してください。");
				// エラーフラグをtrueにする
				hasError = true;
				// 年が0未満ではない場合
			} else {
				// 現在の年を引数の値に変更
				currentYear = yearVariable;
				// 1月から表示する
				currentMonth = MINIMUM_MONTH;
			}
			// コマンドライン引数が2つの時
		} else if (args.length == TWO_ARGUMENT) {
			// 年の値をコマンドライン引数0番目から受け取る
			int yearVariable = Integer.parseInt(args[ZERO_TH_ARGUMENT]);
			// 月の値をコマンドライン引数1番目から受け取る
			int monthVariable = Integer.parseInt(args[FIRST_ARGUMENT]);
			// Calendarクラスでは月は0から始まるため、デクリメントで調整
			monthVariable--;
			// 年が1未満の場合
			if (yearVariable < MINIMUM_YEAR) {
				// エラーメッセージを返す
				System.out.println("不正な値が入力されました: 年は正の値で入力してください。");

				//入力された月が1~12以外の場合
				if (monthVariable < MINIMUM_MONTH || monthVariable > MAXIMUM_MONTH) {
					// エラーメッセージを返す
					System.out.println("不正な値が入力されました: 月は1~12の間で入力してください。");
				}

				// フラグをtrueにする
				hasError = true;
				//入力された月が1~12以外の場合
			} else if (monthVariable < MINIMUM_MONTH || monthVariable > MAXIMUM_MONTH) {
				// エラーメッセージを返す
				System.out.println("不正な値が入力されました: 月は1~12の間で入力してください。");
				// フラグをtrueにする
				hasError = true;
				// 年も月も正常な値の場合
			} else {
				// 現在の年を引数の年に変更
				currentYear = yearVariable;
				// 現在の念を引数の月に変更
				currentMonth = monthVariable;
			}
			// 引数が2つより多い場合
		} else if (args.length > TWO_ARGUMENT) {
			// エラーメッセージを表示
			System.out.println("エラー: 引数は2つまでです。");
			// エラーフラグをtrueにする
			hasError = true;
		}

		// エラーがなければカレンダーを表示
		if (!hasError) {
			// 引数が1つの場合
			if (args.length == ONE_ARGUMENT) {
				// 年の1月から12月までのカレンダーを表示
				displayYearCalendar(currentYear);
				// 引数が2つの場合
			} else if (args.length == TWO_ARGUMENT) {
				// 指定された年と月のカレンダーを表示
				displayMonthCalendar(currentYear, currentMonth);
				// 引数がない場合
			} else {
				// 現在の月のカレンダーを表示
				displayMonthCalendar(currentYear, currentMonth);
			}
		}
	}

	/*
	 * 関数名:displayYearCalendar
	 * 概要:指定された年の1月から12月までのカレンダーを表示
	 * 引数:指定したい年
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	private static void displayYearCalendar(int setYear) {
		// 月の数分繰り返す
		for (int month = MINIMUM_MONTH; month <= MAXIMUM_MONTH; month++) {
			// 年と月のカレンダーを表示
			displayMonthCalendar(setYear, month);
			// 改行を入れる
			System.out.println();
		}
	}

	/*
	 * 関数名:displayMonthCalendar
	 * 概要:指定された年と月のカレンダーを表示
	 * 引数:指定したい年と月
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	private static void displayMonthCalendar(int setYear, int setMonth) {
		// 曜日の補正値を表す定数
		final int WEEKDAY_OFFSET = -1;
		// カレンダークラスのオブジェクトを生成
		Calendar calenderVariable = Calendar.getInstance();
		// 年と月を指定し、1日から表示
		calenderVariable.set(setYear, setMonth, FIRST_DATE);

		// その月がとりえる最大の日を取得
		int daysInMonth = calenderVariable.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 曜日を取得
		int startingDayOfWeek = calenderVariable.get(Calendar.DAY_OF_WEEK);

		// 何月かと指定年を表示
		System.out.println(getMonthName(setMonth) + " " + setYear + "年");
		// カレンダーのヘッダー曜日を表示
		System.out.println("日 月 火 水 木 金 土");

		// 曜日の数だけ繰り返す
		for (int i = FIRST_WEEKDAY; i < startingDayOfWeek; i++) {
			// 空白を出力
			System.out.print("   ");
		}

		// 指定月の日にちの数だけ繰り返し
		for (int day = FIRST_DATE; day <= daysInMonth; day++) {
			// 最大2文字のスペースで日にちを表示
			System.out.printf("%2d ", day);
			// 現在の日付が土曜日または現在の日付がその月の最終日であれば
			if ((startingDayOfWeek + day + WEEKDAY_OFFSET) % MAXIMUM_WEEKDAY == 0 || day == daysInMonth) {
				// 改行を出力
				System.out.println();
			}
		}
	}

	/*
	 * 関数名:getMonthName
	 * 概要:月の番号に対応する月の名前を返す
	 * 引数:指定したい月
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	private static String getMonthName(int setMonth) {
		// 月の名前の配列を作成し、月の名前を格納
		String[] monthNames = {
				"1月", "2月", "3月", "4月", "5月", "6月",
				"7月", "8月", "9月", "10月", "11月", "12月"
		};
		// 指定された月の名前を返却
		return monthNames[setMonth];
	}
}