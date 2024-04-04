package exec02;

public class Exercise2_2 {
	/*
	 * 関数名:main
	 * 概要:三つのint型変数を用いて合計と平均を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/01
	 */
	public static void main(String[] args) {
		int x; //int型の整数xを定義
		int y; //int型の整数yを定義
		int z; //int型の整数zを定義
		
		x = 63;	// xに63を代入
		y = 18; // xに18を代入
		z = 50; // xに50を代入
		
		// x,y,zの合計値をコンソールに出力
		System.out.println("合計は" + (x + y + z) + "です。");
		// x,y,zの平均値をコンソールに出力
		System.out.println("平均は" + (x + y + z) / 3 + "です。");

	}

}
