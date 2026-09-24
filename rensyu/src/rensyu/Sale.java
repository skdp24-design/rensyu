package rensyu;

public class Sale {
//インスタンス変数　修飾
	private int[] no = { 1, 2, 4, 5, 8, 9, 10, 12 };
	private int[] price = { 230, 315, 198, 520, 450, 180, 320, 760 };
	private int[] num = new int[8];
//販売数量初期化する

//引数なしのコンストラクタ　配列num初期化

	Sale() {
		for (int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
	}
//get no　メッソドの宣言　引数なし　戻り値（の型int配列
// no[i] --> no2[i]　複写

	public int[] getNo() {

		int[] no2 = new int[no.length];

		for (int i = 0; i < this.no.length; i++) {
			no2[i] = no[i];
		}

		return no2;
	}
//addNum メッソド宣言　引数は(int no, int num) 戻り値（の型int）
	// 引数を受け取った商品番号がno配列の何番目が調べ、
//num 配列の同じ場所に引数で受け取った数量を追加します

	public int addNum(int no, int num) {
		int ret = -1;
		for (int i = 0; i < this.no.length; i++) {
			if (this.no[i] == no) {
				this.num[i] += num;
				ret = 0;

			}
		}
		return ret;

	}

	// getSalese メッソドの宣言引数なし、戻り値（の型)int型の配列
	public int[] getSales() {
		int[] sales = new int[price.length];
		for (int i = 0; i < sales.length; i++) {
			sales[i] = price[i] * num[i];
		}
		return sales;
	}

}
