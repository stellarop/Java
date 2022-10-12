package lambdaExpression;

import java.util.function.Function;

// Function 의 순차적인 연결
public class FunctionAndThenComposeExample {
    public static void main(String[] args) {

        // functionA = Member, Address class 로 이루어짐
        Function<Member, Address> functionA;
        // functionB = Address class, String 로 이루어짐
        Function<Address, String> functionB;
        // functionAB = Member class, String 로 이루어짐
        Function<Member, String> functionAB;

        // 리턴 받을 도시 변수
        String city;

        // 생성자를 통해서 입력한 Address class 리턴
        functionA = (m) -> m.getAddress();
        // Address 값 중 도시 이름을 가져옴
        functionB = (a) -> a.getCity();

        // functionA.andThen(functionB) => functionA 실행 후 functionB 실행
        functionAB = functionA.andThen(functionB);

        // functionAB 변수는 Member, String 이기 때문에 해당 값 입력
        // functionA가 우선 실행되기 때문에 각 Member, Address class 에 해당 값 저장됨
        // functionB는 Address class 에 실제 저장된 값을 가져옴

        // functionA 실행(생성자를 통해 해당 값 넣어줌)
        // functionB 실행(실제 address class 저장된 이름 리턴)
        // functionAB 실행(해당 유저가 살고 있는 도시 이름 리턴 받음)
        city = functionAB.apply(
                new Member("김세연", "se", new Address("한국", "의정부"))
        );

        System.out.println("거주 도시 : " + city);

        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("이연재", "lee", new Address("한국", "서울"))
        );

        System.out.println("거주 도시 : " + city);

    }
}
