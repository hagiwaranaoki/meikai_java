package exec12;
/*
* クラス名:TimeAccount
* 概要:定期預金つき銀行口座を表す
* 作成者:N.Hagiwara
* 作成日:2024/04/10
*/
class TimeAccount extends Account {
	// 定期預金の残高を表すフィールド
	private long timeBalance;
	// 0を表す定数
	static final int ZERO_NUMBER = 0;

	/*
	* コンストラクタ名:TimeAccount
	* 概要:親クラスであるAccountクラスのコンストラクタを呼び出し、名前、口座番号、残高を初期化
	* 引数:口座名義、口座番号、預金残高、定期預金残高
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	TimeAccount(String name, String no, long balance, long timeBalance) {
		// Accountクラスのコンストラクタを呼び出して初期化
		super(name, no, balance);
		// 定期預金の変数を初期化
		this.timeBalance = timeBalance;
	}

	/*
	 * 関数名:getBalance
	 * 概要:定期預金の残高と普通預金の残高を足す
	 * 引数:なし
	 * 戻り値:定期預金の残高と普通預金の残高を足した結果
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	long getBalance() {
		// 定期預金の残高と普通預金の残高を足した結果を戻す
		return timeBalance + super.getBalance();
	}
	
	/*
	 * 関数名:getBalance
	 * 概要:定期預金の残高を足す
	 * 引数:なし
	 * 戻り値:定期預金の残高
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	long getTimeBalance() {
		// 定期預金の残高を戻す
		return timeBalance;
	}

	/*
	 * 関数名:cancel
	 * 概要:定期預金を解約する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	void cancel() {
		// 定期預金の残高を普通預金に移動させるために、deposit()メソッドを呼び出す
		deposit(timeBalance);
		// timeBalanceを0にリセットする
		timeBalance = ZERO_NUMBER;
	}

	/*
	 * 関数名:compBalance
	 * 概要:2つのAccountオブジェクトの残高を比較する
	 * 引数:Accountオブジェクトを二つ
	 * 戻り値:比較結果の数値(1,0,-1)
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	static int compBalance(Account a, Account b) {
		// 比較結果-1を表す定数
		final int COMPARSION_RESULT_MINUS_ONE = -1;
		// 比較結果1を表す定数
		final int COMPARSION_RESULT_ONE = 1;
		// 比較結果をリセット
		int comparisonResult = ZERO_NUMBER;
		//一つ目の預金残高をメソッドを使用して取得
		long firstBalance = a.getBalance();
		//二つ目の預金残高をメソッドを使用して取得
		long secondBalance = b.getBalance();
		// 一つ目の預金残高のほうが大きいとき
		if (firstBalance > secondBalance) {
			// 比較結果に1を入れる
			comparisonResult = COMPARSION_RESULT_ONE;
			// 一つ目の預金残高のほうが少ないとき
		} else if (firstBalance < secondBalance) {
			// 比較結果に2を入れる
			comparisonResult = COMPARSION_RESULT_MINUS_ONE;
			// 一つ目と二つ目の預金残高が同じとき
		} else {
			// 比較結果に0を入れる
			comparisonResult = ZERO_NUMBER;
		}
		// 比較結果を返す
		return comparisonResult;
	}
}
