import java.util.ArrayList;

public class Gamma {

    private ArrayList<Character> gamma = new ArrayList<Character>();

    public  ArrayList<Character> getGammaNew() {
        return gamma;
    }

    public void setGammaNew(ArrayList<Character> gammaNew) {
        this.gamma = gammaNew;
    }

    public  void createGamma(){
        for(char c : Main.key.toCharArray()){
            gamma.add(c);
        }
        int i = 0;
        while(gamma.size()<Main.message.length()) {
            gamma.add(gamma.get(i));
            i++;
        }
    }
}
