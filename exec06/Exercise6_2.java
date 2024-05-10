package exec06;

/*
 * クラス名:Exercise6_2
 * 概要:int型の配列で要素数が5の配列の要素に対して、先頭から順に5~1を代入して表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
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
		// 配列の要素数用の定数を定義
		final int ELEMENT_COUNT = 5;
		// 要素数が5のint型の配列を定義
		int[] integerArray = new int[ELEMENT_COUNT];
		
		// 代入用の変数を定義
		int substitutionValue = 5;
		//カウントをインクリメントしながらカウントが5になったらループ抜け
		for (int i = 0; i < ELEMENT_COUNT; i++) {
			//配列に代入用の変数の値を1つ1つ代入
			integerArray[i] = substitutionValue;
			//配列の値を表示
			System.out.println(integerArray[i]);
			//代入用の変数の値をデクリメント
			substitutionValue--;
		}
	}

}
