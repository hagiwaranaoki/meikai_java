package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise3_1
 * 概要:整数値を読み込んで絶対値を表示するメソッド
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_1 {
	/*
	 * 関数名:main
	 * 概要:整数値を読み込んで絶対値を表示するメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		// scannerクラスの変数を定義
		Scanner standardInput = new Scanner(System.in);
		// 文字列を改行せずに出力
		System.out.print("整数値：");
		// 整数値をコンソールで受け付け
		int absoluteValue = standardInput.nextInt();
		
		// もし入力された整数値が0より小さい（負の値）ならば
		if (absoluteValue < 0) {
			// 整数値を正の値にする
			absoluteValue *= -1;
		}
		// 文字列を改行ありで出力
		System.out.println("その絶対値は" + absoluteValue + "です。");
		// scannerの受付を終了
		standardInput.close();
	}
}
