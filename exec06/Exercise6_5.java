package exec06;
// Scannerクラスのインポート
import java.util.Scanner;
/*
 * クラス名:Exercise6_5
 * 概要:配列の要素数と個々の要素の値を読み込み、各要素の値を表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_5 {
	/*
	 * 関数名:main
	 * 概要:配列の要素数と個々の要素の値を読み込み、各要素の値を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		// 文字列出力
		System.out.print("要素数:");
		// 要素数をコンソールから受け取る
		int integerNumber = standardInput.nextInt();
		// 受け取った要素数を持つ配列を作成
		int[] integerArray = new int[integerNumber];
		
		// 配列に要素の値を入れていく
		for(int i = 0; i < integerArray.length; i++) {
			// 文字列出力
			System.out.print("a[" + i + "] = ");
			// 配列の要素それぞれにコンソールから受け取った値を入れる
			integerArray[i] = standardInput.nextInt();
		}
		// 各要素の値を表示する
		for (int i = 0; i < integerArray.length; i++) {
			//最初の要素の場合
			if (i == 0) {
				// {を入れる
				System.out.print("{" + integerArray[i] + ",");
			// 最後の要素ではない場合
			} else if(i < integerArray.length -1) {
			// スペースと,を入れる
				System.out.print(" " + integerArray[i] + ",");
			//　それ以外の場合
			} else {
				// 前にスペース、最後に}を入れる
				System.out.print(" " + integerArray[i] + "}");
			}
		}

	}

}
