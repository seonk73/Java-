import java.util.Scanner;

public class TestIf {

	public static void main(String args[]) {

		// int member = 1;
		// if������ member�� 5�̸�, itzy ���
		// member�� 7�̸�, BTS ���
		// member�� 9�̸�, EXO ���
		// member�� 1�̸�, IU ���
		// member�� 13�̸�, Seventeen ���

		// 1. if��

//		if(member == 5) 
//			System.out.println("itzy");
//		else if(member == 7) 
//			System.out.println("BTS");
//		else if(member == 9 ) 
//			System.out.println("EXO");
//		else if(member == 1) 
//			System.out.println("IU");
//		else if(member == 13)
//			System.out.println("Seventeen");
//		
		// 2. switch��

//		switch(member) {
//		
//		case 5 : System.out.println("itzy"); break;
//		case 7 : System.out.println("BTS"); break;
//		case 9 : System.out.println("EXO"); break;
//		case 1 : System.out.println("IU"); break;
//		case 13 : System.out.println("Seventeen"); break;
//
//		}

//		System.out.println("----------------------------");

		// �ݺ���
		// �������� �������!

//		System.out.println("<������ 2��>");

		// for��

//		int i = 2;
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " X " + j + " = " + i*j);
//			}

		// while��

//		int i = 2;
//		int j = 1;
//		while(j<=9) {
//			System.out.println(i + " X " + j + " = " + i*j);
//			j++;
//		}
//		
//		System.out.println("--------------------");

		// for-each��
//		int arr[] = new int[] {5, 7, 9, 1, 13};
//		for(int a : arr) { //arr�� �������µ� ��� �������� �ӽ� ���� a��� ��, �׷��� ���ʴ�� �Ѵٸ� ó������ 5�� ������ �ϳ��� �ٲ� ���̴�.
//			System.out.println(a + ""); //a+"" : ���ڶ� ���ڿ��� ���ϸ� ���ڿ��� �ٲ��. ���ڸ� ���ڿ��� �ٲ� �� �ִ� ���� ���� ���
//			member = a;
//			if(member == 5) 
//				System.out.println("itzy");
//			else if(member == 7) 
//				System.out.println("BTS");
//			else if(member == 9 ) 
//				System.out.println("EXO");
//			else if(member == 1) 
//				System.out.println("IU");
//			else if(member == 13)
//				System.out.println("Seventeen");
//		}	

//		System.out.println("-----------------------");
		// �Է¹���

		Scanner sc = new Scanner(System.in);
		int member = 0;

	
//		System.out.print("��� ���� �Է��ϼ��� : ");
//
//		member = sc.nextInt();
//
//		if (member == 5)
//			System.out.println("itzy");
//		else if (member == 7)
//			System.out.println("BTS");
//		else if (member == 9)
//			System.out.println("EXO");
//		else if (member == 1)
//			System.out.println("IU");
//		else if (member == 13)
//			System.out.println("Seventeen");
		
//			while(true) {
//				
//				System.out.print("��� ���� �Է��ϼ��� : ");
//				member = sc.nextInt();
//				
//				if(member==5 || member==7 || member==9 || member==1 || member==13) {
//					if (member == 5)
//						System.out.println("itzy");
//					else if (member == 7)
//						System.out.println("BTS");
//					else if (member == 9)
//						System.out.println("EXO");
//					else if (member == 1)
//						System.out.println("IU");
//					else if (member == 13)
//						System.out.println("Seventeen");
//				}
//				else 
//					break;
//			}
			
		
		//for������ 
		
			for(boolean i; i = true;) {
				
				System.out.print("��� ���� �Է��ϼ��� : ");
				member = sc.nextInt();
				
				if(member==5 || member==7 || member==9 || member==1 || member==13) {
					if (member == 5)
						System.out.println("itzy");
					else if (member == 7)
						System.out.println("BTS");
					else if (member == 9)
						System.out.println("EXO");
					else if (member == 1)
						System.out.println("IU");
					else if (member == 13)
						System.out.println("Seventeen");
				}
				else 
					break;
			}

	}

}
