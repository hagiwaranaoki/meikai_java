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

		//メッセージを表示
		System.out.println("入力された値を8進数と16進数で表示します。");
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		int inputValue = standardInput.nextInt();

		//8進数で入力値を表示
		System.out.printf("8進数では%oです。\n", inputValue);
		//16進数で入力値を表示
		System.out.printf("16進数では%xです。", inputValue);
	}
}
