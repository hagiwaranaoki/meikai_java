package exec13;

/*
 * クラス名: RightBottomRightTriangle
 * 概要:右下直角二等辺三角形を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class RightBottomRightTriangle extends RightTriangle {
	/*
	* コンストラクタ名:RightBottomRightTriangle
	* 概要:右下直角二等辺三角形を生成する
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public RightBottomRightTriangle(int triangleLength) {
		// 親クラスのコンストラクタを呼び出し
		super(triangleLength);
	}

	/*
	 * 関数名:toString
	 * 概要:右下直角二等辺三角形に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:右下直角二等辺三角形に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 右下直角二等辺三角形に関する図形情報を表す文字列
		return "RBottomRightTriangle(length：" + getLength() + ")";
	}

	/*
	 * 関数名:draw
	 * 概要:右下二等辺三角形を描画する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// 1を表す定数
		final int ONE_NUMBER = 1;
		// 直角二等辺三角形の高さ分繰り返す
		for (int i = getLength(); i > 0; i--) {
			// 各行の空白の数を決定するループ
			for (int j = i; j - ONE_NUMBER > 0; j--) {
				// 空白を出力
				System.out.print(' ');
			}
			// 各行の*の数を決定するループ
			for (int k = 0; k <= (getLength() - i); k++) {
				// *を出力
				System.out.print('*');
			}
			// 空白を出力
			System.out.println();
		}
	}
}
