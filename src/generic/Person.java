package generic;

// �ֻ��� Ŭ����
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //�̺κ��� �־�� registerCourse�� ��°��� ���������� ����. toString�� ������ ��������?
    //�˻�->
    //Object"Ŭ������ ���� �޼ҵ� �� "toString"�޼ҵ尡 �ֽ��ϴ�.
    //���� "Object" Ŭ������ ��� �޼ҵ�� ��� Ŭ������ ����� �����մϴ�.
    //"toString" �޼���� ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ� �Դϴ�.
    //�׷��� �̰��� �ǹ� �ִ� ������ �������Ͽ� ����Ѵ�!

    @Override
    public String toString() {
        return name;
    }
}
