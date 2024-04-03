package exec03;

//Scannerクラスをインポート
import java.util.Scanner;

public class Exercise3_18 {
	/*
	 * 関数名:main
	 * 概要:入力された月の季節を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
		 // Scannerオブジェクトを作成
		 Scanner scanner = new Scanner(System.in);
		
		 // ユーザーに月を入力するように指示
		 System.out.println("Enter a month (1-12):");
		
		 // ユーザーからの月の入力を読み取る
		 int month = scanner.nextInt();
		
		 // 月に基づいて季節を表示
		 if (month >= 3 && month <= 5) {
		   // 月が3から5の場合、"春"を表示
		   System.out.println("春");
		 } else if (month >= 6 && month <= 8) {
		   // 月が6から8の場合、"夏"を表示
		   System.out.println("夏");
		 } else if (month >= 9 && month <= 11) {
		   // 月が9から11の場合、"秋"を表示
		   System.out.println("秋");
		 } else if (month == 12 || month == 1 || month == 2) {
		   // 月が12、1、2の場合、"冬"を表示
		   System.out.println("冬");
		 } else {
		   // それ以外の場合、エラーメッセージを表示
		   System.out.println("1~12の整数値を入力してください");
		 }
		 // scannerの受付を終了
		 scanner.close();
	}
}
