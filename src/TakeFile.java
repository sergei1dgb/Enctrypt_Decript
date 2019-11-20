import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class TakeFile {
    PutFile putFile = null;

    public void takeFile(ArrayList<Character> cry_decry) {
            putFile = new PutFile();
            BufferedReader fIS = null;
            int data = 0;
            Main.message = new ArrayList<Character>();
            File file = new File("D:");
            try {
                File[] massFiles = file.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File file, String s) {
                        return s.endsWith("txt");
                    }
                });

                for (File file1 : massFiles) {
                    fIS = new BufferedReader(new FileReader(file1));

                    while ((data = fIS.read()) != -1)
                        Main.message.add((char) data);

                    putFile.putFile(cry_decry, file1);
                    Main.message.clear();
                    fIS.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fIS.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

