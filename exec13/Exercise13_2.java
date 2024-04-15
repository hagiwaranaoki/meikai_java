package exec13;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise13_2
 * 概要:直角二等辺三角形クラス群をテストする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Exercise13_2 {
	/*
	 * 関数名:main
	 * 概要:直角二等辺三角形クラス群をテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 図形の個数の入力を促す
		System.out.print("図形は何個：");
		// 図形の個数を受け付け
		int numberVariable = standardInput.nextInt();
		// 受け取った値が1未満の時
		while (numberVariable < 1) {
			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 図形の個数を受け付け
			numberVariable = standardInput.nextInt();
		}

		// Shape型の配列を図形の個数分の要素数で生成
		Shape[] variousShape = new Shape[numberVariable];

		// 図形の個数だけ繰り返す
		for (int i = 0; i < numberVariable; i++) {
			// 三角形の種類の入力を促す
			System.out.print((i + 1) + "番の図形の種類 (1…左上直角二等辺三角形/2…右下直角二等辺三角形/3…右上直角二等辺三角形)：");
			// 種類の数値を受け付け
			int typeNumber = standardInput.nextInt();
			// 1~4以外が入力された場合
			while (typeNumber < 1 || typeNumber > 3) {
				// 1~4の整数値の入力を促す
				System.out.print("1~3の整数値を入力してください：");
				// 図形の種類番号を受け付け
				typeNumber = standardInput.nextInt();
			}

			// 種類で1が選択された場合
			if (typeNumber == 1) {
				// 一辺の長さの入力を促す
				System.out.print("一辺の長さ:");
				// 一辺の長さを受け付け
				int triangleLength = standardInput.nextInt();
				// 受け取った値が1未満の時
				while (triangleLength < 1) {
					// 正の整数値の入力を促す
					System.out.print("正の整数値を入力してください：");
					// 長さを受け付け
					triangleLength = standardInput.nextInt();
				}
				// 新しい左上直角二等辺三角形オブジェクトを生成
				variousShape[i] = new LeftTopRightTriangle(triangleLength);
			}

			// 種類で2が選択された場合
			if (typeNumber == 2) {
				// 一辺の長さの入力を促す
				System.out.print("一辺の長さ:");
				// 一辺の長さを受け付け
				int triangleLength = standardInput.nextInt();
				// 受け取った値が1未満の時
				while (triangleLength < 1) {
					// 正の整数値の入力を促す
					System.out.print("正の整数値を入力してください：");
					// 長さを受け付け
					triangleLength = standardInput.nextInt();
				}
				// 新しい右下直角二等辺三角形オブジェクトを生成
				variousShape[i] = new RightBottomRightTriangle(triangleLength);
			}
			
			// 種類で3が選択された場合
			if (typeNumber == 3) {
				// 一辺の長さの入力を促す
				System.out.print("一辺の長さ:");
				// 一辺の長さを受け付け
				int triangleLength = standardInput.nextInt();
				// 受け取った値が1未満の時
				while (triangleLength < 1) {
					// 正の整数値の入力を促す
					System.out.print("正の整数値を入力してください：");
					// 長さを受け付け
					triangleLength = standardInput.nextInt();
				}
				// 新しい右上直角二等辺三角形オブジェクトを生成
				variousShape[i] = new RightTopRightTriangle(triangleLength);
			}
		}
		// 図形の個数分繰り返し
		for (Shape shapeVariable : variousShape) {
			// 直角二等辺三角形を出力
			shapeVariable.print();
		}
	}
}
