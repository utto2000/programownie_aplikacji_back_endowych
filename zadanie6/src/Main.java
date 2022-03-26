import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        int x = 1;
        while(line != null){
            System.out.println(x + ":" + line);
            line = bufferedReader.readLine();
            x++;
        }
    }
}
