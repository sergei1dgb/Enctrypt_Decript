import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Forma extends JFrame {
    TakeFile takeFile = new TakeFile();
    JPanel jPanel = null;
    JTextField jTextField = null;
    static String nameFile = null;
    static File chosenFile = null;

    public Forma(String name){
        super(name);
        setBackground(Color.GRAY);
        setLocation(100, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setButtons();
        add(jPanel);
        setVisible(true);
        pack(); // вызывается для установления оптимального размера окна и только после добавления компонентов
    }

    // метод создает и добавляет компоненты на панель
    public void setButtons(){
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
        JButton crypting = new JButton("Зашифровать файл");
        JButton decrypting = new JButton("Расшифровать файл");
        JButton chooser = new JButton("Выбрать файл...");
        JButton enterKey = new JButton("ввести ключ");
        JLabel labelForEnterKey = new JLabel("Введите ключ");
        jTextField = new JTextField(30);
        jPanel.add(labelForEnterKey);
        jPanel.add(jTextField);
        jPanel.add(enterKey);
        jPanel.add(chooser);
        jPanel.add(crypting);
        jPanel.add(decrypting);

        enterKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.key = jTextField.getText();
            }
        });

        chooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                chosenFile = takeFile.chooseFile(Forma.this);
        }
        });

        crypting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Main.key == null) {
                    JOptionPane.showMessageDialog(null, "Для начала работы введите ключ");
                } else {
                    if(chosenFile==null) JOptionPane.showMessageDialog(Forma.this, "Выберите файл!");
                    else {
                        takeFile.takeFile(chosenFile, "encrypt"); // получаем файлы, шифруем и отправляем в то же место  с тем же названием
                        JOptionPane.showMessageDialog(Forma.this, "Файл зашифрован");
                    }
                }
            }
        });

        decrypting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Main.key == null) {
                    JOptionPane.showMessageDialog(null, "Для начала работы введите ключ");
                } else {
                    if(chosenFile==null) JOptionPane.showMessageDialog(Forma.this, "Выберите файл!");
                    else {
                        takeFile.takeFile(chosenFile, "dencrypt"); // получаем файлы, расшифровываем и отправляем в то же место  с тем же названием
                        JOptionPane.showMessageDialog(Forma.this, "Файл расшифрован");
                    }
            }
            }
        });
    }

}
