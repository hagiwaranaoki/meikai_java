package exec06;

//Randomクラスのインポート
import java.util.Random;
//Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise6_4
 * 概要:アスタリスクで乱数の縦向きの棒グラフを表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_4 {
	/*
	 * 関数名:main
	 * 概要:アスタリスクで乱数の縦向きの棒グラフを表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//Randomクラスのインスタンスを作成
		Random randomGeneration = new Random();
		//乱数生成の範囲指定用変数を宣言
		final int RANDOM_RANGE = 10;
		//入力値を代入する変数を宣言
		int inputValue = 0;
		// 個数をカウントする変数
		int countValue = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			inputValue = (int) scanInteger.nextDouble();
			//正の数が入力されたらループ抜け
		} while (inputValue <= 0);
		//int型の配列を宣言
		int[] integerArray = new int[inputValue];

		//カウントが入力値を超えたらループ抜け
		for (countValue = 0; countValue < inputValue; countValue++) {
			//1～10の乱数を生成して配列の各要素に代入
			integerArray[countValue] = randomGeneration.nextInt(RANDOM_RANGE);
		}
		//最大値を格納する変数に配列の最初の値を代入
		int maximumValue = integerArray[0];

		//カウントが要素数を超えたらループ抜け
		for (countValue = 1; countValue < inputValue; countValue++) {
			//最大値より配列の値が大きい場合
			if (maximumValue < integerArray[countValue]) {
				//配列の値を最大値を格納する変数に代入
				maximumValue = integerArray[countValue];
			}
		}
		//配列の最大値を代入した変数heightValueが0になったらループ抜け
		for (int heightValue = maximumValue; heightValue > 0; heightValue--) {
			//変数widthValueが要素数の値になったらループ抜け
			for (int widthValue = 0; widthValue < inputValue; widthValue++) {
				//配列の値を下回っている場合
				if (integerArray[widthValue] >= heightValue) {
					//＊を表示
					System.out.print("*");
					//配列の値を上回っている場合
				} else {
					//空白を表示
					System.out.print(" ");
				}
				//空白を表示
				System.out.print(" ");
			}
			//改行を表示
			System.out.println();
		}
		//カウントが要素数を超えたらループ抜け
		for (countValue = 0; countValue < inputValue; countValue++) {
			//-を表示
			System.out.print("--");
		}
		//改行を表示
		System.out.println();
		//カウントが要素数を超えたらループ抜け
		for (countValue = 0; countValue < inputValue; countValue++) {
			//インデックスを10で割った余を表示
			System.out.print((countValue % 10) + " ");
		}
	}
}
