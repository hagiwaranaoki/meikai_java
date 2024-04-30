package exec12;

import java.util.Scanner;

/*
 * クラス名:Exercise12_2
 * 概要:TimeAccountクラスのテスト
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
public class Exercise12_2 {
	/*
	 * 関数名:main
	 * 概要:TimeAccountクラスのテスト
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/12
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 1つ目のオブジェクトの作成
		System.out.println("1つ目の口座情報を入力してください。");

		// 口座タイプの入力
		System.out.print("口座タイプを入力してください（1: Account, 2: TimeAccount）: ");
		// 口座タイプがAccountの場合の定数
		final int ACCOUNT_TYPE = 1;
		// 口座タイプがTimeAccountの場合の定数
		final int TIME_ACCOUNT_TYPE = 2;
		// アカウントのタイプを受付
		int firstAccountType = standardInput.nextInt();
		// 口座タイプが1でも0でもない場合繰り返し
		while (firstAccountType != ACCOUNT_TYPE && firstAccountType != TIME_ACCOUNT_TYPE) {
			// 0か1での入力を受け付け
			System.out.print("口座タイプは1か2の整数で入力してください：");
			// 口座タイプの入力を受け付け
			firstAccountType = standardInput.nextInt();
		}

		// 口座名義の入力を促す
		System.out.print("口座名義を入力してください: ");
		// 口座名義を受け付け
		String firstName = standardInput.next();

		// 口座番号の入力
		System.out.print("口座番号を入力してください: ");
		// 口座番号を受け付け
		String firstNumber = standardInput.next();

		// 預金残高の入力
		System.out.print("預金残高を入力してください: ");
		// 預金残高を受け付け
		long firstBalance = standardInput.nextLong();
		// 預金残高が0未満の時繰り返し
		while (firstBalance < 0) {
			// 0以上の整数の入力を促し
			System.out.print("0以上の整数を入力してください：");
			// 預金残高を受け付け
			firstBalance = standardInput.nextLong();
		}

		// Accountオブジェクトを初期化
		Account firstAccount = new Account();
		// 預金残高が1の場合
		if (firstAccountType == ACCOUNT_TYPE) {
			// Accountオブジェクトを生成
			firstAccount = new Account(firstName, firstNumber, firstBalance);
			// 預金残高が0ではない場合
		} else {
			// 定期預金残高の入力を促す
			System.out.print("定期預金残高を入力してください: ");
			// 定期預金残高を受け付け
			long firstTimeBalance = standardInput.nextLong();
			// 預金残高が0未満の時繰り返し
			while (firstTimeBalance < 0) {
				// 0以上の整数の入力を促し
				System.out.print("0以上の整数を入力してください：");
				// 預金残高を受け付け
				firstTimeBalance = standardInput.nextLong();
			}
			// TimeAccountオブジェクトの生成
			firstAccount = new TimeAccount(firstName, firstNumber, firstBalance, firstTimeBalance);
		}

		// 2つ目のオブジェクトの作成
		System.out.println("2つ目の口座情報を入力してください。");

		// 口座タイプの入力を促す
		System.out.print("口座タイプを入力してください（1: Account, 2: TimeAccount）: ");
		// 口座タイプの入力を受け付け
		int secondAccountType = standardInput.nextInt();
		// 口座タイプが1でも0でもない場合繰り返し
		while (secondAccountType != ACCOUNT_TYPE && secondAccountType != TIME_ACCOUNT_TYPE) {
			// 0か1での入力を受け付け
			System.out.print("口座タイプは1か2の整数で入力してください：");
			// 口座タイプの入力を受け付け
			secondAccountType = standardInput.nextInt();
		}

		// 口座名義の入力を促す
		System.out.print("口座名義を入力してください: ");
		// 口座名義の入力を受け付け
		String secondName = standardInput.next();

		// 口座番号の入力を促す
		System.out.print("口座番号を入力してください: ");
		// 口座番号を受け付け
		String secondNumber = standardInput.next();

		// 預金残高の入力を促す
		System.out.print("預金残高を入力してください: ");
		// 預金残高を受け付け
		long secondBalance = standardInput.nextLong();
		// 預金残高が0未満の時繰り返し
		while (secondBalance < 0) {
			// 0以上の整数の入力を促し
			System.out.print("0以上の整数を入力してください：");
			// 預金残高を受け付け
			secondBalance = standardInput.nextLong();
		}

		// Accountオブジェクトを初期化
		Account secondAccount = new Account();
		// 口座タイプが1の場合
		if (secondAccountType == ACCOUNT_TYPE) {
			// Accountオブジェクトを生成
			secondAccount = new Account(secondName, secondNumber, secondBalance);
			// 口座番号が1でhなかった場合
		} else {
			// 定期預金残高の入力を促す
			System.out.print("定期預金残高を入力してください: ");
			// 定期預金を受け付け
			long secondTimeBalance = standardInput.nextLong();
			// 預金残高が0未満の時繰り返し
			while (secondTimeBalance < 0) {
				// 0以上の整数の入力を促し
				System.out.print("0以上の整数を入力してください：");
				// 預金残高を受け付け
				secondTimeBalance = standardInput.nextLong();
			}
			// TimeAccountオブジェクトを生成
			secondAccount = new TimeAccount(secondName, secondNumber, secondBalance, secondTimeBalance);
		}

		// 残高の比較
		int comparisonResult = TimeAccount.compBalance(firstAccount, secondAccount);

		// 比較結果の表示
		if (comparisonResult > 0) {
			// 一つ目の口座のほうが残高多いことを表示
			System.out.println(firstAccount.getName() + "の残高のほうが多いです。");
			// 0未満の場合
		} else if (comparisonResult < 0) {
			// 二つ目の口座のほうが残高が多いことを表示
			System.out.println(secondAccount.getName() + "の残高のほうが多いです。");
			// それ以外の場合
		} else {
			// 口座の残高が同じということを表示
			System.out.println("両方の口座の残高は同じです。");
		}

		// 一つ目の口座の残高を表示
		System.out.println(firstAccount.getName() + "の残高: " + firstAccount.getBalance());
		// 二つ目の口座の残高を表示
		System.out.println(secondAccount.getName() + "の残高: " + secondAccount.getBalance());

		// 入力の受付を終了
		standardInput.close();
	}
}
