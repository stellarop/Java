package stream;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 디렉터리 내용을 소스로 하는 스트림
public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\stream/stream.txt");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p-> System.out.println(p.getFileName()));
    }
}
