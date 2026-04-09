import kr.or.kosa.common.Tv;

public class Ex03_MethodCall {
	public static void main(String[] args) {
		// TV 한대를 만드세요 
		// TV 설계도를 메모리에 올려서 사용하세요. 
		
		Tv lgTv = new Tv();
		lgTv.brandName = "LG";
		lgTv.showChannelInfo();
		
		lgTv.addChannel();
		lgTv.addChannel();
		lgTv.addChannel();
		lgTv.addChannel();
		lgTv.addChannel();
		
		lgTv.showChannelInfo();
		
		lgTv.subtractChannel();
		lgTv.subtractChannel();
		lgTv.subtractChannel();
		lgTv.subtractChannel();
		
		lgTv.showChannelInfo();
		
		Tv sTv = new Tv();
		sTv.brandName = "ss";
		sTv.addChannel();
		sTv.showChannelInfo();
	}
}
