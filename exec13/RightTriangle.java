package exec13;

/*
 * クラス名:RightTriangle
 * 概要:直角二等辺三角形の概念を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public abstract class RightTriangle extends Shape{
	// 三角形の直線の長さのフィールド
	private int rightTriangleLength;
	
	/*
	* コンストラクタ名:RightTriangle
	* 概要:直角二等辺三角形を生成する
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public RightTriangle(int triangleLength) {
		// 長さを設定
		this.rightTriangleLength = triangleLength;
	}
	
	/*
	 * 関数名:getLength
	 * 概要:直線の長さを取得する
	 * 引数:なし
	 * 戻り値:直線の長さ
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public int getLength() {
		// 直線の長さを返す
		return rightTriangleLength;
	}
	
	/*
	 * 関数名:draw
	 * 概要:直角二等辺三角形を描画する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public abstract void draw();
}