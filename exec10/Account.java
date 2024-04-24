package exec10;

/*
 * クラス名:Account
 * 概要:銀行口座を開設する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
class Account {
	// 何番までの識別番号を与えたか
	private static int counter = 0;
	// 口座名義
	private String name = "test";
	// 口座番号
	private String no = "123456";
	// 預金残高
	private long balance = 100000;
	// 識別番号
	private int id;

	// インスタンス初期化子
	{
		// 口座開設メッセージを表示
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	/*
	* コンストラクタ名:Account
	* 概要:Accountオブジェクトを初期化値で作成
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	Account() {
	}

	/*
	* コンストラクタ名:Account
	* 概要:Accountオブジェクトを作成
	* 引数:口座名義、口座番号、預金残高
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	Account(String n, String num, long z) {
		// 引数で受け取った口座名義をフィールドに設定
		name = n;
		// 引数で受け取った口座番号をフィールドに設定
		no = num;
		// 引数で受け取った預金残高をフィールドに設定
		balance = z;
		// 識別番号を与える
		id = ++counter;
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
	
	/*
	 * 関数名:getId
	 * 概要:識別番号を返す
	 * 引数:なし
	 * 戻り値:識別番号
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/24
	 */
	public int getId() {
		// 識別番号を返す
		return id;
	}

	/*
	 * 関数名:toString
	 * 概要:文字列表現を返却
	 * 引数:なし
	 * 戻り値:口座名義：%s\n口座番号：%s\n預金残高：%d\nに設定した文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public String toString() {
		// 文字列表現の形式を返す
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d\n識別番号：%d", name, no, balance, id);
	}
}
