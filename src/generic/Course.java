package generic;


// �ڵ忡�� ?�� ���ϵ�ī���� �θ���. ���׸� Ÿ���� �ɰ����̳� ���� Ÿ������ ����� ��
// ��ü���� Ÿ�� ��ſ� ���ϵ�ī�带 �� ���� ���·� ���

// ���׸�Ÿ��<?> = ���Ѿ���
// Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ��� Ŭ������ �������̽� Ÿ���� �� �� �ִ�.
// ���׸�Ÿ��<? extends ����Ÿ��> = ���� Ŭ���� ����
// Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ�Ը� �� �� �ִ�.
// ���׸�Ÿ��<? super ����Ÿ��> = ���� Ŭ���� ����
// Ÿ�� �Ķ���͸� ��ġ�ϴ� ��ü���� Ÿ������ ���� Ÿ���̳� ���� Ÿ���� �ü� �ִ�.

// ���ϵ�ī�� Ÿ��
public class Course<T> {
    private String name;
    private  T[] students;

    // ������
    // ���� Ŭ�������� �Է��� ������, ���� �ο�
    public Course(String name, int capacity){
        // ������ �ʵ��
        this.name = name;
        // ���� �ο��� ���� �迭 ����
        students = (T[]) (new Object[capacity]);
    }

    public String getName(){
        return name;
    }
    public T[] getStudents(){
        return students;
    }

    public void add(T t){
        // ���� �ο� ���� ���� for ����
        for (int i= 0; i < students.length; i++){
            // �迭�� ���� null�� ��
            if(students[i] == null){
                // ���� �Ķ���� �� �迭�� ���������� �ֱ�
                students[i] = t;
                break;
            }
        }
    }
}
