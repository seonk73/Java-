package kr.hs.emirim;

public class Item {
	
	public String result;
	ClassInfo c;
	AttendInfo a;
	
	// ClassInfo, AttendInfo의 메서드를 사용하기 위해 객체 생성 뒤 각각 result에 값을 넣어놓음
	public boolean setItem() {
		c = new ClassInfo();
		result = c.setPeriod();
		
		// boolean형으로 아무것도 입력하지 않으면 false 반환
		if(result.equals("")) {
			return false; // enter치면 질문 종료시키기
		}
		
		a = new AttendInfo();
		result = a.setAttend();
		
		// boolean형으로 아무것도 입력하지 않으면 false 반환
		if(result.equals("")) {
			return false; // enter치면 질문 종료시키기
		}
		
		
		return true;
	}
	
	// 다른 class에서 ITem을 사용하기 위해 Getters 생성
	public Item getItem() {
		return this;
	}
	
	// 출력할 때 호출되어 값을 문자열화하기 위해 toString() 사용
	@Override
	public String toString() {
		return c + " " + a;
	}
}