package exec09;
// 人間クラスをインポート
import exec08.Human;

/*
 * クラス名:Exercise9_4
 * 概要:Humanクラスの確認をする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise9_4 {
	/*
	 * 関数名:main
	 * 概要:Humanクラスの確認をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// 人間の名前の定数
		final String HUMAN_NAME = "test";
		// 人間の身長の定数
		final double HUMAN_HEIGHT = 182;
		// 人間の体重の定数
		final double HUMAN_WEIGHT = 68;
		// 年の定数
		final int YEAR_VALUE = 2000;
		// 月の定数
		final int MONTH_VALUE = 1;
		// 日の定数
		final int DAY_VALUE = 1;
		// 人間クラスのオブジェクトを生成
		Human firstHuman = new Human(HUMAN_NAME, HUMAN_HEIGHT, HUMAN_WEIGHT, new Day(YEAR_VALUE, MONTH_VALUE, DAY_VALUE));
		// 人間クラスの中身を表示
		System.out.print(firstHuman.toString());
	}
}
