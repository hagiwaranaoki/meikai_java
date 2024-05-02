package exec14;

/*
 * クラス名:Parallelogram
 * 概要:平行四辺形を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Parallelogram extends Shape implements Plane2D {
	// 底辺の幅を表すフィールド
	private int width;
	// 高さを表すフィールド
	private int height;

	/*
	* コンストラクタ名:Parallelogram
	* 概要:平行四辺形を生成する
	* 引数:平行四辺形の幅、長方形の高さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public Parallelogram(int width, int height) {
		// 平行四辺形の幅を設定
		this.width = width;
		// 平行四辺形の高さを設定
		this.height = height;
	}

	/*
	 * 関数名:toString
	 * 概要:平行四辺形に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:平行四辺形に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 平行四辺形に関する図形情報を表す文字列を返す
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	/*
	 * 関数名:draw
	 * 概要:平行四辺形を描画
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// ループのスタート値を表す定数
		final int START_LOOP = 1;
		// 高さの値の回数分繰り返し
		for (int i = START_LOOP; i <= height; i++) {
			// 空白を出力する回数を決定する
			for (int j = START_LOOP; j <= height - i; j++) {
				// 空白を出力
				System.out.print(' ');
			}
			// 幅の値の回数分繰り返し
			for (int j = START_LOOP; j <= width; j++) {
				// #を出力
				System.out.print('#');
			}
			// 改行を出力
			System.out.println();
		}
	}

	/*
	 * 関数名:getArea
	 * 概要:平行四辺形をの面積を求める
	 * 引数:なし
	 * 戻り値:平行四辺形の面積
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public int getArea() {
		// 平行四辺形の面積を返す
		return width * height;
	}
}