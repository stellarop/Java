package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 키로 나이를 값으로 저장
public class HashMapExample1 {
    public static void main(String[] args) {

        // HashMap 선언
        Map<String, Integer> map = new HashMap<>();

        // map에 값 넣기
        map.put("김세연", 21);
        map.put("이연재", 24);
        map.put("백소담", 31);
        map.put("백소진", 28);
        map.put("백성현", 25);

        // map 안에 들어간 총 객체의 수
        System.out.println("총 Entry 수 : " + map.size());

        // key 값으로 해당 객체 찾기
        System.out.println("김세연 : " + map.get("김세연"));
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("key : " + key);
        }
        System.out.println();

        // 객체 삭제
        map.remove("김세연");
        System.out.println("총 Entry 수 : " + map.size());

        // 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();

        // 객체 전체 삭제
        map.clear();
        System.out.println("총 객체 수 : " + map.size());
    }
}
