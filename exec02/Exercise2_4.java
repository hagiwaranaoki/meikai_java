package exec02;

//Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise2_4 {
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
