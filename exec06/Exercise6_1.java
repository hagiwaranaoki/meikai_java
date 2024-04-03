package exec06;

public class Exercise6_1 {
	/*
	 * 関数名:main
	 * 概要:要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/02
	 */
	public static void main(String[] args) {
		// 要素数が5の配列array
		double[]array = new double[5];
		//0番目
		array[0] = 5.1;
		//1番目
		array[1] = 6.1;
		//2番目
		array[2] = 5.8;
		//3番目
		array[3] = 90.3;
		//4番目
		array[4] = 10.4;
		
		// arrayの配列の要素数だけ繰り返し
		for (int i = 0; i < array.length; i++) {
			// arrayの要素を一行ずつ出力
			System.out.println(array[i]);
		}
	}

}
