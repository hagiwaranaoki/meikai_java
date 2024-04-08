package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_15
 * 概要:身長と標準体重の対応表を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_15 {
	/*
	 * 関数名:main
	 * 概要:身長と標準体重の対応表を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scannerInteger = new Scanner(System.in);
		//スタート身長を初期化
		int startValue = 0;
		//ゴール身長を初期化
		int lastValue = 0;
		//毎cm用の変数を初期化
		int everyValue = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何cmから:");
			//インスタンスから入力された値を受け取る
			startValue = scannerInteger.nextInt();
			//正の値が入力されたらループ抜け
		} while (startValue < 0);
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何cmまで:");
			//インスタンスから入力された値を受け取る
			lastValue = scannerInteger.nextInt();
			//正の値が入力されたらループ抜け
		} while (lastValue < 0);
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何cmごと:");
			//インスタンスから入力された値を受け取る
			everyValue = scannerInteger.nextInt();
			//	正の値が入力されたらループ抜け
		} while (everyValue < 0);

		//表題を表示
		System.out.println("身長  標準体重");
		//スタート身長の値を代入したカウント用変数にeveryValueをインクリメント
		//カウント用変数がゴール身長の値を超えたらループ抜け
		for (int countValue = startValue; countValue <= lastValue; countValue = countValue + everyValue) {
			//身長と標準体重を入力
			System.out.println(countValue + "    " + (countValue - 100) * 0.9);
		}

	}
}
