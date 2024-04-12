package exec12;
// Scannerクラスをインポート
import java.util.Scanner;

// Dayクラスをインポート
import exec09.Day;

/*
 * クラス名:Exercise12_1
 * 概要:odomaterクラスの確認
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
public class Exercise12_1 {
	/*
	 * 関数名:main
	 * 概要:odomaterクラスの確認
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		// Odomatorオブジェクトを生成
		Odometer firstOdomator = new Odometer("myCar", 1885, 1490, 5220, 90.0, new Day(), 0);
		// 生成したOdomatorオブジェクトの車のスペックを表示
		firstOdomator.putSpec();
		//while文の中で抜ける処理があるまで繰り返す
		while (true) {
			// 走行するか聞く
			System.out.print("走行しますか？(0...No,1...Yes):");
			// Noを選んだ場合
			if (standardInput.nextInt() == 0) {
				// 繰り返しから抜ける
				break;
			}
			// 何km走行するか聞く
			System.out.println("何km走行しますか？");
			// x方向の移動距離の入力を促す
			System.out.print("x方向:");
			// x方向の移動距離を受け付け
			double movingToX = standardInput.nextDouble();
			//y方向の移動距離を受付
			System.out.print("y方向:");
			// y方向の移動距離の入力を促す
			double movingToY = standardInput.nextDouble();
			// 総走行距離をメソッドで計算して表示
			System.out.println("総走行距離:" + firstOdomator.odometer(movingToX, movingToY) + "km");
		}
	}
}
