package stream;

// ��Ʈ���� �������� ���͸�,����,����,�׷��� �� �߰� ó����
// �հ�,���,�ִ밪,�ּҰ� �� ���� ó���� ���������� ���� �ذ��Ѵ�.
// ������������ ���� ���� ��Ʈ���� ����Ǿ� �ִ� ����

import java.util.Arrays;
import java.util.List;

// ��Ʈ�� ����������
public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("�輼��", Member.women, 21),
                new Member("�̿���", Member.men, 24),
                new Member("�鼺��", Member.men, 25),
                new Member("�����", Member.women, 28)
        );

        // list �� ����� �������� ��Ʈ�� ��ü
        double ageAvg = list.stream()
                // �߰� ó�� ��Ʈ��(list ��ü���� ���ڸ� ���͸��Ѵ�.)
                .filter(m -> m.getSex()==Member.men)
                // ���ڸ� ���͸��� ������ ���̸� �����´�.
                .mapToInt(Member :: getAge)
                // ����ó�� (���� ��� ���̸� ���Ѵ�)
                .average()
                .getAsDouble();

        System.out.println("���� ��� ���� : " + ageAvg);
    }
}
