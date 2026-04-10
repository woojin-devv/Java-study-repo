
public class Ex03_Array_for {
	// 개선된 for 문 
	/* 
	 * Today Point
	 * for 문 > 향상된 for문 , 개선된 for문 
	 * JAVA: for(Type 변수명 : 배열 or Collection)
	 * C# : for(Type 변수명 in 배열 or Collection) 
	 * javascript : for(let index in 배열 ){} .. for(let value of 배열) {}
	 * 
	 * */
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int value : arr) {
			System.out.println(value);
		}
		
		String[] strarr = {"A", "B", "C", "D", "FFFFF"};
		for (String string : strarr) {
			System.out.println(string);
		}
	}
}
