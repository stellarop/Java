package stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// ���� ������ �ҽ��� �ϴ� ��Ʈ��
public class FromFileContentExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/stream/stream.txt");
        Stream<String> stream;

        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(s -> System.out.println(s));

        System.out.println();

    }
}
