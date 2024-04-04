package exec02;
//Randomライブラリの読み込み
import java.util.Random;
//Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise2_8 {
	/*
	 * 関数名:main
	 * 概要:コンソールで受け取った値の±5の乱数を生成するメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		// Randomクラスの変数を定義
		Random random = new Random();

		// 文字列を改行なしで出力
		System.out.print("整数値：");
		// int型の整数xをコンソールで受け付け
		int x = scanner.nextInt();
		// -5~5の値をランダムにrandomPlusMinus5に代入
		int randomPlusMinus5 = random.nextInt(11) - 5;
		// xの±5の乱数を出力
		System.out.println("その値の±5の乱数を生成しました。それは" + (x + randomPlusMinus5) + "です。");
		// scannerの受付を終了
		scanner.close();
	}
}
