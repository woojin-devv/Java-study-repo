package kr.or.kosa;

public class Car {
	int door;
	//public String color; 말도 안되는 코드 
	
	private int window; //같은 패키지 내에서만 사용할 수 있도록 제한 
	// 캡슐화 같은 package 볼 수 없다.
	// 해당 자원을 읽고 쓸 수 있는(read, write)를 method 구현 하려는 의지 
	
	// public
	// 클래스 == 설계도 == 타입 (사용자가 정의하는 큰 타입) > 클래스 이름 -> 변수명 (가능)
	
	// 클래스의 구성요소
	// 필드 + 메서드 + (생성자)
	
	// 필드 (member field) > 데이터, 정보를 담고 있다 
	// // 고유 정보, 상태 정보, 부품 정보 (엔진 : 여러 개의 자원으로 )
	// // 예시 : 색상, 속도, 엔진 
	
	// 함수 (method)
	// >> 기능 (행위) >> 한 번에 하나의 기능 >> 안 좋은 예: 자동차는 연료를 주입하며 달린다 (X)
	// + 생성자는 함수다. >> 특수 목적을 가진 함수 
	// + getter, setter >> 특수한 목적 >> 캡슐화 자원 >> read, write >> 직접할당을 막고 간접할당 
	
	// 접근자 : default (가지고 있는 기본 값), private, public, protected (상속 관계) 
	// 장소 (위치) : 폴더 (pacakge) 기반으로.. 클래스 내부, 함수 내부, 제어문 내부
	
	// 변수의 크기(?) : Static(전역 변수) > Instance ( Class내부 변수 )>  local variable > block variable
	// therefore, default 의 의미 : 같은 폴더에서만..
	// Class 
	
	// DB 테이블의 컬럼 Empno - Spring 의 dto(empno) 객체의 멤버 변수 
}

/**
 * [Java 클래스 설계 및 객체 지향 원칙]
 * * 1. 클래스(Class)의 본질
 * - 설계도이자 사용자 정의 타입(Type)
 * - 데이터(상태)와 함수(행위)의 집합
 * 
 * * 2. 필드(Member Field)
 * - 객체의 정보를 담는 저장소
 * - 고유 정보(색상), 상태 정보(속도), 부품 정보(엔진)로 구분
 * 
 * * 3. 메서드(Method)
 * - 객체의 기능과 행위를 정의
 * - 설계 원칙: 하나의 메서드는 반드시 하나의 기능만 수행할 것
 * 
 * * 4. 캡슐화(Encapsulation) 및 접근 제어
 * - private: 외부의 직접 접근을 막아 데이터를 보호
 * - Getter / Setter: 데이터에 대한 간접적인 Read/Write 통로 제공 (무결성 유지)
 * 
 * * 5. 생성자(Constructor)
 * - 객체 생성 시 호출되는 특수 목적의 함수
 * 
 * * 6. 데이터 매핑
 * - DB Table Column <-> Spring DTO/VO Member Variable
 */