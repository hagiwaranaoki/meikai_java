package exec15;

// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise15_2
 * 概要:文字列を読み込んでその全文字の文字コードを表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_2 {
	/*
	 * 関数名:main
	 * 概要:文字列を読み込んでその全文字の文字コードを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		// 文字越の入力を促す
		System.out.print("文字列を入力してください: ");
		// 文字列を受け付ける
		String inputString = standardInput.nextLine();

		// 入力された文字列を表示
		System.out.println("入力された文字列: " + inputString);
		// 文字コードを表示
		System.out.println("文字コード:");

		// 文字列の文字数分繰り返し
		for (int i = 0; i < inputString.length(); i++) {
			// char型変数を生成し、文字列をchar型にして代入
			char charVariable = inputString.charAt(i);
			// 文字コードの変数を生成
			int charCode = (int) charVariable;
			// 一文字ずつの文字コードを出力
			System.out.println("文字 '" + charVariable + "' の文字コード: " + charCode);
		}
	}
}
