package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_13 {
	/*
	 * 関数名:main
	 * 概要:1からnumberまでの和を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに1からnまでの和を求めることを告げる
    System.out.println("1からnまでの和を求めます");

    // 和を計算するための変数を定義
    int sum = 0;

    // ユーザーから正の整数値を入力してもらうまで繰り返す
    int number;
    // 終わりのない繰り返し
    for (;;) {
      // nの値を求める
      System.out.print("nの値：");
      // コンソールへの入力を待機
      number = scanner.nextInt();
      // numberが0以上ならば
      if (number > 0) {
        // ループから抜ける
        break;
      }
    }

    // 1からnumberまでの和を計算
    for (int i = 1; i <= number; i++) {
      // sumにiを足す
      sum += i;
    }
    
    // 和を出力
    System.out.println("1から" + number + "までの和は" + sum + "です");
    // scannerの受付を終了
    scanner.close();
  }
}
