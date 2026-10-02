package k02;

public class Peroson {
	private String name; //氏名
	private int age; // 年齢

	private static int count = 0;

	Peroson(String name, int age) {

		this.name = name;
		this.age = age;
		count++;
	}

	public String getName() {

		return name;
	}

	public int getAge() {

		return age;
	}

	public static int getCount() {
		return count;
	}

}
