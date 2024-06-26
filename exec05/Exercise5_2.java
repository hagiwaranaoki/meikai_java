package exec05;

import java.util.Scanner;

/*
 * クラス名:Exercise5_2
 * 概要:float型の変数とdouble型の変数に値を読み込んで表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise5_2 {
	/*
	 * 関数名:main
	 * 概要:float型の変数とdouble型の変数に値を読み込んで表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成し、scannerという名前をつける
		Scanner standardInput = new Scanner(System.in);

		// ユーザーにfloat型の値を入力するように促す
		System.out.print("x:");
		// ユーザーからの入力をfloatとして受け取り、xという変数に格納
		float x = standardInput.nextFloat();

		// ユーザーにdouble型の値を入力するように促す
		System.out.print("y:");
		// ユーザーからの入力をdoubleとして受け取り、yという変数に格納
		double y = standardInput.nextDouble();

		// float型の値を出力
		System.out.println("x = " + x);
		//double型の値を出力
		System.out.println("y = " + y);
	}
}
