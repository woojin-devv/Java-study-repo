
public class Ex02_Array_Quix {
	
	static int quiz1(){
		int[] score = new int[] {79, 88, 97, 65, 95};
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < 5; i++) {
			if (score[i] > max) {
				max = score[i];
			} 
			
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("max: " + max + "min: " + min);
		
		return 0;
	}
	
	static int quiz2(){
		
		return 0;
	}

	
	public static void main(String[] args) {
		
		
		/*
		 * Quiz 1
		 * 제어문을 통해서 max라고 하는 변수에 시험점수 중에서 가장 큰 최대값을 담
		 * min 변수에는 시험 점수 중 가장 작은 최소값을 담으세요. 
		 * 
		 * 단, for문은 한 번만 사용하여 max와 min을 사용하세요.
		 * */
		
		quiz1();
		quiz2();
		
		/*
		 * Quiz 2
		 *	
		 * 10개의 방을 1 ~ 10까지의 값을 초기화 시키고 출력하세요.
		 * 
		 * 
		 * */
		
		
		/*
		 * Quiz 3
		 *	
		 * 어느 학생의 기말고사 시험 점수 > 5 과목 시험 
		 * 
		 * */
		int[] jumsu = {100, 55, 90, 60, 78};
		int sum = 0;
		float avg = 0f; 
		/*
		 * 1. 총 과목의 수 
		 * 2. 과목의 합
		 * 3. 과목의 평균 
		 * 
		 * */
		
		/**/
		
	}
}
