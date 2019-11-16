import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncryptDecrypt {
    Gamma gammaObj = null;

    public EncryptDecrypt() {
        gammaObj = new Gamma();
    }

    public ArrayList<Character> encrypt(){
        if(gammaObj.getGammaNew().size()<Main.message.size())
        gammaObj.createGamma();
        ArrayList<Character> cryptCh = new ArrayList<Character>();
        for(int j = 0; j<Main.message.size(); j++)
            cryptCh.add((char)(Main.message.get(j)+gammaObj.getGammaNew().get(j)));
        return cryptCh;
    }

    public ArrayList<Character> dencrypt(){
        if(gammaObj.getGammaNew().size()<Main.message.size())
        gammaObj.createGamma();
        ArrayList<Character> decryptCh = new ArrayList<Character>();
        for(int j = 0; j<Main.message.size(); j++)
            decryptCh.add((char)(Main.message.get(j)-gammaObj.getGammaNew().get(j)));
        return decryptCh;
    }

}
