package exec02;

/*
 * クラス名:Exercise2_1
 * 概要:int型の変数に少数を入れた際のテスト
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_1 {
	/*
	 * 関数名:main
	 * 概要:int型の変数に少数を入れた際のテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// 変数xを定義
		int x;
		// 変数yを定義
		int y;
		//少数部を持つ実数値に変更
		x = 63.2;
		//少数部を持つ実数値に変更
		y = 18.2;
		/*int型に少数部を持つ実数値の代入は型的に不可能なため、エラーが出る*/
		
		// x の値をコンソールに出力
		System.out.println("xの値は" + x + "です。");
		// yの値をコンソールに出力
		System.out.println("yの値は" + y + "です。");
		// xとyの合計値をコンソールに出力
		System.out.println("合計は" + (x + y) + "です。");
		// xとyの平均値をコンソールに出力
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}

}
