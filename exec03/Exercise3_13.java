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
		Scanner scanner = new Scanner(System.in);
		// 文字列を改行なしで出力
		System.out.print("整数a：");
		// int型の変数aにコンソールから値を受け付け
		int a = scanner.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数b：");
		// int型の変数bにコンソールから値を受け付け
		int b = scanner.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数c：");
		// int型の変数cにコンソールから値を受け付け
		int c = scanner.nextInt();
		//int型の変数middleを定義
		int middleValue = 0;
		// c>=a>=bのときまたはc<=a<=bのとき
		if ((a >= b && a <= c) || (a <= b && a >= c)) {
			// middleValueにaを代入
			middleValue = a;
		// a<=b<=cのときまたはc<=b<=aのとき
		} else if ((b >= a && b <= c) || (b <= a && b >= c)) {
			// middleValueにbを代入
			middleValue = b;
			//それ以外の場合（cが中央の場合)
		} else {
			// middleValueにcを代入
			middleValue = c;
		}
		// 中央値を出力
		System.out.println("中央値は" + middleValue + "です。");
		//scannerの受付を終了
		scanner.close();
	}
}
