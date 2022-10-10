package generic;

import java.util.Arrays;

// Course<?> = 수강생은 모든 타입(사람,직장인,학생,고등학생)이 될 수 있다.
// Course<? extends Student> = 수강생은 학생과 고등학생만 될 수 있다.
// Course<? super Worker> = 수강생은 직장인과 사람만 될 수 있다.

// 1. 사람
// 1-1 직장인 1-2 학생
// 2.2 고등학생

// 와일드카드 타입 매개 변수
public class wildCardExample {

    // 모든 과정
    // 제네릭타입<?> = 제한없음
    // 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
    public static void registerCourse(Course<?> course){
        System.out.println(course.getName() + "수강생" +
                Arrays.toString(course.getStudents()));
    }

    // 학생 과정
    // 제네릭타입<? extends 상위타입> = 상위 클래스 제한
    // 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 후위 타입만 올 수 있다.
    public static void registerCourseStudent(Course<? extends generic.Student> course){
        System.out.println(course.getName() + "수강생" +
                Arrays.toString(course.getStudents()));
    }

    // 직장인 과정
    // 제네릭타입<? super 하위타입> = 하위 클래스 제한
    // 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올수 있다.
    public static void registerCourseWorker(Course<? super generic.Worker> course){
        System.out.println(course.getName() + "수강생" +
                Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        // 모든 과정
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);

        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new generic.Student("학생"));
        personCourse.add(new HighStudent("고등학생"));
        Course<Worker> workerCourse = new Course<generic.Worker>("직장인과정", 5);
        workerCourse.add(new generic.Worker("직장인"));

        // 학생
        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(new generic.Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));
        // 고등학생
        Course<HighStudent> hignStudentCourse =  new Course<HighStudent>("고등학생 과정", 5);
        hignStudentCourse.add(new HighStudent("고등학생"));

        // 모든 과정
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(hignStudentCourse);
        System.out.println();
        // 학생 과정
        registerCourseStudent(studentCourse);
        registerCourseStudent(hignStudentCourse);
        System.out.println();
        // 직장인 과정
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
    }
}
