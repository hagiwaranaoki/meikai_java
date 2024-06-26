package exec06;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise6_8
 * 概要:double型の配列の全要素の合計点と平均点を求める
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_8 {
	/*
	 * 関数名:main
	 * 概要:double型の配列の全要素の合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerオブジェクト作成
		Scanner standardInput = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("要素数：");
		// int型の数値を受け付ける
		int integerNumber = standardInput.nextInt();

		// 正の整数が入力されるまで繰り返す
		while (integerNumber < 1) {
			// 要素数の入力を促す
			System.out.print("要素数は正の整数で入力してください:");
			// 要素数をコンソールから受け取る
			integerNumber = standardInput.nextInt();
		}

		// 実数値の配列
		double[] pointArray = new double[integerNumber];

		// 配列に数値を入れていく
		for (int i = 0; i < pointArray.length; i++) {
			// 何要素目かを出力
			System.out.print(i + 1 + "番目：");
			// 配列に入れる数値を受け付け
			pointArray[i] = standardInput.nextDouble();
		}

		// 合計値の初期化
		double pointSum = 0;
		// 平均のためのカウント
		int averageCount = 0;
		// 合計とカウントを計算
		for (double i : pointArray) {
			// 合計を計算
			pointSum += i;
			// カウントをインクリメント
			averageCount++;
		}
		// 平均を計算
		double pointAverage = pointSum / averageCount;

		//合計値を出力
		System.out.println("合計値：" + pointSum);
		//平均値を出力
		System.out.println("平均値：" + pointAverage);
	}

}
