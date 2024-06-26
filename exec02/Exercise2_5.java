package exec02;
//Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise2_5
 * 概要:double型の実数値を受け付け、合計と平均を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_5 {
	/*
	 * 関数名:main
	 * 概要:double型の実数値を受け付け、合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		// 文字列を改行なしで出力
		System.out.print("xの値:");
		// double型の少数を持った実数値の値をコンソールで受け付け
		double x = standardInput.nextDouble();

		// 文字列を改行なしで出力
		System.out.print("yの値:");
		// int型の整数値yの値をコンソールで受け付け
		double y = standardInput.nextDouble();
		
		//xとyの合計値を出力
		System.out.println("合計は" + (x + y) + "です。");
		//xとyの平均値を出力
		System.out.println("平均は" + ((x + y) / 2) + "です。");
		// scannerの受付を終了
		standardInput.close();
  }
}
