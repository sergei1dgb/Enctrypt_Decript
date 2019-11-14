import java.io.*;

public class TakeFile {
    public void takeFile() {
        int data=0;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("D://text.txt"));
           while((data = fileInputStream.read())!=-1){
            data = fileInputStream.read();
            System.out.print((char)data);
           }
           fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println();
    }
}
