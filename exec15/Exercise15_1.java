package exec15;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise15_1
 * 概要:文字列を読み込んで逆順に表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_1 {
	/*
	 * 関数名:main
	 * 概要:文字列を読み込んで逆順に表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		// 文字列の入力を促す
		System.out.print("文字列を入力してください: ");
		// 文字列の入力を受け付け
		String inputString = standardInput.nextLine();

		// 文字列を逆順にする
		String reversedString = reverseString(inputString);

		// 入力された文字列を表示
		System.out.println("入力された文字列: " + inputString);
		// 逆順にした文字列を表示
		System.out.println("逆順の文字列: " + reversedString);
	}

	/*
	 * 関数名:reverseString
	 * 概要:文字列を読み込んで逆順に表示する
	 * 引数:反転させたい文字列
	 * 戻り値:反転した文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static String reverseString(String stringVariable) {
		// char型の配列を生成
		char[] charArray = stringVariable.toCharArray();
		// 配列の末尾を求める定数
		final int ARRAY_END = -1;
		// 配列の先頭の変数を定義
		int startIndex = 0;
		// 配列の末尾の変数を定義
		int endIndex = charArray.length + ARRAY_END;
		
		// 先頭が末尾より小さい時
		while (startIndex < endIndex) {
			// 先頭の文字を一時的な変数に保存
			char temporaryVariable = charArray[startIndex];
			// 先頭の文字を末尾の文字で置き換える
			charArray[startIndex] = charArray[endIndex];
			// 末尾の文字を一時的な変数（元の先頭の文字）で置き換える
			charArray[endIndex] = temporaryVariable;
			// 先頭のインデックスを1つ進める
			startIndex++;
			// 末尾のインデックスを1つ戻す
			endIndex--;
		}
		
		// 反転した文字の配列を新しい文字列に変換して返す
		return new String(charArray);
	}
}
