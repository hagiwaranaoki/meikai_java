import id.DateId;
/*
 * クラス名:DateIdTester
 * 概要:DateIdクラスのテスト用
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
public class DateIdTester {
	/*
	 * 関数名:main
	 * 概要:DateIdクラスのテスト用
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public static void main(String[] args) {
		// DateIdオブジェクトを生成
		DateId a = new DateId();
		// DateIdオブジェクトを生成
		DateId b = new DateId();
		// DateIdオブジェクトを生成
		DateId c = new DateId();
		
		// 一人目の識別番号を表示
		System.out.println("aの識別番号：" + a.getId());
		// 二人目の識別番号を表示
		System.out.println("bの識別番号：" + b.getId());
		// 三人目の識別番号を表示
		System.out.println("cの識別番号：" + c.getId());
	}
}
