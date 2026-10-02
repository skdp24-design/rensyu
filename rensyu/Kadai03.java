package k02;

import java.util.Scanner;

public class Kadai03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("利率--＞");
		double rate = sc.nextDouble();
		BankAccount.setRate(rate);

		System.out.println();

		System.out.print("口座名義 -->");
		String name = sc.next();
		System.out.print("預金額 -->");
		int money = sc.nextInt();

		BankAccount s1 = new BankAccount(name, money);

		System.out.println();
		System.out.println();
		System.out.print("口座名義 -->");
		name = sc.next();
		System.out.print("預金額 -->");
		money = sc.nextInt();

		BankAccount s2 = new BankAccount(name, money);

		System.out.println();

		System.out.println("口座番号 :" + s1.getNumber());
		System.out.println("口座名義 :" + s1.getName());
		System.out.println("口座残高 :" + s1.addInterest());

		System.out.println();
		System.out.println();

		System.out.println("商品名 :" + s2.getNumber());
		System.out.println("税抜き価格 :" + s2.getName());
		System.out.println("税込価格 :" + s2.addInterest());
		System.out.println();
		System.out.println();
		System.out.print("利率--＞");
		rate = sc.nextDouble();
		BankAccount.setRate(rate);
		System.out.println();
		System.out.println();

		System.out.println("口座番号 :" + s1.getNumber());
		System.out.println("口座名義 :" + s1.getName());
		System.out.println("口座残高 :" + s1.addInterest());

		System.out.println();
		System.out.println();

		System.out.println("商品名 :" + s2.getNumber());
		System.out.println("税抜き価格 :" + s2.getName());
		System.out.println("税込価格 :" + s2.addInterest());
	}

}
