// 1. 학년, 학급, 번호 JComboBox로 선택하기
// 2. 현재 수업 JComboBox로 선택하기
// 3. 출석 여부 RadioButton으로 선택하기 (출석, 지각, 조퇴, 결석)
// 3-1. 출석이 아닌 경우 RadioButton으로 선택하기 (질병, 미인정, 기타, 인정)
// 완료 Button 만들기 (완료누르면, 새 창에서 결과 보여줌 -> ResultInfo에서)

package kr.hs.emirim;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class SelectInfo {

	public static void main(String[] args) {
		
//		Font font = new Font("돋움", Font.PLAIN, 15); // 전체에 폰트 설정하기
		
		JFrame frame = new JFrame("SELECT");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(500, 670));
		
		//GridLayout
		GridLayout gl = new GridLayout(13, 1);
		
		JLabel label1 = new JLabel();
		label1.setText("1. 학년, 학급, 번호를 선택해주세요 !");
		label1.setVerticalAlignment(SwingConstants.TOP);
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel2 = new JPanel();
		
		GridLayout gl2 = new GridLayout(1, 6);
		
		JLabel grade = new JLabel();
		grade.setText("학년 : ");
		JComboBox<String> c_grade = new JComboBox<>();
		
		for(int g = 1; g<=3; g++) {
			c_grade.addItem(g+"학년");
		}
		
		JLabel classes = new JLabel();
		classes.setText("학급 : ");
		JComboBox<String> c_classes = new JComboBox<>();
		
		for(int c = 1; c<=6; c++) {
			c_classes.addItem(c+"반");
		}
		
		JLabel number = new JLabel();
		number.setText("번호 : ");
		JComboBox<String> c_number = new JComboBox<>();
		
		for(int n = 1; n<=20; n++) {
			c_number.addItem(n+"번");
		}
		
		panel2.setLayout(gl2);
		panel2.add(grade);
		panel2.add(c_grade);
		panel2.add(classes);
		panel2.add(c_classes);
		panel2.add(number);
		panel2.add(c_number);

		
		JLabel label2 = new JLabel();
		label2.setText("2. 현재 수업을 선택해주세요 !");
		label2.setVerticalAlignment(SwingConstants.TOP);
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel3 = new JPanel();
		
		GridLayout gl3 = new GridLayout(1, 2);
		
		JLabel period = new JLabel();
		period.setText("현재 수업 : ");
		JComboBox<String> c_period = new JComboBox<>();
		
		//문자로 위에 for문 처럼 어떻게 ?
		c_period.addItem("조회");
		c_period.addItem("1교시");
		c_period.addItem("2교시");
		c_period.addItem("3교시");
		c_period.addItem("4교시");
		c_period.addItem("5교시");
		c_period.addItem("6교시");
		c_period.addItem("7교시");
		c_period.addItem("종례");
		c_period.addItem("방과후 A");
		c_period.addItem("방과후 B");
		
		panel3.setLayout(gl3);
		panel3.add(period);
		panel3.add(c_period);
		
		
		JLabel label3 = new JLabel();
		label3.setText("3. 출석 여부를 선택해주세요 !");
		label3.setVerticalAlignment(SwingConstants.TOP);
		label3.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel4 = new JPanel();
		
		GridLayout gl4 = new GridLayout(1, 4);
		
		JRadioButton attend = new JRadioButton("출석");
		JRadioButton tardy = new JRadioButton("지각");
		JRadioButton early = new JRadioButton("조퇴");
		JRadioButton absent = new JRadioButton("결석");
		ButtonGroup bg1 = new ButtonGroup();
		
		bg1.add(attend);
		bg1.add(tardy);
		bg1.add(early);
		bg1.add(absent);
		
		panel4.add(attend);
		panel4.add(tardy);
		panel4.add(early);
		panel4.add(absent);
		
		
		JLabel label4 = new JLabel();
		label4.setText("3-1. 출석이 아닌 경우, 이유를 선택해주세요 !");
		label4.setVerticalAlignment(SwingConstants.TOP);
		label4.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel5 = new JPanel();
		
		GridLayout gl5 = new GridLayout(1, 4);
		
		JRadioButton disease = new JRadioButton("질병");
		JRadioButton unrecogn = new JRadioButton("미인정");
		JRadioButton recognition = new JRadioButton("기타");
		JRadioButton other = new JRadioButton("인정");
		ButtonGroup bg2 = new ButtonGroup();
		
		bg2.add(disease);
		bg2.add(unrecogn);
		bg2.add(recognition);
		bg2.add(other);
		
		panel5.add(disease);
		panel5.add(unrecogn);
		panel5.add(recognition);
		panel5.add(other);
			
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		JButton finish = new JButton("결과보기");
		finish.setBounds(370, 0, 90, 30);
		panel6.add(finish);
		

//		frame.setFont(font); // 어디에 추가할 지 모르겠다
		frame.add(panel);
		panel.setLayout(gl);
		panel.add(label1);
		panel.add(panel2);
		
		panel.add(label2);
		panel.add(panel3);
	
		
		panel.add(label3);
		panel.add(panel4);
		
		panel.add(label4);
		panel.add(panel5);
		
		panel.add(panel6);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
