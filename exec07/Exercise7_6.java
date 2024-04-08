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
	static void printSeason(int m) {
		// mが3~5の場合
		if (3 <= m && m <= 5) {
			// 文字列出力
			System.out.println("春");
			// mが6~8の場合
		} else if (6 <= m && m <= 8) {
			// 文字列出力
			System.out.println("夏");
			// mが9~11の場合
		} else if (9 <= m && m <= 11) {
			// 文字列出力
			System.out.println("秋");
			// mが12~2の場合
		} else if (m == 12 || m == 1 || m == 2) {
			// 文字列出力
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
