package lambdaExpression;


// Predicate �Լ��� �������̽��� �Ķ���Ϳ� boolean ���� ���� �ִ� testOOO �޼��带 ������.
// �� �޼���� �Ķ���� ���� ��ȸ �� true, false �� �����Ѵ�.

import java.util.Arrays;
import java.util.List;

// Predicate �Լ��� �������̽�
public class Predicate {
    // list �Լ�
    private static List<Student2> list = Arrays.asList(
            // Student2 class�� �ش� �� ����
            new Student2("�̿���", "����", 24),
            new Student2("�輼��", "����", 21),
            new Student2("�����", "����", 28),
            new Student2("�鼺��", "����", 25)
    );

    // ��� �޼���
    public static double avg(java.util.function.Predicate<Student2> predicate){
        // list �� Ƚ��
        int count = 0;
        // �հ�
        int sum = 0;

        // student2 list ��ŭ ����
        for(Student2 student2 : list){
            // list true �� ���� ��
            if(predicate.test(student2)){
                // ī��Ʈ ����
                count++;
                // true �� ���� �����ش�
                sum += student2.getAge();
            }
        }
        // �հ� / list �� Ƚ��
        return (double) sum / count;
    }

    public static void main(String[] args) {
        // test() �޼���� �Ķ���� ������ ��ü �ϳ��� ������ ���ٽĵ� �� ���� �Ķ���� ���
        // test() �޼����� ���� Ÿ���� boolean, ���ٽ��� ���� ���� boolean �� ����
        // Ÿ���� Student2 �̹Ƿ� �Ķ���� Ÿ���� Student2 �� �ȴ�.
        // t.getSex() �޼���� Student2 ��ü�� getSex() �޼��带 ȣ���ؼ� ���� / ���ڸ� ��´�
        // equals �� �̿��Ͽ� �ش� ������ true �� �����Ѵ�.
        double ageMan = avg( t -> t.getSex().equals("����"));
        System.out.println("���� ��� ���� : " + ageMan);

        double ageWoman = avg(t-> t.getSex().equals("����"));
        System.out.println("���� ��� ���� : " + ageWoman);

    }


}
