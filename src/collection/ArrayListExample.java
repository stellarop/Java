package collection;

import java.util.ArrayList;
import java.util.List;

// String ��ü�� �����ϴ� ArrayList
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("JSP");
        list.add(2,"Spring");
        list.add("Mybatis");

        // list�� ����� �� ��ü�� ����
        int size = list.size();
        System.out.println("�� ��ü ���� : " + size);

        // list 2�� �ε��� �� ��������
        String skill = list.get(2);
        System.out.println("2�� index : " + skill);

        // list ��ü �� ��ŭ ����
        for(int i = 0; i < list.size(); i++){
            // list ��ü ������ ����
            String str = list.get(i);
        }

        // 2�� �ε��� Spring ����
        list.remove(2);
        // 2�� �ε��� JSP ����
        list.remove(2);
        // Mybatis ����
        list.remove("Mybatis");

        // list ��ü �� ��ŭ ����
        for(int i = 0; i <list.size(); i++){
            // str ������ list �� ����
            String str = list.get(i);
            // �� Ƚ�� + ����� ��ü ���
            System.out.println(i + ":" + str);
        }

    }
}
