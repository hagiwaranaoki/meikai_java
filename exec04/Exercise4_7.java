package exec04;

// Scannerクラスをインポート
import java.util.Scanner;
/*
 * クラス名:Exercise4_7
 * 概要:読み込んだ値の個数だけアスタリスクを表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_7 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ値の個数だけアスタリスクを表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
    // Scannerオブジェクトを作成
    Scanner standardInput = new Scanner(System.in);

    //入力値を代入する変数を宣言
		int inputValue = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("何個表示しますか:");
			//インスタンスから入力された値を受け取る
			inputValue=standardInput.nextInt();
		//正の数が入力されたらループ抜け
		}while(inputValue<=0);

		
		//出力用の変数を宣言して初期化
		int outputValue=0;
		
		//前判定ループ文
		//出力用の変数が入力値と等しくなったらループ抜け
		while(inputValue>outputValue) {
			//偶数の場合
			if(outputValue%2==0) {
				//*を表示
				System.out.print('*');
			//奇数の場合
			}else {
				//+を表示
				System.out.print('+');
			}
			//出力用の変数をインクリメント
			outputValue++;
		}
	}
}