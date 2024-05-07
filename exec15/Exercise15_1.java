package exec15;

// Scannerクラスをインポート
import java.util.Scanner;

/*
	クラス名:Exercise15_1
	概要:文字列を読み込んで逆順に表示する
	作成者:N.Hagiwara
	作成日:2024/04/16
*/
public class Exercise15_1 {
	/*
		関数名:main
		概要:文字列を読み込んで逆順に表示する
		引数:なし
		戻り値:なし
		作成者:N.Hagiwara
		作成日:2024/04/16
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
		関数名:reverseString
		概要:文字列を読み込んで逆順に表示する
		引数:反転させたい文字列
		戻り値:反転した文字列
		作成者:N.Hagiwara
		作成日:2024/04/16
	*/
	public static String reverseString(String stringVariable) {
		// 文字列の末尾を示す定数
		final int STRING_END = -1;
		// 反転した文字列を格納する変数を定義
		String reversedString = "";
		// 文字列の末尾から先頭に向かって1文字ずつ処理
		for (int i = stringVariable.length() + STRING_END; i >= 0; i--) {
			// 現在の文字を取得
			char currentChar = stringVariable.charAt(i);
			// 反転した文字列に現在の文字を追加
			reversedString += currentChar;
		}
		// 反転した文字列を返す
		return reversedString;
	}
}