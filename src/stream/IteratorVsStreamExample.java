package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

// Iterator 와 Stream 순차 처리
public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김세연","이연재","백성현");

        // Iterator 이용
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();

        // Stream 이용
        // Stream 메서드로 스트림 객체를 얻고 나서 stream.forEach
        // 메서드를 통해 컬렉션 요소를 하나씩 콘솔에 출력한다.
        // forEach() 메서드도 Consumer 함수적 인터페이스 타입의 매개값을 가지므로
        // 컬렉션의 요소를 소비할 코드를 람다식으로 기술할 수 있다.
        Stream<String> stream =  list.stream();
        stream.forEach( name -> System.out.println(name));
    }
}
