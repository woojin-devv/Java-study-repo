import kr.or.kosa.Emp;

public class Ex05_Array_Quiz {

	public static void main(String[] args) {
		
		/*
		 1. 사원 3명을 만드세요 (array)
		 1000,홍길동
		 2000,김유신
		 3000,유관순 
		 
		 2. 개선된 for문으로 사번 , 이름 모두 출력하세요 
		  
		 */
		Emp[] emplist = {new Emp(1000,"홍길동"),new Emp(2000,"김유신"),new Emp(3000,"유관순")};
		for(Emp emp : emplist) {
			 System.out.println(emp.toString());
			 System.out.println(emp.getEmpno() + " / " + emp.getEname());
		}
	}

}
