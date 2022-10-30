package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// ��Ʈ���� Ư¡
// Stream �� Iterator �� ����� ��Ȱ�� �ϴ� �ݺ������� ���ٽ����� ��� ó�� �ڵ带
// �����ϴ� ���� ���� �ݺ��ڸ� ����ϹǷ� ���� ó���� ���ٴ� ��, �߰� ó���� ���� ó�� �۾��� ����
// �ϴ� ������ ���� ���̸� ������ �ִ�.

// ���ٽ����� ��� ó�� �ڵ带 ����
// Stream �� �����ϴ� ��κ��� ��� ó�� �޼���� �Լ��� �������̽� �Ű� Ÿ���� ������ ������
// ���ٽ�, �޼��� ������ �̿��ؼ� ��� ó�� ������ �Ű������� ������ �� �ִ�.

// ��� ó���� ���� ���ٽ�
public class LambdaExpressionExample {
    public static void main(String[] args) {
        // ��ü ����
        List<Student> list = Arrays.asList(
                // Student �����ڿ� �ش� �� ����
                new Student("�輼��", 21),
                new Student("�̿���", 24)
        );

        // ��Ʈ���� ��´�.
        Stream<Student> stream = list.stream();
        // list �÷��ǿ��� Student �� ������ ���ٽ��� �Ű������� �����Ѵ�.
        stream.forEach( s-> {
            // Student s�� ��� ��ü�� ������ ���.
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
