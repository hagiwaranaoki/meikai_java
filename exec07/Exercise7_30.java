package exec07;

import java.util.Scanner;

/*
 * クラス名:Exercise7_30
 * 概要:minという名前のメソッドを三つ作り、多重定義のテストをする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Exercise7_30 {
	//Scannerクラスのインスタンスを作成
	static Scanner scanInteger = new Scanner(System.in);

	/*
	 * 関数名:min
	 * 概要:二つの整数の最小値を求める
	 * 引数:int型の変数a,b
	 * 戻り値:最小値[minimumValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static int min(int a, int b) {
		// aを最小値賭して初期化
		int minimumValue = a;
		// aがbより大きい場合
		if (a > b) {
			// bを最小値とする
			minimumValue = b;
		}
		// 最小値を返す
		return minimumValue;
	}

	/*
	 * 関数名:min
	 * 概要:三つの整数の最小値を求める
	 * 引数:int型の変数a,b,c
	 * 戻り値:最小値[minimumValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static int min(int a, int b, int c) {
		// aを最小値として初期化
		int minimumValue = a;
		// bが現在の最小値より小さい場合
		if (b < minimumValue) {
			// bを最小値とする
			minimumValue = b;
		}

		// cが現在の最小値より小さい場合
		if (c < minimumValue) {
			// cを最小値とする
			minimumValue = c;
		}
		// 最小値を返す
		return minimumValue;
	}

	/*
	 * 関数名:min
	 * 概要:三つの整数の最小値を求める
	 * 引数:int型の変数a,b,c
	 * 戻り値:最小値[minimumValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static int min(int[] a) {
		// 配列の最初の要素を最小値とする
		int minimumValue = a[0];
		// 配列の全ての要素を順に調べる
		for (int i = 1; i < a.length; i++) {
			// 現在の要素が現在の最小値より小さい場合
			if (a[i] < minimumValue) {
				// その要素を最小値とする
				minimumValue = a[i];
			}
		}
		// 最小値を返す
		return minimumValue;
	}

	/*
	 * 関数名:scanInput
	 * 概要:配列の要素数と全要素を入力させ宣言した配列を返すメソッド
	 * 引数:入力時の表示のためのint型変数[judgmentValue]
	 * 戻り値:入力された要素数と要素の値をもとに宣言した配列を返すint型配列[integerArray[]]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static int[] scanInput(int judgmentValue) {
		//入力値を代入する変数を宣言
		int elementCount = 0;
		//整数の入力を促す
		System.out.print("配列" + "の要素数:");
		//インスタンスから入力された値を受け取る
		elementCount = (int) scanInteger.nextDouble();
		// 入力された阿知賀0以下の場合
		if (elementCount <= 0) {
			//後判定ループ文
			do {
				//整数の入力を促す
				System.out.print("要素数は正の整数値で入力してください：");
				//インスタンスから入力された値を受け取る
				elementCount = (int) scanInteger.nextDouble();
				//正の数が入力されたらループ抜け
			} while (elementCount <= 0);
		}
		//入力された要素数をもとに配列を宣言
		int[] integerArray = new int[elementCount];
		//カウントが要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			//配列の要素の入力を促す
			System.out.print("配列" + "[" + i + "]=");
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
	 * 概要:配列や整数値の中での最小値を求めて表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static void main(String[] args) {
		//表示の区別用の変数を宣言
		final int OUTPUT_COUNT = 1;
		// 一つ目の整数の入力を促す
		System.out.print("一つ目の整数：");
		// 一つ目の整数をコンソールで受け付け
		int firstValue = scanInteger.nextInt();
		// 二つ目の整数の入力を促す
		System.out.print("二つ目の整数：");
		// 二つ目の整数をコンソールで受け付け
		int secondValue = scanInteger.nextInt();
		// 三つ目の整数の入力を促す
		System.out.print("三つ目の整数：");
		// 三つ目の整数をコンソールで受け付け
		int thirdValue = scanInteger.nextInt();
		// 一つ目の配列を作成
		int[] firstArray = scanInput(OUTPUT_COUNT);

		// メソッドで二つの値の最小値を求めて出力
		System.out.println("最初の二つの値の最小値：" + min(firstValue, secondValue));
		// メソッドで三つの値の最小値を求めて出力
		System.out.println("三つの値の最小値：" + min(firstValue, secondValue, thirdValue));
		// 文字列を出力
		System.out.print("配列：");
		// メソッドで配列の中身を出力
		outputArray(firstArray);
		// 配列の中の最小値を求めて出力
		System.out.println("配列の中の最小値：" + min(firstArray));
	}

}
