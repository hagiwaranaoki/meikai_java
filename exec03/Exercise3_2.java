package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_2 {
	public static void main(String[] args) {
		// scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		
		// 文字列を改行なしで出力
		System.out.print("整数A：");
		// int型の整数aにコンソールから値を受け付け
		int a = scanner.nextInt();
		
		// 文字列を改行なしで出力
		System.out.print("整数B：");
		// int型の整数bにコンソールから値を受け付け
		int b = scanner.nextInt();
		
		// a/bの余りが0の時
		if (a % b == 0) {
			// 文字列を改行ありで出力
			System.out.println("BはAの約数です。");
		} else { // それ以外の時
			// 文字列を改行ありで出力
			System.out.println("BはAの約数ではありません。");
		}
		// scannerの受付を終了
		scanner.close();
  }
}
