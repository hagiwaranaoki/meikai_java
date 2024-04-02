package exec02;
//Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise2_5 {
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		// 文字列を改行なしで出力
		System.out.print("xの値:");
		// double型の変数xの値をコンソールで受け付け
		double x = scanner.nextDouble();

		// 文字列を改行なしで出力
		System.out.print("yの値:");
		// int型の変数yの値をコンソールで受け付け
		double y = scanner.nextDouble();
		
		//xとyの合計値を出力
		System.out.println("合計は" + (x + y) + "です。");
		//xとyの平均値を出力
		System.out.println("平均は" + ((x + y) / 2) + "です。");
		// scannerの受付を終了
		scanner.close();
  }
}
