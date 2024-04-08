package exec04;
// Scannerクラスをインポート
import java.util.Scanner;
/*
 * クラス名:Exercise4_9
 * 概要:入力された整数値までの積を計算
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_9 {
	/*
	 * 関数名:main
	 * 概要:入力された整数値までの積を計算
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner standardInput = new Scanner(System.in);

    // ユーザーにnの値を入力するように指示
    System.out.print("nの値：");

    // ユーザーからnの入力を読み取る
    int n = standardInput.nextInt();

    // 積を計算するための変数を定義
    long productNumber = 1;

    // 1からnまでの積を計算
    for (int i = 1; i <= n; i++) {
      // iをかけていく
      productNumber *= i;
    }

    // 積を出力
    System.out.println("1から" + n + "までの積は" + productNumber + "です");
    // scannerの受付を終了
    standardInput.close();
  }
}
