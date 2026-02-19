package FileHandling.FileStream;

import java.io.File;
import java.io.FileInputStream;

public class StreamReader {
    public static void main(String[] args) {

        try (FileInputStream fr =
                     new FileInputStream(new File("src/FileHandling/FileStream/note.txt"))) {

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
