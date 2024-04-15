package exec13;
/*
 * クラス名:Point
 * 概要:点を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Point extends Shape{
	/*
	* コンストラクタ名:Point
	* 概要:点を生成する
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public Point() {
		
	}
	
	/*
	 * 関数名:toString
	 * 概要:点に関する図形情報を表す文字列を返却する
	 * 引数:なし
	 * 戻り値:文字列Point
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		return "Point";
	}
	
	/*
	 * 関数名:draw
	 * 概要:点を描画する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		System.out.println('+');
	}
}
