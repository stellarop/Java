package collection;

import java.util.HashSet;
import java.util.Set;

// Member ��ü�� �ߺ����� �����ϴ� HashSet
public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        // ������ �� ��ü ����
        // �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����ȴ�.
        set.add(new Member("�輼��", 21));
        set.add(new Member("�輼��", 21));

        System.out.println("�� ��ü �� : " + set.size());

    }
}
