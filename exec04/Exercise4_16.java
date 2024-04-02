package exec04;

// Scannerクラスをインポートします
import java.util.Scanner;

public class Exercise4_16 {
  public static void main(String[] args) {
    // Scannerオブジェクトを作成し
    Scanner scanner = new Scanner(System.in);

    // ユーザーに何個のアスタリスクを表示するか尋ねる
    System.out.print("何個*を表示しますか：");

    // ユーザーからの入力を読み取り
    int numberOfAsterisks = scanner.nextInt();

    // numberOfAsterisksの数だけアスタリスクを表示
    // 5個表示するごとに改行
    for (int counter = 0; counter < numberOfAsterisks; counter++) {
      // *を表示
      System.out.print('*');
      // 5個表示したら改行
      if ((counter + 1) % 5 == 0) {
        // 改行
        System.out.println();
      }
    }

    // 最後に改行
    if (numberOfAsterisks % 5 != 0) {
      // 改行
      System.out.println();
    }
    // scannerの受付を終了
    scanner.close();
  }
}