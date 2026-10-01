package rensyu;
import java.util.Scanner;
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.print("学生番号ーー＞");
int no = sc.nextInt();
System.out.println("nameーー＞");

String name =sc.next();
Student3 student1 = new Student3(name);
System.out.print("学生番号ーー＞");
no = sc.nextInt();
System.out.println("nameーー＞");

name =sc.next();
Student3 student2 = new Student3(name);
System.out.println();
student1.print();
student2.print();
Student3.initbaseno();
System.out.print("学生番号ーー＞");
no = sc.nextInt();
System.out.println("nameーー＞");

name =sc.next();
Student3 student4 = new Student3(name);
System.out.print("学生番号ーー＞");
no = sc.nextInt();
System.out.println("nameーー＞");
student4.print();
	}

}
