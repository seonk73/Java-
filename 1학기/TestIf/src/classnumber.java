import java.util.*;

public class classnumber {

	public static void main(String args[]) {
		
//		Scanner sc = new Scanner(System.in);
//		int number = 0;
//		System.out.println("��ȣ�� �Է��ϼ��� (ex.2301) : ");
//		number = sc.nextInt();
		
//		switch(number) {
//			case 2301: System.out.println("������");break;
//			case 2302: System.out.println("������");break;
//			case 2303: System.out.println("�谡��");break;
//			case 2304: System.out.println("�質��");break;
//			case 2305: System.out.println("�輱��");break;
//			case 2306: System.out.println("�����");break;
//			case 2307: System.out.println("������");break;
//			case 2308: System.out.println("�ڱ���");break;
//			case 2309: System.out.println("������");break;
//			case 2310: System.out.println("���¿�");break;
//			case 2311: System.out.println("������");break;
//			case 2312: System.out.println("��ä��");break;
//			case 2313: System.out.println("�̼���");break;
//			case 2314: System.out.println("��ä��");break;
//			case 2315: System.out.println("������");break;
//			case 2316: System.out.println("������");break;
//			case 2317: System.out.println("������");break;
//			case 2318: System.out.println("�����");break;
//			case 2319: System.out.println("�Ѵٿ�");break;
//			case 2401: System.out.println("������");break;
//			case 2402: System.out.println("������");break;
//			case 2403: System.out.println("�����");break;
//			case 2404: System.out.println("�躽��");break;
//			case 2405: System.out.println("�����");break;
//			case 2406: System.out.println("��ä��");break;
//			case 2407: System.out.println("������");break;
//			case 2408: System.out.println("�ڼ���");break;
//			case 2409: System.out.println("������");break;
//			case 2410: System.out.println("��ä��");break;
//			case 2411: System.out.println("�����");break;
//			case 2412: System.out.println("���ϴ�");break;
//			case 2413: System.out.println("��ä��");break;
//			case 2414: System.out.println("������");break;
//			case 2415: System.out.println("������");break;
//			case 2416: System.out.println("������");break;
//			case 2417: System.out.println("������");break;
//			case 2418: System.out.println("������");break;
//		}
		
		String[] ��3 = {"������", "������", "�谡��", "�質��", "�輱��", "�����", "������", "�ڱ���", "������", "���¿�", "������", 
							"��ä��", "�̼���", "��ä��", "������", "������", "������", "�����", "�Ѵٿ�"};
				System.out.println("��ȣ�� �Է��ϼ��� : ");
				
		Scanner sc = new Scanner(System.in);
//			while(true) {
//				int number = sc.nextInt();
//				//i<=number<=18
//				if(1<=number && number<=��3.length) { 
//					System.out.println(��3[number-1]);
//				}
//				else {
//					break;
//				}
//		}
			
		//for��
//		for(int i=0; i<��3.length; i++) {
//			System.out.println(��3[i]);
//		}
		
		//for each��(�ξ� �����ϴ�) -> �ε����� �ʿ��ϸ� for���� ����ؾ���
		for(String name:��3) {
			System.out.println(name);
		}
		
		
	}
	
}
