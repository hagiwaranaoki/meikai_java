package exec03;
//java.utilパッケージからScannerクラスをインポート
import java.util.Scanner;

public class Exercise3_15 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値を降順にソートする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
	    // Scannerオブジェクトを作成し、ユーザーからの入力を読み取る
	    Scanner scanner = new Scanner(System.in);

	    // ユーザーに二つの整数を入力するように指示する
	    System.out.println("二つの整数を入力してください:");
	    // ユーザーからの最初の整数入力を読み取る
	    int number1 = scanner.nextInt();
	    // ユーザーからの二つ目の整数入力を読み取る
	    int number2 = scanner.nextInt();

	    // もし最初の数が二つ目の数より小さい場合、二つの数を交換
	    if (number1 < number2) {
	      // 一時的な変数を作成して最初の数を保存
	      int temporary = number1;
	      // 最初の数に二つ目の数を代入
	      number1 = number2;
	      // 二つ目の数に一時的な変数（元の最初の数）を代入
	      number2 = temporary;
	    }

	    // ソートされた数をユーザーに表示
	    System.out.println("大きい順にソート:");
	    // 最初の数（大きい方）を表示
	    System.out.println(number1);
	    // 二つ目の数（小さい方）を表示
	    System.out.println(number2);
	    // scannerの受付を終了
	    scanner.close();
	  }

}
