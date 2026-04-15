package lesson01.challenge10;

public class Advertisement {
	public static void main(String[] args) {
		//		始業時間
		int start = 9;
		//		就業時間
		int end = 18;
		//		最低勤務時間
		int wttn = 3;
		//		最低勤務日/週
		int lwd = 2;
		//		時給
		int salary = 1380;

		System.out.println("新規アルバイトを募集します！");
		System.out.println("お菓子が好きな方大歓迎！！");

		System.out.println("\n募集要項\n");

		System.out.println("・勤務時間");
		System.out.println("\t" + start + "時～" + end + "時から" + wttn + "時間以上");
		System.out.println("	週" + lwd + "日以上の勤務");

		System.out.println("\n・時給");
		System.out.println("	\\" + salary + "/h");

		System.out.println("\n・待遇");
		System.out.println("	制服の貸与あり");
		System.out.println("	交通費支給");

		System.out.println("\nぜひお待ちしてます！！");
	}

}
