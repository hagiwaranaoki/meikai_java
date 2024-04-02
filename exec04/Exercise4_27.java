package exec04;

import java.util.Random;
import java.util.Scanner;

public class Exercise4_27 {
  public static void main(String[] args) {
    // Randomクラスのインスタンスを作成し、randomという名前をつける
    Random random = new Random();
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // 0~99のランダムな整数を生成
    int number = random.nextInt(100);

    // ゲーム開始のメッセージを出力
    System.out.println("数あてゲーム開始!!");
    // ゲーム開始のメッセージを出力
    System.out.println("0~99の数を当ててください。");

    // 制限回数を設定
    int limit = 10;

    // 入力された数値を格納する変数を定義
    int x;
    // 制限回数だけループを実行
    for (int i = 0; i < limit; i++) {
    	// 文字列出力
      System.out.print("いくつかな：");
      // ユーザーからの入力を整数として受け取り、xという変数に格納
      x = scanner.nextInt();

      // 入力値が正解より大きい場合、ヒントを出力
      if (x > number)
      	// 文字列出力
        System.out.println("もっと小さな数だよ");
      // 入力値が正解より小さい場合、ヒントを出力
      else if (x < number)
      	// 文字列出力
        System.out.println("もっと大きな数だよ");
      // 入力値が正解と一致した場合、ループを抜ける
      else if (x == number)
      	// forから抜け出す
        break;

      // 制限回数に達した場合、正解を表示してゲームを終了
      if (i == limit - 1) {
      	// 出力
        System.out.println("制限回数に達しました。正解は" + number + "でした。");
        //for分を抜け出す
        return;
      }
    }

    // 正解のメッセージを出力
    System.out.println("正解です。");
  }
}
