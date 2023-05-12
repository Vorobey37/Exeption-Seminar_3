import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * task_0
 */
public class task_0 {
    public static void main(String[] args) {
        /*
         * Перепишите
следующийкод,
используя ресурсный
try
         */
    }

    public static void fwLine(Path pathRead, Path pathWrite) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try (in = Files.newBufferedReader(pathRead);
        out = Files.newBufferedWriter(pathWrite))
        {
            out.write(in.readLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}