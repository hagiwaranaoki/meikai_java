package exec02;
//Randomライブラリの読み込み
import java.util.Random;

/*
 * クラス名:Exercise2_7
 * 概要:乱数を使って1桁の正負の整数値、二桁の正の整数値を求めるメソッド
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */

public class Exercise2_7 {
	/*
	 * 関数名:main
	 * 概要:乱数を使って1桁の正負の整数値、二桁の正の整数値を求めるメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Randomクラスの変数を定義
		Random randomVariable = new Random();
		// ランダム用の定数を定義
		final int RANDAM_RANGE = 9;
		
		// 1~9の正の整数値を乱数で生成
		int randomPlus = randomVariable.nextInt(RANDAM_RANGE) + 1;
		// 1~9の負の整数値を乱数で生成
		int randomMinus = (randomVariable.nextInt(RANDAM_RANGE) + 1) * -1;
		// 10~99の正の整数値を乱数で生成
		int doubleDigitPlus = randomVariable.nextInt((RANDAM_RANGE * 10)) + 10;
		
		// 1~9の正の整数値の値を出力
		System.out.println("1桁の正の整数値は" + randomPlus + "です。");
		// 1~9の負の整数値の値を出力
		System.out.println("1桁の負の整数値は" + randomMinus + "です。");
		// 10~99の正の整数値の値を出力
		System.out.println("2桁の正の整数値は" + doubleDigitPlus + "です。");
	}
}
