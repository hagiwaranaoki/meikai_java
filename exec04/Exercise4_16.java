package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_16
 * 概要:アスタリスクを入力の数値分表示し、5つごとに改行を入れる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_16 {
	/*
	 * 関数名:main
	 * 概要:アスタリスクを入力の数値分表示し、5つごとに改行を入れる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scannerInteger = new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値:");
		//コンソールから入力された整数を受け取る
		int inputValue = scannerInteger.nextInt();
		//約数の個数を表示するための変数を宣言して初期化
		int outputValue = 0;

		//カウントが入力値を超えたらループ抜け
		for (int countValue = 1; countValue <= inputValue; countValue++) {
			//カウント用変数の値が入力値の約数である場合
			if (inputValue % countValue == 0) {
				//約数の値を表示
				System.out.println(countValue);
				//約数の個数をインクリメント
				outputValue++;
			}

		}
		//約数の個数を表示
		System.out.println("約数は" + outputValue + "個です。");
	}
}