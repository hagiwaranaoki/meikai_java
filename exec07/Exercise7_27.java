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
	 * また、加算結果が正しいかどうかも判定し、結果をメッセージで出力する
	 * 引数:受け取った配列を格納するint型配列[x[][]],[y[][]],[z[][]]
	 * 戻り値:加算の成功/失敗を示すboolean型の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// 配列の要素数を計算
		int xElements = x.length * x[0].length;
		// 配列の要素数を計算
		int yElements = y.length * y[0].length;
		// 配列の要素数を計算
		int zElements = z.length * z[0].length;

		// 配列の要素数が等しいかどうかを示すフラグ変数
		boolean equalElements = true;
		// 加算結果が正しいかどうかを示すフラグ変数
		boolean additionCorrect = true;

		// 配列の要素数が等しいか確認
		if (xElements == yElements && xElements == zElements) {
			// 配列の要素数が等しい場合、加算を行う
			int arrayIndex = 0;
			// 配列xの行数分繰り返す
			for (int i = 0; i < x.length; i++) {
				// 配列xの列数分繰り返す
				for (int j = 0; j < x[i].length; j++) {
					// 配列zの要素を、配列xとyの対応する要素の和に設定
					z[arrayIndex / z[0].length][arrayIndex % z[0].length] = x[i][j] + y[arrayIndex / y[0].length][arrayIndex % y[0].length];
					// インデックスを増加
					arrayIndex++;
				}
			}

			// インデックスを初期化
			arrayIndex = 0;
			// 配列xの行数分繰り返す
			for (int i = 0; i < x.length; i++) {
				// 配列xの列数分繰り返す
				for (int j = 0; j < x[i].length; j++) {
					// 配列zの要素が、配列xとyの対応する要素の和と等しくない場合
					if (z[arrayIndex / z[0].length][arrayIndex % z[0].length] != x[i][j] + y[arrayIndex / y[0].length][arrayIndex % y[0].length]) {
						// 加算結果が正しくないことを示すフラグ変数をfalseに設定
						additionCorrect = false;
						// ループを抜ける
						break;
					}
					// インデックスを増加
					arrayIndex++;
				}
				// 加算結果が正しくない場合
				if (!additionCorrect) {
					// ループを抜ける
					break;
				}
			}
			// 要素数が等しくない場合
		} else {
			// 配列の要素数が等しくないことを示すフラグ変数をfalseに設定
			equalElements = false;
		}

		// 配列の要素数が等しくない場合
		if (!equalElements) {
			// エラーメッセージを出力
			System.out.println("配列の要素数が等しくないため、加算できません。");
		}

		// 加算結果が正しい場合
		if (additionCorrect && equalElements) {
			// 加算結果が正しいことを示すメッセージを出力
			System.out.println("加算結果は正しいです。");
		} else if (equalElements) {
			// 加算結果が正しくないことを示すメッセージを出力
			System.out.println("加算結果が正しくありません。");
		}

		// 配列の要素数が等しく、加算結果が正しい場合はtrue、そうでない場合はfalseを返す
		return equalElements && additionCorrect;
	}

	/*
	 * 関数名:printMatrix
	 * 概要:二次元配列を出力する
	 * 引数:二次元配列m
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static void printMatrix(int[][] m) {
		// 行数分繰り返す
		for (int i = 0; i < m.length; i++) {
			// 列数分繰り返す
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
	 * 引数:Scannerオブジェクト、配列の番号、配列の名前
	 * 戻り値:二次元配列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static int[][] inputMatrix(Scanner standardInput, int matrixNumber, String matrixName) {
		// 行を表す変数を定義
		int arrayRows = 0;
		// 列を表す変数を定義
		int arrayCols = 0;

		// 行数の入力を促す
		System.out.print(matrixNumber + "つ目の配列の行数を入力してください: ");
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
		System.out.print(matrixNumber + "つ目の配列の列数を入力してください: ");
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
		System.out.println(matrixNumber + "つ目の配列の要素を入力してください:");
		// 行数分繰り返す
		for (int i = 0; i < arrayRows; i++) {
			// 列数分繰り返す
			for (int j = 0; j < arrayCols; j++) {
				// 配列の要素の入力を促す
				System.out.print(matrixName + "[" + i + "][" + j + "] = ");
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

		// 一つ目の配列を受付
		int[][] firstArray = inputMatrix(standardInput, 1, "firstArray");

		// 二つ目の配列を受付
		int[][] secondArray = inputMatrix(standardInput, 2, "secondArray");

		// 三つ目の二次元配列を生成
		int[][] thirdArray = new int[firstArray.length][firstArray[0].length];

		// 一つ目の配列の要素数を表示
		System.out.println("一つ目の配列の要素数: " + (firstArray.length * firstArray[0].length));
		// 二つ目の配列の要素数を表示
		System.out.println("二つ目の配列の要素数: " + (secondArray.length * secondArray[0].length));

		// 加算を行い、結果を取得
		boolean additionSuccessful = addMatrix(firstArray, secondArray, thirdArray);

		// addMatrixメソッドの戻り値を表示
		System.out.println("addMatrix: " + additionSuccessful);

		// 加算が成功した場合
		if (additionSuccessful) {
			// 一つ目の配列タイトル表示
			System.out.println("一つ目の配列");
			// 一つ目の配列の中身を表示
			printMatrix(firstArray);
			// 二つ目の配列タイトル表示
			System.out.println("二つ目の配列");
			// 二つ目の配列の中身を表示
			printMatrix(secondArray);
			// 三つ目の配列タイトル表示
			System.out.println("三つ目の配列(加算結果)");
			// 三つの配列の中身を表示
			printMatrix(thirdArray);
			//加算が成功しなかった場合
		} else {
			// 一つ目の配列タイトル表示
			System.out.println("一つ目の配列");
			// 一つ目の配列の中身を表示
			printMatrix(firstArray);
			// 二つ目の配列タイトル表示
			System.out.println("二つ目の配列");
			// 二つ目の配列の中身を表示
			printMatrix(secondArray);
		}

		// Scannerオブジェクトの受付を終了
		standardInput.close();
	}
}