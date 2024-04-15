package exec13;
// Scannerクラスをインポート
import java.util.Scanner;
/*
 * クラス名:HumanPlayer
 * 概要:人間プレーヤが出す手を選ぶ
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class HumanPlayer extends Player {
	// Scannerオブジェクトを生成
	Scanner standardInput = new Scanner(System.in);
	// 人間プレーヤが出す手のフィールド
	private int numberVariable;
	
	/*
	* コンストラクタ名:HumanPlayer
	* 概要:人間プレーヤを生成する
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public HumanPlayer() {
		// 1~3の整数の入力を促す
		System.out.print("グー…1/チョキ…2/パー…3 :");
		// 人間プレーヤが選ぶ手を受け付け
		int humanNumber = standardInput.nextInt();
		// 1~3以外の数値が入力された場合
		while (humanNumber < 1 || humanNumber > 3) {
			// 1~3の入力を促す
			System.out.print("1~3の整数を入力してください：");
			// 人間プレーヤが選ぶ手を受け付け
			humanNumber = standardInput.nextInt();
		}
		// 人間プレーヤが出す手を設定
		this.numberVariable = humanNumber;
	}
	
	/*
	 * 関数名:getNumber
	 * 概要:人間プレーヤが出す手を取得
	 * 引数:なし
	 * 戻り値:人間プレーヤが出す手
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public int getNumber() {
		// 人間プレーヤが出す手を返す
		return numberVariable;
	}
	
	/*
	 * 関数名:toString
	 * 概要:人間プレーヤが出す手を文字列で返す
	 * 引数:なし
	 * 戻り値:人間プレーヤが出す手の文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 人間プレーヤが出す手が1の時
		if (numberVariable == 1) {
			// グーを返す
			return "あなた：グー";
		}
		// 人間プレーヤが出す手が2の時
		if (numberVariable == 2) {
			// チョキを返す
			return "あなた：チョキ";
		}
		// 人間プレーヤが出す手が3の時
		if (numberVariable == 3) {
			// パーを返す
			return "あなた：パー";
			// それ以外の時
		} else {
			// エラーを返す
			return "エラー: 指定された値を入力してください";
		}
	}
}