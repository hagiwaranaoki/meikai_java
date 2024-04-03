package exec05;

import java.util.Scanner;

public class Exercise5_1 {
	/*
	 * 関数名:main
	 * 概要:入力された10進数を8進数と16進数で表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/02
	 */
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーに10進整数を入力するように促す
    System.out.print("10進整数を入力してください：");
    // ユーザーからの入力を整数として受け取り、decimalNumberという変数に格納
    int decimalNumber = scanner.nextInt();

    // 10進整数を8進数に変換
    String octalNumber = Integer.toOctalString(decimalNumber);
    // 出力
    System.out.println("8進数では " + octalNumber + " です。");

    // 10進整数を16進数に変換
    String hexadecimalNumber = Integer.toHexString(decimalNumber);
    // 出力
    System.out.println("16進数では " + hexadecimalNumber + " です。");
  }
}
