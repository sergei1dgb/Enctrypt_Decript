import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame {
    TakeFile takeFile = new TakeFile();
    EncryptDecrypt encryptDecrypt =  new EncryptDecrypt();
    JPanel jPanel = null;
    JTextField jTextField = null;

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
        JButton chooser = new JButton("Выбрать файл...");
        jTextField = new JTextField("Введите ключ для зашифрования");
        jPanel.add(jTextField);
        jPanel.add(crypting);
        jPanel.add(chooser);
        jPanel.add(decrypting);

        jTextField.addActionListener(new ActionListener() {
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
                    takeFile.takeFile(encryptDecrypt.encrypt());
                }
            }
        });

        decrypting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Main.key == null) {
                    JOptionPane.showMessageDialog(null, "Для начала работы введите ключ");
                } else {
                takeFile.takeFile(encryptDecrypt.dencrypt());
            }}
        });
    }

}
