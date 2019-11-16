import java.io.*;
import java.util.ArrayList;

public class PutFile {


    public void putFile(ArrayList<Character> arrayList) {
        OutputStreamWriter foS = null;
        try {
            foS = new OutputStreamWriter(new FileOutputStream("D://textNew.txt"), "UTF-8");

            for (int i = 0; i<arrayList.size() ; i++) {
                foS.write(arrayList.get(i));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                foS.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }}

