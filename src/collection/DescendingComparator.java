package collection;

import java.util.Comparator;

// Fruit �� �������� ������
public class DescendingComparator implements Comparator<Fruit> {

    // compare �޼���� ���ϴ� �� ��ü�� �����ϸ� 0
    // ���ϴ� ������ �տ� ���� �Ϸ��� ����,
    // ���ϴ� ������ �ڿ� ���� �Ϸ��� ����� �����Ѵ�
    @Override
    public int compare(Fruit o1, Fruit o2) {
        // ���ϴ� ������ ���� ��� ��
        if(o1.price < o2.price){
            return 1;
            // ���ϴ� ������ �����ϸ� 0
        }else if(o1.price == o2.price){
            return 0;
        }else{
            // ���ϴ� ������ Ŭ ��� ��
            return -1;
        }

    }
}
