package exec08;

/*
 * クラス名:Car
 * 概要:車の移動、燃費を管理するクラス
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Car {
	// 車の名前を保持するためのフィールド
	private String name;
	// 車の幅を保持するためのフィールド
	private int width;
	// 車の高さを保持するためのフィールド
	private int height;
	// 車の長さを保持するためのフィールド
	private int length;
	// 車の現在位置のx座標を保持するためのフィールド
	private double x;
	// 車の現在位置のy座標を保持するためのフィールド
	private double y;
	// 車の残り燃料を保持するためのフィールド
	private double fuel;
	// 車の燃費を保持するためのフィールド
	private double carEconomy;

	/*
	* コンストラクタ名:Car
	* 概要:Carオブジェクトを作成する
	* 引数:名前、幅、高さ、長さ、燃料、燃費
	* 作成者:N.Hagiwara
	* 作成日:2024/04/09
	*/
	Car(String name, int width, int height, int length, double fuel, double carEconomy) {
		// 引数で受け取った名前をフィールドに設定
		this.name = name;
		// 引数で受け取った幅をフィールドに設定
		this.width = width;
		// 引数で受け取った高さをフィールドに設定
		this.height = height;
		// 引数で受け取った長さをフィールドに設定
		this.length = length;
		 // 引数で受け取った燃料をフィールドに設定
		this.fuel = fuel;
		// 引数で受け取った燃費をフィールドに設定
		this.carEconomy = carEconomy;
		// 初期位置を(0,0)に設定
		x = y = 0.0;
	}

	/*
	 * 関数名:getX
	 * 概要:現在位置X座標を取得
	 * 引数:なし
	 * 戻り値:現在のX座標の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	double getX() {
		// 現在のxの値を返す
		return x;
	} 
	
	/*
	 * 関数名:getY
	 * 概要:現在位置Y座標を取得
	 * 引数:なし
	 * 戻り値:現在のY座標の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	double getY() {
		// 現在のyの値を返す
		return y;
	}
	
	/*
	 * 関数名:getFuel
	 * 概要:残り燃料を取得
	 * 引数:なし
	 * 戻り値:現在の燃料の値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	double getFuel() {
		// 現在の燃料の値を返す
		return fuel;
	}

	/*
	 * 関数名:putSpec
	 * 概要:Carオブジェクトのスペックを返す
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	void putSpec() {
		// 名前を表示
		System.out.printf("名前：%s\n", name);
		// 幅を表示
		System.out.printf("車幅：%d mm\n", width);
		// 高さを表示
		System.out.printf("車高：%d mm\n", height);
		// 長さを表示
		System.out.printf("車長：%d mm\n", length);
		// 燃料を表示
		System.out.printf("燃料：%f L\n", fuel);
		// 燃費を表示
		System.out.printf("燃費：%f km/L\n", carEconomy);
	}

	/*
	 * 関数名:move
	 * 概要:Carオブジェクトを指定された距離だけ移動させる
	 * 引数:X方向に移動する距離dx、Y方向に移動する距離dy
	 * 戻り値:移動が可能かどうかを示すmoveFlag
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	boolean move(double dx, double dy) {
		// 移動が可能かどうかを示すフラグ
		boolean isMove = true;
		// 移動距離を計算
		double dist = Math.sqrt(dx * dx + dy * dy);
		// 移動に必要な燃料が残りの燃料より多い場合
		if ((dist / carEconomy) > fuel) {
		// 移動ができないと判断する
			isMove = false;
			// 移動に必要な燃料が残りの燃料より少ない場合
		} else {
			// 移動に使用した燃料を燃費で割り、残りの燃料から引く
			fuel -= dist / carEconomy;
			// x座標を更新
			x += dx;
			 // y座標を更新
			y += dy;
		}
		// 移動が可能かどうかを示すフラグを返す
		return isMove;
	}

	/*
	 * 関数名:chargeFuel
	 * 概要:Carオブジェクトに燃料を給油する
	 * 引数:補給する量
	 * 戻り値:移動が可能かどうかを示すmoveFlag
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	void chargeFuel(double fuelQuantity) {
		// 給油量を残りの燃料に加える
		fuel += fuelQuantity;
	}
}
