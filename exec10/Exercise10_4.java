package exec10;

// Scannerクラスをインポート
import java.util.Scanner;

/*
* クラス名:Exercise10_4
* 概要:新Dayクラスの確認
* 作成者:N.Hagiwara
* 作成日:2024/04/11
*/
public class Exercise10_4 {
	// Scannerオブジェクトの生成
	public static Scanner standardInput = new Scanner(System.in);
	// Dayオブジェクトの生成
	public static Day dayObject = new Day();

	/*
	 * 関数名:main
	 * 概要:新Dayクラスの確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void main(String[] args) {
		// すべてのテストを実行
		runAllTests();
		// テストが終了したことを知らせる
		System.out.println("すべてのテストを終了しました");
	}

	/*
	 * 関数名:runAllTests
	 * 概要:すべてのテストを実行する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void runAllTests() {
		// Dayクラスの基本情報をテスト
		testDayBasicInfo();
		// setメソッド(単体)をテスト
		testSetMethods();
		// setメソッド(全体)をテスト
		testSetAllMethod();
		// オブジェクト作成をテスト
		testObjectCreation();
		// 日付を進めるメソッドをテスト
		testAdvanceDate();
		// 日付を戻すメソッドをテスト
		testRetreatDate();
		// 前後の日付を取得するメソッドをテスト
		testGetPreviousAndNextDay();
		// 日付の比較テストを実行
		testDayComparison();
	}

	/*
	 * 関数名:testDayBasicInfo
	 * 概要:Dayクラスの基本情報をテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void testDayBasicInfo() {
		// Dayオブジェクトの中身を表示
		System.out.println(dayObject.toString());
		// Dayオブジェクトが閏年かどうかを判別して表示
		System.out.println(dayObject.getYear() + "年は閏年" + (dayObject.isLeap() ? "です" : "ではありません"));
		// dayオブジェクトが年内で何日経過しているかを表示
		System.out
				.println(dayObject.toString() + "は" + dayObject.getYear() + "年の1月1日から" + dayObject.elapseDays() + "日経過しています。");
		// dayオブジェクトの年内の残り日数を表示
		System.out.println(dayObject.getYear() + "年は残り" + dayObject.remainDays(dayObject) + "日です。");
	}

	/*
	 * 関数名:testSetMethods
	 * 概要:setメソッド(単体)をテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void testSetMethods() {
		// setメソッド(単体)テストをするか尋ねる
		System.out.print("setメソッド(単体)テストをする？1=yes,それ以外=no:");
		// リトライ変数を受け付け
		int userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == 1) {
			// タイトル出力
			System.out.println("setメソッド(単体)テスト");
			// 年の入力を促す
			System.out.print("年:");
			// 年を設定
			dayObject.setYear(standardInput.nextInt());
			// Dayオブジェクトの中身を表示
			System.out.println(dayObject.toString());

			// 月の入力を促す
			System.out.print("月:");
			// 月を設定
			dayObject.setMonth(standardInput.nextInt());
			// Dayオブジェクトの中身を表示
			System.out.println(dayObject.toString());

			// 日の入力を促す
			System.out.print("日:");
			// 日を設定
			dayObject.setDate(standardInput.nextInt());
			// Dayオブジェクトの中身を表示
			System.out.println(dayObject.toString());

			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
	}

	/*
	 * 関数名:testSetAllMethod
	 * 概要:setメソッド(全体)をテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void testSetAllMethod() {
		// setメソッド(全体)テストをするか尋ねる
		System.out.print("setメソッド(全体)テストをする？1=yes,それ以外=no:");
		// リトライ変数を受け付け
		int userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == 1) {
			// タイトル出力
			System.out.println("setメソッド(全体)テスト");
			// 年の入力を促す
			System.out.print("年:");
			// 年を受け付け
			int yearVariable = standardInput.nextInt();

			// 月の入力を促す
			System.out.print("月:");
			// 月を受け付け
			int monthVariable = standardInput.nextInt();

			// 日の入力を促す
			System.out.print("日:");
			// 日を受け付け
			int dateVariable = standardInput.nextInt();

			// 年、月、日を設定
			dayObject.set(yearVariable, monthVariable, dateVariable);
			// Dayオブジェクトの中身を表示
			System.out.println(dayObject.toString());

			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
	}

	/*
	 * 関数名:testObjectCreation
	 * 概要:オブジェクト作成をテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void testObjectCreation() {
		// オブジェクト作成テストをするか尋ねる
		System.out.print("オブジェクト作成テストをする？1=yes,それ以外=no:");
		// リトライ変数を受け付け
		int userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == 1) {
			// 年の入力を促す
			System.out.print("年:");
			// 年を受け付け
			int yearVariable = standardInput.nextInt();
			// 月の入力を促す
			System.out.print("月:");
			// 月を受け付け
			int monthVariable = standardInput.nextInt();
			// 日の入力を促す
			System.out.print("日:");
			// 日を受け付け
			int dateVariable = standardInput.nextInt();

			// 新しいDayオブジェクトを生成
			Day newDay = new Day(yearVariable, monthVariable, dateVariable);
			// 新しいDayオブジェクトの中身を表示
			System.out.println(newDay.toString());
			// 新しいDayオブジェクトが閏年かどうかを判別して表示
			System.out.println(newDay.getYear() + "年は閏年" + (newDay.isLeap() ? "です" : "ではありません"));
			// 新しいdayオブジェクトが年内で何日経過しているかを表示
			System.out.println(newDay.toString() + "は" + newDay.getYear() + "年の1月1日から" + newDay.elapseDays() + "日経過しています。");
			// 新しいdayオブジェクトの年内の残り日数を表示
			System.out.println(newDay.getYear() + "年は残り" + newDay.remainDays(newDay) + "日です。");
			// 現在のdayオブジェクトと新しいdayオブジェクトの比較を表示
			System.out.println(newDay.compareDate(dayObject));

			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
	}

	/*
	 * 関数名:testAdvanceDate
	 * 概要:日付を進めるメソッドをテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void testAdvanceDate() {
		// 日付を進めるテストをするか尋ねる
		System.out.print("日付を進めるテストをする？1=yes,それ以外=no:");
		// リトライ変数を受け付け
		int userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == 1) {
			// 現在のDayオブジェクトの情報を表示
			System.out.println("現在のDayオブジェクト: " + dayObject.toString());
			// Dayオブジェクトの日付を一つ進める
			dayObject.advanceDate();
			// Dayオブジェクトの中身を表示
			System.out.println("今の日付は" + dayObject.toString() + "です。");

			// 何日進めるか尋ねる
			System.out.print("何日進める？:");
			// 何日進めるかを受け付け
			int dayNumber = standardInput.nextInt();
			// 0以下の時
			while (dayNumber < 0) {
				// 0以上の数値を入力するように促す
				System.out.print("0以上の数値を入力してください：");
				// 何日進めるか受付
				dayNumber = standardInput.nextInt();
			}
			// Dayオブジェクトを任意の日数進める
			dayObject.advanceDays(dayNumber);
			// Dayオブジェクトの中身を表示
			System.out.println("今の日付は" + dayObject.toString() + "です。");

			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
	}

	/*
	 * 関数名:testRetreatDate
	 * 概要:日付を戻すメソッドをテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void testRetreatDate() {
		// 日付を戻すテストをするか尋ねる
		System.out.print("日付を戻すテストをする？1=yes,それ以外=no:");
		// リトライ変数を受け付け
		int userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == 1) {
			// 現在のDayオブジェクトの情報を表示
			System.out.println("現在のDayオブジェクト: " + dayObject.toString());
			// Dayオブジェクトの日付を一つ戻す
			dayObject.retreatDate();
			// Dayオブジェクトの中身を表示
			System.out.println("今の日付は" + dayObject.toString() + "です。");

			// 何日戻すか尋ねる
			System.out.print("何日戻す？:");
			// 何日戻すかを受け付け
			int dayNumber = standardInput.nextInt();
			// 0以下の時
			while (dayNumber < 0) {
				// 0以上の数値を入力するように促す
				System.out.print("0以上の数値を入力してください：");
				// 何日戻すか受付
				dayNumber = standardInput.nextInt();
			}
			// Dayオブジェクトを任意の日数戻す
			dayObject.retreatDays(dayNumber);
			// Dayオブジェクトの中身を表示
			System.out.println("今の日付は" + dayObject.toString() + "です。");

			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
	}

	/*
	 * 関数名:testGetPreviousAndNextDay
	 * 概要:前後の日付を取得するメソッドをテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public static void testGetPreviousAndNextDay() {
		// 前後の日付を確認するテストをするか尋ねる
		System.out.print("前後の日付を確認するテストをする？1=yes,それ以外=no:");
		// リトライ変数を受け付け
		int userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == 1) {
			// 現在のDayオブジェクトの情報を表示
			System.out.println("現在のDayオブジェクト: " + dayObject.toString());
			// Dayオブジェクトの一日後を表示
			System.out.println("一日後は" + dayObject.getNextDay() + "です。");
			// Dayオブジェクトの一日前を表示
			System.out.println("一日前は" + dayObject.getPreviousDay() + "です。");
			// Dayオブジェクトの中身を表示
			System.out.println("現在は" + dayObject.toString() + "です。");
			// 何日前後の日付を知りたいか尋ねる
			System.out.print("何日前後の日付を知りたい？:");
			// 何日前後かを受け付け
			int dayNumber = standardInput.nextInt();
			// 0以下の時
			while (dayNumber < 0) {
				// 0以上の数値を入力するように促す
				System.out.print("0以上の数値を入力してください：");
				// 何日前後か受付
				dayNumber = standardInput.nextInt();
			}
			// Dayオブジェクトの任意の日数後を表示
			System.out.println(dayNumber + "日後は" + dayObject.getFutureDays(dayNumber) + "です。");
			// Dayオブジェクトの任意の日数前を表示
			System.out.println(dayNumber + "日前は" + dayObject.getPastDays(dayNumber) + "です。");
			// Dayオブジェクトの中身を表示
			System.out.println("現在は" + dayObject.toString() + "です。");

			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
	}

	/*
	 * 関数名:testDayComparison
	 * 概要:日付の比較をテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:Assistant
	 * 作成日:2024/04/24
	 */
	public static void testDayComparison() {
		// 日付の比較テストをするか尋ねる
		System.out.print("日付の比較テストをする？1=yes,それ以外=no:");
		// リトライ変数を受け付け
		int userRetry = standardInput.nextInt();

		// リトライ変数が1の場合繰り返し
		while (userRetry == 1) {
			// 比較元のDayオブジェクトの情報を表示
			System.out.println("比較元のDayオブジェクト: " + dayObject.toString());

			// 比較対象の日付を入力するように促す
			System.out.println("比較対象の日付を入力してください");
			// 年の入力を促す
			System.out.print("年:");
			// 年を受け付け
			int yearVariable = standardInput.nextInt();
			// 月の入力を促す
			System.out.print("月:");
			// 月を受け付け
			int monthVariable = standardInput.nextInt();
			// 日の入力を促す
			System.out.print("日:");
			// 日を受け付け
			int dateVariable = standardInput.nextInt();

			// 比較対象のDayオブジェクトを生成
			Day comparisonDay = new Day(yearVariable, monthVariable, dateVariable);
			// 比較対象のDayオブジェクトの情報を表示
			System.out.println("比較対象のDayオブジェクト: " + comparisonDay.toString());

			// 比較元のDayオブジェクトと比較対象のDayオブジェクトの比較結果を表示
			System.out.println(dayObject.compareDate(comparisonDay));

			// 比較元のDayオブジェクトが比較対象のDayオブジェクトより未来かどうかを表示
			System.out.println("比較元のDayオブジェクトが比較対象より未来かどうか: " + (Day.isDateAfter(dayObject, comparisonDay) ? "はい" : "いいえ"));

			// 比較元のDayオブジェクトが比較対象のDayオブジェクトより過去かどうかを表示
			System.out.println("比較元のDayオブジェクトが比較対象より過去かどうか: " + (Day.isDateBefore(dayObject, comparisonDay) ? "はい" : "いいえ"));

			// 比較元のDayオブジェクトと比較対象のDayオブジェクトの前後関係を表示
			int comparison = Day.compareDates(dayObject, comparisonDay);
			// 比較結果の文字列を入れる用の変数を定義
			String comparisonResult = "";
			// 比較結果が0より上の場合
			if (comparison > 0) {
				// 未来にいることを知らせる
				comparisonResult = "比較元のDayオブジェクトのほうが未来にいます";
				// 0より下の場合
			} else if (comparison < 0) {
				// 過去にいることを知らせる
				comparisonResult = "比較元のDayオブジェクトのほうが過去にいます";
				// ０の場合
			} else {
				// 同じ日にいることを知らせる
				comparisonResult = "二つのDayオブジェクトは同じ日にいます";
			}
			// 前後関係の結果を出力
			System.out.println("比較元のDayオブジェクトと比較対象の前後関係: " + comparisonResult);

			// リトライするか尋ねる
			System.out.print("もう一度=1,次へ=1以外:");
			// リトライ受付
			userRetry = standardInput.nextInt();
		}
	}
}