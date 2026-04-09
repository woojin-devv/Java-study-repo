package kr.or.kosa.common;

public class Person { //extends Object
	public String name; // instance variable (생성되는 객체마다 생성 (다른 값을 가짐 ))
	public int age; // 초기화를 하지 않아도 default 
	public boolean power; // default > false 
	// 함수의 이름은 어떤 규칙?
	// >> 내 마음이지만, 보통은 길게 씀 (이해할 수 있도록 )
	
	// 사원 테이블에 있는 모든 데이터를 가져오는 함수 이름.. 
	// [테이블 조회]
	// getAllEmpList() 
	// 사원 번호를 기준으로 한 건의 데이터를 가져오는 함수 
		// getAllEmpListByEmpno 
	
	// // [insert] public void insertEmpData()
	// // public void deleteEmpData()
	
	public void personPrint() {
		System.out.printf("이름은 %s 나이는 %d 파워는 %s 입니다 \n", name, age, power);
	}
}

/*
 1. instance variable 초기화 하지 않아도 된다 > why > default 값
 	초기화 : 변수가 처음으로 값을 할당 받는 것
 
 2. instance variable 초기화 해도 되나요? > Yes >> 
 	public int age = 1; // 필요에 따라서는 기본값 (초기값을) 설정 가능 
 	
 2.1 생성자 >> 를 사용해서 초기화 하는게 나음 >> 객체지향의 방향성 
 
 3. POINT: 거의 초기화를 하지 않음 >> public int age = 1 
 	생성자를 통해 >> 값을 받아서 초기화 >> 설계자 의도 >> 생성되는 객체마다 다른 값을 가지길..
 */

