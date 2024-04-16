package exec14;

/*
 * クラス名:DVDPlayer
 * 概要:DVDプレーヤを表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class DVDPlayer implements ExPlayer{
	/*
	 * 関数名:play
	 * 概要:再生をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public void play() {
		System.out.println("■DVD再生開始！");
	}
	
	/*
	 * 関数名:stop
	 * 概要:停止をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public void stop() {
		System.out.println("■DVD停止！");
	}
	
	/*
	 * 関数名:slow
	 * 概要:スロー再生をする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public void slow() {
		System.out.println("■DVDスロー再生開始！");
	}
}
