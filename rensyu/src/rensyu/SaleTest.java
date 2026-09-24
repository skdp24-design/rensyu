package rensyu;

import java.util.Scanner;

public class SaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// インスタンシ生成。参照変数名sale
		Sale sale = new Sale();
		// sale オブゼクトから商品番号配列を取得（変数配列no)
		int[] no = sale.getNo();

		// 商品番号配列の先頭から繰り返し、商品番号表示。販売数量入力
		for (int i = 0; i < no.length; i++) {
			System.out.print("no:" + no[i] + " "+ "num-->");
			int num = sc.nextInt();
			sale.addNum(no[i], num);
		}
		// saleオブゼクトから販売配列を取得する、変数配列名は(sales)
		int[] sales = sale.getSales();
		// -->saleのgetSales メソッドを呼び出して値を受け取る

//販売額の降順に配列、販売額の移動の際は商品番号も同じ場所（要素番号に移動する
		for (int i = 0; i < sales.length - 1; i++) {
			for (int j = i + 1; j < sales.length; j++) {
				if (sales[i] < sales[j]) {
					int temp = sales[i];
					sales[i] = sales[j];
					sales[j] = temp;
					// 商品番号も
					int tempno = no[i];
					no[i] = no[j];
					no[j] = tempno;
				}
				// 商品番号と販売額を表示

			}

		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < no.length; i++) {
			System.out.println("no:" + no[i] + " " + sales[i]);

		}
		no = sale.getNo();
		sales = sale.getSales();

		System.out.println();
		System.out.println();
		
		for (int i = 0; i < no.length; i++) {
			System.out.println("no:" + no[i] + " " + sales[i]);
		}
		sc.close();
	}

}
