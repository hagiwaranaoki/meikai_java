package exec13;

/*
 * クラス名:VirtLine
 * 概要:垂直直線を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class VirtLine extends AbstLine {
	/*
	* コンストラクタ名:VirtLine
	* 概要:垂直直線を生成する
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public VirtLine(int length) {
		// 親クラスのコンストラクタを呼び出す
		super(length);
	}

	/*
	 * 関数名:toString
	 * 概要:垂直直線に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:垂直直線に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 長さに応じた文字列を返す
		return "VirtLine(length:" + getLength() + ")";
	}

	/*
	 * 関数名:draw
	 * 概要:垂直直線を描画
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// 1を表す定数
		final int ONE_NUMBER = 1;
		// 長さの数だけ繰り返し
		for (int i = ONE_NUMBER; i <= getLength(); i++) {
			// |を表示する
			System.out.println('|');
		}
	}
}
