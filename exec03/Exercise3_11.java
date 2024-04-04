package exec03;

// Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_11
 * 概要:二つの整数値の値の差が10以下かどうかを調べる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_11 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値の値の差が10以下かどうかを調べる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数A：");
		// int型の変数aにコンソールから値を受け付け
		int a = standardInput.nextInt();
		// 文字列を改行なしで出力
		System.out.print("整数B：");
		// int型の変数bにコンソールから値を受け付け
		int b = standardInput.nextInt();
		
		// bよりaのほうが大きければnumberにa-bの値を代入、逆であればb-aの値を代入
		int integerNumber = a > b ? a - b : b - a;
		// numberの値が10以下の時
		if (integerNumber <= 10) {
			// 文字列を改行ありで出力
			System.out.println("それらの差は10以下です。");
			// それ以外の時
		} else {
			// 文字列を改行ありで出力
			System.out.println("それらの差は11以上です。");
		}
		// scannerの受付を終了
		standardInput.close();
	}
}
