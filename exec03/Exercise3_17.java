package exec03;

//java.utilパッケージからRandomクラスをインポート
import java.util.Random;

public class Exercise3_17 {
	/*
	 * 関数名:main
	 * 概要:乱数に基づいてグー、チョキ、パーを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
		// Randomオブジェクトを作成
		Random random = new Random();

		 // 0から2までの乱数を生成
		 int randomNumber = random.nextInt(3);
		
		 // 乱数に基づいて"グー"、"チョキ"、または"パー"を表示
		 if (randomNumber == 0) {
		   // 乱数が0の場合、"グー"を表示
		   System.out.println("グー");
		 } else if (randomNumber == 1) {
		   // 乱数が1の場合、"チョキ"を表示
		   System.out.println("チョキ");
		 } else {
		   // 乱数が2の場合、"パー"を表示
		   System.out.println("パー");
		 }
	}
}
