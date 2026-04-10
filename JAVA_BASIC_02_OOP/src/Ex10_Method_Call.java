/*

void m(int x){
	x 값  출력
	x = 1111;
}
호출하는 코드 : m(100)
call by value




call by ref
void m(Car c){   // c 변수가 받는 것은 : 주소
  c.carName = "포니"
}

Car car = new Car(); car >> 0x24312FF
m(car);

*/
class Data {
	int i;
}

public class Ex10_Method_Call {

	static void scall(Data sdata) {
		System.out.println("함수 : " + sdata.i);
		sdata.i = 1111;
	}
	static void vcall(int x) {
		x = 8888;
	}
	
	public static void main(String[] args) {
		Data data = new Data();
		data.i = 100;
		System.out.println("data.i : " + data.i);
		
		Ex10_Method_Call.scall(data); //주소값  ...
		System.out.println(data.i);
		

	}

}
