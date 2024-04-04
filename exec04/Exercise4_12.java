package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_12 {
	/*
	 * 関数名:main
	 * 概要:0空性の整数値までカウントアップする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);

    // ユーザーに正の整数値を入力するように指示
    System.out.print("正の整数値：");

    // ユーザーからの入力を読み取り
    int number = scanner.nextInt();

    // 0からnumberまでカウントアップ
    for (int counter = 0; counter <= number; counter++) {
      // counterを表示
      System.out.println(counter);
    }
    // scannerの受付を終了
    scanner.close();
  }
}