package exec06;

public class Exercise6_3 {
	/*
	 * 関数名:main
	 * 概要:double型の配列で要素数が5の配列の要素に対して、先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/02
	 */
	public static void main(String[] args) {
		// 要素数が5の配列array
		double[] array = new double[5];
		// iの要素数だけ繰り返す
		for (int i = 0; i < array.length; i++) {
			// sum変数にi+1を入れる
			int sum = i + 1;
			// double型のnumberに11をかけて1の位が1,2...となるようにする
			double number = (sum * 11);
			// 10で割る
			array[i] = (double)(number / 10);
			//小数点付きの結果が出力
			System.out.println(array[i]);
		}
	}

}
