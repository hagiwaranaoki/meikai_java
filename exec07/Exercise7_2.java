package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_2
 * 概要:与えられたint型の値の最小値を求め、出力
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise7_2 {
	/*
	 * 関数名:min
	 * 概要:引数の最小値を調べる
	 * 引数:int型変数a,b,c
	 * 戻り値:最小値を表すminimumVariable
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	static int min(int a, int b, int c) {
		// 最小値をaで初期化
		int minimumVariable = a;
		// bよりも最小値が大きいとき
		if (minimumVariable > b) {
			// 最小値をbに設定
			minimumVariable = b;
		}
		// cよりも最小値が大きいとき
		if (minimumVariable > c) {
			// 最小値をcに変更
			minimumVariable = c;
		}
		// 最小値を返す
		return minimumVariable;
	}

	/*
	 * 関数名:main
	 * 概要:引数の最小値を調べて出力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);

		// 一つ目の整数の入力を促す
		System.out.print("一つ目の整数値：");
		// 一つ目の整数値を受け付け
		int firstNumber = standardInput.nextInt();
		// 二つ目の整数の入力を促す
		System.out.print("二つ目の整数値：");
		// 二つ目の整数値を受け付け
		int secondNumber = standardInput.nextInt();
		// 三つ目の整数の入力を促す
		System.out.print("三つ目の整数値：");
		// 三つ目の整数値を受け付け
		int thirdNumber = standardInput.nextInt();

		// 最小値をメソッドで求めて表示
		System.out.println("最小値は" + min(firstNumber, secondNumber, thirdNumber));
	}

}
