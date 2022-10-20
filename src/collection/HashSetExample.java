package collection;

// ���ڿ��� HashSet �� ������ ��� ���� ���ڿ��� ���� String ��ü�� ������ ��ü�� �����Ѵ�.
// �ٸ� ���ڿ��� ���� String ��ü�� �ٸ� ��ü�� ���ֵǴµ� �� ������ String Ŭ������ hashCode()��
// equals() �޼��带 �������ؼ� ���� ���ڿ��� ��� hashCode() �� ���� ���� ���� equals() ��
// ���� ���� true �� �������� �߱� �����̴�.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// String ��ü�� �ߺ� ���� �����ϴ� HashSet
public class HashSetExample {
    public static void main(String[] args) {

        // HashSet ����
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        // Java ���ڿ��� �ѹ��� ����ȴ�. HashSet���� �ߺ��� ���ڿ��� �����ϱ� ����
        set.add("Java");
        set.add("Mybatis");

        // HashSet ��ü �� ���ϱ�
        int size = set.size();
        System.out.println("�� ��ü �� : " + size);

        // �ݺ��� ���
        Iterator<String> iterator = set.iterator();
        // HashSet�� ����� ��ü �� ��ŭ ����
        while (iterator.hasNext()){
            // �Ѱ��� ��ü�� �����ͼ� ������ ����
            String element = iterator.next();
            // �ҷ��� ��ü ���
            System.out.println(element);
        }

        // �ش� ��ü ����
        set.remove("JDBC");
        set.remove("Mybatis");

        System.out.println("�� ��ü �� : " + set.size());

        // �ݺ��� ���
        iterator = set.iterator();
        // HashSet�� ����� ��ü �� ��ŭ ����
        while (iterator.hasNext()){
            // �Ѱ��� ��ü�� �����ͼ� ������ ����
            String element = iterator.next();
            // �ҷ��� ��ü ���
            System.out.println(element);
        }

        // ��� ��ü�� �����ϰ� ����.
        set.clear();

        System.out.println("�� ��ü �� : " + set.size());
        
        if(set.isEmpty()){
            System.out.println("[set ��ü ��� ����.]");
        }
    }
}
