package collection;

import java.util.ArrayList;
import java.util.List;

// String 객체를 저장하는 ArrayList
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("JSP");
        list.add(2,"Spring");
        list.add("Mybatis");

        // list에 저장된 총 객체의 개수
        int size = list.size();
        System.out.println("총 객체 개수 : " + size);

        // list 2번 인덱스 값 가져오기
        String skill = list.get(2);
        System.out.println("2번 index : " + skill);

        // list 객체 수 만큼 돈다
        for(int i = 0; i < list.size(); i++){
            // list 객체 변수에 저장
            String str = list.get(i);
        }

        // 2번 인덱스 Spring 삭제
        list.remove(2);
        // 2번 인덱스 JSP 삭제
        list.remove(2);
        // Mybatis 삭제
        list.remove("Mybatis");

        // list 객체 수 만큼 돈다
        for(int i = 0; i <list.size(); i++){
            // str 변수에 list 값 저장
            String str = list.get(i);
            // 돈 횟수 + 저장된 객체 출력
            System.out.println(i + ":" + str);
        }

    }
}
