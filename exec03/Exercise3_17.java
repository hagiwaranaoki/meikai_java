package exec03;

//java.utilパッケージからRandomクラスをインポート
import java.util.Random;

/*
 * クラス名:Exercise3_17
 * 概要:乱数に基づいてグー、チョキ、パーを表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_17 {
	/*
	 * 関数名:main
	 * 概要:乱数に基づいてグー、チョキ、パーを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Randomオブジェクトを作成
		Random randomValue = new Random();
		// 乱数の範囲用の変数を定義
		final int RANDOM_RANGE = 3;
		// 0から2までの乱数を生成
		int randomNumber = randomValue.nextInt(RANDOM_RANGE);
		
		// 乱数が0の場合
		if (randomNumber == 0) {
			// "グー"を表示
			System.out.println("グー");
			// 乱数が1の場合
		} else if (randomNumber == 1) {
			// "チョキ"を表示
			System.out.println("チョキ");
			// 乱数が2の場合
		} else {
			// "パー"を表示
			System.out.println("パー");
		}
	}
}
