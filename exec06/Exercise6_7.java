package exec06;

import java.util.Random;
import java.util.Scanner;

public class Exercise6_7 {
	/*
	 * 関数名:main
	 * 概要:配列に探索するキー値が複数含まれる場合最も末尾に位置する要素を探索して表示
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:hagiwara
	 * 作成日:2023/04/03
	 */
	public static void main(String[] args) {
		// Randomオブジェクト作成
		Random randomGeneration=new Random();
		// Scannerオブジェクト作成
		Scanner scanInteger=new Scanner(System.in);
		//要素数を格納する変数をfinalで宣言
		final int count=12;
		//int型配列を宣言
		int[] integerArray=new int[count];
		//乱数生成の範囲指定用変数を宣言
		int range=10;
				
		
		//カウントが入力値と等しくなったらループ抜け
		for(int countValue=0;countValue<count;countValue++) {
			//配列の全要素を乱数で埋める
			integerArray[countValue]=randomGeneration.nextInt(range);
		}
		
		//文字列出力
		System.out.print("配列integerArrayの全要素の値\n{ ");
		//カウントが要素数と等しくなったらループ抜け
		for(int countValue=0;countValue<count;countValue++) {
			//文字列出力
			System.out.print(integerArray[countValue]+" ");
		}
		//文字列出力
		System.out.println("}");
		
		//入力値を代入する変数を宣言
		int inputValue=0; 
		//後判定ループ文
		do {
			//文字列出力
			System.out.print("探す数値:");
			//インスタンスから入力された値を受け取る
			inputValue=(int)scanInteger.nextDouble();
		//正の数が入力されたらループ抜け
		}while(inputValue<0);
		//カウント用変数を宣言
		int countValue=0;
		//配列の最大インデックスからデクリメントして０になったらループ抜け
		for(countValue=count-1;countValue>-1;countValue--) {
			//探す数値と要素が等しい場合
			if(integerArray[countValue]==inputValue) {
				//ループ抜け
				break;
			}
		}
		//カウントが０以上の場合
		if(countValue>=0) {
			//文字列出力
			System.out.println("それは"+countValue+"番目にあります。");
		//カウントが０の場合
		}else {
			//文字列出力
			System.out.println("それはありません。");
		}
	}

}
