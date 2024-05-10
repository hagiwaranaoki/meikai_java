package exec13;

import exec14.Plane2D;

/*
 * クラス名:Rectangle
 * 概要:長方形を表す
 * 作成者:N.Hagiwara
 * 作成日:2024/04/15
 */
public class Rectangle extends Shape implements Plane2D{
	// 長方形の幅を表すフィールド
	private int width;
	// 長方形の高さを表すフィールド
	private int height;

	/*
	* コンストラクタ名:Rectangle
	* 概要:長方形を生成する
	* 引数:長方形の幅、長方形の高さ
	* 作成者:N.Hagiwara
	* 作成日:2024/04/15
	*/
	public Rectangle(int width, int height) {
		// 長方形の幅を引数の値に設定
		this.width = width;
		// 長方形の高さを引数の値に設定
		this.height = height;
	}

	/*
	 * 関数名:toString
	 * 概要:長方形に関する図形情報を表す文字列を返す
	 * 引数:なし
	 * 戻り値:長方形に関する図形情報を表す文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public String toString() {
		// 長方形の図形情報を返す
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}
	
	/*
	 * 関数名:draw
	 * 概要:長方形を描画
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public void draw() {
		// 1を表す定数
		final int ONE_NUMBER = 1;
		// 高さの数値分繰り返す
		for (int i = ONE_NUMBER; i <= height; i++) {
			// 幅の数値分繰り返す
			for (int j = ONE_NUMBER; j <= width; j++) {
				// *を表示
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}
	}
	
	/*
	 * 関数名:getArea
	 * 概要:面積を求める
	 * 引数:なし
	 * 戻り値:長方形の面積
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/15
	 */
	public int getArea() {
		// 長方形の面積を返す
		return width * height;
	}
}
