package kr.hs.emrim.studentnumbertomajor;

import java.util.Scanner;

public class StudentNumberToMajor {

	public static void main(String[] args) {
		
		String number;
		System.out.println("�й��� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextLine();
		
//		String number2 = number.substring(0, 1);
		
		//Ʋ��././///
//		if(number2.equals("11") || number2.equals("11")) {
//			System.out.println("���̵�����Ʈ�����");
//		}
//		else if(number2.equals("13") || number2.equals("14")) {
//			System.out.println("���̵�����ַ�ǰ�");
//		}
//		else if(number2.equals("15") || number2.equals("16")) {
//			System.out.println("���̵������ΰ�");
//		}
//		else if(number2.equals("21") || number2.equals("22")) {
//			System.out.println("���̵�����Ʈ�����");
//		}
//		else if(number2.equals("23") || number2.equals("24")) {
//			System.out.println("���̵�����ַ�ǰ�");
//		}
//		else if(number2.equals("25") || number2.equals("26")) {
//			System.out.println("���̵������ΰ�");
//		}
//		else if(number2.equals("31") || number2.equals("32")) {
//			System.out.println("���ͷ�Ƽ��̵���");
//		}
//		else if(number2.equals("33") || number2.equals("34")) {
//			System.out.println("���̵������ΰ�");
//		}
//		else if(number2.equals("35") || number2.equals("36")) {
//			System.out.println("���̵��ַ�ǰ�");
//		}
//		else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
		
		
		//������ �ؼ�
		if(number.substring(0, 1).equals("3")) { //3�г��϶�
			if(number.substring(1, 2).equals("1") || number.substring(1, 2).equals("2")) {
				System.out.println("���ͷ�Ƽ��̵���");
			}
			else if(number.substring(1, 2).equals("3") || number.substring(1, 2).equals("4")) {
				System.out.println("���̵������ΰ�");
			}
			else if(number.substring(1, 2).equals("5") || number.substring(1, 2).equals("6")) {
				System.out.println("���̵��ַ�ǰ�");
			}
		}
		else { //1�г�, 2�г��϶�
			if(number.substring(1, 2).equals("1") || number.substring(1, 2).equals("2")) {
				System.out.println("���̵�����Ʈ�����");
			}
			else if(number.substring(1, 2).equals("3") || number.substring(1, 2).equals("4")) {
				System.out.println("���̵�����ַ�ǰ�");
			}
			else if(number.substring(1, 2).equals("5") || number.substring(1, 2).equals("6")) {
				System.out.println("���̵������ΰ�");
			}
		}
		
		
		

	}

}
