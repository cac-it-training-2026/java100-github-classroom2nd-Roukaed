/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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
		System.out.println("シトロン");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cit_need = br.readLine();
		System.out.println("ショコラ");
		String cho_need = br.readLine();
		System.out.println("ピスタージュ");
		String pis_need = br.readLine();

		System.out.println("シトロン		" + cit_need + "個");
		System.out.println("ショコラ		" + cho_need + "個");
		System.out.println("ピスタージュ	" + pis_need + "個");

		System.out.println("\nをお買い上げですね\n");
		System.out.println("承りました。");

		br.close();

	}

}
