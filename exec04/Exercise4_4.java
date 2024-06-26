package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_4
 * 概要:カウントダウンをする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_4 {
	/*
	 * 関数名:main
	 * 概要:カウントダウンをする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner standardInput = new Scanner(System.in);

    // ユーザーにカウントダウンの開始を告げる
    System.out.println("カウントダウンします");

    // カウントダウンする数値を格納する変数を定義
    int countdownNumber = 0;

    // ユーザーから正の整数値を入力してもらうまで繰り返す
    do {
      // ユーザーに正の整数値を入力するよう促す
      System.out.print("正の整数値：");
      // コンソールから値を受け取る
      countdownNumber = standardInput.nextInt();
      // 0以下の場合は繰り返す
    } while (countdownNumber <= 0);

    // 入力された数値から0までカウントダウン
    while (countdownNumber >= 0) {
      // カウントダウンを表示
      System.out.println(countdownNumber);
      // カウントダウンから-1
      countdownNumber--;
    }

    // while文が終了した時点でのカウントダウンの値を表示
    System.out.println("while文が終了した時点でのcountdownNumberの値は " + countdownNumber + " です");

    // standardInputの受付を終了
    standardInput.close();
  }
}
