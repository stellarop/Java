package lambdaExpression;

// ���ٽ��� �޼��� ���ο��� �ַ� �ۼ��Ǳ� ������ ���� �͸� ���� ��ü�� ������Ų��.
// ���ٽĿ��� �ٱ� Ŭ������ �ʵ峪 �޼���� ���� ���� ����� �� ������ �޼����� �Ķ����
//, ���� ������ ����ϸ� �� �� ������ final Ư���� ��������
// => �Ķ����, ���� ������ ���ٽĿ��� �д°� �������� ���ٽ� ���� �Ǵ� �ܺο��� ���� �� �� ����

// final Ư���� ������ ���� ����
public class UsingLocalVariable {
    void method(int age){
        int localVer = 40;

        // age = 30; // final Ư�� ������ ���� �Ұ�

        // ���ٽ�
        MyFunctionlInterface fi = ()->{
            // ���� ���� �б�
            System.out.println("age : " + age);
            System.out.println("localVer : " + localVer);
        };
        fi.medhod();
    }
}
