import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2_Components {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox0");
        JCheckBox cb1 = new JCheckBox("JCheckBox1");
        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb0);
        bg.add(rb1);
        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2, 10);

        String[] family = {"아", "이", "우"};
        JComboBox<String> cbox0 = new JComboBox<>(family);
        cbox0.addItem("에");
        cbox0.addItem("오");

        JLabel lbResult = new JLabel("Result");

        cb1.setSelected(true);
        rb0.setSelected(true); // 초기 값 세팅
        tf0.setText("전화번호를 입력하세요.");

        // TextField에 "전화번호를 입력하세요"가 떠있는데 클릭하면 사라지게 하기
        tf0.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) { // 관심 받기
                if (tf0.getText().equals("전화번호를 입력하세요.")) {
                    tf0.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) { // 관심 잃기
                if (tf0.getText().equals("")) { // 값을 입력하지 않고, 다른 것을 선택하면 문구 띄우기, 이미 값이 써있으면 냅두기
                    tf0.setText("전화번호를 입력하세요.");
                }
            }
        });
        // 실제 버튼이 실행되게 하는 코드
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                result += lb0.getText();
                result += bt0.getText();
                result += cb0.isSelected(); //boolean, 참과 거짓으로 확인
                result += cb1.isSelected();
                result += rb0.isSelected();
                result += rb1.isSelected();
                result += tf0.getText();
                result += ta0.getText();
                result += cbox0.getSelectedIndex();
                result += cbox0.getSelectedItem();
                lbResult.setText(result);
            }
        });

        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == cb0) {
                    System.out.println("JCheckBox0 : " + cb0.isSelected());
                } else if (e.getSource() == cb1) {
                    System.out.println("JCheckBox1 : " + cb1.isSelected());
                } else if (e.getSource() == rb0) {
                    System.out.println("미성년자 : " + rb0.isSelected());
                } else if (e.getSource() == rb1) {
                    System.out.println("성인 : " + rb1.isSelected());
                } else if (e.getSource() == cbox0) {
                    System.out.println(cbox0.getSelectedItem());
                }
            }
        }; // 세미콜론 빼먹지 않기
        cb0.addItemListener(il);
        cb1.addItemListener(il);
        rb0.addItemListener(il);
        rb1.addItemListener(il);
        cbox0.addItemListener(il);

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox0);
        panel.add(lbResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
