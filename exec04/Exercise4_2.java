package exec04;

// Randomクラスをインポート
import java.util.Random;
// Scannerクラスインポート
import java.util.Scanner;

public class Exercise4_2 {
	/*
	 * 関数名:main
	 * 概要:乱数の数を当てるゲーム
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/01
	 */
	public static void main(String[] args) {
	  // Scannerオブジェクトを作成
	  Scanner scanner = new Scanner(System.in);
	  // Randomオブジェクトを作成
	  Random random = new Random();
	
	  // 10から99までの乱数を生成
	  int randomNumber = random.nextInt(90) + 10;
	
	  // ユーザーに数あてゲームの開始を告げる
	  System.out.println("数あてゲーム開始！10から99までの数を当ててください。");
	
	  // ユーザーが正解するまでループ
	  while (true) {
		  // ユーザーに数を入力するように指示
		  System.out.print("いくつかな：");
		  // ユーザーからの入力を読み取る
		  int guess = scanner.nextInt();
		
		  // ユーザーの推測が正しいかどうかをチェック
		  if (guess == randomNumber) {
		    // 正解の場合、ループを抜ける
		    System.out.println("正解です！");
		    break;
		  } else if (guess > randomNumber) {
		    // 推測が大きすぎる場合、ヒントを与える
		    System.out.println("もっと小さな数だよ。");
		  } else {
		    // 推測が小さすぎる場合、ヒントを与える
		    System.out.println("もっと大きな数だよ。");
		  }
	  }
	  // scannerの受付を終了
	  scanner.close();
  }
}
