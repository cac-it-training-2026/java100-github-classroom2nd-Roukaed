package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {
	public static void main(String[] args) throws IOException {
		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println(" ゲームスタート！ ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] station = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿",
				"品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里", "駒込", "田端", "高田馬場", "神田", "鶯谷", "代々木", "新大久保", "巣鴨",
				"高輪ゲートウェイ" };

		int hantei = 0;
		int finish = 0;
		boolean flag = false;
		boolean fflag = true;
		//判定
		while (fflag) {
			while (flag != true) {
				String home = br.readLine();
				for (int i = 0; i < station.length; i++) {
					if (station[i].equals(home)) {
						hantei++;
						station[i] = "n";
					}
				}
				if (hantei == 1) {
					flag = true;
					hantei = 0;
				} else {
					System.out.print("<----------ここで入力ミス\nあなたの負けです！");
				}
			}
			//コンピューターのターン
			flag = true;
			while (flag) {
				int random = (int) (Math.random() * 30);
				if (station[random] != "n") {
					System.out.println(station[random]);
					station[random] = "n";
					flag = false;
				}
			}
			for (int i = 0; i < station.length; i++) {
				if (station[i].equals("n")) {
					finish++;
				}
			}
			if (finish == station.length) {

				System.out.println("あなたの勝ちです！");
				break;

			} else {
				finish = 0;
			}
		}
	}

}
