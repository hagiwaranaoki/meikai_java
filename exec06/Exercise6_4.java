package exec06;
import java.util.Random;
import java.util.Scanner;
public class Exercise6_4 {
	/*
	 * 関数名:main
	 * 概要:アスタリスクで乱数の縦向きの棒グラフを表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Randomオブジェクト作成
    Random rand = new Random();
    // Scannerオブジェクト作成
    Scanner scanner = new Scanner(System.in);
    // 文字列出力
    System.out.print("要素数：");
    // 要素数の入力受付
    int number = scanner.nextInt();
    // int型の配列作成
    int[] array = new int[number];
    // numberの数値分繰り返し
    for (int i = 0; i < number; i++) {
    	// 1~10の乱数を配列に代入
      array[i] = 1 + rand.nextInt(10);
    }
    //'*'の描画
    for (int i = 0; i < 10; i++) {
    	// numberの回数分繰り返し
      for (int j = 0; j < number; j++) {
      	// 配列の要素数値によってアスタリスクを描画するか決める
        if (i >= (10 - array[j])) {
        	// 文字列出力
          System.out.print('*');
          // アスタリスクを出力しない場合
        } else {
        	// 空白を出力
          System.out.print(' ');
        }
        // jが要素数と同じになったとき
        if (j == (number - 1)) {
        	// 改行する
          System.out.println();
          // それ以外の場合
        } else {
        	// 空白を出力
          System.out.print(' ');
        }
      }
    }
    //'-'の描画
    for (int i = 0; i < number; i++) {
    	// -を出力
      System.out.print('-');
      // 要素数と同じになった場合
      if (i == number - 1) {
      	// 改行
        System.out.println();
        //それ以外の場合
      } else {
      	// -を出力
        System.out.print('-');
      }
    }
    //インデックスの描画
    for (int i = 0; i < number; i++) {
    	// 1/10の剰余を出力
      System.out.print(i % 10);
      // 要素数と同じになった場合
      if (i == number - 1) {
      	// 改行を出力
        System.out.println();
        // それ以外の場合
      } else {
      	// 空白を出力
        System.out.print(' ');
      }
    }
  }
}
