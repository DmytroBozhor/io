package dmytro.bozhor.tasks;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskThree {
    private static final Path JAVA_CLASS = Path.of(IOUtil.JAVA_CLASSES_DIR, "FileIORunner.java");

    public static void main(String[] args) {

    }

    private static void replacePublicWithPrivate() throws IOException {
        var fileContent = Files.readAllLines(JAVA_CLASS);

        var outputContent = fileContent
                .stream()
                .collect(Collectors.joining(System.lineSeparator()))
                .replaceAll("public", "private");

        Files.writeString(Path.of(IOUtil.IO_DIR, "output.java"), outputContent);
    }

    @SneakyThrows
    private static void write(String s, BufferedWriter bufferedWriter) {
        bufferedWriter.write(s);
        bufferedWriter.write(System.lineSeparator());
    }

    private static void calculatePublicOccurrences() throws IOException {
        var lines = Files.readAllLines(JAVA_CLASS);
        var count = lines.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .filter("public"::equals)
                .count();
        System.out.println(count);
    }
}
