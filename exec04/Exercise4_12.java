package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_12
 * 概要:0～正の整数値までカウントアップする
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_12 {
	/*
	 * 関数名:main
	 * 概要:0～正の整数値までカウントアップする
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner standardInput = new Scanner(System.in);

		// ユーザーに正の整数値を入力するように指示
		System.out.print("正の整数値：");
		// ユーザーからの整数値の入力を読み取り
		int integerNumber = standardInput.nextInt();
		// 0以下の場合
		if (integerNumber <= 0) {
			do {
				// 文字列出力
				System.out.print("正の整数値を入力してください：");
				// ユーザーからの整数値の入力を読み取り
				integerNumber = standardInput.nextInt();
				// 正の値が入力されると抜け出す
			} while(integerNumber < 0);
		}

		// 0から受け取った整数値までカウントアップ
		for (int i = 0; i <= integerNumber; i++) {
			// counterを表示
			System.out.println(i);
		}
		// scannerの受付を終了
		standardInput.close();
	}
}