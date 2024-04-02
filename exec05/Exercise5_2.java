package exec05;

import java.util.Scanner;

public class Exercise5_2 {
  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成し、scannerという名前をつける
    Scanner scanner = new Scanner(System.in);

    // ユーザーにfloat型の値を入力するように促す
    System.out.print("x:");
    // ユーザーからの入力をfloatとして受け取り、xという変数に格納
    float x = scanner.nextFloat();

    // ユーザーにdouble型の値を入力するように促す
    System.out.print("y:");
    // ユーザーからの入力をdoubleとして受け取り、yという変数に格納
    double y = scanner.nextDouble();

    // float型の値を出力
    System.out.println("x = " + x);
    //double型の値を出力
    System.out.println("y = " + y);
  }
}
