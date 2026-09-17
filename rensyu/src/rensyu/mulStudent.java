package rensyu;

import java.util.ArrayList;
import java.util.Scanner;

public class mulStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> StudentList = new ArrayList<>();
//アレイリスト　入れる空間が広い（学生たちを保存するスペース
		System.out.println("===学生リスト===");

		boolean isrun = true;
		//3ばんを押す前には繰り返し
		while (isrun) {
			System.out.println("\n1.　学生追加 | 2. 項目　|3. 終了");
			System.out.println("項目選択");
			int menu = sc.nextInt();
			if (menu == 3) {
				isrun = false;
				System.out.println("syuryo");
				break;
			}
//menu1 学生追加ボタン
			
			else if (menu == 1) {
				System.out.print("学生の名前ーー＞");
				String name = sc.next();
				sc.nextLine();
				System.out.print("点数入力ーー＞");
				int score = sc.nextInt();
				sc.nextLine();
				//名前と点数を受け取って生成者に渡してリストに保存
				StudentList.add(new Student(name, score));
				//追加命令ご
				System.out.println("学生情報を追加しました");

			} else if (menu == 2) {
				// 2.全てのリスト
				System.out.println("\n---[学生全体の名前]");
				if (StudentList.isEmpty()) {
					//もし空いてるリストなら
					System.out.println("\n---登録されている学生がない---");

				} else {
					for (int i = 0; i < StudentList.size(); i++) {
						Student s = StudentList.get(i);
						//for文で全ての学生出力
						System.out.println((i + 1) + ".名前: " + s.name + "/" + s.score);
						//0番から始まるので出力は１からi+1
						
					}

				}

			}

		}
	}
}
