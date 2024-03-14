package dmytro.bozhor;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReaderRunner {
    @SneakyThrows
    public static void main(String[] args) {
        var file = Path.of("src", "main", "resources", "file", "io", "cyberpunk.txt").toFile();

        inputStreamReaderTest(file);

        separateLine();

        bufferedReaderTest(file);

        separateLine();

        
    }

    private static void bufferedReaderTest(File file) throws IOException {
        try (var bufferedReader = new BufferedReader(new FileReader(file))) {
            /*while (true) {
                var line = bufferedReader.readLine();
                if (line == null) break;
                System.out.println(line);
            }*/
            var text = bufferedReader.lines().collect(Collectors.joining("\n"));
            System.out.println(text);
        }
    }

    private static void separateLine() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    @SneakyThrows
    private static void inputStreamReaderTest(File file) {
        try (var inputStreamReader = new InputStreamReader(new FileInputStream(file))) {
            while (true) {
                var charReaded = inputStreamReader.read();
                if (charReaded == -1) break;
                System.out.print((char) charReaded);
            }
        }
    }
}
