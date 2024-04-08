package exec03;

//Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise3_18
 * 概要:入力された月の季節を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_18 {
	/*
	 * 関数名:main
	 * 概要:入力された月の季節を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
	
		// ユーザーに月を入力するように指示
		System.out.println("月を入力してください:");
	
		// ユーザーからの月の入力を読み取る
		int scannerMonth = standardInput.nextInt();
	
		// 月が3から5の場合
		if (scannerMonth >= 3 && scannerMonth <= 5) {
			// "春"を表示
			System.out.println("春");
			// 月が6から8の場合
		} else if (scannerMonth >= 6 && scannerMonth <= 8) {
			// "夏"を表示
			System.out.println("夏");
			// 月が9から11の場合
		} else if (scannerMonth >= 9 && scannerMonth <= 11) {
			//"秋"を表示
			System.out.println("秋");
			// 月が12、1、2の場合
		} else if (scannerMonth == 12 || scannerMonth == 1 || scannerMonth == 2) {
			// "冬"を表示
			System.out.println("冬");
		} else {
			// それ以外の場合、エラーメッセージを表示
			System.out.println("1~12の整数値を入力してください");
		}
		// standardInputの受付を終了
		standardInput.close();
	}
}
