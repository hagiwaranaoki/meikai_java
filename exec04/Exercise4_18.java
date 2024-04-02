package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_18 {
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに整数値を入力するように指示
    System.out.print("整数値：");

    // ユーザーからの入力を読み取り
    int number = scanner.nextInt();

    // 1からnumberまでの全ての数について、その数の2乗値を表示
    for (int i = 1; i <= number; i++) {
    	// iを二乗
      int square = i * i;
      // 結果を出力
      System.out.println(i + "の2乗は" + square);
    }
    // scannerの受付を終了
    scanner.close();
  }
}
