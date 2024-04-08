package exec04;

//Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_1
 * 概要:読み込んだ整数値の符号を何度でも判別する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_1 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ整数値の符号を何度でも判別する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
		// ユーザーがリトライするときの定数
		final int USER_RETRY = 1;
		// ユーザーがリトライしないときの定数
		final int USER_NOT_RETRY = 0;
	
		// ユーザーが繰り返し処理を続けるかどうかを制御する変数を定義
		int userRetry = 0;
	
		// do-whileループを開始
		do {
			// ユーザーに整数値を入力するように指示
			System.out.print("整数値:");
		
			// ユーザーからの整数値の入力を読み取る
			int integerNumber= standardInput.nextInt();
		
			// 整数値が正の場合
			if (integerNumber > 0) {
				// 文字列出力
				System.out.println("その値は正です。");
				//整数値が負の場合
			} else if (integerNumber < 0) {
				// 文字列出力
				System.out.println("その値は負です。");
				// 整数値が0の場合
			} else {
				// 文字列出力
				System.out.println("その値は0です。");
			}
	
			// ユーザーにもう一度実行するかどうかを尋ねる
			System.out.print("もう一度？ 1・・・Yes / 0・・・No:");
	
			// ユーザーからの入力を読み取る
			userRetry = standardInput.nextInt();
			// 0,1以外が入力された場合
			if (userRetry > USER_RETRY || userRetry < USER_NOT_RETRY) {
				// do-whileループを開始
				do {
					// 文字列出力
					System.out.println("0,1以外の数値が入力されました。");
					// 文字列出力
					System.out.print("もう一度？ 1・・・Yes / 0・・・No:");
					// ユーサーからの入力を読み取る
					userRetry = standardInput.nextInt();
					// 0,1以外であれば続行
				} while (userRetry > USER_RETRY || userRetry < USER_NOT_RETRY);
			}
			// ユーザーが1を入力した場合、ループを続ける
		} while (userRetry == USER_RETRY);
		// scannerの受付を終了
		standardInput.close();
	}
}
