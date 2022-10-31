package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 배열로부터 스트림 얻기
public class FromArrayExample {
    public static void main(String[] args) {
        // 배열 생성
        String[] strArr = {"김세연","이연재","백성현"};
        // Arrays.stream() 에 배열 추가
        Stream<String> strStream = Arrays.stream(strArr);
        // 배열에 길이만큼 반복 출력
        strStream.forEach(a-> System.out.print(a + ","));
        System.out.println();

        int[] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a-> System.out.print(a + ","));
    }
}
