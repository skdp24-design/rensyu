package rensyu;

public class Cellphone {
//電話ばんご
	private String number;// 電話番ご
	private String name; // 名義
	private int baseCharge;// 基本料金
	private int unitCallCharge;// １分付き電話料金
	private int freeTraffic;// 無料通信料
	private int unitComeCharge;// 無料超過１ギガ
	private int airtime;// 通話時間
	private double traffic;// 通信用

	Cellphone(String number, String name, int baseCharge, int unitCallCharge, int freeTraffic, int unitComeCharge) {
		this.number = number;
		this.name = name;
		this.baseCharge = baseCharge;
		this.unitCallCharge = unitCallCharge;
		this.freeTraffic = freeTraffic;
		this.unitComeCharge = unitComeCharge;

		airtime = 0;
		traffic = 0;

	}

	public String getNumber() {
		return number;

	}

	public String getName() {
		return name;
	}

	public int getBaseCharge() {
		return baseCharge;
	}

	public int getUnitCallCharge() {
		return unitCallCharge;
	}

	public int getUnitComeCharge() {
		return unitComeCharge;

	}

	public int getFreetraffic() {
		return freeTraffic;

	}

	public void addAirtime(int airtime) {
		this.airtime += airtime;// 通話時間足す
	}

	public void addTraffic(double traffic) {
		this.traffic += traffic;// データ使用量足す
	}

	public int getPhoneCallFare() {
		return airtime * unitCallCharge;
		// １分通話料計算（通話時間、通話料
	}

	public int getCommuicationFare() {
		if (traffic <= freeTraffic) {
			int ret = 0;
			return ret;
		}
		return (int) Math.ceil(traffic - freeTraffic) * unitComeCharge;
	}

	public void printAccount() {
		System.out.println("電話番号: " + number);
		System.out.println("名義: " + name);
		System.out.println("通話時間: " + airtime);
		System.out.printf("通信量:%.2fGB%n ", traffic);
		System.out.println("通話料金: " + getPhoneCallFare());
		System.out.println("通信料金: " + getCommuicationFare());

		int total = baseCharge + getPhoneCallFare() + getCommuicationFare();
		System.out.println("請求料金: " + total + "円");

	}
}
