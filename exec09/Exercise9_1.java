package exec09;

// Scannerクラスをインポート
import java.util.Scanner;

// Humanクラスをインポート
import exec08.Human;

/*
 * クラス名:Exercise9_1
 * 概要:Humanオブジェクトを配列型で生成する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/10
 */
public class Exercise9_1 {
	/*
	 * 関数名:main
	 * 概要:Humanオブジェクトを配列型で生成する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトの生成
		Scanner standardInput = new Scanner(System.in);
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 要素数を受け付ける
		int elementCount = standardInput.nextInt();
		// 正の整数以外が入力されたとき
		if (elementCount <= 0) {
			// 後判定ループ文
			do {
				// 正の整数の入力を促す
				System.out.print("要素数は正の整数で入力してください：");
				// 要素数を受け付ける
				elementCount = standardInput.nextInt();
				// 正の整数が入力されたら抜け出す
			} while (elementCount <= 0);
		}
		
		// Human型配列を作成
		Human[] firstHumanArray = new Human[elementCount];
		// 配列の要素数分繰り返す
		for (int i = 0; i < firstHumanArray.length; i++) {
			// 名前の入力を促す
			System.out.print(i + 1 + "人目の名前を入力してください：");
			// 人の名前の入力を受け付け
			String humanName = standardInput.next();

			// 身長の入力を促す
			System.out.print(i + 1 + "人目の身長を入力してください：");
			// 人の身長の入力を受け付け
			double humanHeight = standardInput.nextDouble();
			// 正の実数値以外が入力されたとき
			if (humanHeight <= 0) {
				// 後判定ループ文
				do {
					// 身長の入力を促す
					System.out.print("正の実数値を入力してください：");
					// 人の身長の入力を受け付け
					humanHeight = standardInput.nextDouble();
					// 正の実数値が入力されたら抜け出す
				} while (humanHeight <= 0);
			}

			// 体重の入力を促す
			System.out.print(i + 1 + "人目の体重を入力してください：");
			// 人の体重の入力を受け付け
			double humanWeight = standardInput.nextDouble();
			// 正の実数値以外が入力されたとき
			if (humanWeight <= 0) {
				// 後判定ループ文
				do {
					// 身長の入力を促す
					System.out.print("正の実数値を入力してください：");
					// 人の身長の入力を受け付け
					humanWeight = standardInput.nextDouble();
					// 正の実数値が入力されたら抜け出す
				} while (humanWeight <= 0);
			}

			// 配列の各要素にHumanオブジェクトを作成し、名前、身長、体重を設定する
			// これにより、各Humanオブジェクトを個別に初期化できる
			firstHumanArray[i] = new Human(humanName, humanHeight, humanWeight);
		}

		// タイトルを表示
		System.out.println("生成時に要素を初期化する");
		// 配列xの各要素であるHumanオブジェクトのputSpec()メソッドを呼び出す
		// これにより、各Humanオブジェクトの詳細情報を表示できる
		for (int i = 0; i < firstHumanArray.length; i++) {
			// 配列の中の人間のスペックを表示
			firstHumanArray[i].putSpec();
		}

		// 点線を出力
		System.out.println("-------------");
		// 1人目の名前の入力を促す
		System.out.print("1人目の名前を入力してください：");
		// 名前を受け付け
		String firstHumanName = standardInput.next();
		// 1人目の身長の入力を促す
		System.out.print("1人目の身長を入力してください：");
		// 身長を受け付け
		double firstHumanHeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (firstHumanHeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 身長を受け付け
				firstHumanHeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (firstHumanHeight <= 0);
		}
		// 1人目の体重の入力を促す
		System.out.print("1人目の体重を入力してください：");
		// 体重を受け付け
		double firstHumanWeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (firstHumanWeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 体重を受け付け
				firstHumanWeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (firstHumanWeight <= 0);
		}

		// 2人目の名前の入力を促す
		System.out.print("2人目の名前を入力してください：");
		// 名前を受け付け
		String secondHumanName = standardInput.next();
		// 2人目の身長の入力を促す
		System.out.print("2人目の身長を入力してください：");
		// 身長を受け付け
		double secondHumanHeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (secondHumanHeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 身長を受け付け
				secondHumanHeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (secondHumanHeight <= 0);
		}
		// 2人目の体重の入力を促す
		System.out.print("2人目の体重を入力してください：");
		// 体重を受け付け
		double secondHumanWeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (secondHumanWeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 体重を受け付け
				secondHumanWeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (secondHumanWeight <= 0);
		}

		// 3人目の名前の入力を促す
		System.out.print("3人目の名前を入力してください：");
		// 名前を受け付け
		String thirdHumanName = standardInput.next();
		// 3人目の身長の入力を促す
		System.out.print("3人目の身長を入力してください：");
		// 身長を受け付け
		double thirdHumanHeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (thirdHumanHeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 身長を受け付け
				thirdHumanHeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (thirdHumanHeight <= 0);
		}
		// 3人目の体重の入力を促す
		System.out.print("3人目の体重を入力してください：");
		// 体重を受け付け
		double thirdHumanWeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (thirdHumanWeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 体重を受け付け
				thirdHumanWeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (thirdHumanWeight <= 0);
		}

		// 配列の初期化時に直接Humanオブジェクトを指定して作成する
		// これにより、配列の作成とHumanオブジェクトの初期化を同時に行える
		Human[] secondHumanArray = {
				// 一人目の人間を生成
				new Human(firstHumanName, firstHumanHeight, firstHumanWeight),
				// 二人目の人間を生成
				new Human(secondHumanName, secondHumanHeight, secondHumanWeight),
				// 三人目の人間を生成
				new Human(thirdHumanName, thirdHumanHeight, thirdHumanWeight)
		};
		// タイトル文字列
		System.out.println("初期化時に直接指定して作成する1");
		// 配列yの各要素であるHumanオブジェクトのputSpec()メソッドを呼び出す
		// これにより、各Humanオブジェクトの詳細情報を表示できる
		for (int i = 0; i < secondHumanArray.length; i++) {
			// 配列の人間のスペックを一覧表示s
			secondHumanArray[i].putSpec();
		}

		// 点線を表示
		System.out.println("-------------");

		// 1人目の名前の入力を促す
		System.out.print("1人目の名前を入力してください：");
		// 名前を受け付け
		String firstPersonName = standardInput.next();
		// 1人目の身長の入力を促す
		System.out.print("1人目の身長を入力してください：");
		// 身長を受け付け
		double firstPersonHeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (firstPersonHeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 身長を受け付け
				firstPersonHeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (firstPersonHeight <= 0);
		}
		// 1人目の体重の入力を促す
		System.out.print("1人目の体重を入力してください：");
		// 体重を受け付け
		double firstPersonWeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (firstPersonWeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 体重を受け付け
				firstPersonWeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (firstPersonWeight <= 0);
		}

		// 2人目の名前の入力を促す
		System.out.print("2人目の名前を入力してください：");
		// 名前を受け付け
		String secondPersonName = standardInput.next();
		// 2人目の身長の入力を促す
		System.out.print("2人目の身長を入力してください：");
		// 身長を受け付け
		double secondPersonHeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (secondPersonHeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 身長を受け付け
				secondPersonHeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (secondPersonHeight <= 0);
		}
		// 2人目の体重の入力を促す
		System.out.print("2人目の体重を入力してください：");
		// 体重を受け付け
		double secondPersonWeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (secondPersonWeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 体重を受け付け
				secondPersonWeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (secondPersonWeight <= 0);
		}

		// 3人目の名前の入力を促す
		System.out.print("3人目の名前を入力してください：");
		// 名前を受け付け
		String thirdPersonName = standardInput.next();
		// 3人目の身長の入力を促す
		System.out.print("3人目の身長を入力してください：");
		// 身長を受け付け
		double thirdPersonHeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (thirdPersonHeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 身長を受け付け
				thirdPersonHeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (thirdPersonHeight <= 0);
		}
		// 3人目の体重の入力を促す
		System.out.print("3人目の体重を入力してください：");
		// 体重を受け付け
		double thirdPersonWeight = standardInput.nextDouble();
		// 正の実数値以外が入力されたとき
		if (thirdPersonWeight <= 0) {
			// 後判定ループ文
			do {
				// 再入力を促す
				System.out.print("正の実数値を入力してください：");
				// 体重を受け付け
				thirdPersonWeight = standardInput.nextDouble();
				// 正の実数値が入力されるまで繰り返す
			} while (thirdPersonWeight <= 0);
		}

		// 人間クラス配列を定義（この後に初期化する方法なので、初期化値無し）
		Human[] thirdHumanArray;
		// 配列の初期化時に直接Humanオブジェクトを指定して作成する
		// これにより、配列の宣言と初期化を分離できる
		thirdHumanArray = new Human[] {
				// 一人目の人間
				new Human(firstPersonName, firstPersonHeight, firstPersonWeight),
				// 二人目の人間
				new Human(secondPersonName, secondPersonHeight, secondPersonWeight),
				// 三人目の人間
				new Human(thirdPersonName, thirdPersonHeight, secondPersonWeight)
		};

		// タイトル文字列
		System.out.println("初期化時に直接指定して作成する2");
		// 配列zの各要素であるHumanオブジェクトのputSpec()メソッドを呼び出す
		// これにより、各Humanオブジェクトの詳細情報を表示できる
		for (int i = 0; i < thirdHumanArray.length; i++) {
			// 配列の中の人間のスペックを表示
			thirdHumanArray[i].putSpec();
		}
	}

}
