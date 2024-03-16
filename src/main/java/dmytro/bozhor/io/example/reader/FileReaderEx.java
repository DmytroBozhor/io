package dmytro.bozhor.io.example.reader;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx {
    @SneakyThrows
    public static void main(String[] args) {
        try (var fileReader = new FileReader(IOUtil.CYBERPUNK_TXT.toFile())) {
            int currentChar;
            while ((currentChar = fileReader.read()) != -1) {
                System.out.print((char) currentChar);
            }
        }
    }
}
