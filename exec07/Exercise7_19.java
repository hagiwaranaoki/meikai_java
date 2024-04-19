package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
* クラス名:Exercise7_19
* 概要:配列から入力されたインデックスの要素n個分を前方にずらすことで削除するプログラム
* 作成者:N.Hagiwara
* 作成日:2024/04/08
*/
public class Exercise7_19 {

	/*
	 * 関数名:outputArray
	 * 概要:受け取った配列の全要素を表示する
	 * 引数:受け取った配列を格納するint型配列[integerArray]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void outputArray(int[] integerArray) {
		// {を表示
		System.out.print("{ ");

		// カウントが配列の要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			// 配列の要素を表示
			System.out.print(integerArray[i] + " ");
		}

		// }を表示
		System.out.println("}");
	}

	/*
	 * 関数名:aryRmvN
	 * 概要:配列から受け取ったインデックスの要素を削除するメソッド
	 * 引数:配列を受け取るint型配列[a[]]
	 *      削除するインデックスを受け取るint型変数[idx]
	 *      削除する要素数を受け取るint型変数[n]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void aryRmvN(int[] a, int idx, int n) {
		// 要素数が1の定数
		final int ELEMENT_ONE = 1;
		// 要素数が1の場合は何もしない
		if (a.length != ELEMENT_ONE) {
			// 削除する要素からカウントが要素数-nになったらループ抜け
			for (int i = idx; i < a.length - n; i++) {
				// n個前方にずらす
				a[i] = a[i + n];
			}
		}
	}

	/*
	 * 関数名:main
	 * 概要:要素数と各要素と削除する要素を入力させaryRmvNメソッドを呼び出す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);

		// 入力値を代入する変数を宣言
		int elementCount = 0;

		// 後判定ループ文
		do {
			// 整数の入力を促す
			System.out.print("要素数:");
			// インスタンスから入力された値を受け取る
			elementCount = (int) scanInteger.nextDouble();
			// 正の数が入力されたらループ抜け
		} while (elementCount <= 0);

		// 入力された要素数をもとに配列を宣言
		int[] integerArray = new int[elementCount];

		// カウントが要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			// 配列の要素の入力を促す
			System.out.print("integerArray[" + i + "]=");
			// インスタンスから入力された値を受け取る
			integerArray[i] = (int) scanInteger.nextDouble();
		}

		// 配列の全要素を表示
		outputArray(integerArray);
		
		// 削除するインデックスの定数
		final int DELETE_INDEX = -1;
		// 要素数が1の場合は削除を行わない
		if (elementCount == 1) {
			System.out.println("要素数が1の時は削除を行いません。");
		} else {
			// 削除するインデックスを格納する変数を宣言
			int deleteIndex = DELETE_INDEX;

			// 後判定ループ文
			do {
				// インデックスの入力を促す
				System.out.print("削除する要素のインデックス:");
				// インスタンスから入力された値を受け取る
				deleteIndex = (int) scanInteger.nextDouble();
				// 要素数より小さい0以上の数が入力されたらループ抜け
			} while (deleteIndex < 0 || deleteIndex >= elementCount);

			// 削除する要素数を格納する変数を宣言
			int deleteCount = 0;

			// 後判定ループ文
			do {
				// 個数の入力を促す
				System.out.print("削除する要素の個数:");
				// インスタンスから入力された値を受け取る
				deleteCount = (int) scanInteger.nextDouble();
				// 要素数より小さい正の数が入力されたらループ抜け
			} while (deleteCount <= 0 || deleteCount > elementCount - deleteIndex);

			// 配列の要素を削除
			aryRmvN(integerArray, deleteIndex, deleteCount);

			// 配列の全要素を表示
			outputArray(integerArray);
		}
	}
}