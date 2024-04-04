package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_5
 * 概要:x--を--xにした際のテスト
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_5 {
	/*
	 * 関数名:main
	 * 概要:x--を--xにした際のテスト
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
    // int型の変数xを定義
    int x;
    // 繰り返し
    do {
      // ユーザーに正の整数値入力を促す
      System.out.print("正の整数値：");
      // コンソールから値を取得
      x = standardInput.nextInt();
      // 0以下なら繰り返す
    } while (x <= 0);
    // xが0以上の時繰り返す
    while (x >= 0) {
      // -が先に処理されるため、最初は1少ない状態に始まり、-1で終わる
      System.out.println(--x);
    }
    // standardInputの受付を終了
    standardInput.close();
  }
}