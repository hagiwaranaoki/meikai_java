package exec14;

/*
 * クラス名:RobotPet
 * 概要:ロボットのペットを表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
class RobotPet extends Pet {

	/*
	* コンストラクタ名:RobotPet
	* 概要:ロボットのペットを生成する
	* 引数:ロボットのペットの名前、主人の名前
	* 作成者:N.Hagiwara
	* 作成日:2024/04/16
	*/
	public RobotPet(String name, String masterName) {
		// 親クラスのコンストラクタを呼び出し
		super(name, masterName);
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
	}

	/*
	 * 関数名:work
	 * 概要:働く
	 * 引数:命令の番号
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public void work(int sw) {
		// 掃除するときの定数
		final int DO_CLEAN = 0;
		// 洗濯するときの定数
		final int DO_WASH = 1;
		// 炊事するときの定数
		final int DO_COOK = 2;
		// 引数によって実行を変える
		switch (sw) {
		// 引数が0の時
		case DO_CLEAN:
			// 掃除をする
			System.out.println("掃除します。");
			// switchから抜け出す
			break;
		//引数が1の時
		case DO_WASH:
			// 洗濯をする
			System.out.println("洗濯します。");
			// switchから抜け出す
			break;
		// 引数が2の時
		case DO_COOK:
			// 炊事をする
			System.out.println("炊事します。");
			// switchから抜け出す
			break;
		}
	}
}
