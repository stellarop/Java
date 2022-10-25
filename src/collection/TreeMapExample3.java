package collection;

import java.util.Map;
import java.util.NavigableMap;

import java.util.TreeMap;

// 키로 정렬하고 범위 검색
public class TreeMapExample3 {
    public static void main(String[] args) {
        // TreeMap 선언
        TreeMap<String,Integer> treeMap = new TreeMap<String, Integer>();

        // 객체 저장
        treeMap.put("apple", new Integer(10));
        treeMap.put("forever", new Integer(60));
        treeMap.put("description", new Integer(40));
        treeMap.put("ever", new Integer(50));
        treeMap.put("zoo", new Integer(10));
        treeMap.put("base", new Integer(20));
        treeMap.put("guess", new Integer(70));
        treeMap.put("cherry", new Integer(30));

        System.out.println("[c ~ f 사이의 단어 검색]");

        // 시작과 끝으로 주어진 키 사이에 Map.Entry 들을 NavigableMap 컬렉션으로 반환.
        // 시작과 끝 키의 Map.Entry 포함 여부는 두 번째, 네 번째 매개값에 따라 달라진다.
        NavigableMap<String, Integer> rangMap =
                treeMap.subMap("c",true,"f",true);

        // rangMap 에 저장된 객체 만큼 반복
        for(Map.Entry<String, Integer> entry : rangMap.entrySet()){
            // rangMap 객체 Map.Entry 타입으로 출력
            System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
        }
     }
}
