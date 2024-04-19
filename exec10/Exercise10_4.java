package exec10;

// Scannerクラスをインポート
import java.util.Scanner;

// dayクラスをインポート
import exec09.Day;

/*
 * クラス名:Exercise10_4
 * 概要:新Dayクラスの確認
 * 作成者:N.Hagiwara
 * 作成日:2024/04/11
 */
public class Exercise10_4 {
	/*
	 * 関数名:main
	 * 概要:新Dayクラスの確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/11
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトの生成
		Scanner standardInput = new Scanner(System.in);

		// 一つ目のDayオブジェクトの生成
		Day firstDay = new Day();
		// 一つ目のDayオブジェクトの中身を表示
		System.out.println(firstDay.toString());
		// 一つ目のDayオブジェクトが閏年かどうかを判別して表示
		System.out.println(firstDay.getYear() + "年は閏年" + (firstDay.isLeap() ? "です" : "ではありません"));
		// 一つ目のdayオブジェクトが年内で何日経過しているかを表示
		System.out.println(firstDay.toString() + "は" + firstDay.getYear() + "年の1月1日から" + firstDay.elapsedDays() + "日経過しています。");
		// 一つ目のdayオブジェクトの年内の残り日数を表示
		System.out
				.println(firstDay.getYear() + "年は残り" + firstDay.remainingDays(firstDay) + "日です。");

		// コンティニュー用定数
		final int USER_CONTINUE = 1;
		// テストをするか尋ねる
		System.out.print("setメソッド(単体)テストをする？1=yes,それ以外=no:");
		// リトライ変数をコンティニュー定数で初期化
		int userRetry = standardInput.nextInt();

		// 年の変数作成
		int setYearValue = 0;
		// 月の変数作成
		int setMonthValue = 0;
		// 日の変数作成
		int setDateValue = 0;
		// リトライ変数が1の場合繰り返し
		while (userRetry == USER_CONTINUE) {
			// タイトル出力
			System.out.println("setメソッド(全体)テスト");
			// 年の入力を促す
			System.out.print("年:");
			// 年を受け付け
			setYearValue = standardInput.nextInt();
			// 年を設定
			firstDay.setYear(setYearValue);
			// 一つ目のDayオブジェクトの中身出力
			System.out.println(firstDay.toString());

			// 月の入力を促す
			System.out.print("月:");
			// 月を受け付け
			setMonthValue = standardInput.nextInt();
			// 月を設定
			firstDay.setMonth(setMonthValue);
			// 一つ目のDayオブジェクトの中身を出力
			System.out.println(firstDay.toString());

			// 日の入力を促す
			System.out.print("日:");
			// 日を受け付け
			setDateValue = standardInput.nextInt();
			// 日を設定
			firstDay.setDate(setDateValue);
			// 一つ目のDayオブジェクトの中身を出力
			System.out.println(firstDay.toString());

			//リトライするか聞く
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}

		// setメソッド(全体)テストをするか尋ねる
		System.out.print("setメソッド(全体)テストをする？1=yes,それ以外=no:");
		// リトライ変数をコンティニュー定数で初期化
		userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == USER_CONTINUE) {
			// タイトル出力
			System.out.println("setメソッド(全体)テスト");
			// 年の入力を促す
			System.out.print("年:");
			// 年を受け付け
			setYearValue = standardInput.nextInt();

			// 月の入力を促す
			System.out.print("月:");
			// 月を受け付け
			setMonthValue = standardInput.nextInt();

			// 日の入力を促す
			System.out.print("日:");
			// 日を受け付け
			setDateValue = standardInput.nextInt();

			// 年、月、日を設定
			firstDay.set(setYearValue, setMonthValue, setDateValue);
			// 一つ目のDayオブジェクトの中身出力
			System.out.println(firstDay.toString());

			//リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}

		// オブジェクト作成テストをするか尋ねる
		System.out.print("オブジェクト作成テストをする？1=yes,それ以外=no:");
		// リトライ変数をコンティニュー定数で初期化
		userRetry = standardInput.nextInt();
		// リトライ変数が1の場合繰り返し
		while (userRetry == USER_CONTINUE) {
			// 年の入力を促す
			System.out.print("年:");
			// 年を受け付け
			int yearValue = standardInput.nextInt();
			// 月の入力を促す
			System.out.print("月:");
			// 月を受け付け
			int monthValue = standardInput.nextInt();
			// 日の入力を促す
			System.out.print("日:");
			// 日を受け付け
			int dayValue = standardInput.nextInt();

			// 二つ目のDayオブジェクトを生成
			Day secondDay = new Day(yearValue, monthValue, dayValue);
			// 二つ目のDayオブジェクトの中身を生成
			System.out.println(secondDay.toString());
			// 二つ目のDayオブジェクトが閏年かどうかを判別して表示
			System.out.println(secondDay.getYear() + "年は閏年" + (secondDay.isLeap() ? "です" : "ではありません"));
			// 二つ目のdayオブジェクトが年内で何日経過しているかを表示
			System.out
					.println(secondDay.toString() + "は" + secondDay.getYear() + "年の1月1日から" + secondDay.elapsedDays() + "日経過しています。");
			// 二つ目のdayオブジェクトの年内の残り日数を表示
			System.out
					.println(secondDay.getYear() + "年は残り" + secondDay.remainingDays(secondDay) + "日です。");
			// 一つ目と二つ目のdayオブジェクトの比較を表示
			System.out.println(secondDay.compareDate(firstDay));
			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}

		// テストをするか尋ねる
		System.out.print("日付を進めるテストをする？1=yes,それ以外=no:");
		// リトライ変数をコンティニュー定数で初期化
		userRetry = standardInput.nextInt();
		// 三つ目のDayオブジェクトを初期値で生成
		Day thirdDay = new Day();
		// リトライ変数が1の場合繰り返し
		while (userRetry == USER_CONTINUE) {
			// 三つ目のDayオブジェクトの中身を表示
			System.out.println(thirdDay.toString());
			// 三つ目のDayオブジェクトの日付を一つ進める
			thirdDay.advanceDate();
			// 三つ目のDayオブジェクトの中身を表示
			System.out.println("今の日付は" + thirdDay.toString() + "です。");
			// 何日進めるか尋ねる
			System.out.print("何日進める？:");
			// 何日進めるかを受け付け
			int dayNumber = standardInput.nextInt();
			// 0以下の時
			while (dayNumber < 0) {
				//0以上の数値を入力するように促す
				System.out.print("0以上の数値を入力してください：");
				// 何日進めるか受付
				dayNumber = standardInput.nextInt();
			}
			// 三つ目のDayオブジェクトを任意の日数進める
			thirdDay.advanceDays(dayNumber);
			// 三つ目のDayオブジェクトの中身を表示
			System.out.println("今の日付は" + thirdDay.toString() + "です。");
			//リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}

		// テストをするか尋ねる
		System.out.print("日付を戻すテストをする？1=yes,それ以外=no:");
		// リトライ変数をコンティニュー定数で初期化
		userRetry = standardInput.nextInt();
		// 四つ目のDayオブジェクトを初期値で生成
		Day forthDay = new Day();
		// リトライ変数が1の場合繰り返し
		while (userRetry == USER_CONTINUE) {
			// 四つ目のDayオブジェクトの中身を表示
			System.out.println(forthDay.toString());
			// 四つ目のDayオブジェクトの日付を一つ戻す
			forthDay.retreatDate();
			// 四つ目のDayオブジェクトの中身を表示
			System.out.println("今の日付は" + forthDay.toString() + "です。");
			
			// 何日戻すか尋ねる
			System.out.print("何日戻す？:");
			// 何日戻すかを受け付け
			int dayNumber = standardInput.nextInt();
			// 0以下の時
			while (dayNumber < 0) {
				//0以上の数値を入力するように促す
				System.out.print("0以上の数値を入力してください：");
				// 何日戻すか受付
				dayNumber = standardInput.nextInt();
			}
			// 四つ目のDayオブジェクトを任意の日数戻す
			forthDay.retreatDays(dayNumber);
			// 四つ目のDayオブジェクトの中身を表示
			System.out.println("今の日付は" + forthDay.toString() + "です。");
			//リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}

		// テストをするか尋ねる
		System.out.print("前後の日付を確認するテストをする？1=yes,それ以外=no:");
		// リトライ変数をコンティニュー定数で初期化
		userRetry = standardInput.nextInt();
		// 五つ目のDayオブジェクトを初期値で生成
		Day fifthDay = new Day();
		// リトライ変数が1の場合繰り返し
		while (userRetry == USER_CONTINUE) {
			// 五つ目のDayオブジェクトの中身を表示
			System.out.println(fifthDay.toString());
			// 五つ目のDayオブジェクトの一日後を表示
			System.out.println("一日後は" + fifthDay.getNextDay() + "です。");
			// 五つ目のDayオブジェクトの一日前を表示
			System.out.println("一日前は" + fifthDay.getPreviousDay() + "です。");
			// 五つ目のDayオブジェクトの中身を表示
			System.out.println("現在は" + fifthDay.toString() + "です。");

			// テストをするか尋ねる
			System.out.print("何日前後の日付を知りたい？:");
			// 何日前後かを受け付け
			int dayNumber = standardInput.nextInt();
			// 0以下の時
			while (dayNumber < 0) {
				//0以上の数値を入力するように促す
				System.out.print("0以上の数値を入力してください：");
				// 何日前後か受付
				dayNumber = standardInput.nextInt();
			}
			// 五つ目のDayオブジェクトの任意の日数後を表示
			System.out.println(dayNumber + "日後は" + fifthDay.getFutureDays(dayNumber) + "です。");
			// 五つ目のDayオブジェクトの任意の日数前を表示
			System.out.println(dayNumber + "日前は" + fifthDay.getPastDays(dayNumber) + "です。");
			// 五つ目のDayオブジェクトの中身を表示
			System.out.println("現在は" + fifthDay.toString() + "です。");
			//リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
		// テストが終了したことを知らせる
		System.out.println("すべてのテストを終了しました");
	}
}
