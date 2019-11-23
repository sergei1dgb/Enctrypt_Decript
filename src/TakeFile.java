import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class TakeFile {
    PutFile putFile = null;
    EncryptDecrypt encryptDecrypt = null;

    public File[] findFileByEnd(){
        File file = new File("D:");
        // получаем список файлов из указанной папки
            File[] massFiles = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File file, String s) {
                    return s.endsWith("txt");
                }
            });
            return massFiles;
    }

    public File chooseFile(){
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog();
        File chosenFile = chooser.getSelectedFile();
        return chosenFile;
    }

    // получаем файл(файлы) и действуем с ними согласно заявленной операции
    public void takeFile(File chosenFile, String operation) {
            putFile = new PutFile();
            encryptDecrypt = new EncryptDecrypt();
            BufferedReader fIS = null;

            int data = 0;
            Main.message = new ArrayList<Character>();

            File file = new File("D:");

            // получаем список файлов из указанной папки
            try {
                // цикл считывает файлы по очереди из созданного списка и работает с ними согласно алгоритму

                    fIS = new BufferedReader(new FileReader(chosenFile));

                    while ((data = fIS.read()) != -1)
                        Main.message.add((char) data);

                    if(operation.equals("encrypt")){
                        putFile.putFile( encryptDecrypt.encrypt(), chosenFile);  //  шифруем файл и отправляем обратно
                    }
                    else if(operation.equals("dencrypt")){
                        putFile.putFile( encryptDecrypt.dencrypt(), chosenFile);   //  расшифровываем файл и отправляем обратно
                    }
                    Main.message.clear();     // очищаем сообщение после отправки, чтобы не было наслоения при большом количестве файлов
                    fIS.close();

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fIS.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

