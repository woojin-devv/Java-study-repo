/*
생성자 함수 (특수한 목적 함수)
1. 특수한 목적 (member field 초기화) : static {} , { }
2. 일반 함수와 다름점
2.1 함수 이름이 고정( class 이름과 동일)
2.2 return type 없어요 ( default void) > 생성시점 > new > member field > 자동 호출 생성자 
2.3 생성자 overloading ( 함수가 여러개 ...) > 개발자가 무었을 강제할 수 있는 ...상황
참고) 원칙은 객체 생성시 생성자 함수는 하나만 실행 .... 그러나 여러개의 생성자 함수를 실행 수 있다 ( this )

public class Car {
   public Car() {}
}

public class Car {
   private Car() {}
}
생성자의 접근자로 private 사용될 수 있다  >> 싱글톤  >> 객체를 하나만 만들어서 공유 


** 생성자 함수 왜 만들까요 **
[생성되는 객체] 마다 [강제적] 으로 member field 초기화  


class Car {
	String color; //default null
}
>> 설계도를 만든 사람은 자동차 색상은 니가 알아서 해 
>> 명시적으로 생성자를 만들지 않으면 자동으로 default 생성자 생성

java Car 엔터
컴파일러가  public Car() {} 기본 생성자 만들어요 

class Car {
	String color="blue";  초기화 
}

문제)자동차의 색상을 정하지 않고 출고 (설계도) 

class Car {
	String color;
	
	public Car() {}
	
	public Car(String color) {
		this.color = color;
	}
}

1. new Car() > public Car() {} 자동 호출 


class Car {
	String color;
	
	public Car(String color) {
		this.color = color;
	}
}

2. new Car(); (x)  >> new Car("blue")
*/

class Car {
	//내부적으로  default 생성자 > public Car(){}
}

class Car2 {
	Car2(){
		System.out.println("default");
	}  //default Car2(){}
}

class Car3{  //강제성이 없어요
	Car3(){}
	
	Car3(String color){
		
	}
}

class Car4{
	
	Car4(String color){  //강제성
		
	}
}

//자동차 매장 : 영업사원 (기본옵션 ,  여러가지 맞춤 옵션)
class Car5 {
	String carColor;
	int door;
	
	public Car5() {
		carColor = "blue";
		door=4;
	}
	public Car5(int door) {
		carColor = "blue";
		this.door=door;
	}
	public Car5(String carColor) {
		this.carColor = carColor;
		this.door=4;
	}
	public Car5(int door , String carColor) {
		this.carColor = carColor;
		this.door = door;
	}
}

public class Ex12_Constructor {

	public static void main(String[] args) {
		Car car = new Car();
		Car4 car4 = new Car4("red");
		
		Car5 car5 = new Car5(2);
	}

}
