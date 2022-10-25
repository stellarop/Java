package collection;

import java.util.TreeSet;

// �������� �����ڸ� ����ϴ� TreeSet
public class ComparatorExample {
    public static void main(String[] args) {
        // �������� ������ ����
        TreeSet<Fruit> treeSet1 = new TreeSet<Fruit>(new DescendingComparator());

        // ����� �� ������ �������� ��ħ�������� ���ĵȴ�.
        treeSet1.add(new Fruit("����", 3000));
        treeSet1.add(new Fruit("����", 10000));
        treeSet1.add(new Fruit("����", 6000));

        // �������� ����
        for(Fruit fruit : treeSet1){
            System.out.println(fruit.name + " : " + fruit.price);
        }

    }
}
