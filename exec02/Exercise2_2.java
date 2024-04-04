package exec02;

/*
 * クラス名:Exercise2_2
 * 概要:三つのint型変数を用いて合計と平均を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_2 {
	/*
	 * 関数名:main
	 * 概要:三つのint型変数を用いて合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// int型の整数firstNumberを定義し、firstNumberに63を代入
		int firstNumber = 63;
		// int型の整数secondNumberを定義し、secondNumberに18を代入
		int secondNumber = 18;
		// int型の整数ThirdNumberを定義し、thirdNumberに50を代入
		int thirdNumber = 50;
		
		// 三つの値の合計値をコンソールに出力
		System.out.println("合計は" + (firstNumber + secondNumber + thirdNumber) + "です。");
		// 三つの値の平均値をコンソールに出力
		System.out.println("平均は" + (firstNumber + secondNumber + thirdNumber) / 3 + "です。");

	}

}
