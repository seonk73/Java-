package kr.hs.emirim;

import java.util.Scanner;

public class AttendInfo {
	Scanner scanner = new Scanner(System.in);
	
	public String attend;
	public String reason = "";
	
	public String setAttend(String attend) { //set_ainfo
		this.attend = scanner.nextLine();
		
		if(attend.equals("지각"))
			tardy();
		else if (attend.equals("조퇴")) {
			early();
		}
		else if (attend.equals("결석")) {
			absent();
		}
		
		System.out.println("출석 여부를 (ex) 출석, 지각, 조퇴, 결석 중 택 1) : " + attend);
		
		return this.attend;
	}
	
	public String getAttend() {
		return attend;
	}

	public void tardy() {
		reason = scanner.nextLine();
		System.out.println("지각 사유 (ex)질병, 미인정, 기타, 인정) : " + reason);
	}
	
	public void early() {
		reason = scanner.nextLine();
		System.out.println("지각 사유 (ex)질병, 미인정, 기타, 인정) : " + reason);
	}
	
	public void absent() {
		reason = scanner.nextLine();
		System.out.println("지각 사유 (ex)질병, 미인정, 기타, 인정) : " + reason);
	}
	
	

}
