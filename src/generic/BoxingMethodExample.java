package generic;

// ���׸� �޼��� ȣ��
public class BoxingMethodExample {
    public static void main(String[] args) {
        // Utill �� boxing �޼��� Ÿ�� �Է� �� boxing �Ķ���� �ֱ�
        Box<Integer> box1 = Utill.<Integer>boxing(100);
        // �Ķ���ͷ� ���� ������ ��������
        int num = box1.get();

        Box<String> box2 = Utill.<String>boxing("test");
        String str = box2.get();

        // ���
        System.out.println("Box : " + num);
        System.out.println("Box : " + str);
    }
}
