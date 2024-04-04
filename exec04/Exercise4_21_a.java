package exec04;
// Scannerクラスのインポート
import java.util.Scanner;
/*
 * クラス名:Exercise4_21_a
 * 概要:左上が直角の三角形を表示
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_21_a {
	/*
	 * 関数名:main
	 * 概要:左上が直角の三角形を表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成		
		Scanner scannerInteger=new Scanner(System.in);
		//表示する三角形の趣旨を説明
		System.out.println("左上直角の三角形を表示します。");
		
		//入力値を代入する変数を宣言
		int inputValue=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("段数は:");
			//インスタンスから入力された値を受け取る
			inputValue=scannerInteger.nextInt();	
		//正の数が入力されたらループ抜け
		}while(inputValue<=0);
		
		//改行の変数を宣言し初期化
		int heightValue = 0;
    // ＊表示変数を宣言し初期化
    int widthValue = 0;
		
		//改行回数が入力値を超えたらループ抜け
		for(heightValue=0;heightValue<inputValue;heightValue++) {
			//＊表示回数が入力値を超えたらループ抜け
			for(widthValue=inputValue;widthValue>heightValue;widthValue--) {
				//*表示
				System.out.print("*");
			}
			//改行を表示
			System.out.println();
		}
	}
}
