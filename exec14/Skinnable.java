package exec14;

/*
 * インタフェース名:Skinnable
 * 概要:着せ替えることができる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public interface Skinnable {
	// 黒の数値を設定
	static final int BLACK_NUMBER = 0;
	// 赤の数値を設定
	final int RED_NUMBER = 1;
	// 緑の数値を設定
	final int GREEN_NUMBER = 2;
	// 青の数値を設定
	final int BLUE_NUMBER = 3;
	// ヒョウ色の数値を設定
	final int LEOPARD_NUMBER = 4;

	/*
	 * 関数名:changeSkin
	 * 概要:着せ替えをする
	 * 引数:着せ替え色の数値
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	void changeSkin(int skinNumber);
}
