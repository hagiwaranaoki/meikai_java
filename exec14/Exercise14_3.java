package exec14;

/*
 * クラス名:Exercise14_3
 * 概要:DVDプレーヤクラスの確認
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise14_3 {
	/*
	 * 関数名:main
	 * 概要:DVDプレーヤクラスの確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// DVDプレーヤオブジェクトの生成
		DVDPlayer dvdPlayer = new DVDPlayer();
		// 再生する
		dvdPlayer.play();
		// 停止する
		dvdPlayer.stop();
		// スロー再生する
		dvdPlayer.slow();
	}
}
