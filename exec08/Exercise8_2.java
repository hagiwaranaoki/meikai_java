package exec08;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise8_2
 * 概要:Carオブジェクトを指定した距離に燃料を使って移動させる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Exercise8_2 {
	/*
	 * 関数名:main
	 * 概要:Carオブジェクトを指定した距離に燃料を使って移動させる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static void main(String[] args) {
		// ユーザーがリトライしない場合の定数
		final int USER_NOT_RETRY = 0;
		// ユーザーがリトライする場合の定数
		final int USER_RETRY = 1;
		// 0の時の定数を定義
		final int ZERO_NUMBER = 0;
		// Scannerクラスのオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 車の名前の入力を促す
		System.out.print("車の名前：");
		// 車の名前を受け付け
		String carName = standardInput.nextLine();
		
		// 車幅の入力を促す
		System.out.print("車幅：");
		// 車幅を受け付け
		int carWidth = standardInput.nextInt();
		// 車幅が0以下の場合
		if (carWidth <= ZERO_NUMBER) {
			// 後判定ループ文
			do {
				// 正の整数値の入力を促す
				System.out.print("正の整数を入力してください：");
				// 車幅を受け付け
				carWidth = standardInput.nextInt();
				// 正の整数値の入力で抜け出す
			} while (carWidth <= ZERO_NUMBER);
		}
		
		// 車高の入力を促す
		System.out.print("車高：");
		// 車高を受け付け
		int carHeight = standardInput.nextInt();
		// 車高が0以下の場合
		if (carHeight <= ZERO_NUMBER) {
			// 後判定ループ文
			do {
				// 正の整数値の入力を促す
				System.out.print("正の整数を入力してください：");
				// 車高を受け付け
				carHeight = standardInput.nextInt();
				// 正の整数値の入力で抜け出す
			} while (carHeight <= ZERO_NUMBER);
		}
		
		// 車の長さの入力を促す
		System.out.print("車の長さ：");
		// 車の長さを受け付け
		int carLength = standardInput.nextInt();
		// 車の長さが0以下の場合
		if (carLength <= ZERO_NUMBER) {
			// 後判定ループ文
			do {
				// 正の整数値の入力を促す
				System.out.print("正の整数を入力してください：");
				// 車の長さを受け付け
				carLength = standardInput.nextInt();
				// 正の整数値の入力で抜け出す
			} while (carLength <= ZERO_NUMBER);
		}
		
		// 燃料の入力を促す
		System.out.print("燃料：");
		// 燃料を受け付け
		double carFuel = standardInput.nextDouble();
		// 燃料が0以下の場合
		if (carFuel <= ZERO_NUMBER) {
			// 後判定ループ文
			do {
				// 正の整数値の入力を促す
				System.out.print("正の実数を入力してください：");
				// 燃料を受け付け
				carFuel = standardInput.nextDouble();
				// 正の整数値の入力で抜け出す
			} while (carFuel <= ZERO_NUMBER);
		}
		
		// 燃費の入力を促す
		System.out.print("燃費：");
		// 燃費を受け付け
		double carEconomy = standardInput.nextDouble();
		// 燃費が0以下の場合
		if (carEconomy <= ZERO_NUMBER) {
			// 後判定ループ文
			do {
				// 正の整数値の入力を促す
				System.out.print("正の実数を入力してください：");
				// 燃費を受け付け
				carEconomy = standardInput.nextDouble();
				// 正の整数値の入力で抜け出す
			} while (carEconomy <= ZERO_NUMBER);
		}
		
		// Carオブジェクトを生成
		Car myCar = new Car(carName, carWidth, carHeight, carLength, carFuel, carEconomy);
		// 車の詳細情報を表示
		myCar.putSpec();
		// 移動しないまたは燃料を補充しないを選ぶまで繰り返す
		while (true) {
			// 現在の車の位置と残り燃料を表示
			System.out.printf("現在地：(%f, %f)\n残り燃料：%f\n", myCar.getX(), myCar.getY(), myCar.getFuel());
			// ユーザーに移動の意思を確認
			System.out.print("移動しますか[0…No／1…Yes]：");
			// 移動するかしないかの数値入力を受け付け
			int userRetry = standardInput.nextInt();
			// 移動しないを選んだ場合
			if (userRetry == USER_NOT_RETRY) {
				// ループから抜け出す
				break;
				// 0,1以外が入力された場合
			} else if (userRetry > USER_RETRY || userRetry < USER_NOT_RETRY) {
				// 後判定ループ文
				do {
					// ユーザーに0か1を入力するように促す
					System.out.print("0か1を入力してください：");
					// 移動するかしないかの数値入力を受け付け
					userRetry = standardInput.nextInt();
					// 0か1が入力されたら抜け出す
				} while (userRetry > USER_RETRY || userRetry < USER_NOT_RETRY);
			}

			// ユーザーにXの移動距離の入力を促す
			System.out.print("x方向の移動距離：");
			// X方向への移動距離を受け付ける
			double dx = standardInput.nextDouble();
			// ユーザーにYの移動距離の入力を促す
			System.out.print("y方向の移動距離：");
			// Y方向への移動距離を受け付ける
			double dy = standardInput.nextDouble();

			// 移動の成否を判定
			if (!myCar.move(dx, dy)) {
				// 燃料不足のメッセージ
				System.out.println("燃料が足りません！");
				// ユーザーに給油の意思を確認
				System.out.print("給油しますか[0…No／1…Yes]：");
				// 給油するかどうかを受け付ける
				int fuelReplenishment = standardInput.nextInt();
				// 0を選んだ場合
				if (fuelReplenishment == USER_NOT_RETRY) {
					// ループから抜ける
					break;
					// 1を選択した場合
				} else if (fuelReplenishment == USER_RETRY) {
					// ユーザーに給油量の入力を促す
					System.out.print("給油量：");
					// 燃料をチャージする量を受け付ける
					double fuelQuantity = standardInput.nextDouble();
					// 燃料をチャージする
					myCar.chargeFuel(fuelQuantity);
					// 0,1以外を選択した場合
				} else {
					// 後判定ループ文
					do {
						// ユーザーに0か1を入力するように促す
						System.out.print("0か1を入力してください：");
						// 給油するかしないかの数値入力を受け付け
						fuelReplenishment = standardInput.nextInt();
						// 0か1が入力されたら抜け出す
					} while (fuelReplenishment > USER_RETRY || fuelReplenishment < USER_NOT_RETRY);
					// ユーザーに給油量の入力を促す
					System.out.print("給油量：");
					// 燃料をチャージする量を受け付ける
					double fuelQuantity = standardInput.nextDouble();
					// 燃料をチャージする
					myCar.chargeFuel(fuelQuantity);
				}
			}
		}
		// 最後に燃料のスペックを表示
		myCar.putSpec();
	}

}
