package exec07;

// Scannerクラスのインポート
import java.util.Scanner;

/*
* クラス名:Exercise7_26
* 概要:配列aから要素a[idx]を挿入した配列を表示
* 作成者:N.Hagiwara
* 作成日:2024/04/08
*/
public class Exercise7_26 {

	/*
	 * 関数名:arrayInsOf
	 * 概要:配列aから指定したインデックスに値を挿入した配列を返すメソッド
	 * 引数:配列を受け取るint型配列[a[]] 挿入するインデックスを受け取るint型変数[idx] ※教本の表記
	 * 		挿入する値を受け取るint型配列[x]  ※教本の表記
	 * 戻り値:配列aから要素a[idx]を挿入したint型配列[returnArray]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int[] arrayInsOf(int[] a, int idx, int x) {
		//配列aの要素数と同じ要素数の配列を宣言
		int[] returnArray = new int[a.length + 1];
		//カウントがidxと等しくなったらループ抜け
		for (int i = 0; i < idx; i++) {
			//受け取った配列の要素を代入
			returnArray[i] = a[i];
		}
		//指定したインデックスに挿入する値を代入
		returnArray[idx] = x;
		//カウントがaの要素数と等しくなったらループ抜け
		for (int i = idx; i < a.length; i++) {
			//idx以降の要素を1つずつ後方に代入
			returnArray[i + 1] = a[i];
		}
		//配列を返す
		return returnArray;
	}

	/*
	 * 関数名:scanInput
	 * 概要:配列の要素数と全要素を入力させ宣言した配列を返すメソッド
	 * 引数:なし
	 * 戻り値:入力された要素数と要素の値をもとに宣言した配列を返すint型配列[integerArray[]]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int[] scanInput() {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int elementCount = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elementCount = (int) scanInteger.nextDouble();
			//正の数が入力されたらループ抜け
		} while (elementCount <= 0);
		//入力された要素数をもとに配列を宣言
		int[] integerArray = new int[elementCount];
		//カウントが要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			//配列の要素の入力を促す
			System.out.print("配列a[" + i + "]=");
			//インスタンスから入力された値を受け取る
			integerArray[i] = (int) scanInteger.nextDouble();
		}
		//配列を返す
		return integerArray;
	}

	/*
	 * 関数名:outputArray
	 * 概要:受け取った配列の全要素を表示するメソッド
	 * 引数:受け取った配列を格納するint型配列[integerArray]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void outputArray(int[] integerArray) {
		// {を表示
		System.out.print("{ ");
		//カウントが配列の要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			//配列の要素を表示
			System.out.print(integerArray[i] + " ");
		}
		// }を表示
		System.out.println("}");
	}

	/*
	 * 関数名:main
	 * 概要:scanInputメソッドを呼び出し配列を宣言し
	 * 		その配列から挿入するインデックスと値を入力させarrayInsOfを呼び出し配列を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//メッセージを表示
		System.out.println("配列aから特定のインデックスの値を挿入します。");
		//配列の要素数と要素を入力させる
		int[] integerArray = scanInput();
		//メッセージを表示
		System.out.print("配列a=");
		//配列の全要素を表示
		outputArray(integerArray);
		//挿入するインデックスを格納する変数を宣言
		int insertIndex = -1;
		//後判定ループ文
		do {
			//数値の入力を促す
			System.out.print("挿入するインデックス:");
			//インスタンスから入力された値を受け取る
			insertIndex = (int) scanInteger.nextDouble();
			//要素数未満の正の数が入力されたらループ抜け
		} while (insertIndex < 0 || insertIndex >= integerArray.length);
		//数値の入力を促す
		System.out.print("挿入する値:");
		//インスタンスから入力された値を受け取る
		int insertValue = (int) scanInteger.nextDouble();

		//メッセージを表示
		System.out.print("配列a=");
		//配列の全要素を表示
		outputArray(arrayInsOf(integerArray, insertIndex, insertValue));
	}

}
