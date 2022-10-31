package stream;

//��Ʈ���� �÷����� ��ҿ� ���� �߰� ó���� ���� ó���� ������ �� �ִµ�
// �߰� ó�������� ����, ���͸�, ������ �����ϰ� ����ó������ �ݺ�, ī����, ���, ���� �� ���踦 ó���Ѵ�.

// �л� ��ü�� ��ҷ� ������ �÷����� �ִٸ�
// �߰� ó�������� �л��� ������ �̾Ƴ��� ���� ó������ ������ ��հ��� �����Ѵ�.

import java.util.Arrays;
import java.util.List;

// ��Ʈ���� �߰�ó���� ���� ó��
public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("�輼��", 80),
                new Student("�鼺��", 87),
                new Student("�̿���", 74)
        );

        // studentList �� ��Ʈ���� ���� Ÿ������ ����.
        double avg = studentList.stream()
                // �߰�ó��(�л� ��ü�� ������ ����)
                .mapToInt(Student :: getScore)
                // ���� ó��(��� ����)
                .average()
                .getAsDouble();
        System.out.println("��� ���� : " + avg);
    }
}
