package lambdaExpression;

import java.util.function.Consumer;

// Consumer 종류의 함수적 인터페이스는 처리 결과를 리턴하지 않기 때문에 andThen() 디폴트 메서드는
// 함수적 인터페이스의 호출 순서만 정한다.
// Consumer 의 순차적 연결
public class ConsumerAndThenExample {
    public static void main(String[] args) {

        Consumer<Member> consumerA = (m) ->{
            System.out.println("consumerA : " + m.getName());
        };

        Consumer<Member> consumerB = (m) ->{
            System.out.println("consumerB : " + m.getId());
        };

        // andThen() compose() 디폴트 메서드는 두 개의 함수적 인터페이스를 순차적으로 연결함
        // consumerAB의 메서드를 호출하면 consumerB부터 처리하고 결과를 consumerA에
        // 파라미터값으로 제공한다.
        // consumerA는 제공받은 파라미터값을 가지고 처리한 후 최종 결과 리턴

        // A.andThen(B) => A 실행 후 B 실행
        // A.compose(B) => B 실행 후 A실 행
        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        // consumerA, consumerB class 에 저장할 값 저장
        consumerAB.accept(new Member("김세연","seyeon", null));

    }
}
