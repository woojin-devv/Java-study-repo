package kr.or.kosa.common;

/*
 * 
 * 
 * 
 * 
 * */

public class Tv {
	public int ch; // default 0 
	public String brandName; // default null 
	
	// private >> 1. 생성자를 통해 제어 , 2. getter / setter
	
	public void addChannel() {
		ch++;
	}
	public void subtractChannel() {
		ch --;
	}
	public void showChannelInfo() {
		System.out.printf("브랜드 이름: [%s], 채널 [%d] \n", brandName, ch);
	}
}
