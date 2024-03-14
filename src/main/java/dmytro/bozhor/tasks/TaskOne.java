package dmytro.bozhor.tasks;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Scanner;

public class TaskOne {
    private static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u', 'y');

    @SneakyThrows
    public static void main(String[] args) {
        try (var scanner = new Scanner(IOUtil.CYBERPUNK_TXT)) {
            while (scanner.hasNext()) {
                var next = scanner.next();
                validate(next);
            }
        }
    }

    private static void validate(String next) {
        if (VOWELS.contains(next.charAt(0))) {
            if (next.length() >= 4) {
                System.out.println(next);
            }
        }
    }
}

