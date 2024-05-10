package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_22
 * 概要:受け取った配列と同じ要素数、同じ要素の値を持つ配列を生成する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_22 {
	/*
	 * 関数名:arrayClone
	 * 概要:受け取った配列と同じ要素数、同じ要素の値を持つ配列を生成して返す
	 * 引数:配列を受け取るint型[a]
	 * 戻り値:受け取った配列のクローンを返すint型配列[returnArray]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int[] arrayClone(int[] a) {
		//配列aの要素数と同じ要素数の配列を宣言
		int[] returnArray = new int[a.length];
		//カウントがaの要素数と等しくなったらループ抜け
		for (int i = 0; i < a.length; i++) {
			//aの要素を1つずつ戻り値の配列に格納
			returnArray[i] = a[i];
		}
		//クローンの配列を返す
		return returnArray;
	}

	/*
	 * 関数名:scanInput
	 * 概要:配列の要素数と全要素を入力させ宣言した配列を返す
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
			System.out.print("配列[" + i + "]=");
			//インスタンスから入力された値を受け取る
			integerArray[i] = (int) scanInteger.nextDouble();
		}
		//配列を返す
		return integerArray;
	}

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
	 * 概要:scanInputメソッドによって宣言した配列と
	 * 			その配列を引数としてarrayCloneメソッドの戻り値の配列を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		//配列の要素数と要素を入力させる
		int[] integerArray = scanInput();
		//配列名を表示
		System.out.print("配列a(original)\t=");
		//配列の全要素を表示
		outputArray(integerArray);
		//配列名を表示
		System.out.print("配列a(clone)\t=");
		//クローンの配列の全要素を表示
		outputArray(arrayClone(integerArray));
	}

}
