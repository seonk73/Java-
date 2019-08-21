package kr.hs.emirim;

import java.util.Scanner;

public class ClassInfo {
	
	public String period;
	
	// 현재 수업을 입력받기 위해, 위에서 변수를 선언한 뒤 Scanner 사용, period 반환
	public String setPeriod() { 
		Scanner scanner = new Scanner(System.in);
		System.out.print("현재 수업 (ex) 조회, 1교시 ~ 7교시, 종례, 방과후 A, 방과후 B) : ");
		this.period = scanner.nextLine();
		
		return this.period;
	}
	
	// 다른 class에서 period의 값을 사용하기 위해 Getters 생성
	public String getPeriod() {
		return period;
	}

	// 출력할 때 호출되어 값을 문자열화하기 위해 toString() 사용
	@Override
	public String toString() {
		return period;
	}

}
