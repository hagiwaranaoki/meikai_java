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
		//引数:標準入力System.in
		Scanner scannerInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int inputValue = 0;
		//整数の入力を促す
		System.out.print("何個*を表示しますか:");
		//インスタンスから入力された値を受け取る
		inputValue = scannerInteger.nextInt();
		// 入力された値が0以下の場合
		if (inputValue <= 0) {
			//後判定ループ文
			do {
				//整数の入力を促す
				System.out.print("正の整数値を入力してください:");
				//インスタンスから入力された値を受け取る
				inputValue = scannerInteger.nextInt();
				//正の数が入力されたらループ抜け
			} while (inputValue <= 0);
		}

		//カウントが入力値を超えたらループ抜け
		for (int countValue = 1; countValue <= inputValue; countValue++) {
			//＊を表示
			System.out.print("*");
			//＊を5個表示ごと
			if (countValue % 5 == 0) {
				//改行を出力
				System.out.println();
			}
		}
	}
}