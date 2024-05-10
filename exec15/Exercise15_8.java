package exec15;

//カレンダークラスをインポート
import java.util.Calendar;

/*
クラス名:Exercise15_8
概要:コマンドライン引数の値でカレンダーの表示
作成者:N.Hagiwara
作成日:2024/04/16
*/
public class Exercise15_8 {
	// 月の最大値を表す定数
	public static final int MAXIMUM_MONTH = 12;
	// 月の最小値を表す定数
	public static final int MINIMUM_MONTH = 1;
	// 年の最小値を表す定数
	public static final int MINIMUM_YEAR = 1;
	// 1日を表す定数
	public static final int FIRST_DATE = 1;
	// 1週間の日にちの最大値を表す定数
	public static final int DAYS_IN_WEEK = 7;
	// 引数がないことを表す定数
	public static final int NO_ARGUMENT = 0;
	// 引数の最大数を表す定数
	public static final int MAXIMUM_ARGUMENT = 2;

	// 年の引数を表す定数
	public static final int YEAR_ARGUMENT = 0;

	/*
	 * 関数名:main
	 * 概要:コマンドライン引数の値でカレンダーの表示
	 * 引数:コマンドライン引数
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// カレンダークラスの月の値の調整値を表す定数
		final int CALENDER_MONTH_OFFSET = 1;
		// カレンダークラスのオブジェクトを生成
		Calendar calendarVariable = Calendar.getInstance();
		// 現在の年を取得して変数に入れる
		int currentYear = calendarVariable.get(Calendar.YEAR);
		// 現在の月を取得して変数に入れる
		// Calendarクラスの月は0から始まるため、+1で調整
		int currentMonth = calendarVariable.get(Calendar.MONTH) + CALENDER_MONTH_OFFSET;
		// エラーフラグを初期化
		boolean hasError = false;

		// コマンドライン引数を処理するためのループを開始
		for (int i = 0; i < Math.min(args.length, MAXIMUM_ARGUMENT); i++) {
			// 引数を整数に変換して変数に格納
			int argumentValue = Integer.parseInt(args[i]);
			// 最初の引数（年）を処理する場合
			if (i == YEAR_ARGUMENT) {
				// 入力された年が許容範囲外の場合
				if (argumentValue < MINIMUM_YEAR) {
					// 年に関するエラーメッセージを表示
					System.out.println("不正な値が入力されました: 年には正の値を指定してください。");
					// エラーフラグを立てる
					hasError = true;
					// 入力された年が許容範囲内の場合
				} else {
					// 入力された年を現在の年として設定
					currentYear = argumentValue;
					// 現在の月を1月に設定
					currentMonth = MINIMUM_MONTH;
				}
				// 2番目の引数（月）を処理する場合
			} else {
				// 入力された月が許容範囲外の場合
				if (argumentValue < MINIMUM_MONTH || argumentValue > MAXIMUM_MONTH) {
					// 月に関するエラーメッセージを表示
					System.out.println("不正な値が入力されました: 月は1~12の間で入力してください。");
					// エラーフラグを立てる
					hasError = true;
					// 入力された月が許容範囲内の場合
				} else {
					// 入力された月を現在の月として設定
					currentMonth = argumentValue;
				}
			}
		}

		// 引数が2つより多い場合
		if (args.length > MAXIMUM_ARGUMENT) {
			// エラーメッセージを表示
			System.out.println("エラー: 引数は2つまでです。");
			// エラーフラグをtrueにする
			hasError = true;
		}

		// エラーがなければカレンダーを表示
		if (!hasError) {
			// 受け取った引数の数に応じて処理を分岐
			switch (args.length) {
			// 引数がない場合
			case NO_ARGUMENT:
				// 現在の月のカレンダーを表示
				displayMonthCalendar(currentYear, currentMonth);
				// switch文を抜ける
				break;
			// 引数が2つの場合
			case MAXIMUM_ARGUMENT:
				// 指定された年と月のカレンダーを表示
				displayMonthCalendar(currentYear, currentMonth);
				// switch文を抜ける
				break;
			// それ以外の場合
			default:
				// 年の1月から12月までのカレンダーを表示
				displayYearCalendar(currentYear);
				// switch文を抜ける
				break;
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
		// 月の補正値を表す定数
		final int MONTH_OFFSET = -1;
		// 次の日に進める定数
		final int NEXT_DATE = 1;
		// カレンダークラスのオブジェクトを生成
		Calendar calendarVariable = Calendar.getInstance();
		// 年と月を指定し、1日から表示
		// Calendarクラスの月は0から始まるため、-1で調整
		calendarVariable.set(setYear, setMonth + MONTH_OFFSET, FIRST_DATE);

		// その月がとりえる最大の日を取得
		int daysInMonth = calendarVariable.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 曜日を取得
		int startingDayOfWeek = calendarVariable.get(Calendar.DAY_OF_WEEK);

		// 何月かと指定年を表示
		System.out.println(getMonthName(setMonth) + " " + setYear + "年");
		// カレンダーのヘッダー曜日を表示
		System.out.println("日 月 火 水 木 金 土");

		// 月の開始曜日までの空白を出力
		for (int i = Calendar.SUNDAY; i < startingDayOfWeek; i++) {
			// 空白を出力
			System.out.print("   ");
		}

		// 指定月の日にちの数だけ繰り返し
		for (int day = FIRST_DATE; day <= daysInMonth; day++) {
			// 最大2文字のスペースで日にちを表示
			System.out.printf("%2d ", day);
			// 現在の日付が土曜日または現在の日付がその月の最終日であれば
			if (calendarVariable.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || day == daysInMonth) {
				// 改行を出力
				System.out.println();
			}
			// 次の日に進める
			calendarVariable.add(Calendar.DATE, NEXT_DATE);
		}
	}

	/*
	 * 関数名:getMonthName
	 * 概要:月の番号に対応する月の名前を返す
	 * 引数:指定したい月
	 * 戻り値:月の名前
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	private static String getMonthName(int setMonth) {
		// 配列の補正値を表す定数
		final int ARRAY_OFFSET = -1;
		// 月の名前の配列を作成し、月の名前を格納
		String[] monthNames = {
				"1月", "2月", "3月", "4月", "5月", "6月",
				"7月", "8月", "9月", "10月", "11月", "12月"
		};
		// 指定された月の名前を返却
		// 配列のインデックスは0から始まるため、-1で調整
		return monthNames[setMonth + ARRAY_OFFSET];
	}

}