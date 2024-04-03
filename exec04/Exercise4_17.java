package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_17 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ整数値のすべての約数を表示し、約数の個数を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに整数値を入力するように指示
    System.out.print("整数値：");

    // ユーザーからの入力を読み取り
    int number = scanner.nextInt();

    // 約数の数をカウントするための変数を初期化
    int divisorCount = 0;

    // 1からnumberまでの全ての数について、numberがその数で割り切れるかどうかをチェック
    for (int i = 1; i <= number; i++) {
      // numberがiで割り切れる場合、iはnumberの約数
      if (number % i == 0) {
        // 約数を表示
        System.out.println(i);

        // 約数の数をカウントアップ
        divisorCount++;
      }
    }

    // 約数の数を表示
    System.out.println("約数の数は" + divisorCount + "個です");

    // scannerの受付を終了
    scanner.close();
  }
}
