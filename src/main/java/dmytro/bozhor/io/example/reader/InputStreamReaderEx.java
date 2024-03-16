package dmytro.bozhor.io.example.reader;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    @SneakyThrows
    public static void main(String[] args) {
        try (var inputStreamReader = new InputStreamReader(new FileInputStream(IOUtil.CYBERPUNK_TXT.toFile()))) {
            int currentChar;
            while ((currentChar = inputStreamReader.read()) != -1) {
                System.out.print((char) currentChar);
            }
        }
    }
}
