/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
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
 */

package lesson01.challenge07;

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

		br.close();

	}

}
