package dmytro.bozhor;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

public class IORunner {

    public static final String RESOURCES = Path.of("src", "main", "resources").toString();

    public static void main(String[] args) {

        var resourcesDirectory = new File(RESOURCES);
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
        new File(RESOURCES + "/first.txt").createNewFile();
        new File(RESOURCES + "/second.txt").createNewFile();
        new File(RESOURCES + "/third.txt").createNewFile();
    }
}