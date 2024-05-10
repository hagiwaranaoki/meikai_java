package exec06;

//Randomクラスのインポート
import java.util.Random;
//標準入力のためのインポート文
import java.util.Scanner;

/*
 * クラス名:Exercise6_9
 * 概要:要素数が入力値のint型配列を生成して全要素を1～10の乱数で埋めつくす
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_9 {

	/*
	 * 関数名:main
	 * 概要:要素数が入力値のint型配列を生成して全要素を1～10の乱数で埋めつくす
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		//Randomオブジェクトを作成
		Random randomValue = new Random();
		//Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
		//要素数用の変数を宣言
		int elmentCount = 0;
		//カウント用の変数を宣言
		int countValue = 0;
		//乱数生成の範囲指定用変数を宣言
		final int RANDOM_RANGE = 10;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elmentCount = (int) standardInput.nextDouble();
			//正の数が入力されたらループ抜け
		} while (elmentCount <= 0);

		//int型配列を宣言
		int[] integerArray = new int[elmentCount];
		//配列の文字列出力
		System.out.print("配列 = { ");
		//カウントが要素数と等しくなればループ抜け
		for (countValue = 0; countValue < elmentCount; countValue++) {
			//配列に1～10の乱数を生成して代入
			integerArray[countValue] = randomValue.nextInt(RANDOM_RANGE) + 1;
			// 配列の要素出力
			System.out.print(integerArray[countValue] + " ");
		}
		// }出力
		System.out.println("}");
	}

}
