package kr.hs.emirim.practice;

public class ClassPractice {

	public static void main(String args[]) {
		
		������ �ڳ��� = new ������();
		�ڳ���.name = "�ڳ���";
		�ڳ���.women = true;
		�ڳ���.play();
		�ڳ���.interview();
		
		��ȭ��� ������ = new ��ȭ���();
		������.name = "������";
		������.movie = "�Ϸ�";
		������.play();
		������.interview();
		������.cry();
		������.skill();
		
		������ ������A�� = ������;
		������A��.play();
		������A��.interview();
		((��ȭ���)������A��).cry();
		
		���� �迵ö = new ����();
		�迵ö.name = "�迵ö";
		�迵ö.women = false;
		�迵ö.song = "�� ������� �ʾ�";
		�迵ö.show();
		�迵ö.skill();
		
	}
	
}
