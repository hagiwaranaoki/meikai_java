package exec02;
//Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise2_6 {
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner scanner = new Scanner(System.in);
		// 文字列を改行ありで出力
		System.out.println("三角形の面積を求めます。");
		
		// 文字列を改行なしで出力
		System.out.print("底辺:");
		// double型の変数xの値をコンソールで受け付け
		double bottom = scanner.nextDouble();
		// 文字列を改行なしで出力
		System.out.print("高さ:");
		// double型の変数xの値をコンソールで受け付け
		double height = scanner.nextDouble();
		
		// 三角形の面積を出力
		System.out.println("面積は" + ((bottom * height) / 2) + "です。");
		
		scanner.close();
  }
}