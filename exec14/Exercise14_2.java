package exec14;

import java.util.Scanner;

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
		// Scannerオブジェクト生成
		Scanner standardInput = new Scanner(System.in);
		// ペットの色の入力を促すメッセージを表示
		System.out.println("ペットの色を入力してください。");
		// ペットの色の入力を促す
		System.out.print("0:黒、1:赤、2:緑、3:青、4:ヒョウ柄, それ以外:無地:");
		// ペットの色を受け付ける
		int petColor = standardInput.nextInt();
		// 着せ替え可能ロボットペットのオブジェクトを生成
		SkinnableRobotPet skinPet = new SkinnableRobotPet(petColor, "クロ", "黒マスター");
		// 自己紹介を出力
		skinPet.introduce();
		// ペットの色の入力を促すメッセージを表示
		System.out.println("何色に変えますか。");
		// ペットの色の入力を促す
		System.out.print("0:黒、1:赤、2:緑、3:青、4:ヒョウ柄, それ以外:無地:");
		// ペットの色を入れる変数
		int changePetColor = standardInput.nextInt();
		// 色を変える
		skinPet.changeSkin(changePetColor);
		// 自己紹介を出力
		skinPet.introduce();
	}
}
