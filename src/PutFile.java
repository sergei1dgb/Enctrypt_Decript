import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class PutFile {

    // метод отправляет файлы обратно в папку с тем же именем
    public void putFile(ArrayList<Character> arrayList, File file) {
        BufferedWriter foS = null;
        try {
            foS = new BufferedWriter(new FileWriter( "D://" +  file.getName() ));

            for (int j = 0; j<arrayList.size(); j++)
                foS.write(arrayList.get(j));

        } catch (IOException e) {
            System.out.println("Файлы не найдены");
        } finally {
            try {
                foS.flush();  // метод для гарантированной отправки всех байт в файл
                foS.close();   // закрываем поток
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }}

