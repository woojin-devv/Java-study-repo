package kr.or.kosa.utils;

import java.io.IOException;

/*
	## 예외 던지기 (Exception Throws)
	- 설계 단계에서 팀장이 클래스 설계 시 예외 처리를 요구했으나, 팀원이 이를 누락하는 상황을 가정했다.
	- 개발자가 메서드를 호출하는 측에 예외 처리를 강제하기 위해 `throws` 키워드를 사용했다.
	- `throws`는 메서드 내부에서 직접 예외를 해결하지 않고, 해당 메서드를 호출한 지점으로 예외 객체를 던져 처리를 위임하는 방식이다.
	- 이를 통해 설계자는 특정 메서드 사용 시 반드시 예외 처리(try-catch)가 동반되도록 문법적으로 강제했다.
 * */
public class ExClass {
	public ExClass(String path) throws IOException, NullPointerException {
		System.out.println("path : " + path); 
	}
}
