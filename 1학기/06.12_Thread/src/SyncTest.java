
public class SyncTest {
		
	private int sum = 0;
	private int num = 0;
	public synchronized void IncreaseNumber() {
		num ++; //num = num + 1 
		sum = sum + num; //(num++�� ���� �� ������� �а� ���� ������ �� �� �ȴ�.)
	}
		
	public void IncreasetNumber2() {
		synchronized (this) {
			num++;
		}
		sum = sum + num;
	}
	public static void main(String[] args) {
		
		
		
	}

}
