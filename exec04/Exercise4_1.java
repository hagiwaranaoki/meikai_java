package exec04;

//Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_1 {
	public static void main(String[] args) {
		 // Scannerオブジェクトを作成
		 Scanner scanner = new Scanner(System.in);
		
		 // ユーザーが繰り返し処理を続けるかどうかを制御する変数を定義
		 int retry;
		
		 // do-whileループを開始
		 do {
		   		// ユーザーに月を入力するように指示
			 		System.out.print("季節を求めます。\n何月ですか:");
		
			 		// ユーザーからの月の入力を読み取る
			 		int month = scanner.nextInt();
		
			 		// 月に基づいて季節を表示
			 		if (month >= 3 && month <= 5) {
			 			// 月が3から5の場合、"春"を表示
			 			System.out.println("それは春です。");
		 } else if (month >= 6 && month <= 8) {
			 // 月が6から8の場合、"夏"を表示
		     System.out.println("それは夏です。");
		 } else if (month >= 9 && month <= 11) {
	     	// 月が9から11の場合、"秋"を表示
	     	System.out.println("それは秋です。");
	   } else if (month == 12 || month == 1 || month == 2) {
	     	// 月が12、1、2の場合、"冬"を表示
	     	System.out.println("それは冬です。");
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
