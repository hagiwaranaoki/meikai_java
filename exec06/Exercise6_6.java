package exec06;
import java.util.Scanner;
public class Exercise6_6 {
	/*
	 * 関数名:main
	 * 概要:配列内の点数の合計、平均、最高、最低それぞれの点数を出力
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		
		// 文字列出力
		System.out.print("人数を入力してください:");
		// 人数を受け付け
		int number = scanner.nextInt();
		// 要素数が人数分の配列を作成
		int[] array = new int[number];
		
		// 点数を読み込むfor文
		for (int i = 0; i < number; i++) {
			// 文字列出力
			System.out.print(i + 1 + "番の点数：");
			// arrayに入力された整数値を入れる
			array[i] = scanner.nextInt();
		}
		
		// 最高点の初期化
		int maximum = array[0];
		// 最低点の初期化
		int minimum = array[0];
		// 合計点の初期化
		int sum = 0;
		// 平均点用のカウント
		int count = 0;
		
		// 各種点数を求める
		for(int i =0; i < array.length; i++) {
			// 最高点を求める
			if(array[i] > maximum) maximum = array[i];
			// 最低点を求める
			if(array[i] < minimum) minimum = array[i];
			// 合計点を求める
			sum = sum + array[i];
			// カウントのインクリメント
			count++;
		}
		// 平均点を求める
		int average = sum/count;
		
		// 合計点の出力
		System.out.println("合計点：" + sum);
		// 平均点の出力
		System.out.println("平均点：" + average);
		// 最高点の出力
		System.out.println("最高点：" + maximum);
		// 最低点の出力
		System.out.println("最低点：" + minimum);
	}

}
