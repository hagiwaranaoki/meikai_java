package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_9 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値の大きいほうを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] main) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数a：");
		// double型の実数値aにコンソールからの値を受け付け
		double a = scanner.nextDouble();
		// 文字列を改行なしで出力
		System.out.print("整数b：");
		// double型の実数値bにコンソールからの値を受け付け
		double b = scanner.nextDouble();
		
		// a>bg成り立てばaを返し、成り立たなければbを返す
		System.out.println("大きいほうの値は" + (a > b ? a : b) + "です。");
		// scannerの受付を終了
		scanner.close();
	}
}
