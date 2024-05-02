package exec07;
// Scannerクラスをインポート
import java.util.Scanner;
public class List7_7 {
	static void putStars(int n) {
		while (n-- > 0) {
			System.out.println('*');
		}
	}
	
	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("左下直角の三角形を表示します。");
		System.out.println("段数は：");
		int n = standardInput.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
