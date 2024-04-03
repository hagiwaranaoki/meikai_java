package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_10 {
	/*
	 * 関数名:main
	 * 概要:アスタリスクを入力の数値分表示。1未満であれば改行文字を出力しない
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに何個のアスタリスクを表示するか尋ねる
    System.out.print("何個*を表示しますか：");

    // ユーザーからの入力を読み取る
    int numberOfAsterisks = scanner.nextInt();

    // numberOfAsterisksの数だけアスタリスクを表示
    for (int counter = 0; counter < numberOfAsterisks; counter++) {
      // アスタリスクを表示
      System.out.print('*');
    }

    // numberOfAsterisksが1以上の場合、改行
    if (numberOfAsterisks >= 1) {
      // 改行する
      System.out.println();
    }
    // scannerの受付を終了
    scanner.close();
  }
}
