package dmytro.bozhor.io.example.inputstream;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.FileInputStream;

public class FileInputStreamEx {
    @SneakyThrows
    public static void main(String[] args) {
        try (var fileInputStream = new FileInputStream(IOUtil.CYBERPUNK_TXT.toFile())) {
            int currentByte;
            while ((currentByte = fileInputStream.read()) != -1) {
                System.out.print((char) currentByte);
            }
        }
    }
}
