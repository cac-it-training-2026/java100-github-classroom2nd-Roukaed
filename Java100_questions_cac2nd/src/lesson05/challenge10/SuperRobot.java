package lesson05.challenge10;

import java.util.Random;

class SRobot {

	private static final String[] COURSES = {
			"フレンチ", "和食", "イタリアン"
	};

	private Random random = new Random();

	public void cookLuxuryMeal() {
		String course = COURSES[random.nextInt(COURSES.length)];
		cookLuxuryMeal(course);
	}

	public void cookLuxuryMeal(String course) {
		System.out.println("=== " + course + " 豪華コース開始 ===");

		switch (course) {
		case "フレンチ":
			System.out.println("フォアグラのソテー...");
			System.out.println("トリュフ香るスープ...");
			System.out.println("和牛のロッシーニ風...");
			break;

		case "和食":
			System.out.println("伊勢海老のお造り...");
			System.out.println("松茸の土瓶蒸し...");
			System.out.println("A5和牛のすき焼き...");
			break;

		case "イタリアン":
			System.out.println("キャビアのブルスケッタ...");
			System.out.println("ポルチーニのリゾット...");
			System.out.println("トリュフのパスタ...");
			break;

		default:
			System.out.println("シェフおまかせスペシャル...");
		}

		System.out.println(" 豪華料理完成！ ");
	}

	public static void showInfo() {
		System.out.println("SuperRobot：最高級料理を自動で作るAI搭載ロボット");
	}
}

public class SuperRobot {
	public static void main(String[] args) {

		SRobot sr = new SRobot();
		sr.cookLuxuryMeal();
	}
}