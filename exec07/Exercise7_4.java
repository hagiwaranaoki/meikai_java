package exec07;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_4
 * 概要:1からnまでの全整数の和を求めて表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise7_4 {
	/*
	 * 関数名:sumUp
	 * 概要:1からnまでの全整数の和を求める
	 * 引数:int型変数n
	 * 戻り値:全整数の和を表すsumAll
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	static int sumUp(int n) {
		// 合計値を初期化
		int sumAll = 0;
		// nと同じ数になるまで繰り返す
		for (int i = 0; i <= n; i++) {
			// 合計値に足していく
			sumAll = sumAll + i;
		}
		// 合計値を返す
		return sumAll;
	}

	/*
	 * 関数名:main
	 * 概要:1からnまでの全整数の和を求めて表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
		// 文字列出力
		System.out.print("整数値:");
		// 整数値の入力を待機
		int integerNumber = standardInput.nextInt();
		// signOfを使って入力された値の正負を調べて出力
		System.out.println("結果:" + sumUp(integerNumber));
	}

}
