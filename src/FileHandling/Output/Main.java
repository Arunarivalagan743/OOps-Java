package FileHandling.Output;

import java.io.*;



import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (OutputStream fos =
                     new FileOutputStream("output.txt",true)) {

            fos.write(65); // A
            fos.write("agd][djd".getBytes());

            System.out.println("Data written successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

