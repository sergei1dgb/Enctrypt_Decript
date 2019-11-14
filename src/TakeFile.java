import java.io.*;

public class TakeFile {
    public int takeFile() {
        int data=0;
        File file = new File("D://text.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            data = bufferedInputStream.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
