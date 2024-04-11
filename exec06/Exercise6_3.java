package exec06;

/*
 * クラス名:Exercise6_3
 * 概要:double型の配列で要素数が5の配列の要素に対して、先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_3 {
	/*
	 * 関数名:main
	 * 概要:double型の配列で要素数が5の配列の要素に対して、先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// 配列の要素数用の定数を定義
		final int ELEMENT_COUNT = 5;
		// 要素数が5の配列を作成
		double[] doubleArray = new double[ELEMENT_COUNT];
		// iの要素数だけ繰り返す
		for (int i = 0; i < doubleArray.length; i++) {
			// sumAll変数にi+1を入れる
			int sumAll = i + 1;
			// double型の変数に11をかけて1の位が1,2...となるようにする
			double doubleNumber = (sumAll * 11);
			// 10で割る
			doubleArray[i] = (double) (doubleNumber / 10);
			//小数点付きの結果が出力
			System.out.println(doubleArray[i]);
		}
	}

}
