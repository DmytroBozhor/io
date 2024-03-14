package dmytro.bozhor;

import lombok.SneakyThrows;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

public class FileRunner {

    public static final String RESOURCES = Path.of("src", "main", "resources").toString();

    public static void main(String[] args) {

        var resourcesDirectory = new java.io.File(RESOURCES);
        System.out.println(resourcesDirectory.isDirectory());

        if (!resourcesDirectory.exists()) {
            System.out.println(resourcesDirectory.mkdirs());
        }

        initFiles();

        var resourcesFiles = Optional.ofNullable(resourcesDirectory.list());
        resourcesFiles.ifPresent(strings -> Arrays.stream(strings).forEach(System.out::println));

    }

    @SneakyThrows
    private static void initFiles() {
        new java.io.File(RESOURCES + "/first.txt").createNewFile();
        new java.io.File(RESOURCES + "/second.txt").createNewFile();
        new java.io.File(RESOURCES + "/third.txt").createNewFile();
    }
}