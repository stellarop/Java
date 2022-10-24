package collection;

// TreeMap �� ���� Ʈ���� ������� �� Map �÷����̴�.
// TreeSet �� �������� Ű�� ���� ����� Map.Entry �� �����Ѵٴ� ���̴�.
// TreeMap �� ��ü�� �����ϸ� �ڵ����� ���ĵǴµ� �⺻������ �θ� Ű���� �� ��
//  Ű���� ������ ���� �ڽ� ��� Ű���� ������ ������ �ڽ� ��忡 Map.Entry ��ü�� �����Ѵ�.

import java.util.Map;
import java.util.TreeMap;

// Ư�� Map.Entry ã��
public class TreeMapExample1 {
    public static void main(String[] args) {
        // TreeMap ����
        TreeMap<Integer,String> scores = new TreeMap<Integer,String>();

        scores.put(new Integer(87), "�輼��");
        scores.put(new Integer(98), "�̿���");
        scores.put(new Integer(75), "��Ҵ�");
        scores.put(new Integer(95), "�����");
        scores.put(new Integer(80), "�鼺��");

        // scores ��ü �ȿ� �ִ� Map.Entry �� ���� ���� ����
        Map.Entry<Integer, String> entry = null;

        // firstEntry() => ���� ���� Map.Entry �� ����
        entry = scores.firstEntry();
        System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

        // lastEntry() => ���� ���� Map.Entry �� ����
        entry = scores.lastEntry();
        System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

        // lowerEntry() => �־��� Ű���� �ٷ� �Ʒ� Map.Entry �� ����
        entry = scores.lowerEntry(new Integer(95));
        System.out.println("95 �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());

        // higherEntry() => �־��� Ű���� �ٷ� �� Map.Entry �� ����
        entry = scores.higherEntry(new Integer(95));
        System.out.println("95 �� ���� : " + entry.getKey() + "-" + entry.getValue());

        // floorEntry() => �־��� Ű�� ������ Ű�� ������ �ش� Map.Entry ����
        // ���ٸ� �ٷ� �Ʒ� Map.Entry �� ����
        entry = scores.floorEntry(new Integer(95));
        System.out.println("95�� �̰ų� �ٷ� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());

        // ceilingEntry() => �־��� Ű�� ������ Ű�� ������ �ش� Map.Entry ����
        // ���ٸ� �ٷ� �� Map.Entry �� ����
        entry = scores.ceilingEntry(new Integer(85));
        System.out.println("85�� �̰ų� �ٷ� �� ���� : " + entry.getKey() + "-" + entry.getValue());

        // scores �� �� ���� �ƴ϶��
        while (!scores.isEmpty()){
            // pollFirstEntry() => ���� ���� Map.Entry �� ���� �� �÷��ǿ��� ����
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "-" + entry.getValue() + " | "
            + "���� ��ü �� : " + scores.size());
        }



    }
}
