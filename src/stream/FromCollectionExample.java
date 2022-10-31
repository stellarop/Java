package stream;

// �ڹ�8���� �߰��� ��Ʈ�� ��Ű������ ��Ʈ�� api �� �߰���
// BaseStream �������̽������� ��� ��Ʈ������ ����� �� �ִ� ���� �޼������ ���ǵǾ� ������
// �ڵ忡�� ���������� ������ �ʴ´�.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// �÷������κ��� ��Ʈ�� ���
public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("�輼��", 10),
            new Student("�̿���", 20),
            new Student("�鼺��", 30)
        );

        // studentList ��ü ��Ʈ������ ȣ��
        Stream<Student> stream = studentList.stream();

        // stream �� ����� ��ü ������ŭ �ݺ��Ѵ�.
        stream.forEach(s -> System.out.println(s.getName()));
    }
}
