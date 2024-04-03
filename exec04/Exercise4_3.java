package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

public class Exercise4_3 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値の大きいほうから小さいほうまでの整数値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner scanner = new Scanner(System.in);
    // 整数Aをユーザーに入力するように指示
    System.out.print("整数A：");
    // ユーザーからの最初の整数入力を読み取る
    int firstNumber = scanner.nextInt();
    // 整数Bをユーザーに入力するように指示
    System.out.print("整数B：");
    // ユーザーからの二つ目の整数入力を読み取る
    int secondNumber = scanner.nextInt();

    // 二つの数を小さい順にソート
    if (firstNumber > secondNumber) {
      // 一時的な変数を作成して最初の数を保存
      int temporary = firstNumber;
      // 最初の数に二つ目の数を代入
      firstNumber = secondNumber;
      // 二つ目の数に一時的な変数（元の最初の数）を代入
      secondNumber = temporary;
    }

    // 小さい数から大きい数までの全整数を表示
    for (int i = firstNumber; i <= secondNumber; i++) {
      // iの値を表示
      System.out.print(i + " ");
    }
    // scannerの受付を終了
    scanner.close();
  }
}
