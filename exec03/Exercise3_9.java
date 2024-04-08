package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_9
 * 概要:二つの整数値の大きいほうを表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_9 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値の大きいほうを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("一つ目の実数値：");
		// 一つ目の実数値実数値にコンソールからの値を受け付け
		double firstNumber = standardInput.nextDouble();
		// 文字列を改行なしで出力
		System.out.print("二つ目の実数値：");
		// 二つ目の実数値の値をコンソールで受け付け
		double secondNumber = standardInput.nextDouble();
		
		// 一つ目の整数 > 二つ目の整数が成り立てば一つ目の整数を返し、成り立たなければ二つ目の整数を返す
		System.out.println("大きいほうの値は" + (firstNumber > secondNumber ? firstNumber : secondNumber) + "です。");
		// scannerの受付を終了
		standardInput.close();
	}
}
