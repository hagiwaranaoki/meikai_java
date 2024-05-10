package exec12;

/*
 * クラス名:Account
 * 概要:銀行口座を開設する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
class Account {
	// 口座名義のフィールド
	private String name;
	// 口座番号のフィールド
	private String no;
	// 預金残高のフィールド
	private long balance;

	/*
	* コンストラクタ名:Account
	* 概要:Accountオブジェクトを作成
	* 引数:口座名義、口座番号、預金残高
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	Account(String n, String num, long z) {
		// 名前を引数の名前に設定
		name = n;
		// 口座番号を引数で受け取った値に設定
		no = num;
		// 預金残高を引数で受け取った値に設定
		balance = z;
	}
	
	/*
	* コンストラクタ名:Account
	* 概要:Accountオブジェクトを作成
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	Account(){
	}

	/*
	 * 関数名:getName
	 * 概要:口座名義を調べる
	 * 引数:なし
	 * 戻り値:口座名義
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	String getName() {
		// 口座名義を返す
		return name;
	}

	/*
	 * 関数名:getNo
	 * 概要:口座番号を調べる
	 * 引数:なし
	 * 戻り値:口座番号
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	String getNo() {
		// 口座番号を返す
		return no;
	}

	/*
	 * 関数名:getBalance
	 * 概要:預金残高を調べる
	 * 引数:なし
	 * 戻り値:預金残高
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	long getBalance() {
		// 預金残高を返す
		return balance;
	}

	/*
	 * 関数名:deposit
	 * 概要:預金残高を増やす
	 * 引数:long型変数[k]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	void deposit(long k) {
		// 預金残高を増やす
		balance += k;
	}

	/*
	 * 関数名:withdraw
	 * 概要:預金残高を増やす
	 * 引数:long型変数[k]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	void withdraw(long k) {
		// 預金残高を下す
		balance -= k;
	}
}
