package exec09;

// Scannerクラスをインポート
import java.util.Scanner;

/*
* クラス名:Exercise9_3
* 概要:Accountクラスのテストを行うクラス
* 作成者:N.Hagiwara
* 作成日:2024/04/10
*/
public class Exercise9_3 {
	/*
	 * 関数名:main
	 * 概要:Accountクラスのテストを行う
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);

		// 口座名義の入力を促す
		System.out.print("口座名義: ");
		// 入力された口座名義を取得
		String accountName = standardInput.nextLine();

		// 口座番号の入力を促す
		System.out.print("口座番号: ");
		// 入力された口座番号を取得
		String accountNumber = standardInput.nextLine();

		// 預金残高の入力を促す
		System.out.print("預金残高: ");
		// 入力された預金残高を取得
		long accountBalance = standardInput.nextLong();

		// 口座開設日の年の入力を促す
		System.out.print("口座開設日 (年): ");
		// 入力された口座開設日の年を取得
		int accountYear = standardInput.nextInt();

		// 口座開設日の月の入力を促す
		System.out.print("口座開設日 (月): ");
		// 入力された口座開設日の月を取得
		int accountMonth = standardInput.nextInt();

		// 口座開設日の日の入力を促す
		System.out.print("口座開設日 (日): ");
		// 入力された口座開設日の日を取得
		int accountDate = standardInput.nextInt();

		// Dayクラスのインスタンスを作成
		Day openingDay = new Day(accountYear, accountMonth, accountDate);

		// Accountクラスのインスタンスを作成
		Account accountVariable = new Account(accountName, accountNumber, accountBalance, openingDay);

		// 口座情報のタイトルを表示
		System.out.println("\n口座情報:");
		// 口座情報を表示
		System.out.println(accountVariable.toString());

		// 預金額の入力を促す
		System.out.print("預金する金額: ");
		// 入力された預金額を取得
		long depositAmount = standardInput.nextLong();
		// 預金を行う
		accountVariable.deposit(depositAmount);

		// 預金後の口座情報のタイトルを表示
		System.out.println("\n預金後の口座情報:");
		// 預金後の口座情報を表示
		System.out.println(accountVariable.toString());

		// 引き出し額の入力を促す
		System.out.print("引き出す金額: ");
		// 入力された引き出し額を取得
		long withdrawAmount = standardInput.nextLong();
		// 引き出しを行う
		accountVariable.withdraw(withdrawAmount);

		// 引き出し後の口座情報のタイトルを表示
		System.out.println("\n引き出し後の口座情報:");
		// 引き出し後の口座情報を表示
		System.out.println(accountVariable.toString());

		// Scannerクラスのインスタンスをクローズ
		standardInput.close();
	}
}