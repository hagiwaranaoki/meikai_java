package exec03;
// Scannerライブラリを読み込む
import java.util.Scanner;

/*
 * クラス名:Exercise3_13
 * 概要:三つの整数の中央値を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_13 {
	/*
	 * 関数名:main
	 * 概要:三つの整数の中央値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] main) {
		//Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);

		// 文字列を改行なしで出力
		System.out.print("一つ目の整数：");
		// 一つ目の整数の値をコンソールで受け付け
		int firstNumber = standardInput.nextInt();
		// 文字列を改行なしで出力
		System.out.print("二つ目の整数：");
		// 二つ目の整数の値をコンソールで受け付け
		int secondNumber = standardInput.nextInt();
		// 文字列を改行なしで出力
		System.out.print("三つ目の整数：");
		// 三つ目の整数の値をコンソールで受け付け
		int thirdNumber = standardInput.nextInt();

		//中央値の変数を定義
		int middleValue = 0;
		// 一つ目の整数が中央に来る
		if ((firstNumber >= secondNumber && firstNumber <= thirdNumber) || (firstNumber <= secondNumber && firstNumber >= thirdNumber)) {
			// middleValueに一つ目の整数を代入
			middleValue = firstNumber;
		// 二つ目の整数が中央に来る
		} else if ((secondNumber >= firstNumber && secondNumber <= thirdNumber) || (secondNumber <= firstNumber && secondNumber >= thirdNumber)) {
			// middleValueに二つ目の整数を代入
			middleValue = secondNumber;
			//それ以外の場合（三つ目の整数が中央の場合)
		} else {
			// middleValueに三つ目の整数を代入
			middleValue = thirdNumber;
		}
		// 中央値を出力
		System.out.println("中央値は" + middleValue + "です。");
		//scannerの受付を終了
		standardInput.close();
	}
}
