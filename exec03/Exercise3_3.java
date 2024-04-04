package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise3_3
 * 概要:elseをelse ifにした際の確認
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_3 {
	/*
	 * 関数名:main
	 * 概要:elseをelse ifにした際の確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		// 改行なしで文字列を出力
		System.out.print("整数値：");
		// int型の整数numberにコンソールから値を受け付け
		int integerNumber = standardInput.nextInt();
		
		// integerNumberが0より大きい時
		if (integerNumber > 0)
			// 文字列を出力
			System.out.println("その値は正です。");
		// integerNumberが0より小さい時
		else if (integerNumber < 0)
			// 文字列を出力
			System.out.println("その値は負です。");
		// integerNumberが0の時
		else if (integerNumber == 0)
			// 文字列を出力
			System.out.println("その値は0です。");
		// standardInputの受付を終了
		standardInput.close();
	}
}
