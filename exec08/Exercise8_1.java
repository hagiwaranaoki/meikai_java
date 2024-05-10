package exec08;

// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise8_1
 * 概要:Humanオブジェクトを使用して、名前、身長、体重を格納する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Exercise8_1 {
	/*
	 * 関数名:main
	 * 概要:Humanオブジェクトを使用して、名前、身長、体重を格納する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);
		// 名前の入力を促す
		System.out.print("名前：");
		// 名前を受け付け
		String userName = standardInput.nextLine();

		// 身長の入力を促す
		System.out.print("身長：");
		// 身長を受け付け
		double userHeight = standardInput.nextDouble();
		// 正ではない値が入力されている場合繰り返し
		while (userHeight <= 0) {
			// 正の値の入力を促す
			System.out.print("正の値を入力してください：");
			// 身長を受け付け
			userHeight = standardInput.nextDouble();
		}

		// 体重の入力を促す
		System.out.print("体重：");
		// 体重を受け付け
		double userWeight = standardInput.nextDouble();
		// 正ではない値が入力されている場合繰り返し
		while (userWeight <= 0) {
			// 正の値の入力を促す
			System.out.print("正の値を入力してください：");
			// 身長を受け付け
			userWeight = standardInput.nextDouble();
		}

		// 人間クラスの新しいオブジェクトを作成
		Human userSpec = new Human(userName, userHeight, userWeight);
		// 人間のスペックを表示
		userSpec.putSpec();
	}

}
