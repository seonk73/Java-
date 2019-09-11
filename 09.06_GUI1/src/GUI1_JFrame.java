import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int 화w = screenSize.width;
        int 화h = screenSize.height;
        int 창w = 400;
        int 창h = 200;
        frame.setPreferredSize(new Dimension(창w, 창h));
        frame.setLocation((화w-창w) / 2, (화h-창h) / 2);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("금요일");
        JButton button = new JButton("오예");

        frame.add(panel);
        panel.add(label);
        panel.add(button);

        frame.pack(); //구성요소가 있으면 요소의 크기만큼 창이 보이게 해줌
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 종료시키기
    }
}
