package exec02;
//Randomライブラリの読み込み
import java.util.Random;

public class Exercise2_7 {
	/*
	 * 関数名:main
	 * 概要:乱数を使って1桁の正負の整数値、二桁の正の整数値を求めるメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
		// Randomクラスの変数を定義
		Random random = new Random();
		
		// 1~10の正の整数値を変数plusに代入
		int plus = random.nextInt(9) + 1;
		// 1~10の負の整数値をminusに代入
		int minus = (random.nextInt(9) + 1) * -1;
		// 10~99の正の整数値をdoubleDigitPlusに代入
		int doubleDigitPlus = random.nextInt(90) + 10;
		
		// plusの値を出力
		System.out.println("1桁の正の整数値は" + plus + "です。");
		// minusの値を出力
		System.out.println("1桁の負の整数値は" + minus + "です。");
		// doubleDigitPlusの値を出力
		System.out.println("2桁の正の整数値は" + doubleDigitPlus + "です。");
	}
}
