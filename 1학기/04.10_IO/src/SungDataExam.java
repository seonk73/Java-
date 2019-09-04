import java.io.*;
import java.util.StringTokenizer;

public class SungDataExam {

//	Kim ��걸 100 100 total average
//	Lee ���α� 90 90 total average
//	Choi ������ 100 100 total average
//	Hong ������ 90 90 total average
	
	public static void main(String[] args) {
		try {
			//���� ��������(Writed.txt)
			FileReader fr = new FileReader("src/Writed.txt");
			//���� ��������(readLine()�ϱ� ���ؼ�)
			BufferedReader br = new BufferedReader(fr);
			//�� �� �а�, \t�� ��������
			String csvStr = ""; //��� ���� \t�� ������ String
			String tmpStr = ""; //���� �б�� �ӽ� String
			while((tmpStr = br.readLine()) != null) {
				csvStr += tmpStr + "\t";
			}
			//System.out.println(csvStr);
			
			//token���� ������ ������ ��������
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			int length = parse.countTokens() / 4; //�� ��ū�� 16���ε� 4���� �ڸ��� ��
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			for(int i = 0; i<length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.parseDouble(parse.nextToken()); //String���� �ɰ��� �ǵ� double�� �ɰ��� �־ ��������
				english[i] = Double.parseDouble(parse.nextToken()); //double�� ����ȭ���ֱ�
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2;
			}
			//total, avg �������
			
			//�������
			for(int i=0; i<length; i++) {
				System.out.println("�̸� : " + name[i] + ", �ּ� : " + address[i] + ", ���� : " + math[i] + 
						", ����" + english[i] + ", ���� : " + total[i] + ", ��� : " + avg[i]);
			} 
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
