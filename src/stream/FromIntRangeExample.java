package stream;

import java.util.stream.IntStream;

// 정수 범위를 소스로 하는 스트림
public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        // rangeClosed() 메서드는 첫 번째 매개값에서 두 번째 매개값까지 순차적으로 제공하는
        // IntStream 을 리턴한다.
        IntStream stream = IntStream.rangeClosed(1, 100);
        // 1부터 100까지 수를 더할때까지 반복
        stream.forEach(a-> sum+=a);

        System.out.println("1 ~ 100 까지 합 : " + sum);
    }
}
