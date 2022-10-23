package collection;

import java.util.TreeSet;

// TreeSet 은 이진트리를 기반으로한 set 컬렉션이다.
// 하나의 노드는 노드값인 value의 왼쪽과 오른쪽 자식 노드를 참고하기 위한 두 개의 변수로 구성된다.
// TreeSet 에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식노드에
// 높은 것은 오른쪽 자식 노드에 저장된다,
public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet 선언
        TreeSet<Integer> scores = new TreeSet<Integer>();
        // 객체 저장
        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(75));
        scores.add(new Integer(95));
        scores.add(new Integer(80));

        Integer score = null;

        // first
        // scores 에서 제일 낮은 객체를 리턴
        score = scores.first();
        System.out.println("가장 낮은 수 : " + score);

        // last
        // scores 에서 제일 높은 객체를 리턴
        score = scores.last();
        System.out.println("가장 높은 수 : " + score);

        // lower
        // 주어진 객체보다 바로 아래 객체를 리턴
        score = scores.lower(new Integer(95));
        System.out.println("95 보다 낮은 수 : " + score);

        // higher
        // 주어진 객체보다 바로 위 객체를 리턴
        score = scores.higher(new Integer(95));
        System.out.println("95 보다 높은 수 : " + score);

        // floor
        // 주어진 객체와 동등한 객체가 있으면 리턴
        // 없다면 주어진 객체의 바로 아래의 객체를 리턴
        score = scores.floor(new Integer(95));
        System.out.println("95 이거나 95 바로 아래의 수 : " + score);

        // ceiling
        // 주어진 객체와 동등한 객체가 있으면 리턴
        // 없다면 주어진 객체의 바로 위에 객체를 리턴
        score = scores.ceiling(new Integer(85));
        System.out.println("85 이상이거나 바로 위의 수 : " + score);

        // isEmpty
        // 제일 낮은 객체를 꺼내오고 컬렉션에서 제거한다.
        while (!scores.isEmpty()){
            score = scores.pollFirst();
            System.out.println("남은 객체 수 : " + score);
        }

    }
}
