package exec13;

/*
 * クラス名:Shape
 * 概要:図形の概念を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public abstract class Shape {
	/*
	 * 関数名:toString
	 * 概要:図形情報を表す文字列を返却する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public abstract String toString();
	
	/*
	 * 関数名:draw
	 * 概要:図形を描画する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public abstract void draw();
	
	/*
	 * 関数名:print
	 * 概要:図形情報の表示と図形の描画
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void print() {
		// toStringメソッドが返却する文字列を表示して改行
		System.out.println(toString());
		// 図形の描画
		draw();
	}
}
