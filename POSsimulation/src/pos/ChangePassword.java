package pos;

import java.util.Scanner;

public class ChangePassword extends Account {
	Scanner sc = new Scanner(System.in);
	
	public int changepassword(int password) {
		System.out.println("");
		System.out.println("현재 비밀번호는 " + REGISTER_PASSWORD + "입니다.");
		System.out.println("");
		System.out.println("새로운 비밀번호을 입력해주세요.");
		System.out.print(">>");
		password = sc.nextInt();
		REGISTER_PASSWORD = password;
		System.out.println("");
		System.out.println("[저장 완료]");
		
		return password;
	}
}
