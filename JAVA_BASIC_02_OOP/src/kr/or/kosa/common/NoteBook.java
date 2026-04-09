package kr.or.kosa.common;

public class NoteBook {
	/*
	 * 노트북은 색상을 가지고 있다 (private) setter getter
	 * 노트북은 생산 년도를 가지고 있다. (private) setter getter
	 * 노트북은 마우스를 가지고 있다. (마우스는 2개 좌표값을 가지고 있다.)(x,y) > 부품  
	 * 	>> 마우스는 끼워서 쓸 수 있음.? >> 노트북은 필요에 따라서 마우스를 가질 수 있다.
	 *  >> NoteBook 생성되면 Mouse 같이 생성 >> NoteBook 폐기하면 Mouse 같이 
	 */
	
	// this(x)
	// 생성자(x)
	
	public String color;
	public int year;
	private Mouse mouse; 
	
//	public Mouse mouse = newMouse();  >> 이렇게 선언하면 안되는 이유, "노트북은 필요에 따라서 마우스를 가질 수 있다."에 반함 
	private void getPoint(Mouse mouse) {
		
	}	
	
	public String getColor(){
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void handleMouse(Mouse mouse){ // 필요하다면 ,, Mouse mouse 주소값을 받겠
		mouse.setX(4);
		mouse.setY(20);
		mouse.getReadMousePoint();
	}
	
}
