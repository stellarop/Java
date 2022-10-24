package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

// descendingIterator() 메서드는 내림차순으로 정렬된 NavigableSet 객체를 리턴한다.
// NavigableSet 은 first(), last(), lower(), higher(), floor(), ceiling() 메서드를 제공하고
// 정렬 순서를 바꾸는 descendingSet() 메서드도 제공한다. 오름차순으로 정렬 하고 싶다면
// descendingSet() 메서드를 두번 호출 후 사용하면 됨

// 객체 정렬
public class TreeSetExample2 {
    public static void main(String[] args) {
        // TreeSet 선언
        TreeSet<Integer> scores = new TreeSet<Integer>();

        // 객체 저장
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        // 내림차순으로 객체를 저장한다.
        NavigableSet<Integer> descendingSet = scores.descendingSet();

        // 객체 수만큼 반복
        for(Integer score : descendingSet){
            System.out.print(score + " ");
        }
        System.out.println();

        // 내림차순 정렬된 descendingSet 변수를 불러와서 descendingSet() 메서드를 호출한다.
        // 최종적으로 descendingSet() 메서드가 두번 입력되므로 오름차순으로 정렬 된다.
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();

        for(Integer score : ascendingSet){
            System.out.print(score + " ");
        }
    }
}
