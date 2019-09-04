package kr.hs.emirim.DYA;

import java.util.Scanner;

public class StudentInfo {
	
	public String grade;
	public String classes;
	public String number;
	
	// 학년, 학급, 번호를 입력받기 위해, 위에서 변수를 선언한 뒤 Scanner 사용
	public StudentInfo() { 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학년 : ");
		this.grade = scanner.nextLine();
		
		System.out.print("학급 : ");
		this.classes = scanner.nextLine();
		
		System.out.print("번호 : ");
		this.number = scanner.nextLine();
	}
	
}
