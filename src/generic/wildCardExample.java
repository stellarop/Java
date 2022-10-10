package generic;

import java.util.Arrays;

// Course<?> = �������� ��� Ÿ��(���,������,�л�,����л�)�� �� �� �ִ�.
// Course<? extends Student> = �������� �л��� ����л��� �� �� �ִ�.
// Course<? super Worker> = �������� �����ΰ� ����� �� �� �ִ�.

// 1. ���
// 1-1 ������ 1-2 �л�
// 2.2 ����л�

// ���ϵ�ī�� Ÿ�� �Ű� ����
public class wildCardExample {

    // ��� ����
    // ���׸�Ÿ��<?> = ���Ѿ���
    // Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ��� Ŭ������ �������̽� Ÿ���� �� �� �ִ�.
    public static void registerCourse(Course<?> course){
        System.out.println(course.getName() + "������" +
                Arrays.toString(course.getStudents()));
    }

    // �л� ����
    // ���׸�Ÿ��<? extends ����Ÿ��> = ���� Ŭ���� ����
    // Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ�Ը� �� �� �ִ�.
    public static void registerCourseStudent(Course<? extends generic.Student> course){
        System.out.println(course.getName() + "������" +
                Arrays.toString(course.getStudents()));
    }

    // ������ ����
    // ���׸�Ÿ��<? super ����Ÿ��> = ���� Ŭ���� ����
    // Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ���� �ü� �ִ�.
    public static void registerCourseWorker(Course<? super generic.Worker> course){
        System.out.println(course.getName() + "������" +
                Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        // ��� ����
        Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);

        personCourse.add(new Person("�Ϲ���"));
        personCourse.add(new Person("������"));
        personCourse.add(new generic.Student("�л�"));
        personCourse.add(new HighStudent("����л�"));
        Course<Worker> workerCourse = new Course<generic.Worker>("�����ΰ���", 5);
        workerCourse.add(new generic.Worker("������"));

        // �л�
        Course<Student> studentCourse = new Course<Student>("�л�����", 5);
        studentCourse.add(new generic.Student("�л�"));
        studentCourse.add(new HighStudent("����л�"));
        // ����л�
        Course<HighStudent> hignStudentCourse =  new Course<HighStudent>("����л� ����", 5);
        hignStudentCourse.add(new HighStudent("����л�"));

        // ��� ����
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(hignStudentCourse);
        System.out.println();
        // �л� ����
        registerCourseStudent(studentCourse);
        registerCourseStudent(hignStudentCourse);
        System.out.println();
        // ������ ����
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
    }
}
