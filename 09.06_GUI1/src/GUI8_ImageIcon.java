import javax.swing.*;
import java.awt.*;

public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        ImageIcon iiJpg = new ImageIcon(GUI8_ImageIcon.class.getResource("img/facebookjpg.jpg"));
        ImageIcon ilJpg_edit = new ImageIcon(iiJpg.getImage().getScaledInstance(iiJpg.getIconWidth()/4, iiJpg.getIconHeight()/4, Image.SCALE_DEFAULT));
        JLabel lbII = new JLabel(ilJpg_edit);


        panel.add(lbII);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
