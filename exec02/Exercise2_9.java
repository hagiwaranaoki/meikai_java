package exec02;
//Randomライブラリの読み込み
import java.util.Random;

public class Exercise2_9 {
	/*
	 * 関数名:main
	 * 概要:正負の0.0~10.0の実数値と、正の0.0~10.0の実数値を作成する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
		// Randomクラスの変数を定義
		Random random = new Random();
		
		// 0.0~1.0の実数値をランダムに変数double1に代入
		double double1 = random.nextDouble();
		// 0.0~10.0の実数値をランダムに変数double2に代入
		double double2 = random.nextDouble(10);
		// 0.0~1.0の実数値をランダムに変数double3に代入
		double double3 = random.nextDouble();
		// 0か1の整数値をランダムに変数numberに代入
		int number = random.nextInt(2);
		// double3から0または1を引いた値をdouble3として上書き
		double3 = double3 - number;
		// double1の値を出力
		System.out.println("0.0以上1.0未満の実数値：" + double1 + "です。");
		// double2の値を出力
		System.out.println("0.0以上10.0未満の実数値：" + double2 + "です。");
		// double3の値を出力
		System.out.println("-1.0以上1.0未満の実数値：" + double3 + "です。");
	}
}
