package exec07;

// Randomクラスのインポート
import java.util.Random;
// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_10
 * 概要:3つの乱数を生成し4つのパターンの問題をランダムに出題する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_10 {
	//Scannerクラスのインスタンスを作成
	static Scanner scanInteger = new Scanner(System.in);

	/*
	 * 関数名:confirmRetry
	 * 概要:繰り返すか入力させそれに応じてtrue/falseを返す
	 * 引数:なし
	 * 戻り値:true/falseを返すか判断するint型変数[cont]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static boolean confirmRetry() {
		//繰り返すかの判断用の変数を宣言
		int cont = 0;
		//後判定ループ文
		do {
			//リトライするか聞く
			System.out.println("もう一度？<Yes...1/No...0>");
			//インスタンスから入力された値を受け取る
			cont = scanInteger.nextInt();
			//0か1が入力されたらループ抜け
		} while (cont != 0 && cont != 1);
		//contが1ならtrue/0ならfalseを返す
		return cont == 1;
	}

	/*
	 * 関数名:dividePattern
	 * 概要:3つの乱数とパターン用の乱数をもとに問題を表示
	 * 			答えと一致するまで入力させる
	 * 引数:受け取った3つの乱数を格納するint型変数[x][y][z]
	 * 			パターンを制御する乱数を格納するint型変数[patternValue]
	 * 戻り値:true/falseを返すか判断するint型変数[cont]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static void dividePattern(int x, int y, int z, int patternValue) {
		//一つ目の回答を格納する変数を宣言
		int firstNumber = 0;
		//二つ目の回答を格納する変数を宣言
		int secondNumber = 0;
		//三つ目の回答を格納する変数を宣言
		int thirdNumber = 0;
		//四つ目の回答を格納する変数を宣言
		int fourthNumber = 0;
		//問題のパターン用の乱数で場合分け
		switch (patternValue) {
		//場合分けの乱数が0の場合
		case 0:
			// 後判定ループ文
			do {
				// 式を表示
				System.out.print(x + "+" + y + "+" + z + "=");
				//インスタンスから入力された値を受け取る
				firstNumber = scanInteger.nextInt();
				//入力値と問題の答えが異なる場合
				if (firstNumber != x + y + z) {
					//間違いメッセージを表示
					System.out.println("違います。");
				}
				//入力値と問題の答えが一致したらループ抜け
			} while (firstNumber != x + y + z);
			//switch文抜け
			break;
		//場合分けの乱数が1の場合
		case 1:
			// 後判定ループ文を表示
			do {
				// 式を表示
				System.out.print(x + "+" + y + "-" + z + "=");
				//インスタンスから入力された値を受け取る
				secondNumber = scanInteger.nextInt();
				//入力値と問題の答えが異なる場合
				if (secondNumber != x + y - z) {
					//メッセージを表示
					System.out.println("違います。");
				}
				//入力値と問題の答えが一致したらループ抜け
			} while (secondNumber != x + y - z);
			//switch文抜け
			break;
		//場合分けの乱数が2の場合
		case 2:
			// 後判定ループ文
			do {
				// 式を表示
				System.out.print(x + "-" + y + "+" + z + "=");
				//インスタンスから入力された値を受け取る
				thirdNumber = scanInteger.nextInt();
				//入力値と問題の答えが異なる場合
				if (thirdNumber != x - y + z) {
					//間違いメッセージを表示
					System.out.println("違います。");
				}
				//入力値と問題の答えが一致したらループ抜け
			} while (thirdNumber != x - y + z);
			//switch文抜け
			break;
		//場合分けの乱数が3の場合
		case 3:
			// 後判定ループ文
			do {
				// 式を表示
				System.out.print(x + "-" + y + "-" + z + "=");
				//インスタンスから入力された値を受け取る
				fourthNumber = scanInteger.nextInt();
				//入力値と問題の答えが異なる場合
				if (fourthNumber != x - y - z) {
					//メッセージを表示
					System.out.println("違います。");
				}
				//入力値と問題の答えが一致したらループ抜け
			} while (fourthNumber != x - y - z);
			//switch文抜け
			break;
		}
	}

	/*
	 * 関数名:main
	 * 概要:3つの乱数と問題のパターン用の乱数を生成しdividePatternメソッドを呼び出す
	 * 			正解した場合confirmRetryメソッドを呼び出して繰り返すか判断
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration = new Random();
		//乱数生成の範囲を格納する変数を宣言
		int RANDOM_RANGE = 900;
		//問題のパターン数を格納する変数を宣言
		int PATTERN_NUMBER = 4;
		//後判定ループ文
		do {
			//3桁の数を生成して代入
			int firstNumber = randomGeneration.nextInt(RANDOM_RANGE) + 100;
			//3桁の数を生成して代入
			int secondNumber = randomGeneration.nextInt(RANDOM_RANGE) + 100;
			//3桁の数を生成して代入
			int thirdNumber = randomGeneration.nextInt(RANDOM_RANGE) + 100;
			//問題のパターン用の乱数を生成
			int patternValue = randomGeneration.nextInt(PATTERN_NUMBER);
			//問題を表示
			dividePattern(firstNumber, secondNumber, thirdNumber, patternValue);
			//繰り返すかどうかを判断
		} while (confirmRetry());

	}

}
