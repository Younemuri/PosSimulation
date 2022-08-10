package pos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Goods extends DB {
	public List<String> goods_list = Arrays.asList( "사과", 	 // 1
			  									    "바나나",    // 2
			  									    "담배",      // 3
			  										"칫솔",      // 4
			  										"소주",      // 5
			  										"맥주",      // 6
			  										"유우",      // 7
			  										"커피",      // 8
			  										"핫바",      // 9
													"떡복기" );  // 10
	public String goods_name; 
	
	Scanner sc = new Scanner(System.in);
	
	public void entergoods() {
		System.out.println("");
		System.out.println("물품을 등록해주세요.");
		
		System.out.print(">>");
		this.goods_name = sc.nextLine();
		
		goods_list.add(goods_name);
		System.out.println("");
		System.out.println("[저장완료]");
	}
	
	public void lookgoods() {
		System.out.println("");
		
		for(String name: goods_list) {
			System.out.println("물품 이름: " + name);
		}
	}
	
	public void sellgoods() {
		System.out.println("");
		System.out.println("판매할 물품을 입력해주세요");
		System.out.print(">>");
		this.goods_name = sc.nextLine();
		
	    goods_list.remove(this.goods_name);
	}
}
