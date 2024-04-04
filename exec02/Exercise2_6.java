package exec02;
//Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise2_6
 * 概要:三角形の面積を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_6 {
	/*
	 * 関数名:main
	 * 概要:三角形の面積を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		// 文字列を改行ありで出力
		System.out.println("三角形の面積を求めます。");
		
		// 文字列を改行なしで出力
		System.out.print("底辺:");
		// double型の変数triangleBottomの値をコンソールで受け付け
		double triangleBottom = standardInput.nextDouble();
		// 文字列を改行なしで出力
		System.out.print("高さ:");
		// double型の変数triangleHeightの値をコンソールで受け付け
		double triangleHeight = standardInput.nextDouble();
		
		// 三角形の面積を出力
		System.out.println("面積は" + ((triangleBottom * triangleHeight) / 2) + "です。");
		
		standardInput.close();
  }
}