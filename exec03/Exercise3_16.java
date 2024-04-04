package exec03;
//java.utilパッケージからScannerクラスをインポート
import java.util.Scanner;
public class Exercise3_16 {
	/*
	 * 関数名:main
	 * 概要:三つの整数値を昇順にソート
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
	
		// ユーザーに三つの整数を入力するように指示
		System.out.println("三つの整数を入力してください:");
	
		// ユーザーからの最初の整数入力を読み取る
		int firstNumber = scanner.nextInt();
	
		// ユーザーからの二つ目の整数入力を読み取る
		int secondNumber = scanner.nextInt();
	
		// ユーザーからの三つ目の整数入力を読み取る
		int thirdNumber = scanner.nextInt();
	
		// 三つの数を小さい順にソート
		// もし最初の数が二つ目の数より大きい場合、二つの数を交換
		if (firstNumber > secondNumber) {
			// 一時的な変数を作成して最初の数を保存
			int temporary = firstNumber;
			// 最初の数に二つ目の数を代入
			firstNumber = secondNumber;
			// 二つ目の数に一時的な変数（元の最初の数）を代入
			secondNumber = temporary;
		}
	
		// もし二つ目の数が三つ目の数より大きい場合、二つの数を交換
		if (secondNumber > thirdNumber) {
			// 一時的な変数を作成して二つ目の数を保存
			int temporary = secondNumber;
			// 二つ目の数に三つ目の数を代入
			secondNumber = thirdNumber;
			// 三つ目の数に一時的な変数（元の二つ目の数）を代入
			thirdNumber = temporary;
		}
	
		// もし最初の数が二つ目の数より大きい場合、二つの数を交換
		if (firstNumber > secondNumber) {
			// 一時的な変数を作成して最初の数を保存
			int temporary = firstNumber;
			// 最初の数に二つ目の数を代入
			firstNumber = secondNumber;
			// 二つ目の数に一時的な変数（元の最初の数）を代入
			secondNumber = temporary;
		}
	
		// ソートされた数をユーザーに表示
		System.out.println("小さい順にソートしました。");
	
		// 最初の数（小さい方）を表示
		System.out.println(firstNumber);
	
		// 二つ目の数（中間の数）を表示
		System.out.println(secondNumber);
	
		// 三つ目の数（大きい方）を表示
		System.out.println(thirdNumber);
	
		// scannerの受付を終了
		scanner.close();
	}
}
