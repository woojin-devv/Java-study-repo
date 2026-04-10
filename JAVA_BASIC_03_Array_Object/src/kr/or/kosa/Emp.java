package kr.or.kosa;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Emp {
	private int empno;
	private String ename;
	/*
	public Emp(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	*/
	
}
