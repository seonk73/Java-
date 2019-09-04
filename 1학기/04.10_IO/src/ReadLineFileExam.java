import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {
	public static void main(String[] args) {
		//���� �а� ����
		FileReader fr;
		try {
			fr = new FileReader("src/dataw.txt");
			//���� �а� ����
			BufferedReader br = new BufferedReader(fr);
			//�� �� �б�
			String s;
			while((s = br.readLine()) != null) {
				//ȭ�� ���
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
