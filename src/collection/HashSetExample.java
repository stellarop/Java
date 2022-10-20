package collection;

// 문자열을 HashSet 에 저장할 경우 같은 문자열을 갖는 String 객체는 동등학 객체로 간주한다.
// 다른 문자열을 갖는 String 객체는 다른 객체로 간주되는데 그 이유는 String 클래스가 hashCode()와
// equals() 메서드를 재정의해서 같은 문자열인 경우 hashCode() 의 리턴 값을 같게 equals() 의
// 리턴 값은 true 가 나오도록 했기 때문이다.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// String 객체를 중복 없이 저장하는 HashSet
public class HashSetExample {
    public static void main(String[] args) {

        // HashSet 선언
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        // Java 문자열은 한번만 저장된다. HashSet에서 중복된 문자열은 제거하기 때문
        set.add("Java");
        set.add("Mybatis");

        // HashSet 객체 수 구하기
        int size = set.size();
        System.out.println("총 객체 수 : " + size);

        // 반복자 얻기
        Iterator<String> iterator = set.iterator();
        // HashSet에 저장된 객체 수 만큼 돈다
        while (iterator.hasNext()){
            // 한개의 객체를 가져와서 변수에 저장
            String element = iterator.next();
            // 불러온 객체 출력
            System.out.println(element);
        }

        // 해당 객체 삭제
        set.remove("JDBC");
        set.remove("Mybatis");

        System.out.println("총 객체 수 : " + set.size());

        // 반복자 얻기
        iterator = set.iterator();
        // HashSet에 저장된 객체 수 만큼 돈다
        while (iterator.hasNext()){
            // 한개의 객체를 가져와서 변수에 저장
            String element = iterator.next();
            // 불러온 객체 출력
            System.out.println(element);
        }

        // 모든 객체를 제거하고 비운다.
        set.clear();

        System.out.println("총 객체 수 : " + set.size());
        
        if(set.isEmpty()){
            System.out.println("[set 객체 비어 있음.]");
        }
    }
}
