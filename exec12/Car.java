package exec12;
// Dayクラスをインポート
import exec09.Day;

/*
 * クラス名:Car
 * 概要:車の移動、車自体の情報を持つ
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
public class Car {
	// 名前のフィールド
	private String name;
	// 幅のフィールド
	private int width;
	// 高さのフィールド
	private int height; 
	// 長さのフィールド
	private int length; 
	// 現在位置Ｘ座標のフィールド
	public double x; 
	// 現在位置Ｙ座標のフィールド
	public double y; 
	// 残り燃料のフィールド
	public double fuel; 
	// 購入日のフィールド
	private Day purchaseDay; 

	/*
	* コンストラクタ名:ExId
	* 概要:Carオブジェクトのの基本情報を設定する
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	public Car(String name, int width, int height, int length, double fuel,
			Day purchaseDay) {
		// 名前は引数の名前に設定
		this.name = name;
		// 幅は引数の幅に設定
		this.width = width;
		// 高さは引数の高さに設定
		this.height = height;
		// 長さは引数の長さに設定
		this.length = length;
		// 燃料は引数の燃料に設定
		this.fuel = fuel;
		// X座標とY座標は0.0に設定
		x = y = 0.0;
		// 購入日は新しいDayオブジェクトで設定
		this.purchaseDay = new Day(purchaseDay);
	}
	
	/*
	 * 関数名:getX
	 * 概要:現在位置のＸ座標を取得
	 * 引数:なし
	 * 戻り値:現在位置のＸ座標
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public double getX() {
		// 現在位置のＸ座標を返す
		return x;
	} 
	
	/*
	 * 関数名:getY
	 * 概要:現在位置のY座標を取得
	 * 引数:なし
	 * 戻り値:現在位置のY座標
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public double getY() {
		// 現在位置のY座標を返す
		return y;
	}
	
	/*
	 * 関数名:getFuel
	 * 概要:現在の燃料を取得
	 * 引数:なし
	 * 戻り値:現在の燃料
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public double getFuel() {
		// 燃料を返す
		return fuel;
	}
	
	/*
	 * 関数名:getPurchaseDay
	 * 概要:購入日を取得
	 * 引数:なし
	 * 戻り値:購入日
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public Day getPurchaseDay() { 
		// 購入日を返す
		return new Day(purchaseDay);
	}

	/*
	 * 関数名:getPurchaseDay
	 * 概要:車のスペックを表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public void putSpec() {
		// 名前を表示
		System.out.println("名前：" + name);
		// 車幅を表示
		System.out.println("車幅：" + width + "mm");
		// 車高を表示
		System.out.println("車高：" + height + "mm");
		// 車長を表示
		System.out.println("車長：" + length + "mm");
	}

	/*
	 * 関数名:move
	 * 概要:Ｘ方向にdx・Ｙ方向にdy移動
	 * 引数:x座標の移動距離、y座標の移動距離
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public boolean move(double dx, double dy) {
		// 移動距離を平方根を使って計算
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		// 燃料より移動距離のほうが大きいとき
		if (dist > fuel) {
			// 燃料不足で移動不可なのでfalseを返す
			return false;
			// 燃料のほうが大きいとき
		} else {
			// 移動距離の分だけ燃料が減る
			fuel -= dist;
			// x座標に引数分動く
			x += dx;
			// y座標に引数分動く
			y += dy;
			// 移動完了
			return true;
		}
	}
}
