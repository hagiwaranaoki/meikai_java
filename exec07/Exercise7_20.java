package exec07;

// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_20
 * 概要:入力された要素を指定したインデックスに挿入するプログラム
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_20 {
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
	 * 関数名:aryIns
	 * 概要:受け取ったインデックスに要素を挿入するメソッド
	 * 引数:配列を受け取るint型配列[a[]]
	 * 			挿入するインデックスを受け取るint型変数[idx]
	 * 			挿入する値を受け取るint型配列[x]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void aryIns(int[] a, int idx, int x) {
		//要素数-2からデクリメントし挿入するインデックスと等しくなったらループ抜け
		for (int i = a.length - 2; i >= idx; i--) {
			//後方に1つずつ要素をずらしていく
			a[i + 1] = a[i];
		}
		//挿入したいインデックスに値を代入する
		a[idx] = x;
	}

	/*
	 * 関数名:main
	 * 概要:要素数と挿入するインデックスと値を入力させaryInsメソッドを呼び出す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
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
			System.out.print("integerArray[" + i + "]=");
			//インスタンスから入力された値を受け取る
			integerArray[i] = (int) scanInteger.nextDouble();
		}
		//outputArrayメソッドを呼び出す
		outputArray(integerArray);
		//削除するインデックスを格納する変数を宣言
		int deleteIndex = -1;
		//後判定ループ文
		do {
			//インデックスの入力を促す
			System.out.print("挿入するインデックス:");
			//インスタンスから入力された値を受け取る
			deleteIndex = (int) scanInteger.nextDouble();
			//要素数より小さい正の数が入力されたらループ抜け
		} while (deleteIndex < 0 || deleteIndex >= elementCount);
		//数値の入力を促す
		System.out.print("挿入する値:");
		//インスタンスから入力された値を受け取る
		int insertValue = (int) scanInteger.nextDouble();
		//aryInsメソッドを呼び出す
		aryIns(integerArray, deleteIndex, insertValue);
		//outputArrayメソッドを呼び出す
		outputArray(integerArray);
	}

}
