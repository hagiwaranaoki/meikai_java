package exec04;

// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_3
 * 概要:二つの整数値の大きいほうから小さいほうまでの整数値を表示する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_3 {
	/*
	 * 関数名:main
	 * 概要:二つの整数値の大きいほうから小さいほうまでの整数値を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/03
	 */
  public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner standardInput=new Scanner(System.in);
		//整数の入力を促す
		System.out.print("整数値1:");
		//インスタンスから入力された値を受け取る
		int firstNumber=standardInput.nextInt();
		//整数の入力を促す
		System.out.print("整数値2:");
		//インスタンスから入力された値を受け取る
		int secondNumber=standardInput.nextInt();
		//出力用の値を格納する変数を宣言して初期化
		int outputValue=0;
		// 大きい値を格納する変数を宣言して初期化
		int maximumValue=0;
		
		//最初に入力された整数のほうが小さい場合
		if (firstNumber<secondNumber) {
			//1つ目に入力された整数値を表示
			System.out.print(firstNumber);
			//出力用の変数に1つ目に入力された値を代入
			outputValue=firstNumber;
			//値が大きい用の変数に2つ目に入力された値を代入
			maximumValue=secondNumber;
		//最初に入力された整数のほうが大きい場合
		}else if(firstNumber>secondNumber) {
			//2つ目に入力された整数値を表示
			System.out.print(secondNumber);
			//出力用の変数に2つ目に入力された値を代入
			outputValue=secondNumber;
			//値が大きい用の変数に1つ目に入力された値を代入
			maximumValue=firstNumber;
		}
		
		//後判定ループ文
		do{
			//2つの整数値が同じ場合
			if(firstNumber==secondNumber) {
				//無限ループ回避のためループ抜け
				break;
			}
			//出力用の変数の値に＋1
			outputValue =outputValue+1;
			//出力用変数の値を表示
			System.out.print(" "+outputValue);
		//出力用変数の値が大きいほうの整数値と等しくなったらループ抜け
		}while(outputValue!=maximumValue);
	}
}
