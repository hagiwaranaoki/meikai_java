package exec09;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise9_2
 * 概要:Dayクラスの確認をする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise9_2 {
	/*
	 * 関数名:main
	 * 概要:Dayクラスの確認をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
		// 年の入力を促す
		System.out.print("年:");
		// 年をコンソールから読み込む
		int yearValue = standardInput.nextInt();
		// 正の整数値以外が入力されたとき
		if (yearValue <= 0) {
			// 後判定ループ文
			do {
				// 正の整数値の入力を促す
				System.out.print("正の整数値で入力してください：:");
				// 年をコンソールから読み込む
				yearValue = standardInput.nextInt();
				// 正の整数値が入力されるまで繰り返す
			} while (yearValue <= 0);
		}
		
		// 月の入力を促す
		System.out.print("月:");
		// 月をコンソールから読み込む
		int monthValue = standardInput.nextInt();
		// 正の整数値以外が入力されたとき
		if (monthValue <= 0) {
			// 後判定ループ文
			do {
				// 正の整数値の入力を促す
				System.out.print("正の整数値で入力してください：:");
				// 年をコンソールから読み込む
				monthValue = standardInput.nextInt();
				// 正の整数値が入力されるまで繰り返す
			} while (monthValue <= 0);
		}
		
		// 日の入力を促す
		System.out.print("日:");
		// 月をコンソールから読み込む
		int dayValue = standardInput.nextInt();
		// 正の整数値以外が入力されたとき
		if (dayValue <= 0) {
			// 後判定ループ文
			do {
				// 正の整数の入力を促す
				System.out.print("正の整数値で入力してください：:");
				// 年をコンソールから読み込む
				dayValue = standardInput.nextInt();
				// 正の整数値が入力されるまで繰り返す
			} while (dayValue <= 0);
		}
		
		// Dayオブジェクトの生成
		Day firstDay = new Day(yearValue, monthValue, dayValue);
		// 一つ目のDayオブジェクトを出力
		System.out.println("day1 = " + firstDay);
		
		// 一つ目と同じDayオブジェクトを生成
		Day secondDay = new Day(firstDay);
		// 同じ日付で作ったことを知らせる
		System.out.println("day2をday1と同じ日付として作りました。");
		// 二つ目のDayオブジェクトを出力
		System.out.println("day2 = " + secondDay);
		// 一つ目と二つ目のDayオブジェクトが等しい場合
		if (firstDay.equalTo(secondDay)) {
			// 比べた結果を表示
			System.out.println("day1とday2は等しいです。");
			// 等しくない場合
		} else {
			// 比べた結果を表示
			System.out.println("dayとday2は等しくありません。");
		}
		
		// 年の定数を定義
		final int YEAR_VALUE = 2010;
		// 月の定数を定義
		final int MONTH_VALUE = 10;
		// 日の定数を定義
		final int DAY_VALUE = 15;
		// 要素数の定数を定義
		final int ELEMENT_COUNT = 3;
		
		// フィールドの初期値でDayオブジェクトを生成
		Day thirdDay = new Day();
		// 年を指定してDayオブジェクトを生成
		Day forthDay = new Day(YEAR_VALUE);
		// 年、月を指定してDayオブジェクトを生成
		Day fifthDay = new Day(YEAR_VALUE, MONTH_VALUE);
		// 年、月、日を指定してDayオブジェクトを生成
		Day sixthDay = new Day(YEAR_VALUE, MONTH_VALUE, DAY_VALUE);
		// 三つ目のDayオブジェクトを表示
		System.out.println("thirdDay = " + thirdDay);
		// 四つ目のDayオブジェクトを表示
		System.out.println("forthDay = " + forthDay);
		// 五つ目のDayオブジェクトを表示
		System.out.println("fifthDay = " + fifthDay);
		// 六つ目のDayオブジェクトを表示
		System.out.println("sixthDay = " + sixthDay);
		
		// Dayオブジェクトの配列を生成
		Day[] dayArray = new Day[ELEMENT_COUNT];
		
		// Day型配列の要素数分繰り返す
		for (int i = 0; i < dayArray.length; i++) {
			// 配列に新しいDayオブジェクトを生成
			dayArray[i] = new Day();
		}
		
		// Day型配列の要素数分繰り返す
		for (int i = 0; i < dayArray.length; i++) {
			// Day型配列の中身を表示
			System.out.println("dayArray[" + i + "] = " + dayArray[i]);
		}
	}
}
