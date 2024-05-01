package exec14;

/*
 * クラス名:Pet
 * 概要:ペットを表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
class Pet {
	// 名前を表すフィールド
	private String name;
	// 主人の名前を表すフィールド
	private String masterName;

	/*
	* コンストラクタ名:Pet
	* 概要:ペットを生成する
	* 引数:ペットの名前、主人の名前
	* 作成者:N.Hagiwara
	* 作成日:2024/04/16
	*/
	public Pet(String name, String masterName) {
		// ペットの名前を設定
		this.name = name;
		// 主人の名前を設定
		this.masterName = masterName;
	}
	
	/*
	 * 関数名:getName
	 * 概要:ペットの名前を取得
	 * 引数:なし
	 * 戻り値:ペットの名前
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public String getName() {
		// ペットの名前を返す
		return name;
	}
	
	/*
	 * 関数名:getMasterName
	 * 概要:主人の名前を取得
	 * 引数:なし
	 * 戻り値:主人の名前
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public String getMasterName() {
		// 主人の名前を返す
		return masterName;
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
		// ペットの名前を出力
		System.out.println("■僕の名前は" + name + "です！");
		// 主人の名前を出力
		System.out.println("■ご主人様は" + masterName + "です！");
	}
}

