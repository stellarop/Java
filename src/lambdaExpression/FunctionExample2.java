package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

// Function �Լ��� �������̽�
public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
            // ������ �Ķ���Ϳ� �� �߰�
            new Student("�̿���", 90, 96),
            new Student("�輼��", 88, 93)
    );

    // ToIntFunction ���׸� Ÿ�� Student class ����
    // Student class ���� ����� �̸�, ��������, ���������� ���������.
    // ��� �� �޼���
    public static double avg(ToIntFunction<Student> function){
      int sum = 0;

      // student List ���̸�ŭ �ݺ�
      for(Student student : list){
          // student ��ü�� ����� int Ÿ���� ��� ���Ѵ�.
        sum += function.applyAsInt(student);
      }
      // ���� �հ踦 list �� �ִ� ����ŭ ������ ���� ��.
      // ���� �հ� / 2
      double avg = (double) sum / list.size();
      return avg;
    }

    public static void main(String[] args) {
        // student �� ����� ���� ������ avg() �Ķ���Ϳ� ���� �� ���� �� ����
        double englishAvg = avg( s-> s.getEnglishScore());
        System.out.println("���� ��� ���� : " + englishAvg);

        // student �� ����� ���� ������ avg() �Ķ���Ϳ� ���� �� ���� �� ����
        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("���� ��� ���� : " + mathAvg);
    }

}
