package exec10;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise10_3
 * 概要:入力を受け付けてMinMaxのテスト
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise10_3 {
	/*
	 * 関数名:main
	 * 概要:入力を受け付けてMinMaxのテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		// 二値での数値を求める時用の定数
		final int TWO_VALUE = 1;
		// 配列での数値を求める時用の定数
		final int ARRAY_VALUE = 3;
		// 三値での数値を求めるとき用の定数
		final int THREE_VALUE = 2;
		// 数値の入力を促す
		System.out.print("二値...1/三値...2/配列...3:");
		// コンソールにて番号を受け付け
		int numberChoice = standardInput.nextInt();
		//1~3以外が入力されたとき
		while (numberChoice < TWO_VALUE || numberChoice > ARRAY_VALUE) {
			// 1-3の入力を促す
			System.out.print("1~3を入力してください:");
			// コンソールにて番号を受け付け
			numberChoice = standardInput.nextInt();
		}

		// 1が選ばれたとき
		if (numberChoice == TWO_VALUE) {
			// xの値の入力を促す
			System.out.print("xの値:");
			// 一つ目の実数を受け付け
			double firstVariable = standardInput.nextDouble();
			// yの値の入力を促す
			System.out.print("yの値:");
			// 二つ目の実数を受け付け
			double secondVariable = standardInput.nextDouble();
			// 最大値を求める
			System.out.println("最大値は" + MinMax.getMaximumTwo(firstVariable, secondVariable) + "です。");
			// 最小値を求める
			System.out.println("最小値は" + MinMax.getMinimumTwo(firstVariable, secondVariable) + "です。");
			// 2が選ばれたとき
		} else if (numberChoice == THREE_VALUE) {
			// xの値の入力を促す
			System.out.print("xの値:");
			// 一つ目の整数の入力を受け付け
			double firstVariable = standardInput.nextDouble();
			// yの値の入力を促す
			System.out.print("yの値:");
			// 二つ目の整数の入力を受け付け
			double secondVariable = standardInput.nextDouble();
			// zの値の入力を促す
			System.out.print("zの値:");
			// 三つ目の整数の入力を受け付け
			double thirdVariable = standardInput.nextDouble();
			// 最大値を求める
			System.out.println("最大値は" + MinMax.getMaximumThree(firstVariable, secondVariable, thirdVariable) + "です。");
			// 最小値を求める
			System.out.println("最小値は" + MinMax.getMinimumThree(firstVariable, secondVariable, thirdVariable) + "です。");
			// 3が選ばれたとき
		} else if (numberChoice == ARRAY_VALUE) {
			// 要素数の入力を促す
			System.out.print("要素数:");
			// 要素数を受け付け
			int elementCount = standardInput.nextInt();
			// 要素数が1より小さい場合
			while (elementCount < 1) {
				// 正の整数の入力を促す
				System.out.print("要素数は正の整数値を入力してください:");
				// 要素数を受け付け
				elementCount = standardInput.nextInt();
			}
			// double型の配列を作成
			double[] doubleArray = new double[elementCount];
			// 大小を求めることを知らせる
			System.out.println("要素数" + elementCount + "の数の大小を求めます。");
			// 要素数分繰り返し
			for (int i = 0; i < elementCount; i++) {
				// 何番目の要素化を表示
				System.out.print("a[" + i + "]:");
				// 配列に値を格納
				doubleArray[i] = standardInput.nextDouble();
			}
			// 最大値を表示
			System.out.println("最大値は" + MinMax.getMaximumArray(doubleArray) + "です。");
			// 最小値を表示
			System.out.println("最小値は" + MinMax.getMinimumArray(doubleArray) + "です。");
		}
	}
}
