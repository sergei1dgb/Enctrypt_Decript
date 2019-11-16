import java.util.ArrayList;

public class Main {

    static String key = "1234ASD56789ASD";
    static ArrayList<Character> message = null;

    public static void main(String[] args) {
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        TakeFile takeFile = new TakeFile();
        PutFile putFile = new PutFile();
        takeFile.takeFile();
        putFile.putFile(encryptDecrypt.dencrypt());
        //putFile.putFile(encryptDecrypt.encrypt());

    }
}
