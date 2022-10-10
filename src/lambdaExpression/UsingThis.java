package lambdaExpression;

// 람다식 실행 블록에는 클래스의 멤버인 필드와 메서드를 제약 사항 없이 사용 가능
// this 키워드 사용시 주의 필요
// 람다식에 this는 내부적으로 생성되는 익명 객체의 참조가 아니라 람다식을 실행한 객체의 참조
// this 사용
public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;


        void method(){
            MyFunctionlInterface fi = ()->{

                System.out.println("outterField : " + outterField);
                // 바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
                System.out.println("outterField : " + UsingThis.this.outterField + "\n");

                System.out.println("innerField : " + innerField);
                // 람다식 내부에서 this는 inner 객체를 참조
                System.out.println("innerField : " + this.innerField);
            };
            fi.medhod();
        }
    }


}
