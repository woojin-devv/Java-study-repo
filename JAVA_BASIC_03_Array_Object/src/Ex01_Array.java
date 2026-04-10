import java.util.Arrays;
/*
 * 
 * 1. new를 통해서 생성(주소 )
 * 2. heap 메모리 생성 
 * 3. 자바의 배열의 종료
 * 3.1 정적배열 : 배열의 크기가 고정되어 있다. 
 * 3.2 자바는 동적 배열이 있을까? N0; Collection (동적 배열처럼 사용)
 * 
 * */

class Car{
	int door;
}

public class Ex01_Array {
	public static void main(String[] args) {
		int s, s2, s3, s4;
		int s5;
		int s6;
		int s7;
		
		// 같은 타입의 변수 여러 개 선언 ...
		// 배열
		int[] score = new int[5];
		// 배열은 첨자로 접근 (index) : score[0], score[1]
		
		System.out.println(score[0]);
		
		score[0] = 100;
		score[1] = 200;
	    //	score[5] = 500; ArrayIndexOutOfBoundsException
		
		
		// 배열 - for 
		for (int i = 0; i < 5; i++) {
			System.out.printf("[%d]=%d \t", i, score[i]);
		}
		
		// 배열은 객체다
		// 사용자가 만드는 모든 클래스는 Object를 상속 받는다 
		// 사용자가 만드는 배열은 Object가 상속 
		
		// JAVA API : 미리 수많은 클래스 (Math ....)
		// java 초급 >> Arrays.toString(score) 쓰지말고 직접 손코딩 하세요.
		String resultArrays = Arrays.toString(score);
		System.out.println(resultArrays);
		
		// JAVA API는 수 많은 helper 클래스 :: Arrays
			
		// Today Point ;; 배열을 만드는 3가지
		int[] arr = new int[5];
		int[] arr2 = new int[] {10, 20, 30}; // 초기값을 가지고 배열의 개수 정의 
		int[] arr3 = {11, 22, 33, 44, 55}; // 컴파일러가 내부적으로는 처리를 함.
		
		// JavaScript 배열은
		// Tip const arr = [1, 2, 3, 4, 5]; let arr = []
		
		// Javascript ==> 동적 배열 
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		// 배열은 객체다 
		int[] arr4 = null; // arr4라고 하는 배열은 메모리를 가지고 있지 않다. 
		arr4 = new int[] {1,2,3,4,5}; 
		System.out.println(arr4); // 출력 >> [I@1f32e575
		
		int[] arr5 = arr4; 
		// 주소값을 할당 (같은 메모리를 바라봄)
		
//		String[] strarr = new String[]{"","",};
				
		//	char[]
		// float[]
				
		// 배열은 객체 배열만 알면 개발에서 문제가 없다.
		// 객체 배열은 방을 만드는 것과 방을 채우는 두 가지 작업 (두가지를 다 해야한다)
		Car[] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();	
 	}
}
