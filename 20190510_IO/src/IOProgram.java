//완벽하지 않으니 교과서 보고하거나 시험기간 되면 승연이 컴퓨터 파일 옮기기

import java.io.IOException;

public class IOProgram {
	
	public static void main(String[] args) {
			
	int bt;
	
	try {
		while((bt = System.in.read()) != -1) {
			System.out.println((char)bt);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
	
}
