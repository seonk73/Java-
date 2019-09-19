import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // 실제 버튼이 실행되게 하는 코드
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bt0.setText("Clicked");
            }
        });

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