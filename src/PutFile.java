import java.io.*;
import java.util.ArrayList;

public class PutFile {


    public void putFile(ArrayList<Character> arrayList, File file) {
        OutputStreamWriter foS = null;
        try {
            foS = new OutputStreamWriter(new FileOutputStream( "D://" + file.getName() ), "UTF-8");
            for (int j = 0; j<arrayList.size() ; j++) {
                foS.write(arrayList.get(j));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                foS.flush();
                foS.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }}

