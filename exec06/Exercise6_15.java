package exec06;

// Randomクラスをインポート
import java.util.Random;
// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise6_15
 * 概要:曜日の英単語を入力する英単語学習
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_15 {
	/*
	 * 関数名:main
	 * 概要:曜日の英単語を入力する英単語学習
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomValue = new Random();
		//Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		//曜日数を格納する定数を宣言
		final int WEEK_RANGE = 7;
		//曜日の英語表現が格納された配列を宣言
		String[] weekArray = {
				"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"
		};
		//表記用に曜日が格納された配列を宣言
		String[] labelsWeek = {
				"月", "火", "水", "木", "金", "土", "日"
		};

		//問題を提示
		System.out.println("英語の曜日名を小文字で入力してください。");
		//リトライ用の変数を宣言
		int retryValue = 0;
		// 連続を避けるための変数を宣言
		int previousValue = 0;
		
		final int USER_RETRY = 1;
		//後判定ループ文
		do {
			//0～6の乱数を生成して曜日を格納する変数を代入
			int weekValue = randomValue.nextInt(WEEK_RANGE);
			////曜日の乱数生成が連続して同じ値の場合
			if (weekValue == previousValue) {
				//ループ文の初めに戻る
				continue;
			}
			//曜日の入力を促す
			System.out.print(labelsWeek[weekValue] + "曜日:");
			//インスタンスから入力された文字列を受け取る
			String weekSpell = standardInput.next();
			//入力された曜日名が間違っている場合
			while (!(weekSpell.equals(weekArray[weekValue]))) {
				//間違い用のメッセージを表示
				System.out.println("違います。");
				//月名の入力を促す
				System.out.print(labelsWeek[weekValue] + "曜日:");
				//インスタンスから入力された文字列を受け取る
				weekSpell = standardInput.next();
			}
			//入力された曜日名が正しい場合
			if ((weekSpell.equals(weekArray[weekValue]))) {
				//連続を避けるための変数に正解した曜日の値を代入
				previousValue = weekValue;
				//メッセージを表示
				System.out.print("正解です。 もう一度？ 1...Yes/1以外...No:");
			}
			//インスタンスから入力された値を受け取る
			retryValue = standardInput.nextInt();
			//1以外が入力されたらループ抜け
		} while (retryValue == USER_RETRY);
	}

}
