package exec05;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise5_1
 * 概要:入力された10進数を8進数と16進数で表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise5_1 {
	/*
	 * 関数名:main
	 * 概要:入力された10進数を8進数と16進数で表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// ユーザーに10進整数を入力するように促す
		System.out.print("10進整数を入力してください：");
		// ユーザーからの入力を整数として受け取る
		int decimalNumber = standardInput.nextInt();

		// 10進整数を8進数に変換
		String octalNumber = Integer.toOctalString(decimalNumber);
		// 8進整数を出力
		System.out.println("8進数では " + octalNumber + " です。");

		// 10進整数を16進数に変換
		String hexadecimalNumber = Integer.toHexString(decimalNumber);
		// 16進整数を出力
		System.out.println("16進数では " + hexadecimalNumber + " です。");
	}
}
