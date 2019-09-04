// 1. 동작, 버튼 누르면 SelectInfo로 !
// 2. image 위 text ! (DYA 프로그램은 미림여자정보과학고등학교 학생들만 이용 가능합니다.) 문구 맨 밑 오른쪽에 띄우기 



import java.awt.*;
import javax.swing.*;

class StartImage {
	JFrame frame = new JFrame();
	ImageIcon ic = new ImageIcon("./images/mirim.jpg");
	Image mirim = ic.getImage();

	StartImage() {
		frame.setTitle("START");

		StartPanel panel = new StartPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JButton("미림여자정보과학고등학교"));
		
		frame.add(panel);
		frame.setSize(670, 460);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public void StartLabel() {
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel();
		panel1.setLayout(null);
		label1.setText("DYA는 미림여자정보과학고등학교 학생들만 이용 가능합니다.");
		label1.setBounds(145, 340, 400, 100);
		panel1.add(label1);
//		panel.add(panel1);
	}
	
	class StartPanel extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(mirim, 0, 0, getWidth(), getHeight(), this);
		}
	
	}
}

public class StartProject {
	public static void main(String[] args) {
		new StartImage();
		//label 추가해야하는데...
		

		
		
	}

}