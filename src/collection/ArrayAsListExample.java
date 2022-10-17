package collection;

// ArrayList �� �����ϰ� �ʿ��� ��ü���� �߰��ϴ� ���� �Ϲ���������
// ������ ��ü��� ������ List �� �����Ϸ��� Arrays.AsList() �� �̿��Ѵ�.


import java.util.Arrays;
import java.util.List;

// Arrays.AsList() �޼���
public class ArrayAsListExample {
    public static void main(String[] args) {

        // T Ÿ�� �Ķ���Ϳ� �°� asList() �� �Ű����� ���������� �Է��ϰų� T[] �迭��
        // �Ű������� �ָ� ��
        List<String> list1 = Arrays.asList("�輼��","�̿���","�ſ��");

        // list1 ��ŭ ����
        for(String name : list1){
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3);

        for(int Value : list2){
            System.out.println(Value);
        }

    }
}
