package collection;

import java.util.HashMap;
import java.util.Map;

// �й��� �̸��� ������ ��� ���� Ű�� �ν�
public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();
        
        // �й��� �̸��� ������ Student key �� ����
        map.put(new Student(1, "�̿���"), 95);
        map.put(new Student(1, "�̿���"), 95);

        System.out.println("�� ����Ƽ �� : " + map.size());
    }
}
