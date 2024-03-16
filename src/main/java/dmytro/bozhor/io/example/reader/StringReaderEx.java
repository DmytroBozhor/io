package dmytro.bozhor.io.example.reader;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.StringReader;
import java.nio.file.Files;
import java.util.stream.Collectors;

public class StringReaderEx {
    @SneakyThrows
    public static void main(String[] args) {
        var lines = Files.lines(IOUtil.CYBERPUNK_TXT).collect(Collectors.joining(System.lineSeparator()));

        try (var stringReader = new StringReader(lines)) {
            int currentByte;
            while ((currentByte = stringReader.read()) != -1) {
                System.out.print((char) currentByte);
            }
        }
    }
}
