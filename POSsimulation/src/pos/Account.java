package pos;

import java.util.Scanner;

public class Account {
	public String REGISTER_NAME = "김재현";
	public int REGISTER_PASSWORD = 20171442;
	public String name;
	public int password;
	
	Scanner sc = new Scanner(System.in);
	
	public void entername(String name) {
		System.out.print("이름: ");
		this.name = sc.nextLine();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int enterpassword(int password) {
		System.out.print("비밀번호: ");
		this.password = sc.nextInt();
		
		return password;
	}

	
}
