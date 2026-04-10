class Human {
	String name;
	int age;

}

class OverT{
	int add(int i) {
		return 100 + i; 
	}
	
	int add(int i, int j) {
		return i+j;
	}
	
	String add(String str) {
		return "hello" + str;
	}
	
	// a
	void add(Human human) {
		human.age = 100;
		human.name = "홍길동";
		
	}
	// b
	void add(Human h, Human h2) {
		System.out.println(h + " : " + h2);
	}
	// a와 b는 이름은 같지만 다른 기능을 하는 함수 
}

public class Ex11_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverT overT = new OverT();
		System.out.println(overT.add("A"));
		
		// 1번 
		Human h = new Human();
		overT.add(h);;
		
		// 2번 
		overT.add(new Human());
		
		// 3번 
		overT.add(new Human(), new Human());

	}

}
