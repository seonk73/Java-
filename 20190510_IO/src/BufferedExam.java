import java.io.*;

public class BufferedExam {
	
	public static void main(String[] args) {
		BufferedInputStream bi = new BufferedInputStream(System.in);
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
		int a;
		try {
			while((a = bi.read()) != -1) {
				bo.write(a);
			}
			bo.flush();
		} catch (IOException e) {
//			e.prin?tStackTrace();
		}
		
	}

}
