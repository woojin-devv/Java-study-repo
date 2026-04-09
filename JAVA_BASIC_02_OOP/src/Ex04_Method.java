import kr.or.kosa.common.NoteBook;
import kr.or.kosa.common.Mouse;

public class Ex04_Method {
	public static void main(String[] args) {
		// Notebook 구매 (메모리에 올리겠다)
		// Mouse 구매 (메모리에 올리겠다)
		NoteBook noteBook = new NoteBook();
		noteBook.setColor("red");
		noteBook.setYear(2025);
		String color = noteBook.getColor();
		System.out.println(color);
		
		// 노트북 사용에 있어서 마우스 불편 
		Mouse mouse = new Mouse();
		
		// 노트북 마우스 연결
		noteBook.handleMouse(mouse); //강사님 ... LG, HP 연결 .. interface .. 인터페이스 구현 
		
	}
}
