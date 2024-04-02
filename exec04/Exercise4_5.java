package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_5 {
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーにカウントダウンの開始を告げる
    System.out.println("カウントダウンします");
    // int型の変数xを定義
    int x;
    // 繰り返し
    do {
      // ユーザーに正の整数値入力を促す
      System.out.print("正の整数値：");
      // コンソールから値を取得
      x = scanner.nextInt();
      // 0以下なら繰り返す
    } while (x <= 0);
    // xが0以上の時繰り返す
    while (x >= 0)
      // -が先に処理されるため、最初は1少ない状態に始まり、-1で終わる
      System.out.println(--x);
    // scannerの受付を終了
    scanner.close();
  }
}