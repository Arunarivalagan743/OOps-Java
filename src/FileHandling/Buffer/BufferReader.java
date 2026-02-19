package FileHandling.Buffer;

import java.io.*;

public class BufferReader {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//import java.io.*;
//
//public class StreamReader {
//    public static void main(String[] args) {
//
//        try (BufferedReader br = new BufferedReader(
//                new FileReader("src/FileHandling/FileStream/note.txt"))) {
//
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
