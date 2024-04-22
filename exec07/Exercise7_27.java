package exec07;

import java.util.Scanner;

/*
* クラス名:Exercise7_27
* 概要:3つの配列の要素数が等しければ加算を行いtrueを返し
* そうでなければ加算を行わずfalseを返すプログラム
* 作成者:N.Hagiwara
* 作成日:2024/04/08
*/

public class Exercise7_27 {

	/*
	* 関数名:addMatrix
	* 概要:３つの配列の要素数が等しければ加算を行いtrueを返す
	* 等しくなければ加算を行わずにfalseを返す
	* 引数:受け取った配列を格納するint型配列[x[][]],[y[][]],[z[][]]
	* 戻り値:false/trueを返すboolean型変数[returnValue]
	* 作成者:N.Hagiwara
	* 作成日:2024/04/08
	*/
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// フラグ変数の初期化
		boolean isFlag = true;

		// 配列の行数が等しいか確認
		if ((x.length == y.length) && (x.length == z.length)) {
			// 各行の列数が等しいか確認
			for (int i = 0; i < x.length; i++) {
				// 列数が正しくない場合
				if (!((x[i].length == y[i].length) && (z[i].length == y[i].length))) {
					// フラグ変数をfalseに変える
					isFlag = false;
				}
			}
			// 行数が等しくない場合
		} else {
			// フラグ変数をfalseにする
			isFlag = false;
		}

		// 配列の要素数が等しい場合、加算を行う
		if (isFlag == true) {
			// 配列xの行数数分繰り返す
			for (int i = 0; i < x.length; i++) {
				// 配列xの列数分繰り返す
				for (int j = 0; j < x[i].length; j++) {
					// 配列zをxとyの配列を加算した値に変更
					z[i][j] = x[i][j] + y[i][j];
				}
			}
		}

		// フラグの値を返す
		return isFlag;
	}

	/*
	* 関数名:addMatrix
	* 概要:二次元配列を出力する
	* 引数:二次元配列m
	* 戻り値:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/08
	*/
	static void printMatrix(int[][] m) {
		// h熾烈の行数分繰り返す
		for (int i = 0; i < m.length; i++) {
			// 配列の列数分繰り返す
			for (int j = 0; j < m[i].length; j++) {
				// 配列の要素を出力
				System.out.print(m[i][j] + " ");
			}
			// 改行する
			System.out.println();
		}
	}

	/*
	* 関数名:inputMatrix
	* 概要:コンソールから二次元配列の要素数と要素を入力する
	* 引数:Scannerオブジェクト
	* 戻り値:二次元配列
	* 作成者:N.Hagiwara
	* 作成日:2024/04/08
	*/
	static int[][] inputMatrix(Scanner standardInput) {
		//行を表す変数を定義
		int arrayRows = 0;
		// 列を表す変数を定義
		int arrayCols = 0;

		// 行数の入力を促す
		System.out.print("行数を入力してください: ");
		// 行数を受け付け
		arrayRows = standardInput.nextInt();
		// 行数が正の整数になるまで再入力を促す
		while (arrayRows <= 0) {
			// 正の整数値の入力を促す
			System.out.print("正の整数を入力してください: ");
			// 行数の入力を受け付け
			arrayRows = standardInput.nextInt();
		}

		// 列数の入力を促す
		System.out.print("列数を入力してください: ");
		// 列数を受け付け
		arrayCols = standardInput.nextInt();
		// 列数が正の整数になるまで再入力を促す
		while (arrayCols <= 0) {
			// 正の整数の入力を促す
			System.out.print("正の整数を入力してください: ");
			// 列数の入力を受け付け
			arrayCols = standardInput.nextInt();
		}

		// 入力した行数と列数の二次元配列を生成
		int[][] arrayMatrix = new int[arrayRows][arrayCols];

		// 配列の要素の入力を促す
		System.out.println("配列の要素を入力してください:");
		// 行数分繰り返す
		for (int i = 0; i < arrayRows; i++) {
			// 列数分繰り返す
			for (int j = 0; j < arrayCols; j++) {
				// 配列の要素を受け付け
				arrayMatrix[i][j] = standardInput.nextInt();
			}
		}

		// 配列を返す
		return arrayMatrix;
	}

	/*
	* 関数名:main
	* 概要:3つの配列の要素数が等しければ加算を行いtrueを返し
	* そうでなければ加算を行わずfalseを返すプログラム
	* 引数:なし
	* 戻り値:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/08
	*/
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 一つ目の配列の入力を促す
		System.out.println("一つ目の配列を入力してください:");
		// 一つ目の配列を受付
		int[][] firstArray = inputMatrix(standardInput);

		// 二つ目の配列の入力を促す
		System.out.println("二つ目の配列を入力してください:");
		// 二つ目の配列の入力を促す
		int[][] secondArray = inputMatrix(standardInput);

		// 三つ目の二次元配列を生成
		int[][] thirdArray = new int[firstArray.length][firstArray[0].length];

		// 加算できるかのフラグ変数
		boolean plusFlag = addMatrix(firstArray, secondArray, thirdArray);

		// 加算ができる場合
		if (plusFlag == true) {
			// 一つ目の配列タイトル表示
			System.out.println("一つ目の配列");
			// 一つ目の配列の中身を表示
			printMatrix(firstArray);
			// 二つ目の配列タイトル表示
			System.out.println("二つ目の配列");
			// 二つ目の配列の中身を表示
			printMatrix(secondArray);
			// 三つ目の配列タイトル表示
			System.out.println("三つ目の配列");
			// 三つの配列の中身を表示
			printMatrix(thirdArray);
			// 加算できない場合
		} else {
			// falseを表示
			System.out.println("false");
		}
		//Scannerオブジェクトの受付を終了
		standardInput.close();
	}
}