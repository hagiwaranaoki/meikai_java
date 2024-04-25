package exec13;

// Scannerクラスインポート
import java.util.Scanner;

/*
 * クラス名:Exercise13_1
 * 概要:図形クラス群をテストする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Exercise13_1 {
	/*
	 * 関数名:main
	 * 概要:図形クラス群をテストする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトの生成
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
		// Shape型の配列を作成
		Shape[] variousShape = new Shape[numberVariable];

		// 点を表す定数
		final int POINT_NUMBER = 1;
		// 水平直線を表す定数
		final int HORZ_LINE_NUMBER = 2;
		// 垂直直線を表す定数
		final int VIRT_LINE_NUMBER = 3;
		// 長方形を表す定数
		final int RECTANGLE_NUMBER = 4;

		// 図形の個数分繰り返し
		for (int i = 0; i < numberVariable; i++) {
			// 図形の種類の入力を促す
			System.out.print((i + 1) + "番の図形の種類 (1…点/2…水平直線/3…垂直直線/4…長方形)：");
			// 図形の種類番号を受け付け
			int typeNumber = standardInput.nextInt();
			// 1~4以外が入力された場合
			while (typeNumber < POINT_NUMBER || typeNumber > RECTANGLE_NUMBER) {
				// 1~4の整数値の入力を促す
				System.out.print("1~4の整数値を入力してください：");
				// 図形の種類番号を受け付け
				typeNumber = standardInput.nextInt();
			}

			// 図形の種類が1の時
			if (typeNumber == POINT_NUMBER) {
				// 点を生成
				variousShape[i] = new Point();
			}

			// 図形の種類が2の時
			if (typeNumber == HORZ_LINE_NUMBER) {
				// 長さの入力を促す
				System.out.print("長さ：");
				// 長さの入力を受け付け
				int horzLineLength = standardInput.nextInt();
				// 受け取った値が1未満の時
				while (horzLineLength < 1) {
					// 正の整数値の入力を促す
					System.out.print("正の整数値を入力してください：");
					// 長さを受け付け
					horzLineLength = standardInput.nextInt();
				}
				// 水平直線を生成
				variousShape[i] = new HorzLine(horzLineLength);
			}

			// 図形の種類が3の時
			if (typeNumber == VIRT_LINE_NUMBER) {
				// 長さの入力を促す
				System.out.print("長さ：");
				// 長さの入力を受け付け
				int virtLineLength = standardInput.nextInt();
				// 受け取った値が1未満の時
				while (virtLineLength < 1) {
					// 正の整数値の入力を促す
					System.out.print("正の整数値を入力してください：");
					// 長さを受け付け
					virtLineLength = standardInput.nextInt();
				}
				// 垂直直線を生成
				variousShape[i] = new VirtLine(virtLineLength);
			}

			// 図形の種類が4の時
			if (typeNumber == RECTANGLE_NUMBER) {
				// 幅の入力を促す
				System.out.print("幅：");
				// 幅の入力を受け付け
				int rectangleWidth = standardInput.nextInt();
				// 受け取った値が1未満の時
				while (rectangleWidth < 1) {
					// 正の整数値の入力を促す
					System.out.print("正の整数値を入力してください：");
					// 長さを受け付け
					rectangleWidth = standardInput.nextInt();
				}
				// 高さの入力を促す
				System.out.print("高さ：");
				// 高さの入力を受け付け
				int rectangleHeight = standardInput.nextInt();
				// 受け取った値が1未満の時
				while (rectangleHeight < 1) {
					// 正の整数値の入力を促す
					System.out.print("正の整数値を入力してください：");
					// 高さを受け付け
					rectangleHeight = standardInput.nextInt();
				}
				// 長方形を生成
				variousShape[i] = new Rectangle(rectangleWidth, rectangleHeight);
			}
		}
		// 図形の個数分繰り返し
		for (Shape shapeVariable : variousShape) {
			// すべての図形の描画をする
			shapeVariable.print();
		}
	}
}
