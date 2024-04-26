package exec14;

/*
 * クラス名:AbstLine
 * 概要:直線を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public abstract class AbstLine extends Shape {
	// 直線の長さを表すフィールド
	private int length;

	/*
	* コンストラクタ名:AbstLine
	* 概要:直線を生成する
	* 引数:長さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public AbstLine(int length) {
		// 直線の長さを設定する
		setLength(length);
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
		return length;
	}

	/*
	 * 関数名:setLength
	 * 概要:直線の長さを設定する
	 * 引数:設定する直線の長さ
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void setLength(int length) {
		// 直線の長さを設定する
		this.length = length;
	}

	/*
	 * 関数名:toString
	 * 概要:直線に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:直線に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		return "AbstLine(length:" + length + ")";
	}
}
