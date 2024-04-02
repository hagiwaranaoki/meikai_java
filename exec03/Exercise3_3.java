package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_3 {
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 改行なしで文字列を出力
		System.out.print("整数値：");
		// int型の整数numberにコンソールから値を受け付け
		int number = scanner.nextInt();
		
		// numberが0より大きい時
		if (number > 0)
			// 文字列を出力
			System.out.println("その値は正です。");
		// numberが0より小さい時
		else if (number < 0)
			// 文字列を出力
			System.out.println("その値は負です。");
		// numberが0の時
		else if (number == 0)
			// 文字列を出力
			System.out.println("その値は0です。");
		// scannerの受付を終了
		scanner.close();
	}
}
