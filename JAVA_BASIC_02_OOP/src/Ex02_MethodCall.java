import kr.or.kosa.common.Fclass;

public class Ex02_MethodCall {

	public static void main(String[] args) {
		Fclass fclass = new Fclass();
		fclass.m();
		
		fclass.m2(1234);
		
		int result = fclass.m3();
		System.out.println("result value :" + result);
		
		result = fclass.sum(100, 200, 300);
		System.out.print("result value:" + result);
		
		fclass.callSubSum();
		
		result = fclass.opSum(-500);
		System.out.print("result value:" + result);
	}

}
