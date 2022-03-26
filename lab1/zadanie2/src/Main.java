import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            byte b[] = text.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(b);
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
