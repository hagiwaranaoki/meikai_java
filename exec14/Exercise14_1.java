package exec14;

// Scannerクラスのインポート
import java.util.Scanner;

// 長方形クラスをインポート
import exec13.Rectangle;
// 図形クラスをインポート
import exec13.Shape;

/*
 * クラス名:Exercise14_1
 * 概要:図形クラス群をテストする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Exercise14_1 {
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

		// 図形オブジェクトの配列を生成
		Shape[] shapeArray = new Shape[2];

		// コンティニュー用定数
		final int USER_CONTINUE = 1;

		// 長方形オブジェクトのテスト
		int userRetry = 0;
		// 後判定ループ文
		do {
			// テストタイトルを表示
			System.out.println("長方形オブジェクトのテスト");
			// 幅の入力を促す
			System.out.print("幅を入力してください: ");
			// 長方形の幅を受け付け
			int rectangleWidth = standardInput.nextInt();
			// 幅に0以下の数値がある間繰り返す
			while (rectangleWidth <= 0) {
				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください: ");
				// 幅の入力を受け付け
				rectangleWidth = standardInput.nextInt();
			}
			// 高さの入力を促す
			System.out.print("高さを入力してください: ");
			// 高さを受け付け
			int rectangleHeight = standardInput.nextInt();
			// 高さが0以下の値である場合繰り返す
			while (rectangleHeight <= 0) {
				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください: ");
				//高さを受け付け
				rectangleHeight = standardInput.nextInt();
			}
			// 配列に長方形オブジェクトを生成
			shapeArray[0] = new Rectangle(rectangleWidth, rectangleHeight);
			// 配列の0番目の図形を描画
			shapeArray[0].print();
			// 面積を表示
			System.out.println("Area=" + ((Plane2D) shapeArray[0]).getArea());
			
			//再度テストするかの入力を促す
			System.out.print("もう一度テストしますか？ (1=はい, 0以外=いいえ): ");
			// リトライする用の変数
			userRetry = standardInput.nextInt();
			//リトライを選ぶ限り繰り返す
		} while (userRetry == USER_CONTINUE);

		// 平行四辺形オブジェクトのテスト
		do {
			// テストタイトルを表示
			System.out.println("平行四辺形オブジェクトのテスト");
			// 幅の入力を促す
			System.out.print("幅を入力してください: ");
			// 幅を受け付け
			int parallelogramWidth = standardInput.nextInt();
			// 幅が0以下の場合繰り返す
			while (parallelogramWidth <= 0) {
				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください: ");
				// 幅の入力を促す
				parallelogramWidth = standardInput.nextInt();
			}
			
			// 高さの入力を促す
			System.out.print("高さを入力してください: ");
			int parallelogramHeight = standardInput.nextInt();
			// 高さの入力を受け付け
			while (parallelogramHeight <= 0) {
				// 正の整数値の入力を促す
				System.out.print("正の整数値を入力してください: ");
				// 高さの入力を受け付け
				parallelogramHeight = standardInput.nextInt();
			}
			
			// 図形型配列に平行四辺形オブジェクトを生成
			shapeArray[1] = new Parallelogram(parallelogramWidth, parallelogramHeight);
			// 配列1番目の図形を描画
			shapeArray[1].print();
			// 面積を表示
			System.out.println("Area=" + ((Plane2D) shapeArray[1]).getArea());
			
			// リトライするかを聞く
			System.out.print("もう一度テストしますか？ (1=はい, 0以外=いいえ): ");
			// リトライするかを受け付け
			userRetry = standardInput.nextInt();
			// リトライするのであれば繰り返す
		} while (userRetry == USER_CONTINUE);
		// テスト終了の案内を入れる
		System.out.println("テストを終了します。");
	}
}
