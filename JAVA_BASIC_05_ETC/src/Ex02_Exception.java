
public class Ex02_Exception {
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		int num = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			result = num / (int)(Math.random() * 10);
			System.out.println("result :" + result + "i : " + i);
		}
		
		try {
			for(int i = 0; i < 10; i++) {
				result = num / (int)(Math.random() * 10);
				System.out.println("result : " + result + "i : " + i);
			}
		}catch(Exception e) {
			System.out.println("문제 발생 관리자에게 알려주세요. 로그기록 ");
			System.out.println("원인 : ");
		}
		
		System.out.println("main end");
	}
}
