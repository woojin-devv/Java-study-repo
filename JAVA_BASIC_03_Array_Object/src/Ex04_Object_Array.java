
class Person{
	String name;
	int age;
	
	void print() {
		System.out.println(this.name + " : " + this.age);
	}
}

public class Ex04_Object_Array {
	public static void main(String[] args) {
		int[] intarr = new int[10];
		// default [0][0][0]....[0] length = 10 
		boolean[] boolarr = new boolean[5];
		// [false][false][false][false][false]
		
		Person person = new Person();
		Person person1 = new Person();
		Person person2 = new Person();
		
		Person[] persons = new Person[3];
		
		persons[0] = new Person();
		
		persons[1] = new Person();
		persons[1].name = "아무개";
		persons[1].age = 100;
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i] + " : " + persons[i].name);
			//persons[i].name persons[2].name이 null 인데 
		}
		
		Person[] parray = new Person[10];
		
		for (int i = 0; i < parray.length; i++) {
			parray[i] = new Person();
			System.out.println("주소값 : " + parray[i] );
		}
		
		
	}
}
