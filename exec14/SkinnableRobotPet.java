package exec14;

/*
 * クラス名:SkinnableRobotPet
 * 概要:着せ替え可能ロボットペットを表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
class SkinnableRobotPet extends RobotPet implements Skinnable {
	// 着せ替え番号のフィールド
	private int skinNumber= 0;

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
		// スキンの色を入れる用の変数
		String temporarySkin = "";
		// 黒の数値の時
		if (skinNumber == BLACK_NUMBER) {
			// 黒を返す
			temporarySkin = "黒";
			// 赤の数値の時
		} else if (skinNumber == RED_NUMBER) {
			// 赤を返す
			temporarySkin = "赤";
			// 緑の数値の場合
		} else if (skinNumber == GREEN_NUMBER) {
			// 緑を返す
			temporarySkin = "緑";
			// 青の数値の場合
		} else if (skinNumber == BLUE_NUMBER) {
			// 青を返す
			temporarySkin = "青";
			// ヒョウ柄の数値の場合
		} else if (skinNumber == LEOPARD_NUMBER) {
			// ヒョウ柄を返す
			temporarySkin = "ヒョウ柄";
			// その他の値の場合
		} else {
			// 無地を返す
			temporarySkin = "無地";
		}
		// スキンの色を返す
		return temporarySkin;
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
		case BLACK_NUMBER:
			// 黒を出力
			System.out.print("黒");
			// switch文から抜け出す
			break;
		// 赤の着せ替え番号の場合
		case RED_NUMBER:
			// 赤を出力
			System.out.print("赤");
			// switch文から抜け出す
			break;
		// 緑の着せ替え番号の場合
		case GREEN_NUMBER:
			// 緑を出力
			System.out.print("緑");
			// switch文から抜け出す
			break;
		// 青の着せ替え番号の場合
		case BLUE_NUMBER:
			// 青を出力
			System.out.print("青");
			// switch文から抜け出す
			break;
		// ヒョウ柄の着せ替え番号の場合
		case LEOPARD_NUMBER:
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
