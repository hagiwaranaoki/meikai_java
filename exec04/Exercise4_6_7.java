package exec04;
// Scannerクラスをインポートします
import java.util.Scanner;
/*
 * クラス名:Exercise4_6_7
 * 概要:読み込んだ値が一以上であれば改行する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_6_7 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ値が一以上であれば改行する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner standardInput = new Scanner(System.in);

    // ユーザーに何個のアスタリスクを表示するか尋ねる
    System.out.print("何個*を表示しますか：");

    // ユーザーからのアスタリスクの個数の入力を読み取る
    int numberOfAsterisks = standardInput.nextInt();

    // アスタリスクカウンタ変数を初期化
    int asteriskCounter = 0;

    // アスタリスクカウンタがアスタリスクの個数より小さい間、ループ
    while (asteriskCounter < numberOfAsterisks) {
      // アスタリスクを表示
      System.out.print('*');

      // アスタリスクカウンタをインクリメント
      asteriskCounter++;
    }

    // アスタリスクの個数が1以上の場合、改行
    if (numberOfAsterisks >= 1) {
      // 改行する
      System.out.println();
    }
    // scannerの受付を終了
    standardInput.close();
  }
}