// 2309 서남경
// 프로젝트 소개 : DYA?란, "Did You Attendance?"의 줄임말로 "너 출석했었니?"라는 의미인데요. 말 그대로 학생들의 출석 여부를 확인하는 프로그램입니다. 
//            평상시 학교에서 매 수업시간마다 출석을 부르는 일이 반복되는데, 특히나 같은 반 학생 중 한 명이 출석하지 않는 경우에는 나머지 친구들이 나오지 않은 친구의 이야기를 매번 대변해야하는 등 여러모로 번거로움이 있었습니다. 
//			    하지만 DYA? 프로그램을 사용하면 하루에 한 번만 자신의 출석 여부를 작성하면 되기에 선생님과 학생 모두 간편하게 출결을 관리할 수 있게됩니다.
//			  (실행 : 질문에 따라 차례대로 입력하시다가 입력이 다 끝나면 계속 질문에 답하실 필요없이 Enter키를 눌러주세요 !)

package kr.hs.emirim.DYA;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	public String MStudent;
	public boolean made;
	public int sum1 = 0;
	public int sum2 = 0;
	public int sum3 = 0;
	public int sum4 = 0;
	
	StudentInfo s;
	Item i;
	ArrayList<Item> attendList = new ArrayList<>();

	// 미림여자정보과학고등학교 학생인지 확인하고, 맞으면 다음 문항으로, 아니면 프로그램 종료
	public void mirim() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("미림여자정보과학고등학교 학생이신가요 ? (Y/N)");
		MStudent = scanner.nextLine();
		
		if(MStudent.equals("Y") || MStudent.equals("y")) {
			s = new StudentInfo(); 
		} else {
			System.out.println("해당 프로그램은 미림여자정보과학고등학교에 재학 중인 학생만 사용하실 수 있습니다ㅜ.ㅜ");
			System.exit(0); // 프로그램 종료
		}
	}
	
	// 이전에 입력했던 결과가 맞는지 확인시켜주기 위해 출력하는 메서드
	public void printInfo() {
		System.out.println();
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 입력 결과 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		
		for(int i = 0; i < attendList.size(); i++) {
			System.out.println("학년 : "+s.grade+"\t학급 : "+s.classes+"\t번호 : "+s.number+"\t현수업 : "+attendList.get(i).c.getPeriod()+"   출석 여부 : "+attendList.get(i).a);
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			System.out.println();
		}
	}
	
	// 현재 출석 현황을 알려주기 위해 출력하는 메서드
	public void printInfo2() {
		// 횟수를 보여주기 위해 입력한 출석 여부에 따라 +1씩 증가
		for(int i = 0; i < attendList.size(); i++) {
			if(attendList.get(i).a.attend.equals("출석")) { 
				sum1 += 1;
			} else if (attendList.get(i).a.attend.equals("지각")) {
				sum2 += 1;
			} else if (attendList.get(i).a.attend.equals("조퇴")) {
				sum3 += 1;
			} else if (attendList.get(i).a.attend.equals("결석")) {
				sum4 += 1;
			}
		}
			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓 출석 현황 〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println();
			System.out.println("출석 : "+sum1+"번"+"   지각 : "+sum2+"번"+"   조퇴 : "+sum3+"번"+"   결석 : "+sum4+"번");
			System.out.println();
			System.out.println("-----------------------------------------------------------");
	}
	
	// 학년, 학급, 번호를 제외한 질문을 무한 반복(지각과 조퇴 등이 하루에 한 번에 일어날 수 있는 상황을 고려하여), 입력한 결과를 attendList에 추가
	public void setItem() {
		while (true) {
			i = new Item();
			made = i.setItem();
			if(made == true) {
				attendList.add(i.getItem());
			} else {
				break;
			}
		}
	}
	
	// 최종적으로 화면에 출력하는 부분
	public static void main(String[] args) {
		Student std = new Student();
		std.mirim();
		std.setItem();
		std.printInfo();
		std.printInfo2();
	}
}