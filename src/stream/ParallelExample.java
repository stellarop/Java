package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 병렬처리란 한 가지 작업을 서브 작업으로 나누고 서브 작업들을 분리된 스레드에서
// 병렬적으로 처리하는 것
// 병렬 처리 스트림을 이용하면 런타임 시 하나의 작업을 서브 작업으로 자동으로 나누고
// 서브 작업의 결과를 자동으로 결합해서 최종 결과물을  생성한다.

// 컬렉션의 요소 총 합계를 구할때 순차 처리 스트림은 하나의 스레드가 요소들을 순차적으로 읽어
// 합을 구하지만 병렬 처리 스트림은 여러 개의 스레드가 요소들을 부분적으로 합하고
// 이 부분 합을 최종 결합해서 전체 합을 생성한다.

// 순차처리 => 컬렉션 요소들을 하나씩 가져와서 더한다.
// 병렬처리 => 컬렉션 요소들을 전부 더해서 가져온다.

// 순차처리, 병렬처리
public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "김세연", "이연재", "백성현","유소윤","강지원"
        );

        // 순차처리
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample :: print);

        System.out.println();

        // 병렬처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
