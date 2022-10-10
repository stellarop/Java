package lambdaExpression;

// 한 개의 추상 메서드를 가지는 인터페이스들은 모두 람다식을 이용해
// 익명 구현 객체로 표현이 가능하다. 스레드의 작업을 정의하는 Runnable 인터페이스는
// 파라미터와 리턴값이 없는 run() 메서드만 존재하기 때문에 람다식을 이용해 Runnable 인스턴스 생성 가능

// 함수적 인터페이스와 람다식
public class RunnableExample {
    public static void main(String[] args) {
        // Runnable 인터페이스를 이용해서 익명 구현 객체 생성
        Runnable runnable = ()->{
            for(int i = 0; i<10; i++){
                System.out.println(i);
            }
        };

        // 스레드 안에 구현한 코드 삽입
        // 스레드 생성자를 호출할 때 익명 구현 객체 생성 가능
        Thread thread = new Thread(runnable);
        // 스레드 시작
        thread.start();
    }
}
