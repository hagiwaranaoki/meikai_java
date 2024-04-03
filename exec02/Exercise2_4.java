package exec02;

//Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise2_4 {
	/*
	 * 関数名:main
	 * 概要:コンソールに入力された値に対して加減する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		// 文字列を改行なしで出力
		System.out.print("整数値:");
		// int型の変数xの値をコンソールで受け付け
		int x = scanner.nextInt();
		// xに10を加えた値を改行ありでコンソールに出力
		System.out.println("10を加えた値は" + (x + 10) + "です。");
		// xから10を引いた値を改行ありでコンソールに出力
		System.out.println("10を減じた値は" + (x - 10) + "です。");
		// scannerの受付を終了
		scanner.close();
	}
}
