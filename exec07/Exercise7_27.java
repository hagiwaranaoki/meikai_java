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
	* 戻り値:加算の成功/失敗を示すboolean型の値
	* 作成者:N.Hagiwara
	* 作成日:2024/04/08
	*/
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// 加算が可能かどうかを示すフラグ
		boolean canAdd = true;

		// 行列のサイズが等しいかどうかを確認
		if (x.length != y.length || x.length != z.length || x[0].length != y[0].length || x[0].length != z[0].length) {
			// サイズが等しくない場合はフラグをfalseに設定
			canAdd = false;
		} else {
			// 行数分繰り返し
			for (int i = 0; i < x.length; i++) {
				// 列数分繰り返し
				for (int j = 0; j < x[i].length; j++) {
					// 対応する要素の和を計算
					z[i][j] = x[i][j] + y[i][j];
				}
			}
		}

		// 加算が可能かどうかを返す
		return canAdd;
	}

	/*
	 * 関数名:printMatrix
	 * 概要:行列を出力する
	 * 引数:int型配列[m[][]]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static void printMatrix(int[][] m) {
		// 行列の行数だけループ
		for (int i = 0; i < m.length; i++) {
			// 行列の列数だけループ
			for (int j = 0; j < m[i].length; j++) {
				// 要素を出力
				System.out.print(m[i][j] + " ");
			}
			// 改行
			System.out.println();
		}
	}

	/*
	 * 関数名:inputMatrix
	 * 概要:行列の要素を入力する
	 * 引数:Scannerオブジェクト、行数、列数
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static int[][] inputMatrix(Scanner standardInput, int arrayRows, int arrayCols) {
		// 指定されたサイズの行列を作成
		int[][] arrayMatrix = new int[arrayRows][arrayCols];
		// 行数だけループ
		for (int i = 0; i < arrayRows; i++) {
			// 列数だけループ
			for (int j = 0; j < arrayCols; j++) {
				// 要素を入力
				arrayMatrix[i][j] = standardInput.nextInt();
			}
		}
		// 入力された行列を返す
		return arrayMatrix;
	}

	/*
	 * 関数名:main
	 * 概要:3つの配列の要素数が等しければ加算を行いtrueを返し
	 * そうでなければ加算を行わずfalseを返す
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);

		// 行列aの行数を入力するようメッセージを表示
		System.out.print("行列aの行数を入力してください: ");
		// 行列aの行数を入力
		int firstRows = standardInput.nextInt();
		// 行列aの行数が正の整数かどうかを確認
		while (firstRows <= 0) {
			// 正の整数でない場合はメッセージを表示し、再入力を促す
			System.out.print("行数は正の整数で入力してください。再入力してください: ");
			// 行列aの行数を再入力
			firstRows = standardInput.nextInt();
		}

		// 行列aの列数を入力するようメッセージを表示
		System.out.print("行列aの列数を入力してください: ");
		// 行列aの列数を入力
		int firstCols = standardInput.nextInt();
		// 行列aの列数が正の整数かどうかを確認
		while (firstCols <= 0) {
			// 正の整数でない場合はメッセージを表示し、再入力を促す
			System.out.print("列数は正の整数で入力してください。再入力してください: ");
			// 行列aの列数を再入力
			firstCols = standardInput.nextInt();
		}

		// 行列aの要素を入力するようメッセージを表示
		System.out.println("行列aの要素を入力してください:");
		// 行列aの要素を入力
		int[][] firstArray = inputMatrix(standardInput, firstRows, firstCols);

		// 行列bの行数を入力するようメッセージを表示
		System.out.print("行列bの行数を入力してください: ");
		// 行列bの行数を入力
		int secondRows = standardInput.nextInt();
		// 行列bの行数が正の整数かどうかを確認
		while (secondRows <= 0) {
			// 正の整数でない場合はメッセージを表示し、再入力を促す
			System.out.print("行数は正の整数で入力してください。再入力してください: ");
			// 行列bの行数を再入力
			secondRows = standardInput.nextInt();
		}

		// 行列bの列数を入力するようメッセージを表示
		System.out.print("行列bの列数を入力してください: ");
		// 行列bの列数を入力
		int secondCols = standardInput.nextInt();
		// 行列bの列数が正の整数かどうかを確認
		while (secondCols <= 0) {
			// 正の整数でない場合はメッセージを表示し、再入力を促す
			System.out.print("列数は正の整数で入力してください。再入力してください: ");
			// 行列bの列数を再入力
			secondCols = standardInput.nextInt();
		}

		// 行列bの要素を入力するようメッセージを表示
		System.out.println("行列bの要素を入力してください:");
		// 行列bの要素を入力
		int[][] secondArray = inputMatrix(standardInput, secondRows, secondCols);

		// 行列cの行数を入力するようメッセージを表示
		System.out.print("行列cの行数を入力してください: ");
		// 行列cの行数を入力
		int thirdRows = standardInput.nextInt();
		// 行列cの行数が正の整数かどうかを確認
		while (thirdRows <= 0) {
			// 正の整数でない場合はメッセージを表示し、再入力を促す
			System.out.print("行数は正の整数で入力してください。再入力してください: ");
			// 行列cの行数を再入力
			thirdRows = standardInput.nextInt();
		}

		// 行列cの列数を入力するようメッセージを表示
		System.out.print("行列cの列数を入力してください: ");
		// 行列cの列数を入力
		int thirdCols = standardInput.nextInt();
		// 行列cの列数が正の整数かどうかを確認
		while (thirdCols <= 0) {
			// 正の整数でない場合はメッセージを表示し、再入力を促す
			System.out.print("列数は正の整数で入力してください。再入力してください: ");
			// 行列cの列数を再入力
			thirdCols = standardInput.nextInt();
		}

		// 行列aの文字列を出力
		System.out.println("行列a");
		// 行列aを出力
		printMatrix(firstArray);
		// 行列bの文字列を出力
		System.out.println("行列b");
		// 行列bを出力
		printMatrix(secondArray);

		// 行列cの文字列を出力
		System.out.println("行列c");
		// 行列cを出力
		int[][] thirdArray = new int[thirdRows][thirdCols];
		// 行列cを出力
		printMatrix(thirdArray);

		// 行列の加算を行う
		boolean addResult = addMatrix(firstArray, secondArray, thirdArray);

		// 行列の加算が成功した場合
		if (addResult) {
			// 行列cの文字列を出力
			System.out.println("行列c (加算後)");
			// 行列cを出力
			printMatrix(thirdArray);
			// 加算が成功したことを示すメッセージを表示
			System.out.println("3つの行列のサイズが等しいため、行列の加算が成功しました。");
			// 成功していない場合
		} else {
			// addMatrixメソッドの戻り値を表示
			System.out.println("addMatrix:" + addResult);
			// 加算ができない場合はメッセージを表示
			System.out.println("行数及び列数が同一でないと加算することはできません。");
		}
	}
}