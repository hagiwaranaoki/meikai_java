package exec06;
// Randomクラスをインポート
import java.util.Random;
// Scannerクラスをインポート
import java.util.Scanner;

/*
 * クラス名:Exercise6_14
 * 概要:月の英単語を入力する英単語学習
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_14 {
	/*
	 * 関数名:main
	 * 概要:月の英単語を入力する英単語学習
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {

		//Randomクラスのインスタンスを作成
		Random randomGeneration=new Random();
		//Scannerクラスのインスタンスを作成
		//引数:標準入力System.in
		Scanner scanInput=new Scanner(System.in);
		//月の範囲を格納する定数を宣言
		final int MONTH_RANGE=12;
		//月名の英語表現が格納されている配列を宣言
		String[] monthArray={
			"January","February","March","April","May","June","July","August","September","October","November","December"
		};
		
		//問題を提示
		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、２文字目以降は小文字とします。");
		//リトライ用と連続を避けるための変数を宣言
		int retryValue=0,previousValue=0;
		//後判定ループ文
		do {
			//乱数を生成して月の値を格納する変数に代入
			int monthValue=randomGeneration.nextInt(MONTH_RANGE)+1;
			//月の乱数生成が連続して同じ値の場合
			if(monthValue==previousValue) {
				//ループ文の初めに戻る
				continue;
			}
			//月名の入力を促す
			System.out.print(monthValue+"月:");
			//インスタンスから入力された文字列を受け取る
			String monthSpell=scanInput.next();
			//入力された月名が間違っている場合
			while(!(monthSpell.equals(monthArray[monthValue-1]))) {
				//メッセージを表示
				System.out.println("違います。");
				//月名の入力を促す
				System.out.print(monthValue+"月:");
				//インスタンスから入力された文字列を受け取る
				monthSpell=scanInput.next();
			}
			//入力された月名が正しい場合
			if((monthSpell.equals(monthArray[monthValue-1]))) {
				//連続を避けるための変数に正解した月の値を代入
				previousValue=monthValue;
				//メッセージを表示
				System.out.print("正解です。 もう一度？ 1...Yes/1以外...No:");
			}
			//インスタンスから入力された値を受け取る
			retryValue=scanInput.nextInt();
		//1以外が入力されたらループ抜け
		}while(retryValue==1);
	}

}
