package pos;

public class PayCheak {
	public int pay;
	public int time;
	
	public int dowork(int time) {
		pay = time * 9800;
		System.out.println("예상 급료는 " + pay + "원입니다.");
		
		return time;
	}
}
