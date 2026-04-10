import java.io.IOException;
/*
 * 
 * 게임 CD
 * 1. 설치 >> C: \Temp 폴더 > 설치 파일 복사   
 * 2. 복사한 파일 > 프로그램을 설치       
 * 3. 정상 설치 > C:\Temp 폴더 내용삭제 
 * 3.1 비정상 설치 > C:\Temp 폴더 내용삭제 
 * 
 * 강제 실행 블럭 : finally 
 * */



public class Ex03_finally {
	static void copyFiles() {
		System.out.println("copy files");
	}
	
	static void startInstall() {
		System.out.println("Install....");
	}
	
	static void deleteFiles() {
		System.out.println("delete files...");
	}
	public static void main(String[] args) {
		/*
		 * 
		 * copyFiles();
		 * startInstall();
		 * deleteFiles();
		 * 
		 * 개발자가 필요에 따라서 예외를 만들고 강제로 던질 수 있다.
		 * 
		 * 개발자 필요에 따라서 예외 만들고 강제로 던질 수 있다. (throw)
		 * */
		
		try {
			copyFiles();
			startInstall();
			
			throw new IOException();
		} catch(Exception e) {
			// TODO: handle
			System.out.println("예외발생: " + e.getMessage());
		} finally {
			// 강제 실행 블럭 
			// 정상 수행 되어도, 비정상 수행되어도,, 무조건 실행
			deleteFiles();
			
		}
	}
}
