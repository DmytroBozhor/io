package dmytro.bozhor;

import java.nio.file.Path;

public final class IOUtil {

    public static final String BASE_RESOURCE_DIR = Path.of("src", "main", "resources").toString();
    public static final String IO_DIR = Path.of(BASE_RESOURCE_DIR, "file", "io").toString();
    public static final Path CYBERPUNK_TXT = Path.of(IO_DIR, "cyberpunk.txt");
    public static final String JAVA_CLASSES_DIR = Path.of("src", "main", "java", "dmytro", "bozhor").toString();

    private IOUtil() {
    }
}
