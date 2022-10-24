package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

// descendingIterator() �޼���� ������������ ���ĵ� NavigableSet ��ü�� �����Ѵ�.
// NavigableSet �� first(), last(), lower(), higher(), floor(), ceiling() �޼��带 �����ϰ�
// ���� ������ �ٲٴ� descendingSet() �޼��嵵 �����Ѵ�. ������������ ���� �ϰ� �ʹٸ�
// descendingSet() �޼��带 �ι� ȣ�� �� ����ϸ� ��

// ��ü ����
public class TreeSetExample2 {
    public static void main(String[] args) {
        // TreeSet ����
        TreeSet<Integer> scores = new TreeSet<Integer>();

        // ��ü ����
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        // ������������ ��ü�� �����Ѵ�.
        NavigableSet<Integer> descendingSet = scores.descendingSet();

        // ��ü ����ŭ �ݺ�
        for(Integer score : descendingSet){
            System.out.print(score + " ");
        }
        System.out.println();

        // �������� ���ĵ� descendingSet ������ �ҷ��ͼ� descendingSet() �޼��带 ȣ���Ѵ�.
        // ���������� descendingSet() �޼��尡 �ι� �ԷµǹǷ� ������������ ���� �ȴ�.
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();

        for(Integer score : ascendingSet){
            System.out.print(score + " ");
        }
    }
}
