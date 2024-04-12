package exec09;
/*
 * クラス名:Exercise9_3
 * 概要:Accountクラスの確認をする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise9_3 {
	/*
	 * 関数名:main
	 * 概要:Accountクラスの確認をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// 口座名義の定数
		final String USER_NAME = "test";
		// 口座番号の定数
		final String USER_NUMBER = "123456";
		// 預金残高の定数
		final int USER_BALANCE = 100000;
		// 年の定数
		final int YEAR_VALUE = 2020;
		// 月の定数
		final int MONTH_VALUE = 8;
		// 日の定数
		final int DAY_VALUE = 4;
		// Accountオブジェクトを生成
		Account userAccount = new Account(USER_NAME, USER_NUMBER, USER_BALANCE, new Day(YEAR_VALUE, MONTH_VALUE, DAY_VALUE));
		// Accountオブジェクトの中身を出力
		System.out.print(userAccount.toString());
	}
}
