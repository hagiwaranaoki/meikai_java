package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_11 {
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // カウントダウンする数値を格納する変数を定義
    int countdownNumber;

    // ユーザーから正の整数値を入力してもらうまで繰り返す
    for (;;) {
      // 正の整数値の入力を求める
      System.out.print("正の整数値：");
      // コンソールから入力を受け取り
      countdownNumber = scanner.nextInt();
      // countdownNumberが0以上ならば
      if (countdownNumber > 0) {
        // for文を抜ける
        break;
      }
    }

    // countdownNumberが0以上の時繰り返す
    for (int i = countdownNumber; i >= 0; i--) {
      // iを表示
      System.out.println(i);
    }
  }
}