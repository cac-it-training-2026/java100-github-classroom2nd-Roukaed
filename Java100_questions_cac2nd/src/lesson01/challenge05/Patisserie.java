/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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

		int cit_needs = Integer.parseInt(cit_need);
		int cho_needs = Integer.parseInt(cho_need);
		int pis_needs = Integer.parseInt(pis_need);

		int sum_quan = cit_needs + cho_needs + pis_needs;
		int sum_value = (cit_value * cit_needs) + (cho_value * cho_needs) + (pis_value * pis_needs);

		System.out.println("\n合計個数		" + sum_quan + "個");
		System.out.println("合計金額		" + sum_value + "個");

		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		br.close();

	}

}
