package exec10;

/*
 * クラス名:Id
 * 概要:識別番号を管理
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Id {
	// 何番までの識別番号を与えたか
	static int counter = 0;
	// 識別番号のフィールド
	private int id;
	
	/*
	* コンストラクタ名:Id
	* 概要:識別番号を増やすコンストラクタ
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Id() {
		// カウンターをインクリメント
		id = ++counter;
	}
	
	/*
	 * 関数名:getId
	 * 概要:idを取得
	 * 引数:なし
	 * 戻り値:idの値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public int getId() {
		// idを返す
		return id;
	}
	
	/*
	 * 関数名:getMaxId
	 * 概要:一番大きいidを取得
	 * 引数:なし
	 * 戻り値:カウンターの数値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	static int getMaxId() {
		// カウンターを返す
		return counter;
	}
}
