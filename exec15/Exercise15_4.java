package exec15;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise15_4
 * 概要:浮動小数の値の桁数を指定して表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_4 {
	/*
	 * 関数名:main
	 * 概要:浮動小数の値の桁数を指定して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		// 円周率を使用することを知らせる
		System.out.println("円周率を使って浮動小数を再現します。");
		
		// 円周率に掛ける数の入力を促す
		System.out.print("円周率に何をかける?：");
		// 円周率にかける数
		double multiplyToPi = standardInput.nextDouble();
		
		// 最大表示桁数の入力を促す
		System.out.print("何桁で表示する?：");
		// 何桁で表示するかの入力を受け付け
		int maximumDigitNumber = standardInput.nextInt();
		
		// 全体を最低表示桁数の入力を促す
		System.out.print("最低何桁で表示する?：");
		// 全体を最低何桁で表示するかの入力を受け付け
		int minimumDigitNumber = standardInput.nextInt();
		
		// 浮動小数を指定した桁数で表示
		printDouble(Math.PI * multiplyToPi, maximumDigitNumber, minimumDigitNumber);
	}

	/*
	 * 関数名:printDouble
	 * 概要:浮動小数の値の桁数を指定
	 * 引数:浮動小数点数値、小数点以下の桁数、全体の最低桁数
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void printDouble(double x, int p, int w) {
		// フォーマット用の変数を作成
		String stringFormat = "%" + w + "." + p + "f";
		// フォーマットを指定して出力
		System.out.println(String.format(stringFormat, x));
	}
}
