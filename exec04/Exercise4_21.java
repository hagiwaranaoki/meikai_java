package exec04;

import java.util.Scanner;

public class Exercise4_21 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーにnの値を入力するように促す
    System.out.print("三角形の大きさを入力してください：");
    // ユーザーからの入力を整数として受け取り、triangleSizeという変数に格納
    int triangleSize = scanner.nextInt();

    // 直角が左上側の三角形を描画
    for (int i = 0; i < triangleSize; i++) {
    	//列のループ
      for (int j = triangleSize - i; j > 0; j--) {
      	//アスタリスク描画
        System.out.print("*");
      }
      //改行
      System.out.println();
    }

    // 直角が右下側の三角形を描画
    for (int i = 0; i < triangleSize; i++) {
    	//行のループ
      for (int j = 0; j < i; j++) {
      	//改行
        System.out.print(" ");
      }
      //列のループ
      for (int k = triangleSize - i; k > 0; k--) {
      	//アスタリスク描画
        System.out.print("*");
      }
      //改行
      System.out.println();
    }

    // 直角が右上側の三角形を描画
    for (int i = 0; i < triangleSize; i++) {
    	//列ループ
      for (int j = 0; j < triangleSize - i; j++) {
      	//改行
        System.out.print(" ");
      }
      // 行のループ
      for (int k = 0; k <= i; k++) {
      	//アスタリスク描画
        System.out.print("*");
      }
      // 改行
      System.out.println();
    }
  }
}
