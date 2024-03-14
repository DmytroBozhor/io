package dmytro.bozhor;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.nio.file.Path;

public class FileIORunner {
    @SneakyThrows
    public static void main(String[] args) {
        var resources = Path.of("src", "main", "resources", "file", "io", "cyberpunk.txt").toFile();

        try (var fileInputStream = new FileInputStream(resources)) {
            System.out.println(fileInputStream.available());

            var bytes = fileInputStream.readAllBytes();
            System.out.println(new String(bytes));
        }
    }
}
