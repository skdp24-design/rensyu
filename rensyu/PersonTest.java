package k02;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("count :" + Peroson.getCount());

		System.out.print("name -->");
		String name = sc.next();
		System.out.print("age -->");
		int age = sc.nextInt();
		Peroson p1 = new Peroson(name, age);
		System.out.println();
		System.out.print("name -->");
		name = sc.next();
		System.out.print("age -->");
		age = sc.nextInt();
		Peroson p2 = new Peroson(name, age);
		System.out.println();
		System.out.print("name -->");
		name = sc.next();
		System.out.print("age -->");
		age = sc.nextInt();
		Peroson p3 = new Peroson(name, age);
		
		System.out.println(p1.getName() + "\t" + p1.getAge());
		System.out.println(p2.getName() + "\t" + p2.getAge());
		System.out.println(p3.getName() + "\t" + p3.getAge());

		System.out.println();
		System.out.println("count :" + Peroson.getCount());

	}

}
