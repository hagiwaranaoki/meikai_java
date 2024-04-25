package exec13;

/*
 * クラス名: LeftTopRightTriangle
 * 概要:左上直角二等辺三角形を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class LeftTopRightTriangle extends RightTriangle {
	/*
	* コンストラクタ名:LeftTopRightTriangle
	* 概要:左上直角二等辺三角形を生成
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public LeftTopRightTriangle(int triangleLength) {
		// 親コンストラクタを呼び出す
		super(triangleLength);
	}

	/*
	 * 関数名:toString
	 * 概要:左上直角二等辺三角形に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:左上直角二等辺三角形に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 左上直角二等辺三角形に関する図形情報を表す文字列を返す
		return "LTopRightTriangle(length：" + getLength() + ")";
	}

	/*
	 * 関数名:draw
	 * 概要:左上直角二等辺三角形を描画
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// 直角三角形の長さ分繰り返す
		for (int i = 0; i < getLength(); i++) {
			// 各行の星の数を決定するループ
			for (int j = (getLength() - i); j > 0; j--) {
				// *を出力
				System.out.print('*');
			}
			// 改行を出力
			System.out.println();
		}
	}
}
