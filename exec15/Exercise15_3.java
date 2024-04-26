package exec15;

// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise15_3
 * 概要:文字列を探索し、探索した文字列に揃うように文字列を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_3 {
	/*
	 * 関数名:main
	 * 概要:文字列を探索し、探索した文字列に揃うように文字列を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		// 文字列1の入力を促す
		System.out.print("文字列1：");
		// 文字列1を受け付ける
		String firstString = standardInput.next();
		// 文字列2の入力を促す
		System.out.print("文字列2：");
		// 文字列2の入力を受け付ける
		String secondString = standardInput.next();
		
		// 文字列2が文字列1に含まれるかを調べる
		int indexVariable = firstString.indexOf(secondString);
		
		// 文字列が含まれない場合の定数
		final int NOT_INCLUDED = -1;
		
		// 文字列2が文字列1に含まれる場合
		if (indexVariable != NOT_INCLUDED) {
			// 文字列1出力
			System.out.println("文字列1:" + firstString);
			// 文字列2出力
			System.out.print("文字列2:");
			// 探索したい文字列の先頭が来るまで繰り返す
			for (int i = 0; i < indexVariable; i++) {
				// 空白を出力
				System.out.print(" ");
			}
			// 文字列2を出力
			System.out.println(secondString);
			// 文字列2が文字列1に含まれない場合
		} else {
			// 文字列2が文字列1に含まれないということを表示する
			System.out.println("文字列2は文字列1に含まれません。");
		}
	}
}
