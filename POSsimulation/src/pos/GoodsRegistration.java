package pos;

import java.util.Scanner;

public class GoodsRegistration implements Goods {
	public String[] goods = new String[7];
	
	Scanner sc = new Scanner(System.in);
	
	public void register() {
		System.out.println("");
		System.out.println("< 새로운 물품의 정보를 입력해주세요 >");
		System.out.print("물품 이름:  ");
		goods[1] = sc.nextLine();
		System.out.print("물품 가격: ");
		goods[2] = sc.nextLine();
		System.out.print("물품 개수: ");
		goods[3] = sc.nextLine();
		System.out.print("물품 폐기 날짜: ");
		goods[4] = sc.nextLine();
		System.out.print("물품 성인 확인( Y / N ): ");
		goods[5] = sc.nextLine();
	}
}
