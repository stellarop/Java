package lambdaExpression;

// 람다식은 메서드 내부에서 주로 작성되기 때문에 로컬 익명 구현 객체를 생성시킨다.
// 람다식에서 바깥 클래스의 필드나 메서드는 제한 없이 사용할 수 있으나 메서드의 파라미터
//, 로컬 변수를 사용하면 이 두 변수는 final 특성을 가져야함
// => 파라미터, 로컬 변수를 람다식에서 읽는건 허용되지만 람다식 내부 또는 외부에서 변경 할 수 없다

// final 특성을 가지는 로컬 변수
public class UsingLocalVariable {
    void method(int age){
        int localVer = 40;

        // age = 30; // final 특성 때문에 수정 불가

        // 람다식
        MyFunctionlInterface fi = ()->{
            // 로컬 변수 읽기
            System.out.println("age : " + age);
            System.out.println("localVer : " + localVer);
        };
        fi.medhod();
    }
}
