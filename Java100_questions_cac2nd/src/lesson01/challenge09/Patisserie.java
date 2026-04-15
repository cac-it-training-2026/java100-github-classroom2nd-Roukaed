/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");

		System.out.println("シトロンの味		・・・" + (int) cit_per + "%");
		System.out.println("ショコラの味		・・・" + (int) cho_per + "%");
		System.out.println("ピスタージュの味	・・・" + (int) pis_per + "%");

		System.out.println("\nが楽しめます！\n");

		double tc_value = (int) (cit_value * cit_per / 100) + (int) (cho_value * cho_per / 100)
				+ (int) (pis_value * pis_per / 100);
		System.out.println("\n値段は\\" + (int) tc_value / 10 * 10 + "です。\n");

		br.close();

	}
}
