import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncryptDecrypt {
    Gamma gammaObj = null;

    public EncryptDecrypt() {
        gammaObj = new Gamma();
    }

    public char[] encrypt(){
        if(gammaObj.getGammaNew().size()<Main.message.length())
        gammaObj.createGamma();
        char[] cryptCh = new char[Main.message.length()];
        for(int j = 0; j<Main.message.length(); j++)
            cryptCh[j] = (char)(Main.message.charAt(j)+gammaObj.getGammaNew().get(j));
        System.out.println(gammaObj.getGammaNew());
        return cryptCh;
    }

    public char[] dencrypt(){
        if(gammaObj.getGammaNew().size()<Main.message.length())
        gammaObj.createGamma();
        char[] decryptCh = new char[Main.message.length()];
        for(int j = 0; j<Main.message.length(); j++)
            decryptCh[j] = (char)(Main.message.charAt(j)-gammaObj.getGammaNew().get(j));
        System.out.println(gammaObj.getGammaNew());
        return decryptCh;
    }

}
