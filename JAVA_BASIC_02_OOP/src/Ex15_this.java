//원칙 객체 생성시 생성자는 한개만 호출가능
//예외적으로 this 사용하면 여러개의 생성자 호출 가능 


class Zcar{
	String color;
	String gearType;
	int door;
	
	//기본옵션
	Zcar(){
		this("red","auto",2);  //할당하는 중복 코드를 감소....
		System.out.println("default");
	}
	
	Zcar(String color , String gearType , int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading ...");
	}
	
	void soCarInfo() {
		System.out.println(this.color + " ," + this.gearType + " , " + this.door);
	}
}

class Zcar2{
	String color;
	String gearType;
	int door;
	
	//기본옵션
	Zcar2(){
		this("red",2);  //할당하는 중복 코드를 감소....
		System.out.println("default");
	}
	
	Zcar2(String color ,int door){
		this(color,"auto",door);
		System.out.println("overloading_1 ...");
	}
	
	
	Zcar2(String color , String gearType , int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("overloading_2 ...");
	}
	
	void soCarInfo() {
		System.out.println(this.color + " ," + this.gearType + " , " + this.door);
	}
}
public class Ex15_this {

	public static void main(String[] args) {
		
		Zcar zcar = new Zcar();
		zcar.soCarInfo();
		
		Zcar2 zcar2 = new Zcar2();
		zcar2.soCarInfo();
	}

}
