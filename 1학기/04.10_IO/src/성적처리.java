import java.io.*;
import java.util.*;

public class ����ó�� {
	
	static ArrayList<����> ������ = new ArrayList<>();
	

	public static void main(String[] args) {
		
		//���Ͽ�������
		FileReader fr;
		try {
			fr = new FileReader("src/Writed.txt");
			//���� ��������
			BufferedReader br = new BufferedReader(fr);
			//�ݺ�, ��������
			String line;
			while((line = br.readLine()) != null) { //�̸�\t�ּ�\t����\t����
				StringTokenizer st = new StringTokenizer(line, "\t"); //t������ �̸�, �ּ�, ����, ��� �ڸ���.
				
				//�� ��ü ���� ����
				���� new���� = new ����(); 
				new����.setName(st.nextToken()); //�ϳ��� �ڸ� ���� ��ü���� ����ִ� ��
				new����.setAddress(st.nextToken());
				new����.setMath(Double.parseDouble(st.nextToken())); //token�� String ���̰�   Math�� english�� double���̱� ������ ����ȯ���־���Ѵ�.
				new����.setEnglish(Double.parseDouble(st.nextToken()));
				
				//����Ʈ�� ������� �� ��ü ����
				������.add(new����);
			}
			//����Ʈ �������
//			for(���� a : ������) {
//				System.out.println(a);
//			}
			for(int i=0; i<������.size(); i++) {
				System.out.println(������.get(i));
				
				//���Ϸ� ��������
				//���� ��������
				FileWriter fw = new FileWriter("src/save.txt");
				//���� ��������
				BufferedWriter bw = new BufferedWriter(fw);
				//����
				for(���� a : ������) {
					bw.write(a.getName() + "\t" + a.getAddress() + "\t");
					bw.write(a.getMath() + "\t" + a.getEnglish() + "\t");
					bw.write(a.getTotal() + "\t" + a.getAverage() + "\t");
					bw.newLine(); // == bw.write("\n")
				}
				//����
				fr.close();
				fw.close();
				br.close();
				bw.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
