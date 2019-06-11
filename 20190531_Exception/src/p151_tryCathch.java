
public class p151_tryCathch {
	public static void main(String[] args) {
		String[] irum = new String[3];
		irum[0] = "이채린";
		irum[1] = "원채린";
		irum[2] = "서남경";
		try {
			for(int i = 0; i <= irum.length; i++) { //length는 3이고, Index는 2까진데 Index 3을 호출하니까
				System.out.println(irum[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} catch(Exception e) { //catch는 두 개 중 하나만 실행됨
			System.out.println("Exception");
		} finally {
			System.out.println("무조건 실행됩니다.");
		}
	}
}
