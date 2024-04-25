package exec13;

// Randomクラスをインポート
import java.util.Random;

/*
 * クラス名:ComputerPlayer
 * 概要:コンピュータプレーヤが出す手を選ぶ
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class ComputerPlayer extends Player {
	// Randomオブジェクトを生成
	Random randomVariable = new Random();

	// コンピュータが出す手のフィールド
	private int numberVariable = 0;

	//0を表す定数
	static final int ZERO_NUMBER = 0;
	// 1を表す定数
	static final int FIRST_NUMBER = 1;

	// コンピュータが出す手の乱数用の定数
	private final int RANDOM_RANGE = 3;

	/*
	* コンストラクタ名:ComputerPlayer
	* 概要:コンピュータプレーヤを生成する
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public ComputerPlayer() {
		// コンピュータが出す手をランダムに生成
		int computerNumber = randomVariable.nextInt(RANDOM_RANGE);
		// コンピュータが出す手を設定
		this.numberVariable = computerNumber;
	}

	/*
	 * 関数名:getNumber
	 * 概要:コンピュータプレーヤが出す手を取得
	 * 引数:なし
	 * 戻り値:コンピュータプレーヤが出す手
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public int getNumber() {
		// コンピュータが出す手を返す
		return numberVariable;
	}

	/*
	 * 関数名:toString
	 * 概要:コンピュータプレーヤが出す手を文字列で返す
	 * 引数:なし
	 * 戻り値:コンピュータプレーヤが出す手の文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// コンピュータの手を入れる変数
		String computerHand = "";
		// コンピュータの出す手が0の時
		if (numberVariable == ZERO_NUMBER) {
			// グーの文字列を格納
			computerHand = "コンピュータ：グー";
		}
		// コンピュータの出す手が1の時
		if (numberVariable == FIRST_NUMBER) {
			// チョキの文字列を格納
			computerHand = "コンピュータ：チョキ";
			// コンピュータの出す手が2の時
		} else {
			// パーの文字列を格納
			computerHand = "コンピュータ：パー";
		}
		// コンピュータの手を返す
		return computerHand;
	}
}
