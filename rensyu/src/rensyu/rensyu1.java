package rensyu;

import java.util.Scanner;

public class rensyu1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		int temp;

		for (int i = 0; i < ary.length ; i++) {
			System.out.println("入力ーー＞");
			ary[i] = sc.nextInt();

		}

		// i = 何回目の比較（何周目）か
		// 配列の要素は5個だが、比較は最大4周で完了するので -1
		for (int i = 0; i < ary.length - 1; i++) {

			// j = 現在どの位置を比較しているか
			// ary[j] と ary[j + 1] を比較する
			// i回目が終わると右側のi個は並び替え済みなので、比較範囲を1つ減らす
			for (int j = 0; j < ary.length - 1 - i; j++) {

				// 現在の位置の数字が右隣より大きければ入れ替える
				if (ary[j] > ary[j + 1]) {

					// ary[j] の値を一時的に保存する
					// 値が消えないようにする
					temp = ary[j];

					// 右隣の値を現在の位置に入れる
					ary[j] = ary[j + 1];

					// 保存しておいた値を右隣に入れる
					ary[j + 1] = temp;
				}
			}
		}

		// 並び替えた配列を表示する
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
}