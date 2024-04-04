package exec03;
// Scannerライブラリの呼び出し
import java.util.Scanner;

/*
 * クラス名:Exercise3_12
 * 概要:三つの整数値の最小値を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_12 {
	/*
	 * 関数名:main
	 * 概要:三つの整数値の最小値を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数a：");
		// int型の変数aにコンソールから値を受け付け
		int a = standardInput.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数b：");
		// int型の変数bにコンソールから値を受け付け
		int b = standardInput.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数c：");
		// int型の変数cにコンソールから値を受け付け
		int c = standardInput.nextInt();
		
		//int型の変数minimumValueにaを代入
		int minimumValue = a;
		// bよりもminimumValueが大きいとき
		if (b < minimumValue)
			// minimumValueにbを代入
			minimumValue = b;
		// cよりもminimumValueが大きいとき
		if (c < minimumValue)
			// minimumValueにcを代入
			minimumValue = c;
		// 最小値を出力
		System.out.println("最小値は" + minimumValue + "です。");
		// standardInputの受付を終了
		standardInput.close();
	}
}
