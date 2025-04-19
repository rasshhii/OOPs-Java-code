import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, File Handling in Java!");
            writer.close();

            FileReader reader = new FileReader("output.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
