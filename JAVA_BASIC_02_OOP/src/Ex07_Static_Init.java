/*
 * 
 * 
 * [초기화]
 * 1. static variable : 공유 자원 > 초기화 할 수 있나? (객체간)
 * 2. instance variable : 생성되는 객체마다 다른 값을 가지게 하겠다. 
 * 
 * 두 자원은 default 값을 (초기화 할 필요 없음)
 * 
 * 
 * 
 * */

class Test2{
	static int cv = 10; // 초기화
	static int cv2; // default 0
	
	int iv  = 9;
	
	static {
		// 실행 시점 : static int cv, static in cv2 클래스 영역 
		cv2 = cv + 2222;
	}
	{} // 일반 자원 초기자????????????????????????????????????????? : 생성자랑 기능이 겹쳐요 . 근데 그 활용도가 생성자가 높아요. 그래서 인기가 없어요. 몰라도 됩니다.~
	
	{
		System.out.println("일반 초기화 블럭이 실행...");
		if (iv < 10) iv = 55555;
	}
}

public class Ex07_Static_Init {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test2.cv);
		System.out.println(Test2.cv2);
		
		Test2 test2 = new Test2();
	}
}


/*
 * 1. static member field : 객체간 공유자원
 * 2. static method : 객체간 공유자
 *     
 * */

/*
 * 설계도 
 * class Car {
 *    static 함수 ... 
 * }
 * */
