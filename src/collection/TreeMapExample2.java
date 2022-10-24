package collection;

// descendingKeySet() => ������������ ���ĵ� Ű�� NavigableSet �� ����
// descendingMap() �޼���� ������������ ���ĵ� NavigableMap ��ü�� �����ϴµ�
// firstEntry(), lastEntry(), lowerEntry(), higherEntry(), floorEntry(), ceilingEntry()
// �޼��带 �����ϰ� ���������� ���������� �����ư��� ���� ������ �ٲٴ� descendingMap() �޼��嵵 �����Ѵ�.
// ������������ �����ϰ� �ʹٸ� descendingMap() �޼��带 �� �� ȣ���ϸ� �ȴ�.

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// ��ü �����ϱ�
public class TreeMapExample2 {
    public static void main(String[] args) {
        // TreeMap ����
        TreeMap<Integer, String> scores = new TreeMap<Integer,String>();

        // ��ü ����
        scores.put(new Integer(87), "�輼��");
        scores.put(new Integer(98), "�̿���");
        scores.put(new Integer(75), "��Ҵ�");
        scores.put(new Integer(95), "�����");
        scores.put(new Integer(80), "�鼺��");

        // ������������ ���ĵ� scores �� ��ü ����
        NavigableMap<Integer,String> deNavigableMap = scores.descendingMap();

        // ����, ���ڿ� ������ �̷���� Map.Entry Ÿ�Կ� ���������� ��ü ��ü�� �־��ش�.
        // entrySet() => ���(key, vaule �� �̷���� �� ��ü���)
        Set<Map.Entry<Integer,String>> descendingEntrySet = deNavigableMap.entrySet();

        // descendingEntrySet ������ ���̸�ŭ �ݺ�
        for (Map.Entry<Integer,String> entry : descendingEntrySet){
            // descendingEntrySet ������ ����� �� ���
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }

        System.out.println();

        // deNavigableMap ������ ���������� �������Ƿ� descendingMap() �޼��带 �ѹ� ��
        // ��� �� ���������� �ȴ�.
        NavigableMap<Integer,String> ascendingMap = deNavigableMap.descendingMap();

        // ����, ���ڿ� ������ �̷���� Map.Entry Ÿ�Կ� ���������� ��ü ��ü�� �־��ش�.
        Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();

        // ascendingEntrySet ������ ���̸�ŭ �ݺ�
        for (Map.Entry<Integer,String> entry : ascendingEntrySet){
            // // ascendingEntrySet ������ ����� �� ���
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }
    }
}
