package exec03;
//java.utilパッケージからScannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise3_15
 * 概要:二つの整数値を降順にソートする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_15 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値を降順にソートする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);

		// ユーザーに二つの整数を入力するように指示する
		System.out.println("二つの整数を入力してください:");
		// ユーザーからの最初の整数入力を読み取る
		int firstNumber = standardInput.nextInt();
		// ユーザーからの二つ目の整数入力を読み取る
		int secondNumber = standardInput.nextInt();

		// もし最初の数が二つ目の数より小さい場合、二つの数を交換
		if (firstNumber < secondNumber) {
			// 一時的な変数を作成して最初の数を保存
			int temporaryNumber = firstNumber;
			// 最初の数に二つ目の数を代入
			firstNumber = secondNumber;
			// 二つ目の数に一時的な変数（元の最初の数）を代入
			secondNumber = temporaryNumber;
		}

		// ソートされた数をユーザーに表示
		System.out.println("大きい順にソート:");
		// 最初の数（大きい方）を表示
		System.out.println(firstNumber);
		// 二つ目の数（小さい方）を表示
		System.out.println(secondNumber);
		// standardInputの受付を終了
		standardInput.close();
	}
}
