package collection;

// TreeSet �� ������ �ִ� ���� �˻��� ���õ� �޼���

// headSet(E toElement, boolean inclusive)
// �־��� ��ü���� ���� ��ü���� NavigableSet ���� ����
// �־��� ��ü ���� ���δ� �� ��° �Ű����� ���� �޶�����.

// tailSet(E toElement, boolean inclusive)
// �־��� ��ü���� ���� ��ü���� NavigableSet ���� ����
// �־��� ��ü ���� ���δ� �� ��° �Ű����� ���� �޶�����.

// subSet(E fromElement, boolean fromInclusive, E toElement, boolean inclusive)
// ���۰� ������ �־��� ��ü ������ ��ü���� NavigableSet ���� ����
// ���۰� �� ��ü�� ���� ���δ� �� ��°, �� ��° �Ű� ���� ���� �޶�����.


import java.util.NavigableSet;
import java.util.TreeSet;

// ���� �ܾ� ����, ���� �˻�
public class TreeSetExample3 {
    public static void main(String[] args) {
        // treeSet ����
        TreeSet<String> treeSet = new TreeSet<String>();

        // ��ü ����
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[c ~ f ������ �ܾ� �˻�]");

        NavigableSet<String> rangSet = treeSet.subSet
                // ���� ��ü, ���� ��ü�� ���� ����, �� ��ü, �� ��ü�� ���� ����
                ("c", true, "f", true);

        // rangSet ��ŭ �ݺ� �� �ش� ��ü ��´�.
        for(String word : rangSet){
            System.out.println(word);
        }
    }
}
