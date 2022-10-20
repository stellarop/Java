package collection;

import java.util.HashSet;
import java.util.Set;

// Member 객체를 중복없이 저장하는 HashSet
public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        // 동일한 두 객체 생성
        // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장된다.
        set.add(new Member("김세연", 21));
        set.add(new Member("김세연", 21));

        System.out.println("총 객체 수 : " + set.size());

    }
}
