package lambdaExpression;

// 람다식은 익명 함수를 생성하기 위한 식
// 람다식을 사용하는 이유?
// => 자바 코드가 간결해지고 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 집계
// 람다식의 형태는 파라미터를 가진 코드 블록이지만 런타임 시 익명 구현 객체를 생성
// 람다식
public class MyFunctionlInterfaceExample {
    public static void main(String[] args) {

        // 인터페이스 변수 선언 (람다식은 인터페이스 변수에 대입됨)
        MyFunctionlInterface fi;


        /*
        // 파라미터가 없는 람다식
        fi = () ->{
            String str = "method1 call";
            System.out.println(str);
        };
        fi.medhod();

        fi = () ->{
            System.out.println("method2 call");
        };
        fi.medhod();

        // 실행문이 하나라면 중괄호{}는 생략 가능
        fi = () -> System.out.println("method3 call");
        fi.medhod();
         */

        /*
        // 파라미터가 존재하는 람다식
        fi = (x) ->{
            int sum = x * 5;
            System.out.println(sum);
        };
        fi.medhod(2);

        fi = (x) ->{
            System.out.println(x*5);
        };
        fi.medhod(2);

        // 파라미터가 하나일 시 괄호() 생략 가능
        fi = x ->{
            System.out.println(x*5);
        };
        fi.medhod(2);
        */

        /*
        // 리턴값이 있는 람다식
        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        int sum = fi.medhod(2, 5);
        System.out.println(sum);

        fi = (x, y) ->{
            return x + y;
        };
        System.out.println(fi.medhod(2,5));

        // return문만 있을 경우 중괄호{}와 return문 생략 가능
        fi = (x, y) -> x + y;
        System.out.println(fi.medhod(2,5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.medhod(2 ,5));

    }
    public static int sum(int x, int y){
        return (x + y);

         */
    }

}


