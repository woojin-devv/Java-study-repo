/*
 this 이것
 
 1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정 .. 사용) 편하게
 >> 인스턴스 자식을 가르키는 참조변수 , 인스턴의 주소가 저장될 곳
 
 2. this 객체자신(주소) : 그 주소를 가지고 재호출 가능 (원칙적으로는 생성자는 객체 생성시 한개만 호출)
 단 this 사용하면 예외적으로 여러개의 생성자를 호출 할 수 있다  
 >> 생성자를 호출 하는 this

*/

class Test5{
	int i;
	int j;
	
	/*
	Test5(int i , int j){
		i = i;
		j = j;
	}
	*/
	/*
	유지보수 , 가독성 , ..... 
	Test5(int n , int m){
		i = n;
		j = m;
	}
	*/
	Test5(int i , int j){ //this
		this.i = i;
		this.j = j;
	}
}


class Book{
	String bookName;
	
	Book(String bookName){
		this.bookName = bookName;
	}
}

//Today Point 
//생성자를 호출하는 this (중복 코드 감소)

class Socar{
	String color;
	String gearType;
	int door;
	
	//기본옵션
	Socar(){
		this.color = "red";
		this.gearType = "auto";
		this.door = 2;
	}
	
	Socar(String color , String gearType , int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void soCarInfo() {
		System.out.println(this.color + " ," + this.gearType + " , " + this.door);
	}
}
public class Ex14_this {

	public static void main(String[] args) {
		Socar socar = new Socar("gold", "auto", 6);
		socar.soCarInfo();

	}

}
