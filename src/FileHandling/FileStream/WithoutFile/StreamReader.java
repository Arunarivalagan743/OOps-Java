package FileHandling.FileStream.WithoutFile;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReader {
    public static void main(String[] args) {
        try(InputStreamReader inr  = new InputStreamReader(System.in)) {
            int l = inr.read();
            while(inr.ready())
            {
                System.out.println((char) l);
                l = inr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
