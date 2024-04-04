package exec02;

//Scannerライブラリの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise2_10
 * 概要:コンソールに入力された人に挨拶をするメソッド
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise2_10 {
	/*
	 * 関数名:main
	 * 概要:コンソールに入力された人に挨拶をするメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/01
	 */
	 public static void main(String[] args) {
		  // Scannerクラスの変数を定義
		  Scanner standardInput = new Scanner(System.in);
		  
		  // 文字列を改行せずに出力
		  System.out.print("姓：");
		  // String型の文字列lastNameをコンソールで受け付け
		  String lastName = standardInput.next();
	
		  // 文字列を改行せずに出力
		  System.out.print("名：");
		  // String型の文字列firstNameをコンソールで受け付け
		  String firstName = standardInput.next();
		  
		  // lastNameとfirstNameをコンソールに出力
		  System.out.println("こんにちは" + lastName + firstName + "さん。");
		  // 受付を終了
		  standardInput.close();
	  }
}
