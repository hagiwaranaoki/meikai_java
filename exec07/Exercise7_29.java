package exec07;

import java.util.Scanner;

/*
 * クラス名:Exercise7_29
 * 概要:2次元配列のクローンを生成する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Exercise7_29 {

	/*
	 * 関数名:aryClone2
	 * 概要:2次元配列を複製する
	 * 引数:受け取った配列を格納するint型配列[a[][]]
	 * 戻り値:複製された新しいint型配列[answerArray[][]]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static int[][] aryClone2(int[][] a) {
		// 元の配列と同じサイズの新しい配列を作成
		int[][] answerArray = new int[a.length][a[0].length];
		//カウントが行の要素数と等しくなったらループ抜け
		for (int i = 0; i < answerArray.length; i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for (int j = 0; j < answerArray[i].length; j++) {
				// 元の配列の各要素を新しい配列にコピー
				answerArray[i][j] = a[i][j];
			}
		}
		// 複製された新しい配列を返す
		return answerArray;
	}

	/*
	 * 関数名:outputMultipleArray
	 * 概要:受け取った多次元配列の全要素を表示するメソッド
	 * 引数:受け取った多次元配列を格納するint型配列[integerArray[][]]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static void outputMultipleArray(int[][] integerArray) {
		//カウントが行の要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for (int j = 0; j < integerArray[i].length; j++) {
				//配列の要素を表示
				System.out.print(integerArray[i][j] + " ");
			}
			//改行を出力
			System.out.println();
		}
	}

	/*
	 * 関数名:scanMultipleInput
	 * 概要:多次元配列の要素数と全要素を入力させ配列を生成する
	 * 引数:なし
	 * 戻り値:入力された要素数と要素の値をもとに宣言した配列を返すint型配列[integerArray[][]]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static int[][] scanMultipleInput() {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		// 行を代入する変数を宣言
		int lineNumber = 0;
		// 列を代入する変数を宣言
		int columnNumber = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("行の要素数:");
			//インスタンスから入力された値を受け取る
			lineNumber = (int) scanInteger.nextDouble();
			//正の数が入力されたらループ抜け
		} while (lineNumber <= 0);
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("列の要素数:");
			//インスタンスから入力された値を受け取る
			columnNumber = (int) scanInteger.nextDouble();
			//正の数が入力されたらループ抜け
		} while (columnNumber <= 0);

		//入力された要素数をもとに配列を宣言
		int[][] firstArray = new int[lineNumber][columnNumber];
		//カウントが行の要素数と等しくなったらループ抜け
		for (int i = 0; i < firstArray.length; i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for (int j = 0; j < firstArray[i].length; j++) {
				//配列の要素の入力を促す
				System.out.print("配列x[" + i + "][" + j + "]=");
				//インスタンスから入力された値を受け取る
				firstArray[i][j] = (int) scanInteger.nextDouble();
			}
		}
		//配列を返す
		return firstArray;
	}

	/*
	 * 関数名:main
	 * 概要:入力では二次元配列を作成し、そのクローンを作成、表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static void main(String[] args) {
		//多次元配列の要素数と全要素を入力させ
		int[][] originalArray = scanMultipleInput();
		// 配列を複製し、その結果を配列クローンに代入
		int[][] cloneArray = aryClone2(originalArray);
		// オリジナルというタイトルを表示
		System.out.println("オリジナル");
		// 配列の全要素を出力
		outputMultipleArray(originalArray);
		//クローンというタイトルを表示
		System.out.println("クローン");
		// 配列クローンを出力
		outputMultipleArray(cloneArray);
	}

}
