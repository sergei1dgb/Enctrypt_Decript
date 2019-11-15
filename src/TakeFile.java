import java.io.*;
import java.util.ArrayList;

public class TakeFile {
    private ArrayList<Integer> list=null;
    public ArrayList<Integer> getList(){
        return this.list;
    }
    public void takeFile() {
        InputStreamReader fIS = null;
        OutputStreamWriter fOS = null;
        int data=0;
         list = new ArrayList<Integer>();
        try {

            fIS = new InputStreamReader(new FileInputStream("D://text.txt"), "UTF-8");
            fOS = new OutputStreamWriter(new FileOutputStream("D://cript.sergo"));

           while((data = fIS.read())!=-1){
               list.add(data);
               System.out.print((char)data);
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
