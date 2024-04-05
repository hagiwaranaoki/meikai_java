package exec06;
/*
 * クラス名:Exercise6_1
 * 概要:要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_1 {
	/*
	 * 関数名:main
	 * 概要:要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// 配列の要素数用の定数を定義
		final int ELEMENT_COUNT = 5;
		// 要素数が5のdouble型の配列を作成
		double[]doubleArray = new double[ELEMENT_COUNT];
		//0番目の要素
		doubleArray[0] = 5.1;
		//1番目の要素
		doubleArray[1] = 6.1;
		//2番目の要素
		doubleArray[2] = 5.8;
		//3番目の要素
		doubleArray[3] = 90.3;
		//4番目の要素
		doubleArray[4] = 10.4;
		
		// arrayの配列の要素数だけ繰り返し
		for (int i = 0; i < doubleArray.length; i++) {
			// arrayの要素を一行ずつ出力
			System.out.println(doubleArray[i]);
		}
	}

}
