package exec04;

import java.util.Scanner;

public class Exercise4_24 {
	/*
	 * 関数名:main
	 * 概要:入力された正の整数値が素数であるかを判別する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーに正の整数値を入力するように促す
    System.out.print("正の整数値を入力してください：");
    // ユーザーからの入力を整数として受け取り、numberという変数に格納
    int number = scanner.nextInt();

    // 素数かどうかを判定するための変数を初期化
    boolean isPrime = true;

    // 2以上number未満の数でnumberを割り切れるかどうかをチェック
    for (int i = 2; i < number; i++) {
      // numberがiで割り切れる場合、numberは素数ではない
      if (number % i == 0) {
      	// isPrimeにfalseを代入
        isPrime = false;
        // 繰り返しから抜け出す
        break;
      }
    }

    // 素数かどうかを出力
    if (isPrime) {
    	// 文字列表示
      System.out.println(number + "は素数です。");
    } else {// それ以外の場合
    	// 文字列出力
      System.out.println(number + "は素数ではありません。");
    }
  }
}
