package exec10;
/*
 * クラス名:ExId
 * 概要:識別番号を管理
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class ExId {
	// 識別番号を付与した回数
	static int idCounter = 0;
	// 識別番号のフィールド
	private int privateId = 0;
	//識別番号を増やす数
	static int NumberVariable = 1;
	
	/*
	 * 関数名:changeN
	 * 概要:識別番号を増やす数を変更
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	static void changeNumber(int integerNumber) {
		// 識別番号を増やす数を変更
		NumberVariable = integerNumber;
	}
	
	/*
	* コンストラクタ名:ExId
	* 概要:識別番号を増やすコンストラクタ
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public ExId() {
		// 指定されている数識別番号の最大値を増やす
		idCounter += NumberVariable;
		// 識別番号の最大値を割り振る
		privateId = idCounter;
	}
	
	/*
	 * 関数名:getExId
	 * 概要:識別番号を取得
	 * 引数:なし
	 * 戻り値:識別番号
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public int getExId() {
		// 識別番号を返す
		return privateId;
	}
	
	/*
	 * 関数名:getMaxExId
	 * 概要:識別番号の最大値を取得
	 * 引数:なし
	 * 戻り値:識別番号の最大値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	static int getMaxExId() {
		// 識別番号の最大値を返す
		return idCounter;
	}
}
