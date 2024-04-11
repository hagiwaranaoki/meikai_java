package exec05;

/*
 * クラス名:Exercise5_6
 * 概要:float型の変数を0.0から1.0まで0.001ずつ増やしていく様子とint型の変数
	 			を0から1000までインクリメントした値を1000で割った値を求める様子を横に並べて表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise5_6 {
	/*
	 * 関数名:main
	 * 概要:float型の変数を0.0から1.0まで0.001ずつ増やしていく様子とint型の変数
	 			を0から1000までインクリメントした値を1000で割った値を求める様子を横に並べて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		//float側の合計を格納するfloat型の変数を宣言
		float floatTotal = 0.000F;
		// 1000の定数
		final int THOUSAND_NUMBER = 1000;
		//表題を表示
		System.out.println("   float\t\t   int\n----------------------------------");
		//int側のカウント用変数の値が1000を超えたらループ抜け
		for (int integerCount = 0; integerCount <= THOUSAND_NUMBER; integerCount++) {
			//int側のカウント用変数を1000で割り商をキャストしてint側の合計用の変数に格納
			float integerTotal = (float) integerCount / THOUSAND_NUMBER;
			//float側とint側の合計値をそれぞれ表示
			System.out.printf(String.format("%.7f", floatTotal) + "\t\t" + String.format("%.7f", integerTotal) + "\n");
			//float側の合計値をインクリメント
			floatTotal = floatTotal + 0.001F;
		}
	}
}
