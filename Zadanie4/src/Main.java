import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
public class Main {
    public static void main(String[] args)  {
        CRC32 crc32 = new CRC32();
        System.out.println("Easy way");
        crc32.update("This is example text ...".getBytes(StandardCharsets.UTF_8));
        System.out.println(crc32.getValue());
// problem z zamienieniem operatorów z js na jave
    }
}
