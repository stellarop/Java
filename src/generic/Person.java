package generic;

// 최상위 클래스
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //이부분이 있어야 registerCourse의 출력값이 정상적으로 나옴. toString이 원래는 뭐였을까?
    //검색->
    //Object"클래스가 가진 메소드 중 "toString"메소드가 있습니다.
    //물론 "Object" 클래스의 모든 메소드는 모든 클래스가 사용이 가능합니다.
    //"toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드 입니다.
    //그래서 이것을 의미 있는 값으로 재정의하여 사용한다!

    @Override
    public String toString() {
        return name;
    }
}
