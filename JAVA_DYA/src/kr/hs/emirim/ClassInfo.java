package kr.hs.emirim;

import java.util.Scanner;

public class ClassInfo {
	
	public String period;
	
	public String setPeriod(String period) { //set_cinfo
		Scanner scanner = new Scanner(System.in);
		this.period = scanner.nextLine();
		System.out.println("현재 수업 (ex) 조회, 1교시 ~ 7교시, 종례, 방과후 A, 방과후 B) : " + period);
		
		return this.period;
	}

}
