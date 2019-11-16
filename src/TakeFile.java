import java.io.*;
import java.util.ArrayList;

public class TakeFile {

    public void takeFile() {
        InputStreamReader fIS = null;
        int data=0;
         Main.message = new ArrayList<Character>();
        try {
            fIS = new InputStreamReader(new FileInputStream("D://cript.txt"), "UTF-8");

           while((data = fIS.read())!=-1){
               Main.message.add((char)data);
               //System.out.print((char)data);
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
