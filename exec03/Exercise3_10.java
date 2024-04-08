package exec03;
// Scannerライブラリを読み込む
import java.util.Scanner;

/*
 * クラス名:Exercise3_10
 * 概要:二つの値の差を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_10 {
	/*
	 * 関数名:main
	 * 概要:二つの値の差を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義する
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列を改行せずに出力
		System.out.print("一つ目の整数：");
		// 一つ目の整数をコンソールから受け付け
		int firstNumber = standardInput.nextInt();
		// 文字列を改行せずに出力
		System.out.print("二つ目の整数：");
		// 二つ目の整数をコンソールから受け付け
		int secondNumber = standardInput.nextInt();
		// 一つ目の整数 > 二つ目の整数であれば一つ目の整数-二つ目の整数をして、逆であれば二つ目の整数、同じであれば一つ目の整数ー二つ目の整数をする
		System.out.println("値の差は" + (firstNumber > secondNumber ? firstNumber - secondNumber : secondNumber - firstNumber) + "です。");
		// standardInputの受付を終了する
		standardInput.close();
	}
}
