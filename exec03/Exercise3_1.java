package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

public class Exercise3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 文字列を改行せずに出力
		System.out.print("整数値：");
		// int型の文字列absoluteValueをコンソールで受け付け
		int absoluteValue = scanner.nextInt();
		
		// もしabsoluteValueが0より小さい（負の値）ならば
		if (absoluteValue < 0) {
			// absoluteValueを正の値にする
			absoluteValue *= -1;
		}
		// 文字列を改行ありで出力
		System.out.println("その絶対値は" + absoluteValue + "です。");
		// scannerの受付を終了
		scanner.close();
	}
}
