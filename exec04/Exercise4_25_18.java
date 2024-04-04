package exec04;

import java.util.Scanner;

public class Exercise4_25_18 {
	/*
	 * 関数名:main
	 * 概要:入力された複数の数値の合計を100を超えない範囲で計算し、その平均を計算する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);
    
    // 文字列出力
    System.out.println("整数を加算します。");
    // ユーザーに整数の個数を入力するように促す
    System.out.print("何個加算しますか：");
    // ユーザーからの入力を整数として受け取り、numberOfIntegersという変数に格納
    int numberOfIntegers = scanner.nextInt();

    // 合計を計算するための変数を初期化
    int sum = 0;
    // 平均を計算するための変数を初期化
    int count = 0;

    // numberOfIntegers回だけループを実行
    for (int i = 0; i < numberOfIntegers; i++) {
      System.out.print("整数：");
      // ユーザーからの入力を整数として受け取り、inputIntegerという変数に格納
      int inputInteger = scanner.nextInt();
      // 合計が1000を超える場合、ループを抜ける
      if (sum + inputInteger > 1000) {
      	// 出力
        System.out.println("合計が1,000を超えました。");
        // 出力
        System.out.println("最後の数値は無視します。");
        break;
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
