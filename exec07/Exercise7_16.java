package exec07;

// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise7_16
 * 概要:配列を引数とするminOfメソッドを利用して配列の全要素の最小値を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/08
 */
public class Exercise7_16 {
	/*
	 * 関数名:minOf
	 * 概要:受け取った配列の最小値を求める
	 * 引数:配列を受け取るint型配列[a[]]
	 * 戻り値:最小値を格納するint型変数[minimumValue]
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	static int minOf(int[] a) {
		//最小値を格納する変数を宣言
		int minimumValue = a[0];
		//カウントが配列の要素数と等しくなったらループ抜け
		for (int i = 0; i < a.length; i++) {
			//最小値よりも配列の要素が小さい場合
			if (minimumValue > a[i]) {
				//配列の要素を最小値とする
				minimumValue = a[i];
			}
		}
		//最小値を返す
		return minimumValue;
	}

	/*
	 * 関数名:main
	 * 概要:要素数と各要素を入力させminOfメソッドを呼び出す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/08
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scanInteger = new Scanner(System.in);
		//入力値を代入する変数を宣言
		int elementCount = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elementCount = scanInteger.nextInt();
			//正の数が入力されたらループ抜け
		} while (elementCount <= 0);
		//入力された要素数をもとに配列を宣言
		int[] integerArray = new int[elementCount];
		//カウントが要素数と等しくなったらループ抜け
		for (int i = 0; i < integerArray.length; i++) {
			//配列の要素の入力を促す
			System.out.print("integerArray[" + i + "]=");
			//インスタンスから入力された値を受け取る
			integerArray[i] = (int) scanInteger.nextDouble();
		}
		//minOfメソッドを呼び出して表示
		System.out.println("最小値:" + minOf(integerArray));
	}
}
