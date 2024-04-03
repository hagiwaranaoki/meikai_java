package exec04;

//Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_1 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ整数値の符号を何度でも判別する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
		 // Scannerオブジェクトを作成
		 Scanner scanner = new Scanner(System.in);
		
		 // ユーザーが繰り返し処理を続けるかどうかを制御する変数を定義
		 int retry;
		
		 // do-whileループを開始
		 do {
		   		// ユーザーに整数値を入力するように指示
			 		System.out.print("整数値:");
		
			 		// ユーザーからの整数値の入力を読み取る
			 		int number= scanner.nextInt();
		
			 		// 整数値が正の場合
			 		if (number > 0) {
			 			// 文字列出力
			 			System.out.println("その値は正です。");
			 			//整数値が負の場合
			 		} else if (number < 0) {
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
		   retry = scanner.nextInt();
		
		   // ユーザーが1を入力した場合、ループを続ける
		 } while (retry == 1);
		 // scannerの受付を終了
		 scanner.close();
	}
}
