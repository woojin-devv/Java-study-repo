package kr.or.kosa.common;
/*
 * 마우스는 한 점을 가지고 있다.
 * 
 * x, y
 * private int x;
 * private int y;
 * 
 * */

public class Mouse {
	public int pointX;
	public int pointY;

	public void setX(int x) {
		this.pointX = x;
		
	}
	public void setY(int y) {
		this.pointY = y;
		
	}
	// 요구 사항 .... x, y 각각 확인하기를 원한다.
	// >> getX(), getY()
	
	// 노트북은 필요에 따라서 마우스를 가질 수 있다.
	// 불편해 마우스 .. (기능)
	
	
	public void getReadMousePoint(){
		System.out.println("x: " + pointX + "y: " + pointY);
	}
}
