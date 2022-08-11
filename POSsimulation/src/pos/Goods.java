package pos;

import java.util.Scanner;

public class Goods extends DB {
	public String goods_name;
	
	Scanner sc = new Scanner(System.in);
	
	public void entergoods() {
		System.out.println("");
		System.out.println("물품을 등록해주세요.");
		System.out.print(">>");
		this.goods_name = sc.nextLine();
		
		try {
			goods_list.add(goods_name);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("");
		System.out.println("[저장완료]");
	}
	
	public void lookgoods() {
		System.out.println("");
		
			for(String name: goods_list) {
				System.out.println(name);
		}
		System.out.println("");
	}
	
	public void sellgoods() {
		System.out.println("");
		System.out.println("판매할 물품을 입력해주세요");
		System.out.print(">>");
		this.goods_name = sc.nextLine();
		
	    try {
	    	goods_list.remove(this.goods_name);
		} catch (Exception e) {
			// TODO: handle exception
		}
	    System.out.println("");
		System.out.println("[저장완료]");
	}
}
