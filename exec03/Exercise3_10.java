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
		System.out.print("整数a：");
		// int型の変数aにコンソールから値を受け付け
		int a = standardInput.nextInt();
		// 文字列を改行せずに出力
		System.out.print("整数b：");
		// int型の変数bにコンソールから値を受け付け
		int b = standardInput.nextInt();
		// a>bであればa-bをして、逆であればb-a、同じであればa-bをする
		System.out.println("値の差は" + (a > b ? a - b : b - a) + "です。");
		// standardInputの受付を終了する
		standardInput.close();
	}
}
