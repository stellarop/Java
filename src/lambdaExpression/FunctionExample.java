package lambdaExpression;

// Function �Լ��� �������̽��� Ư¡�� �Ķ���Ͱ��� ���ϰ��� �ִ� applyOOO �޼��带 ������ �ִ�.
// �� �޼������ �Ķ���Ͱ����� ����(Ÿ�� ��ȯ) �ϴ� ��Ȱ�� �Ѵ�.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

// Function �Լ��� �������̽�
public class FunctionExample {
    private static List<Student> list = Arrays.asList(
        // ������ �Ķ���Ϳ� �� �߰�
        new Student("�̿���", 90, 96),
        new Student("�輼��", 88, 93)
    );

    // Function <T,R>  �������̽��� Ÿ�� Ÿ������ �ϴ� ���ٽ��� ������ ���� �ۼ��Ѵ�.
    // apply() �޼���� �Ķ���� ������ T ��ü�� �ϳ� �����Ƿ� ���ٽĵ� �� ���� �Ķ���͸� ����Ѵ�.
    // apply() �޼����� ���� Ÿ���� String Ÿ�� t �Ķ���� Ÿ���� Student Ŭ���� �̴�
    // ���ٽ� �߰�ȣ�� ���� ���� R ��ü�� ��(String)
    // t.getName()�� Student ��ü�� getName() �޼��带 ȣ���ؼ� �л� �̸��� ��´�
    // ���ٽ� Ÿ�� ����
    public static void printString(Function<Student, String> function) {
        // list�� ����� �׸� ����ŭ ����
        for(Student student : list){
            // [���ٽ� ����] String Ÿ��(�̸�) ����
            // �Ķ���ͷ� ���� �̸� ��� apply()�� String
            System.out.println(function.apply(student) + "");
        }
        System.out.println();
    };

    // applyAsInt() �޼���� �Ķ���Ͱ����� T ��ü�� �ϳ� �����Ƿ� ���ٽĵ� �� ���� �Ķ���� ���� ���´�.
    // applyAsInt() �޼����� ���� Ÿ���� int ���ٽ� �߰�ȣ�� ���ϰ��� int�� ��.
    // T�� Student Ÿ���̹Ƿ� t �Ķ���� Ÿ���� Student�� ��.
    // t.getScore() �޼���� Student ��ü�� getScore() �޼��带 ȣ���ؼ� ��´�.
    public static void printInt(ToIntFunction<Student> function){
        // list�� ����� �׸� ����ŭ ����
        for(Student student : list){
            // [���ٽ� ����] int Ÿ��(����) ����
            // �Ķ���ͷ� ���� ���� ��� applyAsInt()�� int
            System.out.println(function.applyAsInt(student) + "");
        }
        System.out.println();
    };

    public static void main(String[] args) {
        // return �� ���� ��� �߰�ȣ{}, return ���� ����
        System.out.println("�л� �̸�");
        // student ��ü�� ����� �̸�(String)�� �ش� �޼��� �Ķ���ͷ� ����
        printString( t -> t.getName());

        // student ��ü�� ����� ����(int)�� �ش� �޼��� �Ķ���ͷ� ����
        System.out.println("���� ����");
        printInt( t -> t.getEnglishScore());

        System.out.println("���� ����");
        printInt( t -> t.getMathScore());
    }
}
