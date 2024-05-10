package exec13;

/*
 * クラス名: LeftBottomRightTriangle
 * 概要:左下直角二等辺三角形を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/25
 */
public class LeftBottomRightTriangle extends RightTriangle {
	/*
	* コンストラクタ名:LeftBottomRightTriangle
	* 概要:左下直角二等辺三角形を生成する
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/25
	*/
	public LeftBottomRightTriangle(int triangleLength) {
		// 親クラスのコンストラクタを呼び出し
		super(triangleLength);
	}

	/*
	 * 関数名:toString
	 * 概要:左下直角二等辺三角形に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:左下直角二等辺三角形に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 左下直角二等辺三角形に関する図形情報を表す文字列
		return "LBottomRightTriangle(length：" + getLength() + ")";
	}

	/*
	 * 関数名:draw
	 * 概要:左下二等辺三角形を描画する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// 直角二等辺三角形の高さ分繰り返す
		for (int i = 0; i < getLength(); i++) {
			// 各行の*の数を決定するループ
			for (int j = 0; j <= i; j++) {
				// *を出力
				System.out.print('*');
			}
			// 空白を出力
			System.out.println();
		}
	}
}
