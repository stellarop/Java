package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// �̸��� Ű�� ���̸� ������ ����
public class HashMapExample1 {
    public static void main(String[] args) {

        // HashMap ����
        Map<String, Integer> map = new HashMap<>();

        // map�� �� �ֱ�
        map.put("�輼��", 21);
        map.put("�̿���", 24);
        map.put("��Ҵ�", 31);
        map.put("�����", 28);
        map.put("�鼺��", 25);

        // map �ȿ� �� �� ��ü�� ��
        System.out.println("�� Entry �� : " + map.size());

        // key ������ �ش� ��ü ã��
        System.out.println("�輼�� : " + map.get("�輼��"));
        System.out.println();

        // ��ü�� �ϳ��� ó��
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("key : " + key);
        }
        System.out.println();

        // ��ü ����
        map.remove("�輼��");
        System.out.println("�� Entry �� : " + map.size());

        // ��ü�� �ϳ��� ó��
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();

        // ��ü ��ü ����
        map.clear();
        System.out.println("�� ��ü �� : " + map.size());
    }
}
