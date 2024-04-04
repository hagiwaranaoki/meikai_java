package exec04;
// Scannerクラスをインポートします
import java.util.Scanner;

public class Exercise4_6_7 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ値が一以上であれば改行する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに何個のアスタリスクを表示するか尋ねる
    System.out.print("何個*を表示しますか：");

    // ユーザーからの入力を読み取る
    int numberOfAsterisks = scanner.nextInt();

    // カウンタ変数を初期化
    int counter = 0;

    // カウンタがnumberOfAsterisksより小さい間、ループ
    while (counter < numberOfAsterisks) {
      // アスタリスクを表示
      System.out.print('*');

      // カウンタをインクリメント
      counter++;
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