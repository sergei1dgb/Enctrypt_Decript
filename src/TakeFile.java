import java.io.*;
import java.util.ArrayList;

public class TakeFile {
    EncryptDecrypt encryptDecrypt = null;
    PutFile putFile = null;
    public void takeFile() {
        encryptDecrypt = new EncryptDecrypt();
        putFile = new PutFile();
        InputStreamReader fIS = null;
        int data=0;
         Main.message = new ArrayList<Character>();
         File file = new File("D:");
        try {
            File[] massFiles = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File file, String s) {
                    return s.endsWith("txt");
                }
            });
            for(File file1: massFiles) {
                fIS = new InputStreamReader(new FileInputStream(file1), "UTF-8");

                while ((data = fIS.read()) != -1) {
                    Main.message.add((char) data);
                }
                putFile.putFile(encryptDecrypt.dencrypt(), file1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fIS.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
