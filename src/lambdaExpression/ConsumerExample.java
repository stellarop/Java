package lambdaExpression;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

// consume 함수적 인터페이스의 특징은 리턴값이 없는 accept() 메서드를 가진다.
// accept() 메서드는 매개 값을 소비하는 역할을 한다 => 리턴 값이 없다.(void)

// consume 함수적 인터페이스
public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer<T> 인터페이스를 타켓 타입으로 하는 람다식은 다음과 같이 작성
        Consumer<String> consumer = t -> System.out.println(t + "8");
        // accept() 메서드는 파라미터값으로 T 객체 하나를 가진다
        // 타입 파라미터에 String이 대입되어 람다식 T 파라미터도 String
        consumer.accept("java");

        // BiConsumer<T,U> 인터페이스를 타켓 타입으로 하는 람다식은 다음과 같이 작성
        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        // accept() 메서드는 파라미터값으로 T, U 두 개의 객체를 가지므로 람다식도 두 개의 파라미터 사용
        // 타입 파라미터가 각각 String이 대입, T, U 파라미터 타입은 String
        biConsumer.accept("java", "8");

        // BiConsumer 인터페이스를 타켓 타입으로 하는 람다식은 다음과 같이 작성
        DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
        // accept() 메서드는 파라미터로 double을 가지므로 람다식도 한개의 파라미터 타입을 가진다.
        // d 타입은 고정적으로 double
        doubleConsumer.accept(8.0);

        // ObjIntConsumer<T> 인터페이스 타켓 타입으로 하는 람다식은 다음과 같이 작성한다.
        ObjIntConsumer<String> objIntConsumer = (t,i) -> System.out.println(t + i);
        // accept() 메서드는 파라미터 값으로 T 객체와 int 값 두 개를 가지기 때문에 람다식에서도
        // 두 개의 파라미터를 사용한다. T는 String i는 고정적으로 int
        objIntConsumer.accept("java", 8);
    }
}
