package exec14;

/*
 * クラス名:SkinnableRobotPet
 * 概要:着せ替え可能ロボットペットを表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
class SkinnableRobotPet extends RobotPet implements Skinnable {
	// 着せ替え番号のフィールド
	private int skinNumber;
	
	/*
	* コンストラクタ名:SkinnableRobotPet
	* 概要:着せ替え可能ロボットペットを生成する
	* 引数:着せ替え番号、ペットの名前、主人の名前
	* 作成者:N.Hagiwara
	* 作成日:2024/04/16
	*/
	public SkinnableRobotPet(int skinNumber, String name, String masterName) {
		// 親クラスのコンストラクタを呼び出し
		super(name, masterName);
		// 着せ替え番号を設定
		this.skinNumber = skinNumber;
	}
	
	/*
	 * 関数名:changeSkin
	 * 概要:着せ替えをする
	 * 引数:着せ替え色の数値
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public void changeSkin(int skinNumber) {
		// スキンをの文字列出力
		System.out.print("スキンを");
		// 着せ替え番号によって場合が変わる
		switch (skinNumber) {
		// 黒の着せ替え番号の場合
		case blackNumber:
			// 黒を出力
			System.out.print("黒");
			// switch文から抜け出す
			break;
			// 赤の着せ替え番号の場合
		case redNumber:
			// 赤を出力
			System.out.print("赤");
			// switch文から抜け出す
			break;
			// 緑の着せ替え番号の場合
		case greenNumber:
			// 緑を出力
			System.out.print("緑");
			// switch文から抜け出す
			break;
			// 青の着せ替え番号の場合
		case blueNumber:
			// 青を出力
			System.out.print("青");
			// switch文から抜け出す
			break;
			// ヒョウ柄の着せ替え番号の場合
		case leopardNumber:
			// ヒョウ柄を出力
			System.out.print("ヒョウ柄");
			// switch文から抜け出す
			break;
			// デフォルトの場合
		default:
			// 無地を出力
			System.out.print("無地");
			// switch文から抜け出す
			break;
		}
		// 変更を知らせる
		System.out.println("に変更しました。");
	}
}
