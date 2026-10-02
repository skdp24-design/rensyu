package k02;

public class Student {
	private String number;
	private String name;
	private int score; //点数

	private static int counter = 101;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
		this.number = "22JN0" + counter;
		counter++;
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;

	}

	public int getScore() {
		return score;
	}

	public static int getCounter() {
		return counter;
	}

	public String getGrade() {
		String grade = "";
		if (this.score >= 90) {
			grade = "S";
		}
		if (this.score < 90) {
			grade = "A";
		}
		if (this.score < 80) {
			grade = "B";
		}
		if (this.score < 70) {
			grade = "C";

		}
		if (this.score < 60) {
			grade = "D";

		}
		

		return grade;
	}
}
