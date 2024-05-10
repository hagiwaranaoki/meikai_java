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
		// Carオブジェクトを生成
		Car firstCar = new Car("myCar", 1885, 1490, 5220, 90.0, new Day(), 0.0);
		// 生成したOdomatorオブジェクトの車のスペックを表示
		firstCar.putSpec();
		// ユーザーが走行するとき用の定数
		final int USER_CONTINUE = 1;
		// ユーザーが奏功しないとき用の定数
		final int USER_NOT_CONTINUE = 0;
		//while文の中で抜ける処理があるまで繰り返す
		while (true) {
			// 走行するか聞く
			System.out.print("走行しますか？(0...No,1...Yes):");
			// 走行するかの入力を受け付け
			int canRun = standardInput.nextInt();
			// 0,1以外の場合繰り返し
			while (canRun < USER_NOT_CONTINUE || canRun > USER_CONTINUE) {
				// 再入力を促す
				System.out.println("0か1を入力してください。");
				// 再入力を受け付け
				canRun = standardInput.nextInt();
			}
			// 0が入力された場合
			if (canRun == USER_NOT_CONTINUE) {
				// ループから抜ける
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
			
			//燃料があれば車を移動させる
			firstCar.moveCar(movingToX, movingToY);
			// 総走行距離をメソッドで計算して表示
			System.out.println("総走行距離:" + firstCar.getTotalTravelDistance() + "km");
		}
	}
}
