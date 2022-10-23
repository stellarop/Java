package collection;

// key �� ������ ��ü - hashCode() �� equals() ������

// HashMapExample2 ���� ����ϴ� class
public class Student {
    // �й�
    public int sno;
    // �̸�
    public String name;

    // ������
    public Student(int sno, String name){
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object obj){

        if(obj instanceof Student){
            // student obj ��
            Student student = (Student) obj;
            // Student class �� �ִ� ���� map �ȿ� �ִ� ���� ���ٸ�! �� ��ȯ
            return (sno == student.sno) && (name.equals(student.name));
        }else{
            // �ƴϸ� false
            return false;
        }
    }

    public int hashCode(){
        return sno + name.hashCode();
    }
}
