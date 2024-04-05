package exec06;
// Scannerクラスのオブジェクトを作成
import java.util.Scanner;

/*
 * クラス名:Exercise6_18
 * 概要:行数・各行の列数・各要素の値を入力させ配列を作成
 * 作成者:N.Hagiwara
 * 作成日:2024/04/05
 */
public class Exercise6_18 {
	/*
	 * 関数名:main
	 * 概要:行数・各行の列数・各要素の値を入力させ配列を作成
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスのインスタンスを作成
		Scanner standardInput=new Scanner(System.in);
		//変数を宣言
		int lineNumber=0,columnNumber=0;
		//後判定ループ文
		do {
			//整数の入力を促す
			System.out.print("行数:");
			//インスタンスから入力された値を受け取る
			lineNumber=standardInput.nextInt();
		//正の数が入力されたらループ抜け
		}while(lineNumber<=0);
		//入力された行数をもとに配列を宣言
		int[][] integerArray=new int[lineNumber][];
		//カウントが行数と等しくなったらループ抜け
		for(int countValue=0;countValue<lineNumber;countValue++) {
			//後判定ループ文
			do {
				//整数の入力を促す
				System.out.print("配列integerArrayの"+(countValue+1)+"行目の列数:");
				//インスタンスから入力された値を受け取る
				columnNumber=standardInput.nextInt();
			//正の数が入力されたらループ抜け
			}while(columnNumber<=0);
			//入力された列数をもとに各行の配列を宣言
			integerArray[countValue]=new int[columnNumber];
		}
		//行数カウントが行数と等しくなったらループ抜け
		for(int lineCount=0;lineCount<integerArray.length;lineCount++) {
			//列数カウントが列数と等しくなったらループ抜け
			for(int columnCount=0;columnCount<integerArray[lineCount].length;columnCount++) {
				//要素の入力を促す
				System.out.print("integerArray["+lineCount+"]["+columnCount+"]=");
				//配列の要素を入力させ格納
				integerArray[lineCount][columnCount]=(int)standardInput.nextDouble();
			}
		}
		//行数カウントが行数と等しくなったらループ抜け
		for(int lineCount=0;lineCount<integerArray.length;lineCount++) {
			//列数カウントが列数と等しくなったらループ抜け
			for(int columnCount=0;columnCount<integerArray[lineCount].length;columnCount++) {
				//配列の要素を表示
				System.out.print(integerArray[lineCount][columnCount]+"\t");
			}
			//改行を表示
			System.out.println();
		}
	}

}
