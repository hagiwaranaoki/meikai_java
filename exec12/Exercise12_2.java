package exec12;

/*
 * クラス名:Exercise12_2
 * 概要:TimeAccountクラスのテスト
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
public class Exercise12_2 {
	/*
	 * 関数名:main
	 * 概要:TimeAccountクラスのテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public static void main(String[] args) {
		// 一つ目のTimeAccountオブジェクトを生成
		TimeAccount firstTimeAccount = new TimeAccount("定期預金", "123456", 5, 1234567);
		// 一つ目のTimeAccountオブジェクトの口座名義をメソッドで取得し出力
		System.out.println("口座名義 : " + firstTimeAccount.getName());
		// 一つ目のTimeAccountオブジェクトの口座番号をメソッドで取得し出力
		System.out.println("口座番号 : " + firstTimeAccount.getNo());
		// 一つ目のTimeAccountオブジェクトの口座残高をメソッドで取得し出力
		System.out.println("口座残高 : " + firstTimeAccount.getBalance());
		// 二つ目のTimeAccountオブジェクトを生成
		Account secondTimeAccount = new Account("普通預金", "654321", 1234572);
		// 二つ目のTimeAccountオブジェクトの口座名義をメソッドで取得し出力
		System.out.println("口座名義 : " + secondTimeAccount.getName());
		// 二つ目のTimeAccountオブジェクトの口座番号をメソッドで取得し出力
		System.out.println("口座番号 : " + secondTimeAccount.getNo());
		// 二つ目のTimeAccountオブジェクトの口座残高をメソッドで取得し出力
		System.out.println("口座残高 : " + secondTimeAccount.getBalance());
		// 二つの口座残高を比べた結果を表示
		System.out.println(TimeAccount.compBalance(firstTimeAccount, secondTimeAccount));
	}
}
