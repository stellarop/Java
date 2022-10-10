package lambdaExpression;

// Supplier �Լ��� �������̽��� Ư¡�� �Ķ���Ͱ� ���� ���ϰ��� �ִ� getOOO() �޼��带 ������.
// �� �޼������ ���� �� ȣ���� ������ �����͸� ���� �ϴ� ��Ȱ�� ��.

import java.util.function.IntSupplier;
import java.util.function.Supplier;

// Supplier �Լ��� �������̽�
public class SupplierExample {
    public static void main(String[] args) {

        // ���ٽ� �������̽� ���� / �͸� ��ü ����
        IntSupplier intSupplier = () ->{
            // ���� ���� ���� ��
            int num = (int) (Math.random() * 6) + 1;
            // �ش� �������̽� ����
            return num;
        };

        Supplier<String> StringSupplier = ()-> {
            String ssl = "Supplier ���׸� Ÿ�� ����";
            return ssl;
        };

        // �ش� �������̽��� ����� ���� ���� get() �޼���� ������
        int num = intSupplier.getAsInt();
        // ���
        System.out.println("num : " + num);

        // ���׸� Ÿ������ String�� �־����� �޴� ���� String���� �޾ƾ� ��.
        String ssl = StringSupplier.get();
        System.out.println(ssl);
    }
}
