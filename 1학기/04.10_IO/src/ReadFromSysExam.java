import java.io.IOException;

public class ReadFromSysExam {

	public static void main(String[] args) {
		
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b); //������ �̷��� �дٰ�
		} catch (IOException e) { //IOException ������ �߻��ϸ� catch
			e.printStackTrace();
		}
		System.out.write(b, 0, len);

	}

}
