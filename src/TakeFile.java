import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class TakeFile {
    PutFile putFile = null;
    EncryptDecrypt encryptDecrypt = null;

    public void takeFile(String operation) {
            putFile = new PutFile();
            encryptDecrypt = new EncryptDecrypt();
            BufferedReader fIS = null;
            int data = 0;
            Main.message = new ArrayList<Character>();
            File file = new File("D:");
            try {
                File[] massFiles = file.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File file, String s) {
                        return s.endsWith("txt");
                    }
                });

                for (File file1 : massFiles) {
                    fIS = new BufferedReader(new FileReader(file1));

                    while ((data = fIS.read()) != -1)
                        Main.message.add((char) data);

                    if(operation.equals("encrypt")){
                        putFile.putFile( encryptDecrypt.encrypt(), file1);
                    }
                    else if(operation.equals("dencrypt")){
                        putFile.putFile( encryptDecrypt.dencrypt(), file1);
                    }
                    Main.message.clear();
                    fIS.close();
                }
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

