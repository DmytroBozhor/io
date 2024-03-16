package dmytro.bozhor.io.example.inputstream;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
    @SneakyThrows
    public static void main(String[] args) {
        try (var objectInputStream = new ObjectInputStream(new FileInputStream(IOUtil.CYBERPUNK_TXT.toFile()))) {
            var object = objectInputStream.readObject();
            System.out.println(object);
        }
    }
}
