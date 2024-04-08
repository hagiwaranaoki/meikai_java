package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_8
 * 概要:整数値の桁数を調べる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_8 {
	/*
	 * 関数名:main
	 * 概要:整数値の桁数を調べる
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner standardInput = new Scanner(System.in);

    // ユーザーからの入力を読み取る
    int integerNumber = 0;
    // ユーザーに整数値を入力するように指示
		System.out.print("整数値：");
		//インスタンスから入力された値を受け取る
		integerNumber=standardInput.nextInt();
		// 0以下の数値が入力されたとき
		if (integerNumber <= 0) {
	    //後判定ループ文
			do {
				// 文字列出力
				System.out.print("正の整数値を入力してください：");
				//インスタンスから入力された値を受け取る
				integerNumber=standardInput.nextInt();
			//正の数が入力されたらループ抜け
			}while(integerNumber<=0);
		}

    // 桁数を計算するための変数を初期化
    int digitCount = 0;

    // 入力された整数値が0になるまでループ
    while (integerNumber > 0) {
      // 入力された整数値を10で割って桁を1つ減らす
      integerNumber /= 10;

      // 桁数をカウントアップ
      digitCount++;
    }

    // 桁数を出力する
    System.out.println("その数は" + digitCount + "桁です");

    // scannerの受付を終了
    standardInput.close();
  }
}
