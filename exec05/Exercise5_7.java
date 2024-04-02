package exec05;

public class Exercise5_7 {
  public static void main(String[] args) {
    // ヘッダーを表示
    System.out.println("float\tfloat^2");

    // 0.0から1.0まで0.001おきにループを実行
    for (float i = 0.0f; i <= 1.0f; i += 0.001f) {
      // iの値と、iの2乗を表示
      System.out.printf("%.3f\t%.6f\n", i, i * i);
    }
  }
}
