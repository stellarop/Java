package collection;

import java.util.Map;
import java.util.NavigableMap;

import java.util.TreeMap;

// Ű�� �����ϰ� ���� �˻�
public class TreeMapExample3 {
    public static void main(String[] args) {
        // TreeMap ����
        TreeMap<String,Integer> treeMap = new TreeMap<String, Integer>();

        // ��ü ����
        treeMap.put("apple", new Integer(10));
        treeMap.put("forever", new Integer(60));
        treeMap.put("description", new Integer(40));
        treeMap.put("ever", new Integer(50));
        treeMap.put("zoo", new Integer(10));
        treeMap.put("base", new Integer(20));
        treeMap.put("guess", new Integer(70));
        treeMap.put("cherry", new Integer(30));

        System.out.println("[c ~ f ������ �ܾ� �˻�]");

        // ���۰� ������ �־��� Ű ���̿� Map.Entry ���� NavigableMap �÷������� ��ȯ.
        // ���۰� �� Ű�� Map.Entry ���� ���δ� �� ��°, �� ��° �Ű����� ���� �޶�����.
        NavigableMap<String, Integer> rangMap =
                treeMap.subMap("c",true,"f",true);

        // rangMap �� ����� ��ü ��ŭ �ݺ�
        for(Map.Entry<String, Integer> entry : rangMap.entrySet()){
            // rangMap ��ü Map.Entry Ÿ������ ���
            System.out.println(entry.getKey() + "-" + entry.getValue() + "������");
        }
     }
}
