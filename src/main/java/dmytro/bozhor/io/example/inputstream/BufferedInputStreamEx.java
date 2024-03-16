package dmytro.bozhor.io.example.inputstream;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {
    @SneakyThrows
    public static void main(String[] args) {
        try (var bufferedInputStream = new BufferedInputStream(new FileInputStream(IOUtil.CYBERPUNK_TXT.toFile()))) {
            var buffer = new byte[512];
            while (bufferedInputStream.read(buffer) > 0) {
                System.out.println(new String(buffer));
            }
        }
    }
}
