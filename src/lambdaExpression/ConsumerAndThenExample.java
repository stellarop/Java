package lambdaExpression;

import java.util.function.Consumer;

// Consumer ������ �Լ��� �������̽��� ó�� ����� �������� �ʱ� ������ andThen() ����Ʈ �޼����
// �Լ��� �������̽��� ȣ�� ������ ���Ѵ�.
// Consumer �� ������ ����
public class ConsumerAndThenExample {
    public static void main(String[] args) {

        Consumer<Member> consumerA = (m) ->{
            System.out.println("consumerA : " + m.getName());
        };

        Consumer<Member> consumerB = (m) ->{
            System.out.println("consumerB : " + m.getId());
        };

        // andThen() compose() ����Ʈ �޼���� �� ���� �Լ��� �������̽��� ���������� ������
        // consumerAB�� �޼��带 ȣ���ϸ� consumerB���� ó���ϰ� ����� consumerA��
        // �Ķ���Ͱ����� �����Ѵ�.
        // consumerA�� �������� �Ķ���Ͱ��� ������ ó���� �� ���� ��� ����

        // A.andThen(B) => A ���� �� B ����
        // A.compose(B) => B ���� �� A�� ��
        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        // consumerA, consumerB class �� ������ �� ����
        consumerAB.accept(new Member("�輼��","seyeon", null));

    }
}
