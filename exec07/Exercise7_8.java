package exec07;

// Randomクラスのインポート
import java.util.Random;
// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_8
 * 概要:a以上b未満の乱数を生成して表示 a>bの時はaの値を表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_8 {
	/*
	 * 関数名:random
	 * 概要:a以上b未満の乱数を生成して返す
	 * 引数:受け取った2つの数値を格納するint型変数[a][b]
	 * 戻り値:乱数を格納するint型変数[randomValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int random(int a, int b) {
		//乱数を格納する変数を宣言
		int randomValue = a;
		//Randomクラスのインスタンスを作成
		Random randomGeneration = new Random();
		//aがbより小さい場合
		if (a < b) {
			//a以上b未満の乱数を生成
			randomValue = randomGeneration.nextInt(b - a) + a;
		}
		//乱数を格納する変数を返す
		return randomValue;
	}

	/*
	 * 関数名:main
	 * 概要:2つの整数を入力させrandomメソッドを呼び出し返り値を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int firstNumber = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("整数値a:");
			//インスタンスから入力された値を受け取る
			firstNumber = scanInteger.nextInt();
			//正の数が入力されたらループ抜け
		} while (firstNumber <= 0);

		//入力値を代入する変数を宣言
		int secondNumber = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("整数値b:");
			//インスタンスから入力された値を受け取る
			secondNumber = scanInteger.nextInt();
			//正の数が入力されたらループ抜け
		} while (secondNumber <= 0);
		//randomメソッドを呼び出し返り値を表示
		System.out.println(random(firstNumber, secondNumber));
	}

}
