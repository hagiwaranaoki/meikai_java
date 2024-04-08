package exec04;
// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise4_24
 * 概要:素数かどうかを判定する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise4_24 {
	/*
	 * 関数名:main
	 * 概要:素数かどうかを判定する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
  public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner scannerInteger=new Scanner(System.in);
		
		//入力値を代入する変数を宣言
		int inputValue = 0;
		//概要説明を表示
		System.out.println("素数の判定をします。");
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("正の整数値:");
			//インスタンスから入力された値を受け取る
			inputValue=scannerInteger.nextInt();
		//正の数が入力されたらループ抜け
		}while(inputValue<=1);
		
		//カウント用変数を宣言
		int countValue=0;
		//カウントが入力値を超えたらループ抜け
		for(countValue=2;countValue<inputValue;countValue++) {
			//カウントで入力値を割り切れた場合
			if(inputValue%countValue==0) {
				//素数でないことを表示
				System.out.println(inputValue+"は素数ではありません。");
				//ループ抜け
				break;
			}
		}	
		//入力値が最後まで割り切れなかった場合
		if(countValue==inputValue) {
			//素数であることを表示
			System.out.println(inputValue+"は素数です。");
		}
		
	}
}
