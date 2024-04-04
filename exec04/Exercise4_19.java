package exec04;

import java.util.Scanner;

public class Exercise4_19 {
	/*
	 * 関数名:main
	 * 概要:入力された数値の月によって季節を表示。月以外の数値の場合は再度入力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // 再試行するかどうかを制御する変数retryを定義
    int retry;

    // do-whileループを開始
    do {
      // ユーザーに月を入力するように促す
      System.out.print("季節を求めます。\n何月ですか？");
      // ユーザーからの入力を整数として受け取り、monthという変数に格納
      int month = scanner.nextInt();

      // monthが1~12の範囲外なら再入力させる
      while (month < 1 || month > 12) {
      	//文字列出力
        System.out.print("1~12の間で入力してください。何月ですか？");
        //入力を受け付け
        month = scanner.nextInt();
      }

      // monthの値に応じて季節を出力
      if (month >= 3 && month <= 5)
      	// 出力
        System.out.println("それは春です。");
      // 6~8の場合
      else if (month >= 6 && month <= 8)
      	//出力
        System.out.println("それは夏です。");
      // 9~11の場合
      else if (month >= 9 && month <= 11)
      	//出力
        System.out.println("それは秋です。");
      //12~2の場合
      else if (month == 12 || month == 1 || month == 2)
      	//出力
        System.out.println("それは冬です。");

      // ユーザーに再試行するかどうかを尋ねる
      System.out.print("もう一度？ 1・・・Yes / 0・・・No:");
      // ユーザーからの入力を整数として受け取り、retryという変数に格納
      retry = scanner.nextInt();
      // retryの値が1ならループを続ける
    } while (retry == 1);
  }
}
