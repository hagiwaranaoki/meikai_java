package exec03;
// Scannerライブラリの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise3_2
 * 概要:約数の判別を行うメソッド
 * 作成者:N.Hagiwara
 * 作成日:2024/04/04
 */
public class Exercise3_2 {
	/*
	 * 関数名:main
	 * 概要:約数の判別を行うメソッド
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/02
	 */
	public static void main(String[] args) {
    // scannerクラスの変数を定義
    Scanner standardInput = new Scanner(System.in);

    // 文字列を改行なしで出力
    System.out.print("整数A：");
    // 整数Aの値をコンソールで受け付け
    int a = standardInput.nextInt();

    // 文字列を改行なしで出力
    System.out.print("整数B：");
    // 整数Bの値をコンソールで受け付け
    int b = standardInput.nextInt();
    // aかbが負の値の場合
    // 正の整数値の入力を求めているので負の値では計算しない
    if (a < 0 || b < 0) {
      // 文字列を改行ありで出力
      System.out.println("整数A,Bともに正の整数を入力してください。");
      // b が0の時
    } else if (b == 0 || a == 0) {
      // 文字列を改行ありで出力
      System.out.println("A,Bともに0より大きい数字で入力してください");
      // a/bの余りが0の時
    } else if (a % b == 0) {// 修正
      // 文字列を改行ありで出力
      System.out.println("BはAの約数です。");
      // それ以外の時
    } else {
      // 文字列を改行ありで出力
      System.out.println("BはAの約数ではありません。");
    }
    // scannerの受付を終了
    standardInput.close();
  }
}
