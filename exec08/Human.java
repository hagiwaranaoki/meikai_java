package exec08;

import exec09.Day;

/*
 * クラス名:Human
 * 概要:名前、身長、体重をメンバに持ち、身体能力を出力する
 * 作成者:N.Hagiwara
 * 作成日:2024/04/09
 */
/**
 * クラスHumanは身体能力を表すクラスです。
 * @author N.Hagiwara
 *
 */
public class Human {
	// 人間の名前を保持するためのフィールド
	/**
	 * 人間の名前を表すString型のフィールドです。
	 */
	private String humanName;

	// 人間の身長を保持するためのフィールド
	/**
	 * 人間の身長を表すdouble型のフィールドです。
	 */
	private double humanHeight;

	// 人間の体重を保持するためのフィールド
	/**
	 * 人間の体重を表すdouble型のフィールドです。
	 */
	private double humanWeight;

	// 人間の誕生日を保持するためのフィールド
	/**
	 * 人間の誕生日を表すDay型のフィールドです
	 */
	private Day humanBirthday;

	/*
	* コンストラクタ名:Human
	* 概要:名前、身長、体重を初期化
	* 引数:名前(String),身長(double),体重(double)
	* 作成者:N.Hagiwara
	* 作成日:2024/04/09
	*/
	/**
	 * 人間を生成するコンストラクタです。
	 * 人間の名前、身長、体重を引数として受け取ります。
	 * @param humanName 生成する人間の名前
	 * @param humanHeight 生成する人間の身長
	 * @param humanWeight 生成する人間の体重
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
	/**
	 * 人間を生成するコンストラクタです。
	 * 人間の名前、身長、体重、誕生日を引数として受け取ります。
	 * @param humanName 生成する人間の名前
	 * @param humanHeight 生成する人間の身長
	 * @param humanWeight 生成する人間の体重
	 * @param humanBirthday 生成する人間の誕生日
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
	/**
	 * メソッドputSpecは人間の詳細情報を表す文字列を出力します。
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
	/**
	 * メソッドgetFormatは小数部がある時とない時で表記を変えます。
	 * 少数部があるときは少数部以降も表示し、少数部がない時は少数部以降を表示しません。
	 * @param doubleNumber double型の数値
	 * @return 文字列3.2または3を返却します。
	 * 					3.2と3の部分はそれぞれ与えられたdouble型の引数に応じた値です。
	 */
	public static String getFormat(double doubleNumber) {
		// 少数部があるときは小数点を出し、ない時は丸める
		return doubleNumber == (int) doubleNumber ? String.format("%d", (int) doubleNumber)
				: String.format("%s", doubleNumber);
	}

	/*
	 * 関数名:toString
	 * 概要:文字列を表示形式に則って表示
	 * 引数:なし
	 * 戻り値:表示形式に直された文字列
	 * 作成者:N.Hagiwara
	 * 作成日:2024/04/09
	 */
	/**
	 * メソッドtoStringは人間に関する情報を表す文字列返却します。
	 * @return 名前：test<br>
	 * 					身長：163<br>
	 * 					体重：54<br>
	 * 					誕生日：2000年01月01日(土)<br>
	 * 					このような形式の文字列を返却します。test、163、54、2000年01月01日(土)の部分は
	 * 					それぞれ名前、身長、体重、誕生日に応じた値です。
	 */
	public String toString() {
		// 表示形式に直した文字列を返す
		return String.format("名前：%s\n身長：%s\n体重：%s\n誕生日：%s\n", humanName, getFormat(humanHeight), getFormat(humanWeight),
				humanBirthday);
	}

	/*
	* 関数名:getBirthday
	* 概要:人間の誕生日を取得する
	* 引数:なし
	* 戻り値:誕生日を表すDay型オブジェクト
	* 作成者:N.Hagiwara
	* 作成日:2024/04/10
	*/
	/**
	 * メソッドgetBirthdayは人間の誕生日を表すDay型オブジェクトを返却します。
	 * @return 人間の誕生日を表すDay型オブジェクト
	 */
	public Day getBirthday() {
		// 誕生日を表すDay型オブジェクトを返却
		return new Day(humanBirthday);
	}
}
