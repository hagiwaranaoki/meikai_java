package exec06;

// Randomクラスのインポート
import java.util.Random;
import java.util.Scanner;

/*
 * クラス名:Exercise6_7
 * 概要:配列に探索するキー値が複数含まれる場合最も末尾に位置する要素を探索して表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_7 {
	/*
	 * 関数名:main
	 * 概要:配列に探索するキー値が複数含まれる場合最も末尾に位置する要素を探索して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration = new Random();
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//要素数を格納する変数をfinalで宣言
		final int ELMENT_COUNT = 12;
		//int型配列を宣言
		int[] integerArray = new int[ELMENT_COUNT];
		//乱数生成の範囲指定用変数を宣言
		int RANDOM_RANGE = 10;

		//入力値と等しくなったらループ抜け
		for (int countValue = 0; countValue < ELMENT_COUNT; countValue++) {
			//配列の全要素を乱数で埋める
			integerArray[countValue] = randomGeneration.nextInt(RANDOM_RANGE);
		}

		//メッセージを表示
		System.out.print("配列integerArrayの全要素の値\n{ ");
		//要素数と同じ回数繰り返し
		for (int countValue = 0; countValue < ELMENT_COUNT; countValue++) {
			//配列の値を表示
			System.out.print(integerArray[countValue] + " ");
		}
		//｝を表示
		System.out.println("}");

		//入力値を代入する変数を宣言
		int inputValue = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("探す数値:");
			//インスタンスから入力された値を受け取る
			inputValue = (int) scanInteger.nextDouble();
			//正の数が入力されたらループ抜け
		} while (inputValue < 0);
		//カウント用変数を宣言
		int countValue = 0;
		//配列の最大インデックスからデクリメントして０になったらループ抜け
		for (countValue = ELMENT_COUNT - 1; countValue > -1; countValue--) {
			//探す数値と要素が等しい場合
			if (integerArray[countValue] == inputValue) {
				//ループ抜け
				break;
			}
		}
		//カウントが０以上の場合
		if (countValue >= 0) {
			//数値のインデックスを表示
			System.out.println("それはintegerArray[" + countValue + "]にあります。");
			//カウントが０の場合
		} else {
			//なかったことを知らせるメッセージを表示
			System.out.println("それはありません。");
		}
	}

}
