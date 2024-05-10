package exec12;

// Dayクラスをインポート
import exec09.Day;

/*
 * クラス名:Odometer
 * 概要:Carクラスを継承し、総走行距離とその値を調べる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
public class Odometer extends Car {
	// 総走行距離フィールドを宣言し、初期値を0に設定
	private double odometer = 0;

	/*
	 * 関数名:odometer
	 * 概要:総走行距離を更新
	 * 引数:XとYの移動距離
	 * 戻り値:総走行距離
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public double odometer(double dx, double dy) {
		// 移動が可能であれば
		if (super.moveCar(dx, dy)) {
			// 総走行距離を経遺恨を用いて計算
			double dist = Math.sqrt(dx * dx + dy * dy);
			// 総走行距離に計算結果を入れる
			odometer += dist;
			// 可能でなければ
		} else {
			// 燃料が足りないことを知らせる
			System.out.println("燃料が足りません！");
		}
		// 総走行距離を返す
		return odometer;
	}

	/*
	* コンストラクタ名:Odometer
	* 概要:親クラスのコンストラクタを呼び出し、追加で総走行距離を初期化
	* 引数:名前、車幅、車高、車長、燃料、購入日、総走行距離
	* 作成者:N.Hagiwara
	* 作成日:2024/04/12
	*/
	Odometer(String name, int width, int height, int length, double fuel, Day purchaseDay, double odometer, double totalTravelDistance) {
		// 親クラスのコンストラクタを呼び出す
		super(name, width, height, length, fuel, purchaseDay, totalTravelDistance);
		// 総走行距離を初期化
		this.odometer = odometer;
	}

	/*
	 * 関数名:setOdometer
	 * 概要:総走行距離を設定する
	 * 引数:総走行距離
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	void setOdometer(double odometer) {
		// 総走行距離を引数で設定
		this.odometer = odometer;
	}
}
