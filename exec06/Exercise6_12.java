package exec06;

// Randomクラスをインポート
import java.util.Random;
// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise6_12
 * 概要:配列の要素の並びをシャッフルする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_12 {
	/*
	 * 関数名:main
	 * 概要:配列の要素の並びをシャッフルする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomGeneration = new Random();

		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//要素数を代入する変数を宣言
		int elmentCount = 0;
		//乱数生成の範囲を格納する変数を宣言
		final int RANDOM_RANGE = 90;

		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elmentCount = scanInteger.nextInt();
			//正の数が入力されたらループ抜け
		} while (elmentCount <= 0);

		//シャッフル前の配列を宣言
		int[] beforeArray = new int[elmentCount];
		//シャッフル後の配列を宣言
		int[] afterArray = new int[elmentCount];
		//シャッフルしたインデックスを格納する配列を宣言
		int[] indexArray = new int[elmentCount];

		//配列=のメッセージを表示
		System.out.print("beforeArray={");
		//カウントが要素数と等しくなったらループ抜け
		for (int countValue = 0; countValue < elmentCount; countValue++) {
			////要素数分の乱数を生成してシャッフル前の配列に代入
			beforeArray[countValue] = randomGeneration.nextInt(RANDOM_RANGE);
			//シャッフル前の配列の中身を表示
			System.out.print(" " + beforeArray[countValue]);
		}
		//｝を表示
		System.out.println(" }");

		//カウントが要素数と等しくなればループ抜け
		for (int countValue = elmentCount - 1; countValue >= 0; countValue--) {
			//配列に1～10の乱数を生成して代入
			indexArray[countValue] = randomGeneration.nextInt(elmentCount);
			//配列の最大インデックスからデクリメントして０になったらループ抜け
			for (int searchIndex = elmentCount - 1; searchIndex > 0; searchIndex--) {
				//indexArrayの要素が他のインデックスの要素と等しい場合
				if (countValue != searchIndex && indexArray[countValue] == indexArray[searchIndex]) {
					//カウント数をインクリメントしてループ抜け
					countValue++;
					// for文から抜ける
					break;
				}
			}
		}
		//メッセージを表示
		System.out.print("配列をシャッフルしました。\n" + "afterArray={");
		//カウントが要素数を超えたらループ抜け
		for (int countValue = 0; countValue < elmentCount; countValue++) {
			//ランダムなインデックスを格納しているindexArrayをもとにシャッフル前の配列の値をシャッフル後の配列へ代入
			afterArray[countValue] = beforeArray[indexArray[countValue]];
			//シャッフル後の配列の全要素を表示
			System.out.print(afterArray[countValue] + " ");
		}
		//}を表示
		System.out.print("}");
	}

}
