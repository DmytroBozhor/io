package dmytro.bozhor;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.nio.file.Path;

private class FileIORunner {
    @SneakyThrows
    private static void main(String[] args) {
        var resources = IOUtil.CYBERPUNK_TXT.toFile();

        try (var fileInputStream = new FileInputStream(resources)) {
            System.out.println(fileInputStream.available());

            var bytes = fileInputStream.readAllBytes();
            System.out.println(new String(bytes));
        }
    }
}