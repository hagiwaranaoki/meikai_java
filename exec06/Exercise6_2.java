package exec06;

public class Exercise6_2 {
	/*
	 * 関数名:main
	 * 概要:int型の配列で要素数が5の配列の要素に対して、先頭から順に5~1を代入して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// 要素数が5のint型の配列arrayを定義
		int[] array = new int[5];
		
		// intが0になるまで繰り返す
		for (int i = 5; i > 0; i--) {
			// arrayの要素数は5なのでi-1から入れる
			array[i-1] = i;
			// 結果を出力
			System.out.println(array[i-1]);
		}
	}

}
