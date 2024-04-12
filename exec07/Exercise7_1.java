package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_1
 * 概要:与えられたint型の値の正負を確かめ、出力
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise7_1 {
	/*
	 * 関数名:signOf
	 * 概要:引数の正負を調べる
	 * 引数:int型変数n
	 * 戻り値:正、負、0を表すint型の変数regularNegative
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	static int signOf(int n) {
		// 正、負、0を格納する変数を定義
		int regularNegative = 0;
		// 0より小さい場合
		if (n < 0) {
			// 負を意味する-1を代入
			regularNegative = -1;
			// nが0の場合
		} else if (n == 0) {
			// 0を代入
			regularNegative = 0;
			// 正の場合
		} else {
			// 1を代入
			regularNegative = 1;
		}
		// -1,0,1のいずれかを返す
		return regularNegative;
	}

	/*
	 * 関数名:main
	 * 概要:入力を受け付けて正負を判定し、出力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
		// 整数値の入力を促す
		System.out.print("整数値:");
		// 整数値の入力を待機
		int integerNumber = standardInput.nextInt();
		// signOfを使って入力された値の正負を調べて出力
		System.out.println("結果:" + signOf(integerNumber));
	}

}
