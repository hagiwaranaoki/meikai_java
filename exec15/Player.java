package exec15;

/*
 * クラス名:Player
 * 概要:プレーヤの概念を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public abstract class Player {
	/*
	 * 関数名:toString
	 * 概要:プレーヤ情報を表す文字列を返却する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public abstract String toString();

	/*
	 * 関数名:print
	 * 概要:プレーヤ情報の表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void print() {
		// プレーや情報の出力
		System.out.println(toString());
	}
}