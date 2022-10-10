package lambdaExpression;

// Supplier 함수적 인터페이스의 특징은 파라미터가 없고 리턴값이 있는 getOOO() 메서드를 가진다.
// 이 메서드들은 실행 후 호출한 곳으로 데이터를 리턴 하는 역활을 함.

import java.util.function.IntSupplier;
import java.util.function.Supplier;

// Supplier 함수적 인터페이스
public class SupplierExample {
    public static void main(String[] args) {

        // 람다식 인터페이스 선언 / 익명 객체 구현
        IntSupplier intSupplier = () ->{
            // 랜덤 난수 생성 후
            int num = (int) (Math.random() * 6) + 1;
            // 해당 인터페이스 리턴
            return num;
        };

        Supplier<String> StringSupplier = ()-> {
            String ssl = "Supplier 제네릭 타입 저장";
            return ssl;
        };

        // 해당 인터페이스에 저장된 랜덤 난수 get() 메서드로 가져옴
        int num = intSupplier.getAsInt();
        // 출력
        System.out.println("num : " + num);

        // 제네릭 타입으로 String을 주었으니 받는 값을 String으로 받아야 함.
        String ssl = StringSupplier.get();
        System.out.println(ssl);
    }
}
