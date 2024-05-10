package exec10;
/*
 * クラス名:MinMax
 * 概要:最小値や最大値を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class MinMax {
	/*
	 * 関数名:getMaximumThree
	 * 概要:3値の最大値を求める
	 * 引数:三つの実数
	 * 戻り値:三つの値の最大値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static double getMaximumThree(double firstVariable, double secondVariable, double thirdVariable) {
		//二つの値の最大値を求める
		double firstMaximum = Math.max(firstVariable, secondVariable);
		// 三つの値の最大値を求める
		double secondMaximum = Math.max(firstMaximum, thirdVariable);
		// 三つの値の最大値を返す
		return secondMaximum;
	}
	
	/*
	 * 関数名:getMainimumThree
	 * 概要:3値の最小値を求める
	 * 引数:三つの実数
	 * 戻り値:三つの値の最小値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static double getMinimumThree(double firstVariable, double secondVariable, double thirdVariable) {
		//二つの値の最小値
		double firstMinimum = Math.min(firstVariable, secondVariable);
		// 三つの値の最小値
		double secondMinimum = Math.min(firstMinimum, thirdVariable);
		// 三つの値の最小値を返す
		return secondMinimum;
	}
	
	/*
	 * 関数名:getMaximumTwo
	 * 概要:2値の最大値を求める
	 * 引数:2つの実数
	 * 戻り値:2つの値の最大値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static double getMaximumTwo(double firstVariable, double secondVariable) {
		// 最大値を求める
		double maximumValue = Math.max(firstVariable, secondVariable);
		// 最大値を返す
		return maximumValue;
	}
	
	/*
	 * 関数名:getMainimumTwo
	 * 概要:2値の最小値を求める
	 * 引数:2つの実数
	 * 戻り値:2つの値の最小値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static double getMinimumTwo(double firstVariable, double secondVariable) {
		// 2値の最小値を求める
		double minimumValue = Math.min(firstVariable, secondVariable);
		// 2値の最小値を返す
		return minimumValue;
	}
	
	/*
	 * 関数名:getMaximumArray
	 * 概要:配列の中の最大値を求める
	 * 引数:double型の配列
	 * 戻り値:2つの値の最大値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static double getMaximumArray(double[] arrayVariable) {
		// 最大値を初期化
		double maximumValue = arrayVariable[0];
		// 配列の要素数だけ繰り返す
		for (int i = 0; i < arrayVariable.length; i++) {
			// 配列の最大値を求める
			maximumValue = Math.max(maximumValue, arrayVariable[i]);
		}
		// 最大値を返す
		return maximumValue;
	}
	
	/*
	 * 関数名:getMinimumArray
	 * 概要:配列の最小値を求める
	 * 引数:double型の配列
	 * 戻り値:配列の中の最小値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static double getMinimumArray(double[] arrayVariable) {
		// 最小値を初期化
		double minimumValue = arrayVariable[0];
		// 配列の要素数分繰り返す
		for (int i = 0; i < arrayVariable.length; i++) {
			// 最小値を求める
			minimumValue = Math.min(minimumValue, arrayVariable[i]);
		}
		// 最小値を返す
		return minimumValue;
	}

}
