import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame {
    TakeFile takeFile = new TakeFile();
    JPanel jPanel = null;
    JTextField jTextField = null;
    static String nameFile = null;

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
        jPanel.setLayout(new FlowLayout());
        JButton crypting = new JButton("Зашифровать файлы");
        JButton decrypting = new JButton("Расшифровать файлы");
        JButton chooser = new JButton("Выбрать файл...");
        JButton enterKey = new JButton("ввести ключ");
        jTextField = new JTextField("Введите ключ и нажмите Enter");
        jPanel.add(jTextField);
        jPanel.add(enterKey);
        jPanel.add(crypting);
        jPanel.add(chooser);
        jPanel.add(decrypting);

        enterKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.key = jTextField.getText();
            }
        });

        crypting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Main.key == null) {
                    JOptionPane.showMessageDialog(null, "Для начала работы введите ключ");
                } else {
                    takeFile.takeFile("encrypt");
                }
            }
        });

        decrypting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Main.key == null) {
                    JOptionPane.showMessageDialog(null, "Для начала работы введите ключ");
                } else {
                takeFile.takeFile("dencrypt");
            }}
        });
    }

}
