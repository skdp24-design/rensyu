package k02;

public class BankAccount {
	private String number;
	private String name;
	private int money;

	private static double rate; // 利率;
	private static int counter = 1001;

	BankAccount(String name, int money) {
		this.number = number;
		this.money = money;
		this.name = name;
		this.number = "F" + counter;
		counter++;

	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;

	}

	public int getMoney() {
		return money;

	}

	public static void setRate(double rate) {
		BankAccount.rate = rate;
	}

	public int addInterest() {
		this.money += (int) money * (rate/100);
		return this.money;
	}

	public static double getRate() {
		return rate;
	}

}
