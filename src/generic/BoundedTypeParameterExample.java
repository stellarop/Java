package generic;

// 제한된 타입 파라미터<T extends 최상위 타입>
// 숫자를 연산하는 제네릭 메서드는 매개값으로 Number 타입 또는 하위 클래스 타입(Integer,double,Long)
// 의 인스턴스만 가져와야함
// 이것이 제한된 타입 파라미터가 필요한 이유이다.
// 제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 extends 붙히고 상위 타입 명시(클래스,인터페이스 가능)

// 제네릭 메서드 호출
public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        // String은 Number 타입이 아니기 때문에 error
        //String str = Utill.Compare("a","b");

        // 자동 형변환
        int result1 = Utill.intCompare(10,20);// int => Integer
        System.out.println(result1);

        int result2 = Utill.intCompare(4.5,3);// double => Double
        System.out.println(result2);
    }
}
