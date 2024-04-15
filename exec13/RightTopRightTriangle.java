package exec13;

/*
 * クラス名: RightTopRightTriangle
 * 概要:右上直角二等辺三角形を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class RightTopRightTriangle extends RightTriangle {
	/*
	* コンストラクタ名:RightTopRightTriangle
	* 概要:右上直角二等辺三角形を生成する
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public RightTopRightTriangle(int triangleLength) {
		// 親クラスのコンストラクタを呼び出す
		super(triangleLength);
	}

	/*
	 * 関数名:toString
	 * 概要:右上直角二等辺三角形に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:右上直角二等辺三角形に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 右上直角二等辺三角形に関する図形情報を表す文字列を返す
		return "RTopRightTriangle(length：" + getLength() + ")";
	}
	
	/*
	 * 関数名:draw
	 * 概要:右上二等辺三角形を描画する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// 長さと同じ回数繰り返す
		for (int i = getLength(); i > 0; i--) {
			// 各行の空白を決める
			for (int k = 0; k < getLength() - i; k++) {
				// 空白を出力
				System.out.print(' ');
			}
			// 各行の*の数を決定する
			for (int j = i; j > 0; j--) {
				// *を出力
				System.out.print('*');
			}
			// 改行を出力
			System.out.println();
		}
	}
}
