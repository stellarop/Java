package generic;

// ���ѵ� Ÿ�� �Ķ����<T extends �ֻ��� Ÿ��>
// ���ڸ� �����ϴ� ���׸� �޼���� �Ű������� Number Ÿ�� �Ǵ� ���� Ŭ���� Ÿ��(Integer,double,Long)
// �� �ν��Ͻ��� �����;���
// �̰��� ���ѵ� Ÿ�� �Ķ���Ͱ� �ʿ��� �����̴�.
// ���ѵ� Ÿ�� �Ķ���͸� �����Ϸ��� Ÿ�� �Ķ���� �ڿ� extends ������ ���� Ÿ�� ���(Ŭ����,�������̽� ����)

// ���׸� �޼��� ȣ��
public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        // String�� Number Ÿ���� �ƴϱ� ������ error
        //String str = Utill.Compare("a","b");

        // �ڵ� ����ȯ
        int result1 = Utill.intCompare(10,20);// int => Integer
        System.out.println(result1);

        int result2 = Utill.intCompare(4.5,3);// double => Double
        System.out.println(result2);
    }
}
