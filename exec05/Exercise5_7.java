package exec05;

public class Exercise5_7 {
	/*
	 * 関数名:main
	 * 概要:0.0から1.0まで0.001おきに、その値と、その値の2乗を表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/03
	 */
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
