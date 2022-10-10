package lambdaExpression;

// �� ���� �߻� �޼��带 ������ �������̽����� ��� ���ٽ��� �̿���
// �͸� ���� ��ü�� ǥ���� �����ϴ�. �������� �۾��� �����ϴ� Runnable �������̽���
// �Ķ���Ϳ� ���ϰ��� ���� run() �޼��常 �����ϱ� ������ ���ٽ��� �̿��� Runnable �ν��Ͻ� ���� ����

// �Լ��� �������̽��� ���ٽ�
public class RunnableExample {
    public static void main(String[] args) {
        // Runnable �������̽��� �̿��ؼ� �͸� ���� ��ü ����
        Runnable runnable = ()->{
            for(int i = 0; i<10; i++){
                System.out.println(i);
            }
        };

        // ������ �ȿ� ������ �ڵ� ����
        // ������ �����ڸ� ȣ���� �� �͸� ���� ��ü ���� ����
        Thread thread = new Thread(runnable);
        // ������ ����
        thread.start();
    }
}
