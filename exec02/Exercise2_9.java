package exec02;
//Randomライブラリの読み込み
import java.util.Random;

/*
 * クラス名:Exercise2_9
 * 概要:正負の0.0~10.0の実数値と、正の0.0~10.0の実数値を作成する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_9 {
	/*
	 * 関数名:main
	 * 概要:正負の0.0~10.0の実数値と、正の0.0~10.0の実数値を作成する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Randomクラスの変数を定義
		Random randomVariable = new Random();
		
		// 乱数の範囲用の定数を定義
		final int RANDOM_RANGE = 10;
		// 狭い乱数の範囲用の定数を定義
		final int RANDOM_RANGE_MINIMUM = 2;
		
		// 0.0~1.0の実数値をランダムに代入
		double firstNumber = randomVariable.nextDouble();
		// 0.0~10.0の実数値をランダムに代入
		double secondNumber = randomVariable.nextDouble(RANDOM_RANGE);
		// 0.0~1.0の実数値をランダムに代入
		double thirdNumber = randomVariable.nextDouble();
		// 0か1の整数値をランダムに代入
		int randomNumber = randomVariable.nextInt(RANDOM_RANGE_MINIMUM);
		// double3から0または1を引いた値をdouble3として上書き
		thirdNumber = thirdNumber - randomNumber;
		// double1の値を出力
		System.out.println("0.0以上1.0未満の実数値：" + firstNumber + "です。");
		// double2の値を出力
		System.out.println("0.0以上10.0未満の実数値：" + secondNumber + "です。");
		// double3の値を出力
		System.out.println("-1.0以上1.0未満の実数値：" + thirdNumber + "です。");
	}
}
