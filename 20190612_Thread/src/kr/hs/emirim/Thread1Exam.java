package kr.hs.emirim;

class Top extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.print(i+"\t");
		}
	}
	
}

public class Thread1Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top d = new Top();
		Top d2 = new Top();
		d.start(); //내부적으로 어떻게 실행되는지 보여줌, 내부적으로 MultiThead를 돌려줌 / run() X
		d2.start();
		System.out.println("프로그램 종료");
	}

}
