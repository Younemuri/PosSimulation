package pos;

public class Termination extends PayCheak {
	
	public int exit(int time) {
		pay = time * 9800;
		System.out.println("");
		System.out.println("나의 급료: " + pay + "원");
		System.out.println("오늘 하루도 수고하셨습니다.");
		
		return time;
	}
}
