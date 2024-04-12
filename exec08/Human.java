package exec08;

import exec09.Day;

/*
 * クラス名:Human
 * 概要:名前、身長、体重をメンバに持ち、身体能力を出力する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
public class Human {
	// 人間の名前を保持するためのフィールド
	private String humanName;
	// 人間の身長を保持するためのフィールド
	private double humanHeight;
	// 人間の体重を保持するためのフィールド
	private double humanWeight;
	// 人間の誕生日を保持するためのフィールド
	private Day humanBirthday;

	/*
	* コンストラクタ名:Human
	* 概要:名前、身長、体重を初期化
	* 引数:名前(String),身長(double),体重(double)
	* 作成者:N.Hagiwara
	* 作成日:2024/04/09
	*/
	public Human(String humanName, double humanHeight, double humanWeight) {
		// 引数で受け取った名前をフィールドに設定
		this.humanName = humanName;
		// 引数で受け取った身長をフィールドに設定
		this.humanHeight = humanHeight;
		// 引数で受け取った体重をフィールドに設定
		this.humanWeight = humanWeight;
	}

	/*
	* コンストラクタ名:Human
	* 概要:名前、身長、体重、誕生日を初期化
	* 引数:名前(String),身長(double),体重(double),誕生日(Day)
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	public Human(String humanName, double humanHeight, double humanWeight, Day humanBirthday) {
		// 引数で受け取った名前をフィールドに設定
		this.humanName = humanName;
		// 引数で受け取った身長をフィールドに設定
		this.humanHeight = humanHeight;
		// 引数で受け取った体重をフィールドに設定
		this.humanWeight = humanWeight;
		// 引数で受け取った日付を誕生日フィールドに設定
		this.humanBirthday = new Day(humanBirthday);
	}

	/*
	 * 関数名:putSpec
	 * 概要:Humanオブジェクトのスペックを表示する
	 * 引数:なし
	 * 戻り値:なし
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public void putSpec() {
		// 名前を表示
		System.out.println("名前：" + humanName);
		// 身長を表示
		System.out.println("身長：" + getFormat(humanHeight));
		// 体重を表示
		System.out.println("体重：" + getFormat(humanWeight));
	}

	/*
	 * 関数名:getFormat
	 * 概要:double型の数値に小数点以下がない場合表示しないようにする
	 * 引数:小数点以下を表示させたくないdouble型の変数
	 * 戻り値:String型に変換された実数値
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public static String getFormat(double doubleNumber) {
		// 小数点以下がない場合
		if (doubleNumber == (int) doubleNumber) {
			// 小数点をなくした実数値を返す
			return String.format("%d", (int) doubleNumber);
			//小数点がある場合
		} else {
			// 小数点がある実数値を返す
			return String.format("%s", doubleNumber);
		}
	}
	/*
	 * 関数名:toString
	 * 概要:文字列を表示形式に則って表示
	 * 引数:なし
	 * 戻り値:表示形式に直された文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	public String toString() {
		// 表示形式に直した文字列を返す
    return String.format("名前：%s\n身長：%s\n体重：%s\n誕生日：%s\n", humanName, getFormat(humanHeight), getFormat(humanWeight), humanBirthday);
  }
}
