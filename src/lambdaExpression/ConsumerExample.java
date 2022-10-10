package lambdaExpression;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

// consume �Լ��� �������̽��� Ư¡�� ���ϰ��� ���� accept() �޼��带 ������.
// accept() �޼���� �Ű� ���� �Һ��ϴ� ������ �Ѵ� => ���� ���� ����.(void)

// consume �Լ��� �������̽�
public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer<T> �������̽��� Ÿ�� Ÿ������ �ϴ� ���ٽ��� ������ ���� �ۼ�
        Consumer<String> consumer = t -> System.out.println(t + "8");
        // accept() �޼���� �Ķ���Ͱ����� T ��ü �ϳ��� ������
        // Ÿ�� �Ķ���Ϳ� String�� ���ԵǾ� ���ٽ� T �Ķ���͵� String
        consumer.accept("java");

        // BiConsumer<T,U> �������̽��� Ÿ�� Ÿ������ �ϴ� ���ٽ��� ������ ���� �ۼ�
        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        // accept() �޼���� �Ķ���Ͱ����� T, U �� ���� ��ü�� �����Ƿ� ���ٽĵ� �� ���� �Ķ���� ���
        // Ÿ�� �Ķ���Ͱ� ���� String�� ����, T, U �Ķ���� Ÿ���� String
        biConsumer.accept("java", "8");

        // BiConsumer �������̽��� Ÿ�� Ÿ������ �ϴ� ���ٽ��� ������ ���� �ۼ�
        DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
        // accept() �޼���� �Ķ���ͷ� double�� �����Ƿ� ���ٽĵ� �Ѱ��� �Ķ���� Ÿ���� ������.
        // d Ÿ���� ���������� double
        doubleConsumer.accept(8.0);

        // ObjIntConsumer<T> �������̽� Ÿ�� Ÿ������ �ϴ� ���ٽ��� ������ ���� �ۼ��Ѵ�.
        ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + i);
        // accept() �޼���� �Ķ���� ������ T ��ü�� int �� �� ���� ������ ������ ���ٽĿ�����
        // �� ���� �Ķ���͸� ����Ѵ�. T�� String i�� ���������� int
        objIntConsumer.accept("java", 8);
    }
}
