package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_22
 * 概要:配列aで値がxである全要素のインデックスを格納した配列を表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_23 {
	//Scannerクラスのインスタンスを作成
	static Scanner scanInteger = new Scanner(System.in);

	/*
	 * 関数名:arraySrchIdx
	 * 概要:配列aで値がxである全要素のインデックスを配列に格納し返す
	 * 引数:配列を受け取るint型配列[a[]] 探索するキーを格納するint型変数[x]
	 * 戻り値:値がxであるインデックスを格納したint型配列[returnArray]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static int[] arraySrchIdx(int[] a, int x) {
		//配列aの要素数と同じ要素数の配列を宣言
		int[] indexArray = new int[a.length];
		//要素数を格納する変数を宣言
		int elementCount = 0;
		//カウントがaの要素数と等しくなったらループ抜け
		for (int i = 0; i < a.length; i++) {
			//探索キーが配列に存在する場合
			if (a[i] == x) {
				//インデックスを配列に格納
				indexArray[elementCount] = i;
				//要素数カウントをインクリメント
				elementCount++;
			}
		}
		//xの値分の要素数である配列を宣言
		int[] returnArray = new int[elementCount];
		//カウントが要素数と等しくなったらループ抜け
		for (int i = 0; i < elementCount; i++) {
			//インデックスを要素数をそろえた配列に代入
			returnArray[i] = indexArray[i];
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
	static int[] scanInput() {

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
	static void outputArray(int[] integerArray) {
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
	 * 概要:scanInputメソッドを呼び出し配列を宣言しその配列から探索するキーを入力させ
	 * 		arraySrchIdxを呼び出しインデックスが格納された配列を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//タイトルを表示
		System.out.println("配列aに存在するxの値のインデックスをすべて表示します。");
		//scanInputメソッドを呼び出す
		int[] integerArray = scanInput();
		//配列名を表示
		System.out.print("配列a=");
		//outputArrayメソッドを呼び出し配列integerArrayを表示
		outputArray(integerArray);
		//数値の入力を促す
		System.out.print("xの値:");
		//インスタンスから入力された値を受け取る
		int searchValue = (int) scanInteger.nextDouble();
		//タイトルを表示
		System.out.print("存在するインデックス:");
		//arraySrchIdxメソッドを呼び出しインデックスが格納された配列を表示
		outputArray(arraySrchIdx(integerArray, searchValue));
	}

}
