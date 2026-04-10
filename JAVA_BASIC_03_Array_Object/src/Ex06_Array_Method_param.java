class Human{
	String name;
}

class Test{
	
	int add(int i, int j) {
		return i+j;
	}
	
	void add(Human human) {
		System.out.println(human.name);
	}
	
	int add(int param) {
		return param + 100;
	}
	
	int[] add(int[] params) {
		int[] target = new int[params.length];
		for (int i =0; i < target.length; i++) {
			target[i] = params[i]+1;	
		}
		return target;
		
	}
}

public class Ex06_Array_Method_param {
	public static void main(String[] args) {
		Test test = new Test();
		
		
	}

}
