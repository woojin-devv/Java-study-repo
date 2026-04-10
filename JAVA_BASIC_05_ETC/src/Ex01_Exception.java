/*
 * 
 * 오류 >> 
 * 	1. 에러 (error) : 네트워크 장애, 메모리, 하드웨어 >> 개발자가 코드적으로 해결 불가 
 * 	2. 예외 (exception) : 개발자가 처리해야 하는 문제 >> 개발자가 코드 실수 발생 문제 >> 문제 발생 원인 파악 >> 수정 >> 배포 
 *  3. 예외처리 : 문제 원인 파악 > 일단 실행 
 *  	- 컴파일이 안 됨 (해결 ..)
 * 		- 런타임 실행 도중 >> 문제 >> 강제 종료 >> 문제가 생긴 시점 >> 그 이후 코드는 실행이 안 됨 
 * 		- 예외처리 : 프로그램이 안정적으로 종료 -> 그리고 -> 분석(로그, 상태코드)
 * 			분석이 끝나면 > 코드 수정 > 재배포 
 * 		try {
 * 			>> 문제 의심 되는 코드 
 * 			>> 문제가 발생되면 >> 그 문제를 담을 수 있는 객체가 자동으로 만들어 
 * 				>> 해당 객체에 정보가 담겨서 catch 던져진다. 
 * 			ex) [0][1][2] >> [3] = 100 ; 예외 발생 -> new ArrayIndexOutofBoundException 
 * 		} catch(Exception e){ // Exception e ; e라는 변수가 예외 객체의 주소를 받는다. 
 * 			>> 문제파악 (결과 - 출력)
 * 			>> 처리 (코드가 자동 수정되진 않는다.)
 * 				>> 보고
 * 				>> 1. 관리자 (email) 
 * 				>> 2. 로그 기록 (장애 발생 기록)
 * 				강제 종료는 막아짐.
 * 		} finally {
 * 			>> 문제가 발생하던, 발생하지 않던 강제적 실행되는 코
 * 			>> 함수 종료 방법 (return, kill)
 * 				- finally를 타고 빠짐 (함수에 return을 걸어도 타고 빠짐)
 * 			>> DB 작업 (자원 해제)
 * 			>> conn.close()
 * 		}
 * */

public class Ex01_Exception {
		public static void main(String[] args) {
//			System.out.println("main start");
//			System.out.println(0/0);
//			System.out.println("main end");
			try {
				System.out.println(0/0);
				}catch(Exception e){
					e.printStackTrace();
				}
			System.out.println("main end");
		}
}
