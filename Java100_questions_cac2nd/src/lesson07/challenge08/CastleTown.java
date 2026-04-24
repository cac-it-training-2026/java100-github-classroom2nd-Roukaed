/**
 * 第7章 武士のお仕事
 *
 * 問題8  equals()メソッドの利用
 *
 * equals()メソッドを適切にオーバーライドする。
 *
 * 問題7で作成した藩士クラスにequals()メソッドをオーバーライドする
 * 記述を追加し、同じ藩の所属かどうか確認する処理に変更してください。
 * （※藩士クラスにフィールドprotected String domainを追記）
 * （名前と一緒に藩名もコンストラクタで設定する）
 *
 * <実行例>
 * ○△□藩の藩士を二つ作ります。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 * 拙者は○△□藩士、テスト次郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属しています】
 *
 * ○△×藩の藩士を一つ作ります。
 *
 * 拙者は○△×藩士、テスト三郎ともうす。
 *
 * 同じ藩に所属しているか確認します。
 *
 * 【同じ藩に所属していません】
 *
 */

package lesson07.challenge08;

class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	protected String domain;

	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	public String toString() {
		return "拙者は○△□藩士、" + name + "太郎ともうす。";
	}

	public boolean equals(Object object) {
		boolean match = false;
		Retainer rt = (Retainer) object;
		if (this.domain.equals(rt.domain)) {
			match = true;
		} else {
			match = false;
		}
		return match;
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("○△□藩の藩士を二つ作ります。\n");

		//ここに適切な処理を記述
		Retainer rn1 = new Retainer("テスト", "近江");
		Retainer rn2 = new Retainer("テス", "近江");

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		boolean flag = rn1.equals(rn2);
		if (flag) {
			System.out.println("同じ藩に所属しています。");
		} else {
			System.out.println("同じ藩に所属していません。");
		}

		System.out.println("\n○△×藩の藩士を一つ作ります。\n");

		//ここに適切な処理を記述
		Retainer rn3 = new Retainer("テ", "薩摩");

		System.out.println("\n同じ藩に所属しているか確認します。\n");

		//ここに適切な処理を記述
		flag = rn1.equals(rn3);
		if (flag) {
			System.out.println("同じ藩に所属しています。");
		} else {
			System.out.println("同じ藩に所属していません。");
		}

	}
}
