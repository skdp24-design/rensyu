package rensyu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class buffer {
	// 💡 BufferedReader를 쓸 때 예외 처리를 위해 반드시 붙여야 하는 'throws IOException'
	public static void main(String[] args) throws IOException {

		// 1. 키보드로 친 글자들을 한 번에 많이 실어 오는 대형 트럭(br)을 만듭니다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("띄어쓰기가 포함된 문장을 입력하고 엔터를 치세요:");

		// 2. 아래 한 줄이 작동하는 핵심 순서입니다.
		// [순서 ①] br.readLine() 으로 사용자가 키보드로 친 문장 전체를 통째로 낚아챕니다. (예: "4 5")
		// [순서 ②] .replaceAll(" ", "") 으로 문장 안의 모든 띄어쓰기(" ")를 찾아내어 텅 빈 칸("")으로 싹 지워버립니다.
		// [순서 ③] System.out.print(...) 가 공백이 사라진 최종 결과물("45")을 화면에 출력합니다.
		System.out.print(br.readLine().replaceAll(" ", ""));

	}
}
