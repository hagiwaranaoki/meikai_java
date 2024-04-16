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
	 * 関数名:introduce
	 * 概要:自己紹介を出力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public void introduce() {
		// ロボットの名前を出力
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		// ロボットの主人の名前を出力
		System.out.println("◇ご主人様は" + getMasterName() + "。");
		// ロボットの色を出力
		System.out.println("◇色は" + getSkin() + "。");
	}

	/*
	 * 関数名:getSkin
	 * 概要:スキンを取得
	 * 引数:なし
	 * 戻り値:スキンの色を返す
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public String getSkin() {
		// 黒の数値の時
		if (skinNumber == blackNumber) {
			// 黒を返す
			return "黒";
			// 赤の数値の時
		} else if (skinNumber == redNumber) {
			// 赤を返す
			return "赤";
			// 緑の数値の場合
		} else if (skinNumber == greenNumber) {
			// 緑を返す
			return "緑";
			// 青の数値の場合
		} else if (skinNumber == blueNumber) {
			// 青を返す
			return "青";
			// ヒョウ柄の数値の場合
		} else if (skinNumber == leopardNumber) {
			// ヒョウ柄を返す
			return "ヒョウ柄";
			// その他の値の場合
		} else {
			// 無地を返す
			return "無地";
		}
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
		// スキンを変える
		this.skinNumber = skinNumber;
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
