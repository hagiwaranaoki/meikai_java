package exec04;

import java.util.Scanner;

public class Exercise4_25_17 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーに整数の加算を行うことを伝える
    System.out.println("整数を加算します。");
    // ユーザーに加算する整数の個数を入力するように促す
    System.out.print("何個加算しますか：");
    // ユーザーからの入力を整数として受け取り、numberOfIntegersという変数に格納
    int numberOfIntegers = scanner.nextInt();

    // 合計を計算するための変数を初期化
    int sum = 0;
    // 平均を計算するための変数を初期化
    int count = 0;

    // numberOfIntegers回だけループを実行
    for (int i = 0; i < numberOfIntegers; i++) {
      // ユーザーに整数を入力するように促す（0で終了）
      System.out.print("整数（0で終了）：");
      // ユーザーからの入力を整数として受け取り、inputIntegerという変数に格納
      int inputInteger = scanner.nextInt();
      // 入力が0ならループを終了
      if (inputInteger == 0)
        break;
      // 入力された整数を合計に加算
      sum += inputInteger;
      // 入力された整数の個数をカウント
      count++;
    }
    // 合計と平均を計算
    double average = (double) sum / count;

    // 合計を出力
    System.out.println("合計は" + sum + "です。");
    // 平均を出力
    System.out.println("平均は" + average + "です。");
  }
}