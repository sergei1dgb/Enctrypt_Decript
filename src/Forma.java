import javax.swing.*;
import java.awt.*;

public class Forma extends JFrame {
    JPanel jPanel = null;
    public Forma(String name){
        super(name);
        setBounds(200, 200, 500, 500);
        setBackground(Color.GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setButtons();
        add(jPanel);
        setVisible(true);

    }

    public void setButtons(){
        jPanel = new JPanel();
        JButton crypting = new JButton("Зашифровать файлы");
        JButton decrypting = new JButton("Расшифровать файлы");
        jPanel.add(crypting);
        jPanel.add(decrypting);

    }

}
