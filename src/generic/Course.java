package generic;


// 코드에서 ?를 와일드카드라고 부른다. 제네릭 타입을 맴개값이나 리턴 타입으로 사용할 때
// 구체적인 타입 대신에 와일드카드를 세 가지 형태로 사용

// 제네릭타입<?> = 제한없음
// 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
// 제네릭타입<? extends 상위타입> = 상위 클래스 제한
// 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 후위 타입만 올 수 있다.
// 제네릭타입<? super 하위타입> = 하위 클래스 제한
// 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올수 있다.

// 와일드카드 타입
public class Course<T> {
    private String name;
    private  T[] students;

    // 생성자
    // 구현 클래스에서 입력한 과정명, 수강 인원
    public Course(String name, int capacity){
        // 과정명 필드로
        this.name = name;
        // 수강 인원에 맞춰 배열 생성
        students = (T[]) (new Object[capacity]);
    }

    public String getName(){
        return name;
    }
    public T[] getStudents(){
        return students;
    }

    public void add(T t){
        // 수강 인원 길이 마다 for 진행
        for (int i= 0; i < students.length; i++){
            // 배열의 값이 null일 시
            if(students[i] == null){
                // 받은 파라미터 값 배열에 순차적으로 넣기
                students[i] = t;
                break;
            }
        }
    }
}
