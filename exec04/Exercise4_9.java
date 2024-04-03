package exec04;

import java.util.Scanner;

public class Exercise4_9 {
	/*
	 * 関数名:main
	 * 概要:入力された整数値までの積を計算
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーにnの値を入力するように指示
    System.out.print("nの値：");

    // ユーザーからの入力を読み取る
    int number = scanner.nextInt();

    // 積を計算するための変数を初期化
    long product = 1;

    // 1からnumberまでの積を計算
    for (int i = 1; i <= number; i++) {
      // productにiをかけていく
      product *= i;
    }

    // 積を出力
    System.out.println("1から" + number + "までの積は" + product + "です");
    // scannerの受付を終了
    scanner.close();
  }
}
