package exec04;

// Randomクラスをインポート
import java.util.Random;
// Scannerクラスインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_2
 * 概要:乱数の数を当てるゲーム
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_2 {
	/*
	 * 関数名:main
	 * 概要:乱数の数を当てるゲーム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//Randomクラスのインスタンスを作成
		Random randomValue=new Random();
		// 乱数の範囲用の定数
		final int RANDOM_RANGE = 90;
		
		//10～99の乱数を生成してランダム用の変数に代入
		int randomVariable=randomValue.nextInt(RANDOM_RANGE)+10;
		//Scannerクラスのインスタンスを作成
		Scanner standardInput=new Scanner(System.in);
		//数当てゲームの開始表示
		System.out.println("数当てゲーム開始！");
		//数を当てる範囲を表示
		System.out.println("10～99の数を当ててください。");
		//入力された値を受け取る変数を宣言
		int inputValue = 0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("いくつかな:");
			//インスタンスから入力された値を受け取る
			inputValue=standardInput.nextInt();
			//入力された値が乱数より大きい場合
			if(inputValue>randomVariable) {
				//ヒントを表示
				System.out.println("もっと小さな数だよ。");
			//入力された値が乱数より小さい場合
			}else if(inputValue<randomVariable) {
				//ヒントを表示
				System.out.println("もっと大きな数だよ。");
			}
		//入力された値が乱数と一致した場合ループ抜け
		}while(inputValue!=randomVariable);
		//正解であることを表示
		System.out.println("正解です。");
	}
}
