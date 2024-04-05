package exec06;
// Randomクラスのインポート
import java.util.Random;
// Scannerクラスのインポート
import java.util.Scanner;

/*
 * クラス名:Exercise6_13
 * 概要:配列aの全要素を配列bに対して逆順にコピーする(二つの配列の要素数は同列と仮定)
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_13 {
	/*
	 * 関数名:main
	 * 概要:配列aの全要素を配列bに対して逆順にコピーする(二つの配列の要素数は同列と仮定)
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		//Randomクラスのオブジェクトを作成
		Random randomValue=new Random();

		//Scannerクラスのオブジェクトを作成
		Scanner standardInput=new Scanner(System.in);
		//入力値を代入する変数を宣言
		int elmentCount=0;
		//乱数生成の範囲を格納する定数を宣言
		final int RANDOM_RANGE=90;

		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("要素数:");
			//インスタンスから入力された値を受け取る
			elmentCount=standardInput.nextInt();
		//正の数が入力されたらループ抜け
		}while(elmentCount<0);
				
		//並べ替え前の配列を宣言
		int[] beforeArray=new int [elmentCount];
		//並べ替え後の配列を宣言
		int[] afterArray=new int [elmentCount];
		
		//メッセージを表示
		System.out.print("beforeArray={");
		//カウントが要素数と等しくなったらループ抜け
		for(int countValue=0;countValue<elmentCount;countValue++) {
			////要素数分の乱数を生成してシャッフル前の配列に代入
			beforeArray[countValue]=randomValue.nextInt(RANDOM_RANGE);
			//シャッフル前の配列の中身を表示
			System.out.print(" "+beforeArray[countValue]);
		}
		//｝を表示
		System.out.println(" }");
		//カウントダウン用変数を宣言
		int countDownValue=elmentCount-1;
		//カウントアップが要素数と等しくなったらループ抜け
		for(int countUpValue=0;countUpValue<elmentCount;countUpValue++) {
			//並べ替え前の配列の要素を後ろから並べ替え後の配列に前から格納
			afterArray[countUpValue]=beforeArray[countDownValue];
			//カウントダウン変数とデクリメント
			countDownValue--;
		}
		//メッセージを表示
		System.out.print("配列を逆順に並び替えました。\n"+"afterArray={");
		//カウントが要素数を超えたらループ抜け
		for(int countValue=0;countValue<elmentCount;countValue++) {
			//シャッフル後の配列の全要素を表示
			System.out.print(afterArray[countValue]+" ");
		}
		//}を表示
		System.out.print("}");
	}

}
