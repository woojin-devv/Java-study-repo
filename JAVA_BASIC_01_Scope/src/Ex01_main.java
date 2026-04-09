/*
일반적으로 프로젝트 진행하면
필요한 클래스 별도의 package를 만들어서
kr.or.kosa.dto > a.java
kr.or.kosa.dao > a.java
kr.or.kosa menu > a.java


지양해야할 것 
> import kr.or.kosa.*; (무슨 자원을 사용할 수 없음 )
>> import kr.or.kosa.Emp; 이런 형식으로 어떤 패키지에 어떤 클래스를 사용해줄 것인지에 대해 명시해줘야한다.
*/

import kr.or.kosa.Emp;

class Emp2 { //default 
	
}

class Dept { //default class Dept
	int deptno; //default int deptno
    String dename; // 그대로 (문법 (문제 없다) (X)
	private int count; // 직접할당 (X) but, 간접할당 (O)
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int num) {
		if (num < 0) {
			count = 0;
		} else {
			count = num;
		}
	}
}

// 연습용 (class Dept) > 접근자를 쓰지 않는 ; 접근자 생략 > Default > 같은 폴더에서만 .. 

public class Ex01_main {
	public static void main(String[] args) {
		Emp emp = new Emp();
	}

}
