package exec02;

//Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise2_4
 * 概要:コンソールに入力された値に対して加減する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_4 {
	/*
	 * 関数名:main
	 * 概要:コンソールに入力された値に対して加減する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		// 文字列を改行なしで出力
		System.out.print("整数値:");
		// 一つ目の数値の変数を定義し、コンソールで受け付け
		int integerNumber = standardInput.nextInt();
		//  一つ目の数値に10を加えた値を改行ありでコンソールに出力
		System.out.println("10を加えた値は" + (integerNumber + 10) + "です。");
		//  一つ目の数値から10を引いた値を改行ありでコンソールに出力
		System.out.println("10を減じた値は" + (integerNumber - 10) + "です。");
		// 入力の受付を終了
		standardInput.close();
	}
}
