package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_18
 * 概要:1からnまでの整数値の2乗値を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_18 {
	/*
	 * 関数名:main
	 * 概要:1からnまでの整数値の2乗値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);

		//入力値を代入する変数を宣言
		int inputValue = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("nの値:");
			//インスタンスから入力された値を受け取る
			inputValue = scanInteger.nextInt();
			//正の数が入力されたらループ抜け
		} while (inputValue <= 0);

		//カウントが入力値を超えたらループ抜け
		for (int countValue = 1; countValue <= inputValue; countValue++) {
			//1からnまでの二乗を表示
			System.out.println(countValue + "の2乗は" + countValue * countValue);
		}
	}
}
