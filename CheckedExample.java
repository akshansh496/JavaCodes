import java.io.*;

public class CheckedExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("nonexistent.txt");  // FileNotFoundException
        fr.read();
        fr.close();
    }
}
