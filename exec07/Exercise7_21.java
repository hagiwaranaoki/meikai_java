package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_21
 * 概要:配列aと配列bの全要素の値を交換する
 * 			要素数が異なる場合は小さいほうの要素数分の要素を交換
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_21 {
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
	 * 関数名:scanInput
	 * 概要:配列の要素数と全要素を入力させ宣言した配列を返すメソッド
	 * 引数:入力時の表示のためのint型変数[judgmentValue]
	 * 戻り値:入力された要素数と要素の値をもとに宣言した配列を返すint型配列[integerArray[]]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int[] scanInput(int judgmentValue) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int elementCount = 0;
		//入力時の表示用の文字型配列
		char[] outputArray = { 'a', 'b' };
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("配列" + outputArray[judgmentValue] + "の要素数:");
			//インスタンスから入力された値を受け取る
			elementCount = (int) scanInteger.nextDouble();
			//正の数が入力されたらループ抜け
		} while (elementCount <= 0);
		//入力された要素数をもとに配列を宣言
		int[] integerArray = new int[elementCount];
		//カウントが要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			//配列の要素の入力を促す
			System.out.print("配列" + outputArray[judgmentValue] + "[" + i + "]=");
			//インスタンスから入力された値を受け取る
			integerArray[i] = (int) scanInteger.nextDouble();
		}
		//メッセージを表示
		System.out.print("配列" + outputArray[judgmentValue] + "=");
		//配列を返す
		return integerArray;
	}

	/*
	 * 関数名:aryExchng
	 * 概要:配列aと配列bの全要素の値を交換する
	 * 引数:配列を受け取るint型配列[a[]][b[]]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void aryExchng(int[] a, int[] b) {
		//要素数を格納する変数を宣言
		int elementCount = 0;
		//配列aの要素数が多い場合
		if (a.length > b.length) {
			//bの要素数を代入する
			elementCount = b.length;
			//配列bの要素数が多いor要素数が同じ場合
		} else {
			//aの要素数を代入する
			elementCount = a.length;
		}
		//配列の要素数が小さいほうの配列の要素数で交換用の配列を宣言
		int[] exchangeArray = new int[elementCount];
		//カウントが要素数と等しくなったらループ抜け
		for (int i = 0; i < elementCount; i++) {
			//交換用の配列にaの要素を一時的に代入
			exchangeArray[i] = a[i];
			//aの配列にbの要素を格納
			a[i] = b[i];
			//bの配列にaの要素を格納
			b[i] = exchangeArray[i];
		}
	}

	/*
	 * 関数名:main
	 * 概要:要素数と挿入するインデックスと値を入力させaryExchngメソッドを呼び出す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		//表示の区別用の変数を宣言
		final int OUTPUT_COUNT = 1;
		//配列の要素数と全要素を入力させる
		int[] firstArray = scanInput(OUTPUT_COUNT - OUTPUT_COUNT);
		//配列の全要素を表示
		outputArray(firstArray);
		//配列の要素数と全要素を入力させる
		int[] secondArray = scanInput(OUTPUT_COUNT);
		//配列の全要素を表示
		outputArray(secondArray);

		//交換開始メッセージを表示
		System.out.println("配列aと配列bの全要素の値を交換します。");
		//配列の値を交換する
		aryExchng(firstArray, secondArray);
		//配列a=を表示
		System.out.print("配列a=");
		//配列の全要素を表示
		outputArray(firstArray);
		//配列b=を表示
		System.out.print("配列b=");
		//配列の全要素を表示
		outputArray(secondArray);
	}

}
