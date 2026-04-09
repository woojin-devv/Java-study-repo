package kr.or.kosa.common;


// 1차 완성본 
// 나중에 2차 완성본 ..
public class AirPlane {
	private int airNum;
	private String airName;
	// 객체간 공유 자원 (static)
	private static int airTotalCount; //공유되면서 증가해야 하기 때문에 static 선언 

	/*
	 * 
	 * 
	 * 우리 회사는 비행기를 주문 제작 판매하는 회사입니다. 
	 * 우리 회사는 비행기를 생산하는 설계도를 만들려고 합니다. 
	 * 
	 * 
	 * 요구사항
	 * 1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 한다.
	 * 2. 비행기가 생산되면 비행기의 이름과 번호가 맞게 부여되었는지 확인하는 작업
	 * 3. 공장장은 현재까지 만들어진 비행기의 총 누적 대수를 확인할 수 있다. (기능) 출력
	 * 		단, 제약 사항)
		 * 		생성자 사용 금지 
		 *		this 사용 금지 
	 *			>> 변수, 함수, 접근 제한자 
	 *
	 
	 	객체 한개 비행기 한대 
	 	AirPlane air707 = new AirPlane()
	 	air707.자원 = "대한항공"
	 	air707.자원 = 707
	 	
	 	정보확인 
	 	
	 	총 2
	 * 
	 */
	public void makeAirPlane(int num, String name) {
		airNum = num; 
		airName = name;
		airTotalCount++;
		airDisplay();
	}
	
	private void airDisplay() {
		System.out.printf("번호[%d], 이름[%s] \n", airNum, airName);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("비행기[%d], 이름[%s] \n", airNum, airName);
	}
	
}
