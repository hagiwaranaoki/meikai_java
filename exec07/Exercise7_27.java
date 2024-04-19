package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_27
 * 概要:3つの配列の要素数が等しければ加算を行いtrueを返し
 * 		そうでなければ加算を行わずfalseを返すプログラム
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_27 {

	/*
	 * 関数名:addMatrix
	 * 概要:３つの配列の要素数が等しければ加算を行いtrueを返す
	 * 		等しくなければ加算を行わずにfalseを返す
	 * 引数:受け取った配列を格納するint型配列[x[][]][y[][]][z[][]]
	 * 戻り値:false/trueを返すboolean型変数[returnValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	// 三つの二次元配列の要素数が等しければ加算を行い、等しくなければ加算を行わないメソッド
	public static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// 加算が可能かどうかを示すフラグ変数
		boolean canAdd = true;

		// 配列のサイズ（行数）が等しいかどうかを確認
		if (x.length != y.length || x.length != z.length || y.length != z.length) {
			// サイズが等しくない場合は、加算不可能なのでフラグを false に設定
			canAdd = false;
			// 行数が等しくなければ
		} else {
			// 各行の要素数が等しいかどうかを確認
			for (int i = 0; i < x.length; i++) {
				//各行の要素数が等しくない場合
				if (x[i].length != y[i].length || x[i].length != z[i].length || y[i].length != z[i].length) {
					// 加算不可能なのでフラグを false に設定
					canAdd = false;
					// ループを中断
					break;
				}
			}
		}

		// 加算が可能な場合のみ加算を行う
		if (canAdd) {
			//行カウントが要素数と等しくなったらループ抜け
			for (int i = 0; i < x.length; i++) {
				//列カウントが要素数と等しくなったらループ抜け
				for (int j = 0; j < x[i].length; j++) {
					 // 配列 x の各要素に、配列 y と配列 z の対応する要素の和を代入
					x[i][j] = y[i][j] + z[i][j];
				}
			}
		}

		// 加算の可否を示すフラグの値を返す
		return canAdd;
	}

	/*
	 * 関数名:scanMultipleInput
	 * 概要:多次元配列の要素数と全要素を入力させ宣言した配列を返すメソッド
	 * 引数:なし
	 * 戻り値:入力された要素数と要素の値をもとに宣言した配列を返すint型配列[integerArray[][]]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static int[][] scanMultipleInput() {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int lineNumber = 0, columnNumber = 0;
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
		int[][] integerArray = new int[lineNumber][columnNumber];
		//カウントが行の要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			//カウントが列の要素数と等しくなったらループ抜け
			for (int j = 0; j < integerArray[i].length; j++) {
				//配列の要素の入力を促す
				System.out.print("配列[" + i + "][" + j + "]=");
				//インスタンスから入力された値を受け取る
				integerArray[i][j] = (int) scanInteger.nextDouble();
			}
		}
		//配列を返す
		return integerArray;
	}

	/*
	 * 関数名:outputMultipleArray
	 * 概要:受け取った多次元配列の全要素を表示するメソッド
	 * 引数:受け取った多次元配列を格納するint型配列[integerArray[][]]
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
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
	 * 関数名:main
	 * 概要:scanMultiptleInputメソッドを呼び出し３つの多次元配列を生成し
	 * 		その３つの配列を引数としてaddMatrixメソッドを呼び出す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//多次元配列の要素数と全要素を入力させる
		int[][] firstArray = scanMultipleInput();
		//多次元配列の要素数と全要素を入力させる
		int[][] secondArray = scanMultipleInput();
		//多次元配列の要素数と全要素を入力させる
		int[][] thirdArray = scanMultipleInput();
		//配列の要素数が正しいかを調べて表示
		System.out.println(addMatrix(firstArray, secondArray, thirdArray));
	}
}
