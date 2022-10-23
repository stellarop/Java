package collection;

import java.util.TreeSet;

// TreeSet �� ����Ʈ���� ��������� set �÷����̴�.
// �ϳ��� ���� ��尪�� value�� ���ʰ� ������ �ڽ� ��带 �����ϱ� ���� �� ���� ������ �����ȴ�.
// TreeSet �� ��ü�� �����ϸ� �ڵ����� ���ĵǴµ� �θ𰪰� ���ؼ� ���� ���� ���� �ڽĳ�忡
// ���� ���� ������ �ڽ� ��忡 ����ȴ�,
public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet ����
        TreeSet<Integer> scores = new TreeSet<Integer>();
        // ��ü ����
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        // first
        // scores ���� ���� ���� ��ü�� ����
        score = scores.first();
        System.out.println("���� ���� �� : " + score);

        // last
        // scores ���� ���� ���� ��ü�� ����
        score = scores.last();
        System.out.println("���� ���� �� : " + score);

        // lower
        // �־��� ��ü���� �ٷ� �Ʒ� ��ü�� ����
        score = scores.lower(new Integer(95));
        System.out.println("95 ���� ���� �� : " + score);

        // higher
        // �־��� ��ü���� �ٷ� �� ��ü�� ����
        score = scores.higher(new Integer(95));
        System.out.println("95 ���� ���� �� : " + score);

        // floor
        // �־��� ��ü�� ������ ��ü�� ������ ����
        // ���ٸ� �־��� ��ü�� �ٷ� �Ʒ��� ��ü�� ����
        score = scores.floor(new Integer(95));
        System.out.println("95 �̰ų� 95 �ٷ� �Ʒ��� �� : " + score);

        // ceiling
        // �־��� ��ü�� ������ ��ü�� ������ ����
        // ���ٸ� �־��� ��ü�� �ٷ� ���� ��ü�� ����
        score = scores.ceiling(new Integer(85));
        System.out.println("85 �̻��̰ų� �ٷ� ���� �� : " + score);

        // isEmpty
        // ���� ���� ��ü�� �������� �÷��ǿ��� �����Ѵ�.
        while (!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println("���� ��ü �� : " + score);
        }

    }
}
