package pos;

import java.util.Scanner;

public class POSmain {
	public static void main(String[] args) {
		boolean run = true;
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Account ac = new Account();
		GoodsRegistration gr = new GoodsRegistration();
		PayCheak pc = new PayCheak();
		ChangePassword cp = new ChangePassword();
		Termination t = new Termination();
		
		ac.entername(ac.getName());
		ac.enterpassword(ac.password);
		
		if(ac.getName().equals(ac.REGISTER_NAME) && ac.password == ac.REGISTER_PASSWORD) {
			long start = System.currentTimeMillis();
			System.out.println("");
			System.out.println(ac.getName() + "님 안녕하세요.");
			
			while(run) {
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------------------------------");
				System.out.println("1. 물품 등록 | 2. 물품 재고 확인 | 3. 물품 판매 | 4. 나의 예상 급료 확인 | 5. 비밀번호 변경 | 6. 종료");
				System.out.println("------------------------------------------------------------------------------------------------------");
				System.out.print("메뉴 선택>> ");
				choice = sc.nextInt();
				
				if(choice == 1) {
					gr.register();
				} else if(choice == 2) {
					
				} else if(choice == 3) {
					
				} else if(choice == 4) {
					long end = System.currentTimeMillis();
					int worktime = (int) ((end - start) / 1000.0);
					System.out.println("일한 시간: " + worktime + "초");
					pc.dowork(worktime);
				} else if(choice == 5) {
					cp.changepassword(ac.password);
				} else if(choice == 6) {
					long end = System.currentTimeMillis();
					int worktime = (int) ((end - start) / 1000.0);
					t.exit(worktime);
					run = false;
				}
				
			}
		} else {
			System.out.println("계정이 일치하지 않습니다. 프로그램을 종료합니다.");
		}
	}
}
