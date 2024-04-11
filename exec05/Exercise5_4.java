package exec05;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise5_4
 * 概要:三つの整数値の合計と平均（実数値）を表示する。
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise5_4 {
	/*
	 * 関数名:main
	 * 概要:三つの整数値の合計と平均（実数値）を表示する。
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// ユーザーに一つ目の整数を入力するように促す
		System.out.print("一つ目の整数を入力してください：");
		// 一つ目の整数をコンソールで入力待機
		int firstNumber = standardInput.nextInt();
		// ユーザーに二つ目の整数を入力するように促す
		System.out.print("二つ目の整数を入力してください：");
		// 二つ目の整数をコンソールで入力待機
		int secondNumber = standardInput.nextInt();
		// ユーザーに三つ目の整数を入力するように促す
		System.out.print("三つ目の整数を入力してください：");
		// 三つ目の整数をコンソールで入力待機
		int thirdNumber = standardInput.nextInt();

		// 三つの整数の合計を計算
		int sumAll = firstNumber + secondNumber + thirdNumber;

		// 三つの整数の平均を計算（実数として）
		double tripleAverage = (double) sumAll / 3;

		// 合計を表示
		System.out.println("合計は" + sumAll + "です。");
		// 平均を表示
		System.out.println("平均は" + tripleAverage + "です。");
	}
}
