package collection;

// TreeMap 은 이진 트리를 기반으로 한 Map 컬렉션이다.
// TreeSet 과 차이점은 키와 값이 저장된 Map.Entry 를 저장한다는 점이다.
// TreeMap 에 객체를 저장하면 자동으로 정렬되는데 기본적으로 부모 키값과 비교 후
//  키값이 낮은건 왼쪽 자식 노드 키값이 높은건 오른쪽 자식 노드에 Map.Entry 객체를 저장한다.

import java.util.Map;
import java.util.TreeMap;

// 특정 Map.Entry 찾기
public class TreeMapExample1 {
    public static void main(String[] args) {
        // TreeMap 선언
        TreeMap<Integer,String> scores = new TreeMap<Integer,String>();

        scores.put(new Integer(87), "김세연");
        scores.put(new Integer(98), "이연재");
        scores.put(new Integer(75), "백소담");
        scores.put(new Integer(95), "백소진");
        scores.put(new Integer(80), "백성현");

        // scores 객체 안에 있는 Map.Entry 값 담을 변수 선언
        Map.Entry<Integer, String> entry = null;

        // firstEntry() => 제일 낮은 Map.Entry 를 리턴
        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());

        // lastEntry() => 제일 높은 Map.Entry 를 리턴
        entry = scores.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());

        // lowerEntry() => 주어진 키보다 바로 아래 Map.Entry 를 리턴
        entry = scores.lowerEntry(new Integer(95));
        System.out.println("95 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

        // higherEntry() => 주어진 키보다 바로 위 Map.Entry 를 리턴
        entry = scores.higherEntry(new Integer(95));
        System.out.println("95 위 점수 : " + entry.getKey() + "-" + entry.getValue());

        // floorEntry() => 주어진 키와 동등한 키가 있으면 해당 Map.Entry 리턴
        // 없다면 바로 아래 Map.Entry 를 리턴
        entry = scores.floorEntry(new Integer(95));
        System.out.println("95점 이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

        // ceilingEntry() => 주어진 키와 동등한 키가 있으면 해당 Map.Entry 리턴
        // 없다면 바로 위 Map.Entry 를 리턴
        entry = scores.ceilingEntry(new Integer(85));
        System.out.println("85점 이거나 바로 위 점수 : " + entry.getKey() + "-" + entry.getValue());

        // scores 가 빈 값이 아니라면
        while (!scores.isEmpty()){
            // pollFirstEntry() => 제일 낮은 Map.Entry 을 꺼낸 후 컬렉션에서 제거
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "-" + entry.getValue() + " | "
            + "남은 객체 수 : " + scores.size());
        }



    }
}
