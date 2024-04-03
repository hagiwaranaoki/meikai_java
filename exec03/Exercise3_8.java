package exec03;
// Scannerライブラリを読み込み
import java.util.Scanner;

public class Exercise3_8 {
	/*
	 * 関数名:main
	 * 概要:キーボードで読み込んだ点数に評価をつける
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	  public static void main(String[] args) {
		  // Scannerクラスの変数を定義
		  Scanner scanner = new Scanner(System.in);
		  
		  // 改行なしで文字列を出力
		  System.out.print("点数：");
		  // int型の変数pointにコンソールから値を受け付け
		  int point = scanner.nextInt();
		  
		  // 0以上59以下の時
		  if (point >= 0 && point <= 59) {
			  // 文字列を改行ありで出力
			  System.out.println("不可");
			  // 60以上69以下の時
		  } else if (point >= 60 && point <= 69) {
			  // 文字列を改行ありで出力
			  System.out.println("可");
			  // 70以上79以下の時
		  } else if (point >= 70 && point <= 79) {
			  // 文字列を改行ありで出力
			  System.out.println("良");
			  // 100以下の時(上から実行されるためここでは100以下で80~100になる)
		  } else if (point <= 100) {
			  // 文字列を改行ありで出力
			  System.out.println("優");
		  }
		  // scannerの受付を終了
		  scanner.close();
	  }
}
