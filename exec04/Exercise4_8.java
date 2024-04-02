package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_8 {
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);
    
    // ユーザーに正の整数値を入力するように指示
    System.out.print("整数値：");

    // ユーザーからの入力を読み取る
    int number = scanner.nextInt();

    // 桁数を計算するための変数を初期化
    int digitCount = 0;

    // numberが0になるまでループ
    while (number > 0) {
      // numberを10で割って桁を1つ減らす
      number /= 10;

      // 桁数をカウントアップ
      digitCount++;
    }

    // 桁数を出力する
    System.out.println("その数は" + digitCount + "桁です");

    // scannerの受付を終了
    scanner.close();
  }
}
