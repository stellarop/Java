package lambdaExpression;

// Predicate 함수적 인터페이스를 사용하기 위한 class
public class Student2 {
    private String name;
    private String sex;
    private int age;

    public Student2(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
}
