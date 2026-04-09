package kr.or.kosa.common;

/*
  기능 (행위) : 클래스 안에 있는 기능 : method 
  
  method : 하나의 method는 하나의 기능 구현 원칙 
  만약 여러 개의 기능 (다른 기능 호출 사용)
  
  ** 모든 함수는 호출에 의해서만 동작 **
  * <웹>
  * event > load() > DOM 객체 > 메모리에 > 자동으로 사건 발생 > 사건에 대해 처리하는 핸들러 
  
  ** JAVA * 함수의 종류는 4가지 
  1. void, parameter가 있는 함수 : public void print(String str){}
  2. void, parameter가 없는 함수 : 
  3. return type이 존재하면서 parameter가 있는 함수 
  4. return type이 있으면서, parameter가 있는 함수 
  
  void: return type이 없다
  return type : 8 + 1, Array, Class, Interface, Collection 
  
  Public boolean print(){return true}
  public List<Emp> getEmpt(){ return new list = ArrayList(); list.add(new Emp()); ... return list;}
  public car print(Car car){Car c = new Car(); c.color = car.color; return c;}
  public car print(){return new Car();}
 */


public class Fclass {
	
	// 함수 접근자 : 68% public
	// 함수 private 32% : 클래스 설계 함수를 private 설계자의 의도 : 공통 함수 (클래스 내부에서 다른 함수를 도와준다 .)
	
	public int data;
	
	public void m() {
		System.out.println("일반함수 : void, parameter(x)");
	}
	public void m2(int i ) {
		System.out.println("일반함수 : void, parameter(x)");
	}
	public int m3() {
		return 1000;
	}
	public int m4(int data) {
		return 100 + data;
	}
	
	// 요기까지 ... 4가지
	// 4가지 확
	
	public int sum(int i, int j, int k) {
		return i + j + k;
	}
	
	private int subSum(int i) {
		//  객체 입장에서 접근 불가 
		return i + 100;
	}
	
	public void callSubSum() {
		int result = subSum(100);
		
		System.out.println("call result : " + result);
	}
	
	public int opSum(int data) {
		int result = subSum(data);
		
		if (result > 0) {
			return 1;
		}
		
		return -1;
	}
	/*
	 * 
	 * 함수를 만드는데	
	 * 	정수 타입의 parameter 2개를 입력 받아서 둘 중에 큰 값을 리턴하는 함수 작성
	 *  ex) max(10, 5) return 0
	 *  
	 *  
	 * 
	 * */
	
	/* return의 횟수를 줄이는 방법이 좋다........................*/
	
	public int maxNum(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
}
