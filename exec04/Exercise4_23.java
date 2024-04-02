package exec04;

import java.util.Scanner;

public class Exercise4_23 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーにnの値を入力するように促す
    System.out.print("数字ピラミッドの段数を入力してください：");
    // ユーザーからの入力を整数として受け取り、pyramidSizeという変数に格納
    int pyramidSize = scanner.nextInt();

    // 外側のループはピラミッドの段数を制御
    for (int i = 1; i <= pyramidSize; i++) {
      // 内側のループは各段の空白の数を制御
      for (int j = pyramidSize - i; j > 0; j--) {
        System.out.print(" ");
      }
      // 内側のループは各段の数字の数を制御
      for (int k = 0; k < (i * 2) - 1; k++) {
        // i%10を出力
        System.out.print(i % 10);
      }
      // 各段の最後で改行
      System.out.println();
    }
  }
}
