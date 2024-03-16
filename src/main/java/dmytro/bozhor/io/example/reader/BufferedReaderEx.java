package dmytro.bozhor.io.example.reader;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.util.stream.Collectors;

public class BufferedReaderEx {
    @SneakyThrows
    public static void main(String[] args) {
        try (var bufferedReader = Files.newBufferedReader(IOUtil.CYBERPUNK_TXT)) {
            var content = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
            System.out.println(content);
        }
    }
}
