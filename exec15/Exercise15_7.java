package exec15;

/*
 * クラス名:Exercise15_7
 * 概要:コマンドライン引数の値の総和
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_7 {
	/*
	 * 関数名:main
	 * 概要:コマンドライン引数の値の総和
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		//合計値を入れる変数
		double sum = 0.0;
		// 拡張for文でコマンドライン引数の数分繰り返し
		for (String argsValue : args) {
			// 合計値を加算していく
			sum += Double.parseDouble(argsValue);
		}
		// 合計値を出力
		System.out.println("合計は" + sum + "です。");
	}
}
