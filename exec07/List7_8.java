package exec07;

import java.util.Scanner;

public class List7_8 {
	static void putChars(char c, int n) {
		while(n-- > 0)
			System.out.println(c);
	}
	
	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("右下直角の三角形を表示します。");
		System.out.println("段数は:");
		int n =standardInput.nextInt();
		
		for (int i = 1; i <= n; i++) {
			putChars(' ', n-i);
			putChars('+', i);
			System.out.println();
		}
	}
}
