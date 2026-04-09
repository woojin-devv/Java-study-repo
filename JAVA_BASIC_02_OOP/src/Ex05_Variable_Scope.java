class VariableClass {
	int iv;
	/*
	 *  1. member field, instance variable (생성되는 객체마다 다른 값을 가질 수 있다.)
	 *  2. iv는 언제 메모리(힙)에 올라가나(= 메모리에 언제 올라감?)?
	 *  	- 메모리에 올라갈 때 >> 
	 *  		- heap >> new VariableClass()
	 *  3. 목적 : 데이터 자료를 담을 목적 
	 * */
	
	static int cv; // 해당 객체는 공유자원 
	
	/*
	 * 1. class Variable (클래스 변수) >> static variable (객체간 공유 자원)
	 * 2. 객체간 공유 자원 (모든 객체가 공유하는 자원)
	 * */
	
	void method () {
		int lv = 0;
		for (int i = 0; i<= 100; i++) {
			VariableClass variableClass = new VariableClass();
			
		}
	}
}


public class Ex05_Variable_Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableClass vc  = new VariableClass();
		vc.iv = 200;
		vc.method();
		vc.cv = 200;
	}
}

/*
 * 1. instance variable  >> 클래스 아래에 만들어지는 변수 
 * 		예) class Car { private String color }
 * 1.1 생성되는 객체마다 다른 값을 가질 수 있다.
 * 1.2 default 값을 가지고 있다... 초기화를 한다면 생성자 ..
 * 
 * 2. local variable
 * 2.1 public void run(){ int speed; }
 * 2.2 초기화 필요 
 * 
 * 3. block variable 제어문 안에 있는 변수 >> 제어문이 끝나면 소멸 
 * 
 * Today Point
 * 4. Static variable
 * 	  static variable >> 공유자원 (heap 생성된 객체간 공유 자원)
 * 		>> 객체 생성 이전에 memory 올라가는 자원 (클래스 또는 메서드 영역)
 * 			1. 설계도 > 2. 구체화 > 3. new			
 * 
 */