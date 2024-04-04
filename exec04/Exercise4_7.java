package exec04;

// Scannerクラスをインポート
import java.util.Scanner;
/*
 * クラス名:Exercise4_7
 * 概要:読み込んだ値の個数だけアスタリスクを表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_7 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ値の個数だけアスタリスクを表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner standardInput = new Scanner(System.in);

    // ユーザーに何個の記号文字を表示するか尋ねる
    System.out.print("何個*を表示しますか：");

    // ユーザーからのアスタリスクを表示したい個数の入力を読み取る
    int numberOfSymbols = standardInput.nextInt();

    // カウンタ変数を初期化
    int asteriskCounter = 0;

    // カウンタがアスタリスクを表示したい個数より小さい間、ループ
    while (asteriskCounter < numberOfSymbols) {
      // 記号文字を表示
      System.out.print('*');

      // カウンタをインクリメント
      asteriskCounter++;
    }

    // 改行
    System.out.println();
    // scannerの受付を終了
    standardInput.close();
  }
}