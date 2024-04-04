package exec04;

import java.util.Scanner;

public class Exercise4_26 {
	/*
	 * 関数名:main
	 * 概要:入力された複数の数値の合計と平均を計算する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // 出力
    System.out.println("整数を加算します。");
    // ユーザーに整数の個数を入力するように促す
    System.out.print("何個加算しますか：");
    // ユーザーからの入力を整数として受け取り、numberOfIntegersという変数に格納
    int numberOfIntegers = scanner.nextInt();

    // 合計を計算するための変数を初期化
    int sum = 0;
    // 入力値の数を計算するための変数を初期化
    int count = 0;

    // numberOfIntegers回だけループを実行
    for (int i = 0; i < numberOfIntegers; i++) {
    	// 改行なしで出力
      System.out.print("整数：");
      // ユーザーからの入力を整数として受け取り、inputIntegerという変数に格納
      int inputInteger = scanner.nextInt();
      // inputIntegerが負の数の場合、加算せずに次のループに進む
      if (inputInteger < 0) {
      	// 出力
        System.out.println("負の数は加算しません。");
        // forの最初に戻る
        continue;
      }
      // 合計に入力値を加算
      sum += inputInteger;
      // 入力値の数をカウント
      count++;
    }
    // 平均を計算
    double average = (double) sum / count;

    // 合計を出力
    System.out.println("合計は" + sum + "です。");
    // 平均を出力
    System.out.println("平均は" + average + "です。");
  }
}
