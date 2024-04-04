package exec02;
//Randomライブラリの読み込み
import java.util.Random;
//Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise2_8
 * 概要:コンソールで受け取った値の±5の乱数を生成するメソッド
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_8 {
	/*
	 * 関数名:main
	 * 概要:コンソールで受け取った値の±5の乱数を生成するメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		// Randomクラスの変数を定義
		Random randomVariable = new Random();
		// 乱数の範囲用の定数を定義
		final int RANDOM_RANGE = 11;

		// 文字列を改行なしで出力
		System.out.print("整数値：");
		// 整数値をコンソールで受け付け
		int integerNumber = standardInput.nextInt();
		// -5~5の値を乱数で生成
		int randomPlusMinus = randomVariable.nextInt(RANDOM_RANGE) - 5;
		// 入力された整数値の±5の乱数を出力
		System.out.println("その値の±5の乱数を生成しました。それは" + (integerNumber + randomPlusMinus) + "です。");
		// 入力の受付を終了
		standardInput.close();
	}
}
