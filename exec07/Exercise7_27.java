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
			// 等しい場合
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
		// 行列aの列数を入力するようメッセージを表示
		System.out.print("行列aの列数を入力してください: ");
		// 行列aの列数を入力
		int firstCols = standardInput.nextInt();

		// 入力が有効かどうかを示すフラグ
		boolean validInput = true;

		// 行列aの行数と列数が正の整数かどうかを確認
		if (firstRows <= 0 || firstCols <= 0) {
			// 正の整数でない場合はメッセージを表示
			System.out.println("行数と列数は正の整数で入力してください。");
			// 入力が無効であることを示すためフラグをfalseに設定
			validInput = false;
		}

		// 行列aを格納する変数を宣言
		int[][] firstArray = null;
		// 入力が有効な場合
		if (validInput) {
			// 行列aの要素を入力するようメッセージを表示
			System.out.println("行列aの要素を入力してください:");
			// 行列aの要素を入力
			firstArray = inputMatrix(standardInput, firstRows, firstCols);
		}

		// 行列bの行数を入力するようメッセージを表示
		System.out.print("行列bの行数を入力してください: ");
		// 行列bの行数を入力
		int secondRows = standardInput.nextInt();
		// 行列bの列数を入力するようメッセージを表示
		System.out.print("行列bの列数を入力してください: ");
		// 行列bの列数を入力
		int secondCols = standardInput.nextInt();

		// 行列bの行数と列数が正の整数かどうかを確認
		if (secondRows <= 0 || secondCols <= 0) {
			// 正の整数でない場合はメッセージを表示
			System.out.println("行数と列数は正の整数で入力してください。");
			// 入力が無効であることを示すためフラグをfalseに設定
			validInput = false;
		}

		// 行列bを格納する変数を宣言
		int[][] secondArray = null;
		// 入力が有効な場合
		if (validInput) {
			// 行列bの要素を入力するようメッセージを表示
			System.out.println("行列bの要素を入力してください:");
			// 行列bの要素を入力
			secondArray = inputMatrix(standardInput, secondRows, secondCols);
		}

		// 入力が有効な場合
		if (validInput) {
			// 加算結果を格納する行列cを宣言
			int[][] thirdArray = new int[firstRows][firstCols];

			// 行列の加算を行う
			boolean addResult = addMatrix(firstArray, secondArray, thirdArray);

			// 行列aの文字列を出力
			System.out.println("行列a");
			// 行列aを出力
			printMatrix(firstArray);
			// 行列bの文字列を出力
			System.out.println("行列b");
			// 行列bを出力
			printMatrix(secondArray);

			// 行列の加算が成功した場合
			if (addResult) {
				// 行列cの文字列を出力
				System.out.println("行列c");
				// 行列cを出力
				printMatrix(thirdArray);
				// 加算が成功したことを示すメッセージを表示
				System.out.println("行列の加算が成功しました。");
				// 行列の加算が成功しなかった場合
			} else {
				// 加算ができない場合はメッセージを表示
				System.out.println("行数と列数の両方が一致する場合でないと行列の加算は行うことができません。");
			}
		}
	}
}