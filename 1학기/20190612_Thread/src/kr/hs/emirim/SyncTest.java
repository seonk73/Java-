package kr.hs.emirim;

public class SyncTest {
	private int sum = 0;
	private int num = 0;
	public synchronized void IncreaseNumber() {
		num++; //num = num + 1,  읽고 쓰는 작업을 같이 함 (기존의 num 값을 읽어오고 num에 새로운 값을 씀)
		sum += num;
	}
	
	public void IncereaseNumber2() {
		synchronized (this) {
			num++;
		}
		sum += num;
	}
	
	
	public static void main(String[] args) {
		
	}

}
