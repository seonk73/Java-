
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println(~5);
		System.out.println(5>>2);   //1 (2ĭ�� ���������� �а� ���� �ڸ��� 0���� ä���)
		System.out.println(5>>3);   //0
		// 5>>3�� �з��� ���� 01 �̴ϱ� ������ ù°�ڸ� 0���� ä���ָ� ���� 0�̵ȴ�
		System.out.println(5<<2);   //20 (2ĭ�� �������� �δ�)
		System.out.println(5>>>2);  //1 
		System.out.println(-5>>2);  //-2 (5�� 2�� ������ �ٲ��� ���� ���������� 2ĭ �δ�)
		//2�� ���� -> ���� ���ڸ� �ݴ�� �ٲ۴���(1�� ����) -> 1�� �����ش�(2�� ����)
		// >> (�б����� ���� ù°�ڸ� ���� ������ ������ ä�����ٴ� ��)
		System.out.println(-5>>>2); //1073741822
		// >>> (�з��� �� �ڸ��� ������ 0���� ä�����ٴ� ��)
		
		System.out.println("---------------");
		System.out.println(false||false);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);
		System.out.println(!true); //false (Not ������)
		
	}
}
