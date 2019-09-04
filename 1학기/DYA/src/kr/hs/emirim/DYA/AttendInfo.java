package kr.hs.emirim.DYA;

import java.util.Scanner;

public class AttendInfo {
	Scanner scanner = new Scanner(System.in);
	
	public String attend;
	public String reason;
	
	// 출석 여부를 입력받기 위해, 위에서 변수를 선언한 뒤 Scanner 사용, attend 반환
	public String setAttend() { 
		System.out.print("출석 여부를 (ex) 출석, 지각, 조퇴, 결석 중 택 1) : ");
		
		this.attend = scanner.nextLine();
		
		if(attend.equals("지각")) // 출석 여부에 "지각"을 입력하면, tardy() 실행
			tardy();
		else if (attend.equals("조퇴")) { // 출석 여부에 "조퇴"를 입력하면, early() 실행
			early();
		}
		else if (attend.equals("결석")) { // 출석 여부에 "결석"을 입력하면, absent() 실행
			absent();
		}
		
		return this.attend;
	}
	
	// 다른 class에서 attend 값을 사용하기 위해 Getters 생성
	public String getAttend() {
		return attend;
	}

	// 출석 여부 "지각"을 선택하면 실행됨, 구체적인 지각 사유를 입력
	public void tardy() {
		System.out.print("지각 사유 (ex)질병, 미인정, 기타, 인정) : ");
		reason = scanner.nextLine();
	}
	
	// 출석 여부 "조퇴"를 선택하면 실행됨, 구체적인 조퇴 사유를 입력
	public void early() {
		System.out.print("조퇴 사유 (ex)질병, 미인정, 기타, 인정) : ");
		reason = scanner.nextLine();
	}
	
	// 출석 여부 "결석"을 선택하면 실행됨, 구체적인 결석 사유를 입력
	public void absent() {
		System.out.print("결석 사유 (ex)질병, 미인정, 기타, 인정) : ");
		reason = scanner.nextLine();
	}
	
	// 출력할 때 호출되어 값을 문자열화하기 위해 toString() 사용, 
	// 출석 여부에 "출석"을 입력하면 출석, 그 외는 뒤에 괄호 붙여서 구체적인 사유까지 출력될 수 있게함
	@Override
	public String toString() {
		if(attend.equals("출석")) {
			return "출석";
		}
		else {
			return (attend + "("+reason+")");
		}
	}
}
