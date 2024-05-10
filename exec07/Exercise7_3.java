package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_3
 * 概要:三つの値の中央値を求めて表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise7_3 {
	/*
	 * 関数名:med
	 * 概要:三つの引数の中央値を調べる
	 * 引数:int型変数a,b,c
	 * 戻り値:中央値を表すmiddleValue
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static int med(int a, int b, int c) {
		// 中央値をaで初期化
		int middleValue = a;
		// aとbが同じ値またはbとcが同じ値の場合
		if (a == b || b == c) {
			// 中央値をbにする
			middleValue = b;
			// aとcが同じ場合
		} else if (a == c) {
			// 中央値をcにする
			middleValue = c;
			// 中央値よりもbが大きく、bよりもcが大きいまたはbよりも中央値が小さく、cよりもbが大きい場合
		} else if (((b > middleValue) && (c > b)) || ((b < middleValue) && (c < b))) {
			// 中央値をbにする
			middleValue = b;
			// 中央値よりもcが大きく、cよりもbが大きいまたはcよりも中央値が小さく、bよりもcが大きい場合
		} else if (((c > middleValue) && (b > c)) || ((c < middleValue) && (b < c))) {
			// 中央値をcにする
			middleValue = c;
		}
		// 中央値を返す
		return middleValue;
	}

	/*
	 * 関数名:main
	 * 概要:三つの値の中央値を求めて表示
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
		// 一つ目の整数
		int firstNumber = standardInput.nextInt();

		// 二つ目の整数の入力を促す
		System.out.print("二つ目の整数:");
		// 二つ目の整数
		int secondNumber = standardInput.nextInt();

		// 三つ目の整数の入力を促す
		System.out.print("三つ目の整数値：");
		// 三つ目の整数
		int thirdNumber = standardInput.nextInt();

		// 中央値を出力
		System.out.println("中央値：" + med(firstNumber, secondNumber, thirdNumber));
	}

}
