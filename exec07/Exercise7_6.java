package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_6
 * 概要:入力された月の季節を表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise7_6 {
	/*
	 * 関数名:printSeason
	 * 概要:引数の月の季節を出力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void printSeason(int m) {
		//3月の定数
		final int MONTH_MARCH = 3;
		//5月の定数
		final int MONTH_MAY = 5;
		//6月の定数
		final int MONTH_JUNE = 6;
		//8月の定数
		final int MONTH_AUGUST = 8;
		//9月の定数
		final int MONTH_SEPTEMBER = 9;
		//11月の定数
		final int MONTH_NOVEMBER = 11;
		//12月の定数
		final int MONTH_DECEMBER = 12;
		//1月の定数
		final int MONTH_JANUARY = 1;
		//2月の定数
		final int MONTH_FEBRUARY = 2;
		// 月が3~5の場合
		if (MONTH_MARCH <= m && m <= MONTH_MAY) {
			// 春の文字列出力
			System.out.println("春");
			// 月が6~8の場合
		} else if (MONTH_JUNE <= m && m <= MONTH_AUGUST) {
			// 夏を知らせる
			System.out.println("夏");
			// 月が9~11の場合
		} else if (MONTH_SEPTEMBER <= m && m <= MONTH_NOVEMBER) {
			// 秋を知らせる
			System.out.println("秋");
			// mが12~2の場合
		} else if (m == MONTH_DECEMBER || m == MONTH_JANUARY || m == MONTH_FEBRUARY) {
			// 冬を知らせる
			System.out.println("冬");
		}
	}

	/*
	 * 関数名:main
	 * 概要:入力された月の季節を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
		// 月の入力を促す
		System.out.print("月を入力してください：");
		// 月の値を受け付け
		int moonValue = standardInput.nextInt();
		// printSeasonを呼び出し
		printSeason(moonValue);
	}

}
