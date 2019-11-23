import java.util.ArrayList;

public class Gamma {

    private ArrayList<Character> gamma = new ArrayList<Character>();

    public  ArrayList<Character> getGammaNew() {
        return gamma;
    }

    public void setGammaNew(ArrayList<Character> gammaNew) {
        this.gamma = gammaNew;
    }

    // создание гаммы, равной длине сообщения
    public  void createGamma(){
        for(char c : Main.key.toCharArray()){
            gamma.add(c);                       // копируем ключ в гамму
        }
        int i = 0;
        while(gamma.size()<Main.message.size()) {
            gamma.add(gamma.get(i));                    // делаем гамму равной сообщению за счет повторения ключа
            i++;
        }
    }
}
