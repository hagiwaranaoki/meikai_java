package exec06;
import java.util.Scanner;
public class Exercise6_8 {
	/*
	 * 関数名:main
	 * 概要:double型の配列の全要素の合計点と平均店を求める
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2024/04/03
	 */
	public static void main(String[] args) {
		// Scannerオブジェクト作成
		Scanner scanner = new Scanner(System.in);
		// 文字列出力
		System.out.print("要素数：");
		// int型の数値を受け付ける
		int number = scanner.nextInt();
		
		// 点数を入れる用の配列
		double[] point = new double[number];
		
		// 配列に点数を入れていく
		for (int i = 0; i < point.length; i++) {
			// 文字列出力
			System.out.print(i + 1 + "番目：");
			// 配列に入れる点数を受け付け
			point[i] = scanner.nextDouble();
		}
		
		// 合計値の初期化
		double sum = 0;
		// 平均のためのカウント
		int count = 0;
		// 合計とカウントを計算
		for (double i: point) {
			// 合計を計算
			sum += i;
			// カウントをインクリメント
			count++;
		}
		// 平均を計算
		double average = sum/count;
		
		//合計点を出力
		System.out.println("合計点：" + sum);
		//平均点を出力
		System.out.println("平均点：" + average);
	}

}
