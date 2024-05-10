package id;
// カレンダーモジュールのオブジェクトをすべてインポート
import static java.util.Calendar.*;

// GregorianCalendarクラスをインポート
import java.util.GregorianCalendar;

/*
 * クラス名:DateId
 * 概要:日付をもとにidを割り当てる
 * 作成者:N.Hagiwara
 * 作成日:2024/04/12
 */
public class DateId {
	// 何番までの識別番号を与えたか
	private static int counter;
	// 識別番号を定義
	private int id;
	//静的初期化子で初期化
	static {
		//GregorianCalendarオブジェクトを作成
		GregorianCalendar today = new GregorianCalendar();
		// 今日の年を定義
		int y = today.get(YEAR); 
		// 今日の月を定義
		int m = today.get(MONTH) + 1;
		// 今日の日を定義
		int d = today.get(DATE);

		// 今日の日付を表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		// カウンターに今日の日付の数値を入れる
		counter = y * 1000000 + m * 10000 + d * 100;
	}

	/*
	* コンストラクタ名:DateId
	* 概要:識別番号を生成する
	* 引数:なし
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public DateId() {
		// 識別番号をカウンターの数にする
		id = ++counter; 
	}

	/*
	 * 関数名:getId
	 * 概要:識別番号を取得
	 * 引数:なし
	 * 戻り値:int型の識別番号
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/10
	 */
	public int getId() {
		// 識別番号を返す
		return id;
	}
}
