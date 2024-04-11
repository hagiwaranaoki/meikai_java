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
		// ヘッダーを表示
		System.out.println("float\tint");
		// 点線を表示
		System.out.println("--------------------");

		// float型の変数を0.0から1.0まで0.001ずつ増やす
		for (float f = 0.0f; f <= 1.0f; f += 0.001f) {
			// int型の変数を0から1000までインクリメント
			int incrementNumber = (int) (f * 1000);
			// 1000で割る
			double divideThousand = incrementNumber / 1000.0;

			// float型の変数と計算結果を表示
			System.out.printf("%f\t%f\n", f, divideThousand);
		}
	}
}
