package lambdaExpression;

import java.util.function.Function;

// Function �� �������� ����
public class FunctionAndThenComposeExample {
    public static void main(String[] args) {

        // functionA = Member, Address class �� �̷����
        Function<Member, Address> functionA;
        // functionB = Address class, String �� �̷����
        Function<Address, String> functionB;
        // functionAB = Member class, String �� �̷����
        Function<Member, String> functionAB;

        // ���� ���� ���� ����
        String city;

        // �����ڸ� ���ؼ� �Է��� Address class ����
        functionA = (m) -> m.getAddress();
        // Address �� �� ���� �̸��� ������
        functionB = (a) -> a.getCity();

        // functionA.andThen(functionB) => functionA ���� �� functionB ����
        functionAB = functionA.andThen(functionB);

        // functionAB ������ Member, String �̱� ������ �ش� �� �Է�
        // functionA�� �켱 ����Ǳ� ������ �� Member, Address class �� �ش� �� �����
        // functionB�� Address class �� ���� ����� ���� ������

        // functionA ����(�����ڸ� ���� �ش� �� �־���)
        // functionB ����(���� address class ����� �̸� ����)
        // functionAB ����(�ش� ������ ��� �ִ� ���� �̸� ���� ����)
        city = functionAB.apply(
                new Member("�輼��", "se", new Address("�ѱ�", "������"))
        );

        System.out.println("���� ���� : " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("�̿���", "lee", new Address("�ѱ�", "����"))
        );

        System.out.println("���� ���� : " + city);

    }
}
