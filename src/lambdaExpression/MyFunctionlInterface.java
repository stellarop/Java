package lambdaExpression;

// 람다식은 하나의 메서드를 정의하기 때문에 두개 이상의 추상 메서드가 선언된 인터페이스는
// 람다식을 이용해서 구현 객체를 생성할 수 없음
// 하나의 추상 메서드가 선언된 인터페이스만 람다식의 타켓이 될 수 있다.
// 이런 인터페이스를 함수적 인터페이스 라고 한다
// 함수적 인터페이스 작성 시 두개 이상의 추상 메서드가 선언되지 않도록 컴파일 체킹해주는 기능이 있는데
// 인터페이스 선언시 @FunctionalInterface 어노테이션을 붙혀주면 가능
// @FunctionalInterface 어노테이션은 두 개 이상의 추상 메서드가 선언되면 컴파일 오류 발생시킴
@FunctionalInterface
public interface MyFunctionlInterface {
    public void medhod();
    //public void medhod(int x);
    //public int medhod(int x, int y);
}
