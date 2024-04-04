package exec03;
// Scannerライブラリを読み込む
import java.util.Scanner;

public class Exercise3_10 {
	/*
	 * 関数名:main
	 * 概要:二つの値の差を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義する
		Scanner scanner = new Scanner(System.in);
		
		// 文字列を改行せずに出力
		System.out.print("整数a：");
		// int型の変数aにコンソールから値を受け付け
		int a = scanner.nextInt();
		// 文字列を改行せずに出力
		System.out.print("整数b：");
		// int型の変数bにコンソールから値を受け付け
		int b = scanner.nextInt();
		// a>bであればa-bをして、逆であればb-a、同じであればa-bをする
		System.out.println("値の差は" + (a > b ? a - b : b - a) + "です。");
		// scannerの受付を終了する
		scanner.close();
	}
}
