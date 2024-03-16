package dmytro.bozhor.io.example.inputstream;

import dmytro.bozhor.IOUtil;
import lombok.SneakyThrows;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamEx {
    @SneakyThrows
    public static void main(String[] args) {
        try (var dataInputStream = new DataInputStream(new FileInputStream(IOUtil.CYBERPUNK_TXT.toFile()))) {
            byte currentByte;
            while ((currentByte = dataInputStream.readByte()) != -1) {
                System.out.print((char) currentByte);
            }
//            var content = dataInputStream.readBoolean();
//            var content = dataInputStream.readChar();
//            var content = dataInputStream.readDouble();
//            var content = dataInputStream.readFloat();
//            var content = dataInputStream.readInt();
//            var content = dataInputStream.readLong();
//            var content = dataInputStream.readShort();

//            var content = dataInputStream.readUTF();
        }
    }
}
