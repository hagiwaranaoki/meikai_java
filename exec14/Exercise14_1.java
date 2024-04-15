package exec14;
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
		// 画像クラスのオブジェクトを生成
		Shape shapeArray[] = {
				// 新しい長方形オブジェクトを生成
				new Rectangle(4, 6),
				// 新しい平行四辺形オブジェクトを生成
				new Parallelogram(4, 6)
		};
		// 改行を出力
		System.out.println();
		// 図形クラスオブジェクトの個数分繰り返し
		for (Shape shapeVariable : shapeArray) {
			// 図形クラスオブジェクトの情報出力
			shapeVariable.print();
			// 図形オブジェクトがPlane2Dインタフェースのオブジェクトの場合
			if (shapeVariable instanceof Plane2D) {
				// 図形オブジェクトの面積を表示
				System.out.println("Area=" + ((Plane2D) shapeVariable).getArea());
			}
			// 改行を出力
			System.out.println();
		}
	}
}
