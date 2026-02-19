package FileHandling.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        try(FileReader inr= new FileReader(new java.io.File("src/FileHandling/FileStream/note.txt"))) {
            int l = inr.read();
            while(inr.ready())
            {
                System.out.println((char) l);
                l = inr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
