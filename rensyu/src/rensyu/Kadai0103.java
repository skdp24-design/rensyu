package rensyu;

import java.util.Scanner;

public class Kadai0103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("電話番号-->");
		String number = sc.next();
		System.out.print("名義-->");
		String name = sc.next();
		System.out.print("基本料金-->");
		int baseCharge = sc.nextInt();
		System.out.print("1分当たりの料金-->");
		int unitCallCharge = sc.nextInt();

		System.out.print("無料通信量（GB）-->");
		int freeTraffic = sc.nextInt();
		System.out.print("無料超過の1GB当たりの通信料金-->");
		int unitComeCharge = sc.nextInt();

		Cellphone cellp = new Cellphone(number, name, baseCharge, unitCallCharge, freeTraffic, unitComeCharge);

		System.out.println("電話番号：" + cellp.getNumber());
		System.out.println("名義：" + cellp.getName());
		System.out.println("基本料金：" + cellp.getBaseCharge());
		System.out.println("1分当たりの料金：" + cellp.getUnitCallCharge());
		System.out.println("無料通信量：" + cellp.getFreetraffic());
		System.out.println("無料超過の1GB当たりの通信料金：" + cellp.getUnitComeCharge());
		System.out.println();
		System.out.println("メニュー選択");
		System.out.println("1:電話");
		System.out.println("２:通信");
		System.out.println("9:終了");
		boolean isrun = true;
		while (isrun) {

			System.out.print("選択-->");
			int menu = sc.nextInt();

			if (menu == 9) {
				System.out.println("終了");
				isrun = false;
				break;
			}
			if (menu == 1) {
				System.out.println("通話時間-->");
				int airtime = sc.nextInt();
				cellp.addAirtime(airtime);

			} else if (menu == 2) {
				System.out.println("通信量-->");
				double traffic = sc.nextDouble();
				cellp.addTraffic(traffic);
				
			}

		}
		cellp.printAccount();
		sc.close();

	}

}
