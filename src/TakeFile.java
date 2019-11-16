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
        try {
            fIS = new InputStreamReader(new FileInputStream("D://1.txt"), "UTF-8");

           while((data = fIS.read())!=-1){
               Main.message.add((char)data);
             }
           putFile.putFile(encryptDecrypt.encrypt());

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
