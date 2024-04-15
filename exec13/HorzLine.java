package exec13;

/*
 * クラス名:HorzLine
 * 概要:水平直線を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class HorzLine extends AbstLine {
	/*
	* コンストラクタ名:HorzLine
	* 概要:水平直線を生成する
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public HorzLine(int length) {
		// 親クラスのコンストラクタを呼び出す
		super(length);
	}

	/*
	 * 関数名:toString
	 * 概要:水平直線に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:水平直線に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 水平直線に関する図形情報を表す文字列を返す
		return "HorzLine(length:" + getLength() + ")";
	}

	/*
	 * 関数名:draw
	 * 概要:水平直線を描画する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// 長さの数だけ繰り返し
		for (int i = 1; i <= getLength(); i++) {
			// -を表示
			System.out.print('-');
		}
		//改行する
		System.out.println();
	}
}
