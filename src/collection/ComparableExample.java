package collection;

// TreeSet, TreeMap �� ������ ���� Comparable �� ������ ��ü�� �䱸�ϴµ�
// Integer, Double, String ��� Comparable �������̽��� �����ϰ� �ִ�.
// Comparable ���� compareTo() �޼��尡 ���ǵǾ� �ֱ� ������ ����� ���� Ŭ���������� ��
// �޼��带 �������̵�(������) �Ͽ� ���� ���� �����.

import java.util.TreeSet;

// ����� ���� ��ü�� ���� ������ ����
public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        // TreeSet, TreeMap ��ü�� ���� ������ �� ������������ ���ĵȴ�.
        treeSet.add(new Person("�輼��", 21));
        treeSet.add(new Person("�����", 28));
        treeSet.add(new Person("�̿���", 24));

        // treeSet ��ü ��ŭ �ݺ�
        for(Person entry : treeSet){
            // compareTo �޼���� ���� ������ �������� ������ �߱� ������
            // ��� �� ���̰� ������������ ��µȴ�.
            System.out.println("�̸� : " + entry.name + " | " + "���� : " + entry.age);
        }

    }
}
