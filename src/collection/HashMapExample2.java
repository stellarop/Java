package collection;

import java.util.HashMap;
import java.util.Map;

// 학번과 이름이 동일한 경우 같은 키로 인식
public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();
        
        // 학번과 이름이 동일한 Student key 로 저장
        map.put(new Student(1, "이연재"), 95);
        map.put(new Student(1, "이연재"), 95);

        System.out.println("총 엔터티 수 : " + map.size());
    }
}
