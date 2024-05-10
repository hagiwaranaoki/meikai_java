package exec06;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise6_5
 * 概要:配列内の点数の合計、平均、最高、最低それぞれの点数を出力
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_6 {
	/*
	 * 関数名:main
	 * 概要:配列内の点数の合計、平均、最高、最低それぞれの点数を出力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);

		// 文字列出力
		System.out.print("人数を入力してください:");
		// 人数を受け付け
		int humanCount = standardInput.nextInt();
		// 正の整数が入力されるまで繰り返す
		while (humanCount < 1) {
			// 人数の入力を促す
			System.out.print("人数は正の整数で入力してください:");
			// 人数をコンソールから受け取る
			humanCount = standardInput.nextInt();
		}
		// 要素数が人数分の配列を作成
		int[] integerArray = new int[humanCount];

		// 点数を読み込むfor文
		for (int i = 0; i < humanCount; i++) {
			// 何人目の点数かを表示
			System.out.print(i + 1 + "番の点数：");
			// 配列に入力された整数値を入れる
			integerArray[i] = standardInput.nextInt();
			// 0以上の整数が入力されるまで繰り返す
			while (integerArray[i] < 0) {
				// 点数の入力を促す
				System.out.print("点数は0以上の整数で入力してください:");
				// 点数をコンソールから受け取る
				integerArray[i] = standardInput.nextInt();
			}
		}

		// 最高点の初期化
		int maximumPoint = integerArray[0];
		// 最低点の初期化
		int minimumPoint = integerArray[0];
		// 合計点の初期化
		int pointSum = 0;
		// 平均点用のカウント
		int averageCount = 0;

		// 各種点数を求める
		for (int i = 0; i < integerArray.length; i++) {
			// 最高点を求める
			if (integerArray[i] > maximumPoint)
				maximumPoint = integerArray[i];
			// 最低点を求める
			if (integerArray[i] < minimumPoint)
				minimumPoint = integerArray[i];
			// 合計点を求める
			pointSum = pointSum + integerArray[i];
			// カウントのインクリメント
			averageCount++;
		}
		// 平均点を求める
		int pointAverage = pointSum / averageCount;

		// 合計点の出力
		System.out.println("合計点：" + pointSum);
		// 平均点の出力
		System.out.println("平均点：" + pointAverage);
		// 最高点の出力
		System.out.println("最高点：" + maximumPoint);
		// 最低点の出力
		System.out.println("最低点：" + minimumPoint);
	}

}
