package exec14;

/*
 * クラス名:Exercise14_2
 * 概要:着せ替え可能ロボットペットのテスト
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise14_2 {
	/*
	 * 関数名:main
	 * 概要:着せ替え可能ロボットペットのテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// 着せ替え可能ロボットペットのオブジェクトを生成
		SkinnableRobotPet skinPet = new SkinnableRobotPet(2, "クロ", "黒マスター");
		// 自己紹介を出力
		skinPet.introduce();
		// 色を変える
		skinPet.changeSkin(Skinnable.redNumber);
		// 自己紹介を出力
		skinPet.introduce();
	}
}
