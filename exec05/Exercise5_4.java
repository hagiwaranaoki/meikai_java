package exec05;

import java.util.Scanner;

public class Exercise5_4 {
	/*
	 * 関数名:main
	 * 概要:三つの整数値の合計と平均（実数値）を表示する。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/02
	 */
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーに一つ目の整数を入力するように促す
    System.out.print("整数1を入力してください：");
    // コンソールの入力待機
    int number1 = scanner.nextInt();
    // ユーザーに一つ目の整数を入力するように促す
    System.out.print("整数2を入力してください：");
    // コンソールの入力待機
    int number2 = scanner.nextInt();
    // ユーザーに一つ目の整数を入力するように促す
    System.out.print("整数3を入力してください：");
    // コンソールの入力待機
    int number3 = scanner.nextInt();

    // 三つの整数の合計を計算
    int sum = number1 + number2 + number3;

    // 三つの整数の平均を計算（実数として）
    double average = (double) sum / 3;

    // 合計を表示
    System.out.println("合計は" + sum + "です。");
    // 平均を表示
    System.out.println("平均は" + average + "です。");
  }
}
