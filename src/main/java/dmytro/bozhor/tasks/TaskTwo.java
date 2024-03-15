package dmytro.bozhor.tasks;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.util.Arrays;

public class TaskTwo {
    private static String previousWord = " ";

    @SneakyThrows
    public static void main(String[] args) {
        try (var bufferedReader = Files.newBufferedReader(IOUtil.CYBERPUNK_TXT)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                var words = line.split(" ");
                Arrays.stream(words)
                        .filter(s -> !s.isBlank())
                        .forEach(TaskTwo::checkIfCharsEqual);
            }
        }
    }

    private static void checkIfCharsEqual(String currentWord) {
        var lastChar = previousWord.charAt(previousWord.length() - 1);
        var firstChar = currentWord.charAt(0);
        if (lastChar == firstChar) {
            System.out.println(previousWord + currentWord);
        }
        previousWord = currentWord;
    }
}
