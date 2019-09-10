import javax.swing.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("금요일");
        JButton button = new JButton("오예");

        frame.add(panel);
        panel.add(label);
        panel.add(button);

        frame.pack(); //구성요소가 있으면 요소의 크기만큼 창이 보이게 해줌
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 종료시키기
    }
}
