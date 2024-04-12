package exec09;

/*
 * クラス名:Account
 * 概要:銀行口座を開設する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
class Account {
	// 口座名義を保持するためのフィールド
	private String name;
	// 口座番号を保持するためのフィールド
	private String no;
	// 預金残高を保持するためのフィールド
	private long balance;
	// 口座開設日を保持するためのフィールド
	private Day dayValue;

	// インスタンス初期化子
	{
		// 口座開設メッセージを表示
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	/*
	* コンストラクタ名:Account
	* 概要:Accountオブジェクトを作成
	* 引数:口座名義、口座番号、預金残高、口座開設日
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	Account(String n, String num, long z, Day dayVariable) {
		// 引数で受け取った口座名義をフィールドに設定
		name = n;
		// 引数で受け取った口座番号をフィールドに設定
		no = num;
		// 引数で受け取った預金残高をフィールドに設定
		balance = z;
		// 引数で受け取ったDayクラスを用いた口座開設日をフィールドに設定
		dayValue = new Day(dayVariable);
	}

	/*
	 * 関数名:getName
	 * 概要:口座名義を調べる
	 * 引数:なし
	 * 戻り値:口座名義
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
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
	 * 作成日:2024/04/10
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
	 * 作成日:2024/04/10
	 */
	long getBalance() {
		// 預金残高を返す
		return balance;
	}

	/*
	 * 関数名:getDay
	 * 概要:口座開設日を調べる
	 * 引数:なし
	 * 戻り値:口座開設日
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public Day getDay() {
		// Dayクラスを呼び出して口座開設日を返す
		return new Day(dayValue);
	}

	/*
	 * 関数名:deposit
	 * 概要:預金残高を増やす
	 * 引数:long型変数[k]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
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
	 * 作成日:2024/04/10
	 */
	void withdraw(long k) {
		// 預金残高を下す
		balance -= k;
	}

	/*
	 * 関数名:toString
	 * 概要:文字列表現を返却
	 * 引数:なし
	 * 戻り値:口座名義：%s\n口座番号：%s\n預金残高：%d\n口座開設日：%s\nに設定した文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public String toString() {
		// 文字列表現の形式を返す
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d\n口座開設日：%s\n", name, no, balance, dayValue);
	}
}
