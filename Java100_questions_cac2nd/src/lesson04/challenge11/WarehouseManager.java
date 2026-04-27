/**
 * 第4章 倉庫番のお仕事
 *
 * 問題11 荷物の入れ替え（三つの配列をまとめる）
 *
 * MQ運送から、新たに三つのコンテナ群を預かり
 * 委託管理を行うことになりました。
 * 三つのコンテナ群はそれぞれ5箱ずつからなり、
 * 合計すると15箱の入れ物になります。
 *
 * 併せてMQ運送から依頼があり、
 * コンテナ群のうち空き箱がいくつかあるので、
 * 空いてるところは詰めてほしいと言われました。
 * つまり、
 *
 * 有、空、有、空、有
 *
 * と並んでいた場合は、
 *
 * 有、有、有、空、空
 *
 * としてほしいという依頼です。
 *
 * 各コンテナのどの箱が空き箱なのかはランダムに決定し、
 * 空き箱である確率は1/4です。
 * 中身がある箱には1～10の何れかの数値が入り、
 * これもランダムに決定します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  MQ運送の件、お願いします。
 *
 *  Yさん：
 *  はい、まずは現状から確認いたします。
 *
 *  C...3,4,4,0,7
 *
 *  D...0,5,0,9,0
 *
 *  E...2,1,3,10,6
 *
 *  でした。直してきます...
 *
 *  Yさん：
 *  直してきました。
 *
 *  C...3,4,4,7,5
 *
 *  D...9,2,1,3,10
 *
 *  E...6,0,0,0,0
 *
 *  になりました。
 *
 *  E主任：
 *  ご苦労さまでした。
 *
 */

package lesson04.challenge11;

public class WarehouseManager {

	public static void main(String[] args) {

		//ここに必要な配列の宣言を記述する。
		int[] random = new int[5];
		int[] mqA = new int[5];
		int[] mqB = new int[5];
		int[] mqC = new int[5];

		//ここに配列に値を代入する処理を記述する。(要素はランダム)
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10 % 4);
		}

		for (int i = 0; i < mqA.length; i++) {
			if (random[i] == 0) {
				mqA[i] = 0;
			} else {
				mqA[i] = (int) (Math.random() * 10 % 9) + 1;
			}
		}
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10 % 4);
		}

		for (int i = 0; i < mqB.length; i++) {
			if (random[i] == 0) {
				mqB[i] = 0;
			} else
				mqB[i] = (int) (Math.random() * 10 % 9) + 1;
		}

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10 % 4);
		}

		for (int i = 0; i < mqC.length; i++) {
			if (random[i] == 0) {
				mqC[i] = 0;
			} else {
				mqC[i] = (int) (Math.random() * 10 % 9) + 1;
			}
		}

		System.out.println("E主任：");
		System.out.println("MQ運送の件、お願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、まずは現状から確認いたします。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < mqA.length; i++) {
			System.out.print(mqA[i]);
			if (i != (mqA.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < mqB.length; i++) {
			System.out.print(mqB[i]);
			if (i != (mqB.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < mqC.length; i++) {
			System.out.print(mqC[i]);
			if (i != (mqC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nでした。直してきます...\n");

		//ここに詰め替え処理を記述する

		//並び替え
		for (int i = 0; i < mqA.length; i++) {
			for (int j = 0; j < mqA.length - 1; j++) {
				if (mqA[j] == 0) {
					int k = j + 1;
					int keep = mqA[j];
					mqA[j] = mqA[k];
					mqA[k] = keep;
				}
			}
		}
		for (int i = 0; i < mqB.length; i++) {
			for (int j = 0; j < mqB.length - 1; j++) {
				if (mqB[j] == 0) {
					int k = j + 1;
					int keep = mqB[j];
					mqB[j] = mqB[k];
					mqB[k] = keep;
				}
			}
		}
		for (int i = 0; i < mqC.length; i++) {
			for (int j = 0; j < mqC.length - 1; j++) {
				if (mqC[j] == 0) {
					int k = j + 1;
					int keep = mqC[j];
					mqC[j] = mqC[k];
					mqC[k] = keep;
				}
			}
		}
		//カウント
		int CounterA = 0;
		for (int i = 0; i < mqA.length; i++) {
			if (mqA[i] == 0) {
				CounterA++;
			}
		}
		int CounterB = 0;
		for (int i = 0; i < mqB.length; i++) {
			if (mqB[i] == 0) {
				CounterB++;
			}
		}

		//入れ替え
		int a = 0;
		int inNum = mqB.length - CounterB;
		if (CounterA <= inNum) {
			for (int i = 0; i < CounterA;) {
				mqA[mqA.length - CounterA + a] = mqB[i];
				mqB[i] = 0;
				a++;
				i++;
			}
		} else {
			for (int i = 0; i < inNum;) {
				mqA[mqA.length - CounterA + a] = mqB[i];
				mqB[i] = 0;
				a++;
				i++;

			}

		}
		//さらに整列
		for (int i = 0; i < mqB.length; i++) {
			for (int j = 0; j < mqB.length - 1; j++) {
				if (mqB[j] == 0) {
					int k = j + 1;
					int keep = mqB[j];
					mqB[j] = mqB[k];
					mqB[k] = keep;
				}
			}
		}
		CounterB = 0;
		for (int i = 0; i < mqB.length; i++) {
			if (mqB[i] == 0) {
				CounterB++;
			}
		}
		int CounterC = 0;
		for (int i = 0; i < mqC.length; i++) {
			if (mqC[i] == 0) {
				CounterC++;
			}
		}

		//BとC入れ替え
		a = 0;
		inNum = mqC.length - CounterC;
		if (CounterB <= inNum) {
			for (int i = 0; i < CounterB;) {
				mqB[mqB.length - CounterB + a] = mqC[i];
				mqC[i] = 0;
				a++;
				i++;
			}
		} else {
			for (int i = 0; i < inNum;) {
				mqB[mqB.length - CounterB + a] = mqC[i];
				mqC[i] = 0;
				a++;
				i++;

			}

		}
		for (int i = 0; i < mqC.length; i++) {
			for (int j = 0; j < mqC.length - 1; j++) {
				if (mqC[j] == 0) {
					int k = j + 1;
					int keep = mqC[j];
					mqC[j] = mqC[k];
					mqC[k] = keep;
				}
			}
		}
		System.out.println("Yさん：");
		System.out.println("直してきました。\n");

		System.out.print("C...");

		//ここに配列Cの要素をすべて出力する処理を記述する。
		for (int i = 0; i < mqA.length; i++) {
			System.out.print(mqA[i]);
			if (i != (mqA.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nD...");

		//ここに配列Dの要素をすべて出力する処理を記述する。
		for (int i = 0; i < mqB.length; i++) {
			System.out.print(mqB[i]);
			if (i != (mqB.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.print("\n\nE...");

		//ここに配列Eの要素をすべて出力する処理を記述する。
		for (int i = 0; i < mqC.length; i++) {
			System.out.print(mqC[i]);
			if (i != (mqC.length - 1)) {
				System.out.print(",");
			}
		}

		System.out.println("\n\nになりました。\n");

		System.out.println("E主任：");
		System.out.println("ご苦労さまでした。");
	}
}
