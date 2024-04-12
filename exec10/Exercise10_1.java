package exec10;

/*
 * クラス名:Exercise10_1
 * 概要:Idクラスの確認をする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise10_1 {
	/*
	 * 関数名:main
	 * 概要:Idクラスの確認をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// 一つ目のIdオブジェクトを生成
		Id firstIdTester = new Id();
		// 二つ目のIdオブジェクトを生成
		Id secondIdTester = new Id();
		
		// 一人目のidを取得
		System.out.println("aの識別番号: " + firstIdTester.getId());
		// 二人目のidを取得
		System.out.println("bの識別番号: " + secondIdTester.getId());
		
		// idがいくつあるかを取得
		System.out.println("Id.counter = " + Id.counter);
		
		// Idの最大を表示
		System.out.println("MaxId = " + Id.getMaxId());
	}
}
