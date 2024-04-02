package exec05;

public class Exercise5_6 {
  public static void main(String[] args) {
    // ヘッダーを表示
    System.out.println("float\tint");
    // ヘッダーを表示
    System.out.println("--------------------");

    // float型の変数を0.0から1.0まで0.001ずつ増やす
    for (float f = 0.0f; f <= 1.0f; f += 0.001f) {
      // int型の変数を0から1000までインクリメント
      int i = (int) (f * 1000);
      // 1000で割る
      double d = i / 1000.0;

      // float型の変数と計算結果を表示
      System.out.printf("%f\t%f\n", f, d);
    }
  }
}
