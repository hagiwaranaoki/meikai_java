package exec15;

/*
 * クラス名:Exercise15_6
 * 概要:円の円周の長さと面積を求めて表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/16
 */
public class Exercise15_6 {
	/*
	 * 関数名:main
	 * 概要:円の円周の長さと面積を求めて表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/16
	 */
	public static void main(String[] args) {
		// 引数の数を表す定数
		final int ARGUMENT_COUNT = 1;
		// コマンドライン引数が1つ以外の場合
		if (args.length != ARGUMENT_COUNT) {
			// 使用方法を出力
			System.out.println("使用方法: java Circle 半径");
			// プログラムを終了する
			System.exit(ARGUMENT_COUNT);
		}
		
		// コマンドライン引数0番目を半径に設定
		double circleRadius = Double.parseDouble(args[0]);
		
		// 半径が正の整数値でない場合
		if (circleRadius <= 0) {
			// 正の整数値ではないことを知らせる
			System.out.println("正の整数を引数に入力してください");
			// プログラムを終了
			System.exit(ARGUMENT_COUNT);
		}
		
		// 直径を表す定数
		final double DIAMETER_CONSTANT = circleRadius * 2;
		
		// 円周を計算
		double circumferenceVariable = DIAMETER_CONSTANT * Math.PI;
		// 面積を計算
		double circleArea = Math.PI * circleRadius * circleRadius;
		
		// 半径を表示
		System.out.printf("半径: %.2f%n", circleRadius);
		// 円周を表示
		System.out.printf("円周: %.2f%n", circumferenceVariable);
		// 面積を表示
		System.out.printf("面積: %.2f%n", circleArea);
	}
}
