package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_19
 * 概要:入力された数値の月によって季節を表示。月以外の数値の場合は再度入力
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_19 {
	/*
	 * 関数名:main
	 * 概要:入力された数値の月によって季節を表示。月以外の数値の場合は再度入力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scannerInteger = new Scanner(System.in);

		//入力値を代入する変数を宣言
		int inputValue = 0;
		// リトライ用変数
		int userRetry = 0;

		//後判定ループ文
		do {
			//後判定ループ文
			do {
				//整数の入力を促す
				System.out.print("季節を求めます。\n何月ですか：");
				//インスタンスから入力された値を受け取る
				inputValue = scannerInteger.nextInt();
				//入力値が1～12の場合ループ抜け
			} while (inputValue < 1 || inputValue > 12);

			//入力値の場合分け
			switch (inputValue) {
			//3～5の場合
			case 3, 4, 5:
				System.out.println("季節は春です。");
				//繰り返し終了
				break;
			//6～8の場合
			case 6, 7, 8:
				System.out.println("季節は夏です。");
				//繰り返し終了
				break;
			//9～11の場合
			case 9, 10, 11:
				System.out.println("季節は秋です。");
				//繰り返し終了
				break;
			//12～2の場合
			case 12, 1, 2:
				System.out.println("季節は冬です。");
				//繰り返し終了
				break;
			}
			//整数の入力を促す
			System.out.print("もう一度？ 1...Yes/1以外...No:");
			//インスタンスから入力された値を受け取る
			userRetry = scannerInteger.nextInt();
			//1以外の数値が入力された場合ループ抜け
		} while (userRetry == 1);
	}
}
