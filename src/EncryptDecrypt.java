import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncryptDecrypt {

    public char[] encrypt(String gamma, String str){
        char[] gammaCh = gamma.toCharArray();
        ArrayList<Character> gammaNew = new ArrayList<Character>();
        for(char c : gammaCh){
            gammaNew.add(c);
        }
        char[] strCh = str.toCharArray();
        int i = 0;
        while(gammaNew.size()<strCh.length) {
            gammaNew.add(gammaNew.get(i));
            i++;
            }

        char[] cryptCh = new char[str.length()];
        for(int j = 0; j<strCh.length; j++)
            cryptCh[j] = (char)(strCh[j]+gammaNew.get(j));
        return cryptCh;
    }

    public char[] dencrypt(String gamma, String str){
        char[] gammaCh = gamma.toCharArray();
        ArrayList<Character> gammaNew = new ArrayList<Character>();
        for(char c : gammaCh){
            gammaNew.add(c);
        }
        char[] strCh = str.toCharArray();
        int i = 0;
        while(gammaNew.size()<strCh.length) {
            gammaNew.add(gammaNew.get(i));
            i++;
        }

        char[] decryptCh = new char[str.length()];
        for(int j = 0; j<strCh.length; j++)
            decryptCh[j] = (char)(strCh[j]-gammaNew.get(j));
        return decryptCh;
    }

}
