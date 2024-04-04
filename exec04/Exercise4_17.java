package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_17
 * 概要:読み込んだ整数値のすべての約数を表示し、約数の個数を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_17 {
	/*
	 * 関数名:main
	 * 概要:読み込んだ整数値のすべての約数を表示し、約数の個数を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scannerInteger=new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値:");
		//インスタンスから入力された値を受け取る
		int inputValue=scannerInteger.nextInt();
		//約数の個数を表示するための変数を宣言して初期化
		int outputValue=0;
		
		//カウントが入力値を超えたらループ抜け
		for(int countValue=1;countValue<=inputValue;countValue++) {
			//カウント用変数の値が入力値の約数である場合
			if(inputValue%countValue==0) {
				//約数の値を表示
				System.out.println(countValue);
				//約数の個数をインクリメント
				outputValue++;
			}
		
		}
		//約数の個数を表示
		System.out.println("約数は"+outputValue+"個です。");
	}
}
