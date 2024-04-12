package exec10;
/*
 * クラス名:Exercise10_2
 * 概要:ExIdクラスの確認をする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise10_2 {
	/*
	 * 関数名:main
	 * 概要:ExIdクラスの確認をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// 識別番号を変える用の定数を定義
		final int CHANGE_NUMBER = 4;
		// 一つ目のExIdを生成
		ExId firstExId = new ExId();
		// 二つ目のExIdを生成
		ExId secondExId = new ExId();
		// 識別番号の割り振りを変える
		ExId.changeNumber(CHANGE_NUMBER);
		// 三つ目のExIdを生成
		ExId thirdExId = new ExId();
		// 四つ目のExIdを生成
		ExId forthExId = new ExId();
		
		// 一人目の識別番号
		System.out.println("aの識別番号: " + firstExId.getExId());
		// 二人目の識別番号
		System.out.println("bの識別番号: " + secondExId.getExId());
		// 三人目の識別番号
		System.out.println("cの識別番号: " + thirdExId.getExId());
		// 四人目の識別番号
		System.out.println("dの識別番号: " + forthExId.getExId());
		
		// 識別番号を付与した数を返す
		System.out.println("Id.counter = " + ExId.idCounter);
		// 識別番号の最大値を返す
		System.out.println("MaxId = " + ExId.getMaxExId());
	}
}
