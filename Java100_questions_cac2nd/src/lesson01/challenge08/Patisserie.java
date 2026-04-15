/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int cit_value = 250;
		int cho_value = 280;
		int pis_value = 320;

		int cit_quan = 30;
		int cho_quan = 30;
		int pis_quan = 30;

		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("シトロン		\\" + cit_value + "・・・残り" + cit_quan + "個");
		System.out.println("ショコラ		\\" + cho_value + "・・・残り" + cho_quan + "個");
		System.out.println("ピスタージュ	\\" + pis_value + "・・・残り" + pis_quan + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか（最大30個まで）\n");
		System.out.println("シトロン		>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cit_need = br.readLine();
		System.out.println("ショコラ		>");
		String cho_need = br.readLine();
		System.out.println("ピスタージュ	>");
		String pis_need = br.readLine();

		System.out.println("\nシトロン		" + cit_need + "個");
		System.out.println("ショコラ		" + cho_need + "個");
		System.out.println("ピスタージュ	" + pis_need + "個");

		double cit_needs = Double.parseDouble(cit_need);
		double cho_needs = Double.parseDouble(cho_need);
		double pis_needs = Double.parseDouble(pis_need);

		double sum_quan = cit_needs + cho_needs + pis_needs;
		double sum_value = (cit_value * cit_needs) + (cho_value * cho_needs) + (pis_value * pis_needs);

		System.out.println("\n合計個数		" + sum_quan + "個");
		System.out.println("合計金額		" + (int) sum_value + "個");

		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		cit_quan -= cit_needs;
		cho_quan -= cho_needs;
		pis_quan -= pis_needs;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\" + cit_value + "・・・残り" + cit_quan + "個");
		System.out.println("ショコラ		\\" + cho_value + "・・・残り" + cho_quan + "個");
		System.out.println("ピスタージュ	\\" + pis_value + "・・・残り" + pis_quan + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の合計");
		System.out.println("売上合計\\" + (int) sum_value);

		double cit_sum_value = cit_value * cit_needs;
		double cho_sum_value = cho_value * cho_needs;
		double pis_sum_value = pis_value * pis_needs;

		double cit_per = cit_sum_value / sum_value * 100;
		double cho_per = cho_sum_value / sum_value * 100;
		double pis_per = pis_sum_value / sum_value * 100;

		System.out.println("内訳");
		System.out.println("シトロン 		\\" + (int) cit_sum_value + "・・・" + (int) cit_per + "%");
		System.out.println("ショコラ 		\\" + (int) cho_sum_value + "・・・" + (int) cho_per + "%");
		System.out.println("ピスタージュ 	\\" + (int) pis_sum_value + "・・・" + (int) pis_per + "%");

		br.close();

	}

}
