package collection;

// descendingKeySet() => 내림차순으로 정렬된 키의 NavigableSet 을 리턴
// descendingMap() 메서드는 내림차순으로 정렬된 NavigableMap 객체를 리턴하는데
// firstEntry(), lastEntry(), lowerEntry(), higherEntry(), floorEntry(), ceilingEntry()
// 메서드를 제공하고 오름차순과 내림차순을 번갈아가며 정렬 순서를 바꾸는 descendingMap() 메서드도 제공한다.
// 오름차순으로 정렬하고 싶다면 descendingMap() 메서드를 두 번 호출하면 된다.

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// 객체 정렬하기
public class TreeMapExample2 {
    public static void main(String[] args) {
        // TreeMap 선언
        TreeMap<Integer, String> scores = new TreeMap<Integer,String>();

        // 객체 저장
        scores.put(new Integer(87), "김세연");
        scores.put(new Integer(98), "이연재");
        scores.put(new Integer(75), "백소담");
        scores.put(new Integer(95), "백소진");
        scores.put(new Integer(80), "백성현");

        // 내림차순으로 정렬된 scores 의 객체 리턴
        NavigableMap<Integer,String> deNavigableMap = scores.descendingMap();

        // 숫자, 문자열 값으로 이루어진 Map.Entry 타입에 내림차순한 객체 전체를 넣어준다.
        // entrySet() => 출력(key, vaule 로 이루어진 값 전체출력)
        Set<Map.Entry<Integer,String>> descendingEntrySet = deNavigableMap.entrySet();

        // descendingEntrySet 변수에 길이만큼 반복
        for (Map.Entry<Integer,String> entry : descendingEntrySet){
            // descendingEntrySet 변수에 저장된 값 찍기
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }

        System.out.println();

        // deNavigableMap 변수에 내림차순이 되있으므로 descendingMap() 메서드를 한번 더
        // 사용 시 오름차순이 된다.
        NavigableMap<Integer,String> ascendingMap = deNavigableMap.descendingMap();

        // 숫자, 문자열 값으로 이루어진 Map.Entry 타입에 오름차순한 객체 전체를 넣어준다.
        Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();

        // ascendingEntrySet 변수에 길이만큼 반복
        for (Map.Entry<Integer,String> entry : ascendingEntrySet){
            // // ascendingEntrySet 변수에 저장된 값 찍기
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }
    }
}
