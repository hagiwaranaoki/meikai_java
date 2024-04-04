package exec03;
// Scannerライブラリを読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_8
 * 概要:キーボードで読み込んだ点数に評価をつける
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_8 {
	/*
	 * 関数名:main
	 * 概要:キーボードで読み込んだ点数に評価をつける
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		
		// 改行なしで文字列を出力
		System.out.print("点数：");
		// 点数にコンソールから値を受け付け
		int integerPoint = standardInput.nextInt();
		
		// 入力された点数が0以上59以下の時
		if (integerPoint >= 0 && integerPoint <= 59) {
			// 文字列を改行ありで出力
			System.out.println("不可");
			// 入力された点数が60以上69以下の時
		} else if (integerPoint >= 60 && integerPoint <= 69) {
			// 文字列を改行ありで出力
			System.out.println("可");
			// 入力された点数が70以上79以下の時
		} else if (integerPoint >= 70 && integerPoint <= 79) {
			// 文字列を改行ありで出力
			System.out.println("良");
			// 入力された点数が100以下の時(上から実行されるためここでは100以下で80~100になる)
		} else if (integerPoint <= 100) {
			// 文字列を改行ありで出力
			System.out.println("優");
		}
		// standardInputの受付を終了
		standardInput.close();
	}
}
