package kr.hs.emirim;

import java.util.Scanner;

public class StudentInfo {
	
	public String grade;
	public String classes;
	public String number;
	
	public StudentInfo(String grade, String classes, String number) {
		Scanner scanner = new Scanner(System.in);
		this.grade = scanner.nextLine();
		this.classes = scanner.nextLine();
		this.number = scanner.nextLine();
		
		System.out.println("학년 : " + grade);
		System.out.println("학급 : " + classes);
		System.out.println("번호 : " + number);
	}
	
}
