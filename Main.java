import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

        public static void init_interface() {
            JFrame jf = new JFrame();
            jf.setSize(500, 500);
            jf.setTitle("Merhaba, JFrame!");
            ImageIcon icon = new ImageIcon("D:\\favicon.png");
            jf.setIconImage(icon.getImage());
            jf.setVisible(true);
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton buton = new JButton("Input'a yazıyı yazdır");
            buton.setBounds(50,50,50,50);
            buton.setSize(190, 50);
            jf.setLayout(null);
            JTextField jt = new JTextField();
            jt.setBounds(290, 50, 150, 20);
            jf.add(buton);jf.add(jt);

            buton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jt.setText("Selam");
                }
            });
            jt.setSize(170, 50);
        }


    public static void main(String[] args) {
    init_interface();
    }
}

