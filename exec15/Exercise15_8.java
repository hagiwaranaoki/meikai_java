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

	// 引数の個数が1の場合の定数
	static final int FIRST_ARGUMENT = 1;

	// 引数の個数が2の場合の定数
	static final int SECOND_ARGUMENT = 2;

	// 引数の個数が3の場合の定数
	static final int THIRD_ARGUMENT = 3;

	// 月の最大値を表す定数
	static final int MAXIMUM_MONTH = 12;

	// 週の最大値を表す定数
	static final int MAXIMUM_WEEK = 7;

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
		if (args.length == FIRST_ARGUMENT) {
			// 年の値をコマンドラインの0番目の引数から受け取る
			int yearVariable = Integer.parseInt(args[0]);
			// 年が0未満の場合
			if (yearVariable < 0) {
				// エラーメッセージを返す
				System.out.println("不正な値が入力されました: 年に負の値が指定されています。");
				// エラーフラグをtrueにする
				hasError = true;
				// 年が0未満ではない場合
			} else {
				// 現在の年を引数の値に変更
				currentYear = yearVariable;
				// 1月から表示する
				currentMonth = 0;
			}
			// コマンドライン引数が2つの時
		} else if (args.length == SECOND_ARGUMENT) {
			// 年の値をコマンドライン引数0番目から受け取る
			int yearVariable = Integer.parseInt(args[0]);
			// 月の値をコマンドライン引数1番目から受け取る
			int monthVariable = Integer.parseInt(args[FIRST_ARGUMENT]) - FIRST_ARGUMENT;
			// 年または月が0未満の場合
			if (yearVariable < 0 || monthVariable < 0) {
				// エラーメッセージを返す
				System.out.println("不正な値が入力されました: 年は0以上の値、月は正の値を入力してください。");
				// フラグをtrueにする
				hasError = true;
				// 年も月も正常な値の場合
			} else {
				// 現在の年を引数の年に変更
				currentYear = yearVariable;
				// 現在の念を引数の月に変更
				currentMonth = monthVariable;
			}
			// 引数が3つ以上の場合
		} else if (args.length >= THIRD_ARGUMENT) {
			// エラーメッセージを表示
			System.out.println("エラー: 引数は2つまでです。");
			// エラーフラグをtrueにする
			hasError = true;
		}

		// エラーがなければカレンダーを表示
		if (!hasError) {
			// 引数が1つの場合
			if (args.length == FIRST_ARGUMENT) {
				// 年の1月から12月までのカレンダーを表示
				displayYearCalendar(currentYear);
				// 引数が2つの場合
			} else if (args.length == SECOND_ARGUMENT) {
				// 指定された年と月のカレンダーを表示
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
		// 12回繰り返す
		for (int month = 0; month < MAXIMUM_MONTH; month++) {
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
		// カレンダークラスのオブジェクトを生成
		Calendar calenderVariable = Calendar.getInstance();
		// 年と月を指定し、1日から表示
		calenderVariable.set(setYear, setMonth, FIRST_ARGUMENT);

		// その月がとりえる最大の日を取得
		int daysInMonth = calenderVariable.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 曜日を取得
		int startingDayOfWeek = calenderVariable.get(Calendar.DAY_OF_WEEK);

		// 月の英名と指定年を表示
		System.out.println(getMonthName(setMonth) + " " + setYear);
		// カレンダーのヘッダー曜日を略して表示
		System.out.println("Su Mo Tu We Th Fr Sa");

		// 曜日の数だけ繰り返す
		for (int i = FIRST_ARGUMENT; i < startingDayOfWeek; i++) {
			// 空白を出力
			System.out.print("   ");
		}

		// 指定月の日にちの数だけ繰り返し
		for (int day = 1; day <= daysInMonth; day++) {
			// 最大2文字のスペースで日にちを表示
			System.out.printf("%2d ", day);
			// 現在の日付が土曜日または現在の日付がその月の最終日であれば
			if ((startingDayOfWeek + day - FIRST_ARGUMENT) % MAXIMUM_WEEK == 0 || day == daysInMonth) {
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
		// 月の名前の配列を作成し、月の英名を格納
		String[] monthNames = {
				"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};
		// 指定された月の英名を返却
		return monthNames[setMonth];
	}
}
