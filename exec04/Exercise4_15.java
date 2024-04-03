package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_15 {
  /*
	 * 関数名:main
	 * 概要:身長と標準体重の対応表を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに身長の範囲の開始値を入力するように指示
    System.out.print("何cmから：");
    // コンソールの入力を待機
    int startHeight = scanner.nextInt();

    // ユーザーに身長の範囲の終了値を入力するように指示
    System.out.print("何cmまで：");
    // コンソールの入力を待機
    int endHeight = scanner.nextInt();

    // ユーザーに身長の範囲の増分を入力するように指示
    System.out.print("何cmごと：");
    // コンソールの入力を待機
    int increment = scanner.nextInt();

    // 身長と標準体重のヘッダーを表示
    System.out.println("身長　標準体重");

    // 開始値から終了値までの身長とそれに対応する標準体重を表示
    for (int height = startHeight; height <= endHeight; height += increment) {
      // 標準体重の計算
      double standardWeight = (height - 100) * 0.9;
      // 身長と標準体重を表示
      System.out.println(height + "      " + standardWeight);
    }
    // scannerの受付を終了
    scanner.close();
  }
}
