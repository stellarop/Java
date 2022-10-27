package collection;

import java.util.Stack;

// Stack
// ���Լ��� ������ ���߿� ���� ��ü�� ���� ���������� �ڷᱸ��.
public class StackExample {
    public static void main(String[] args) {
        // Stack ����
        Stack<Coin> coinBox = new Stack<Coin>();

        // ������ �����.(push)
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // ���� ���̽��� ������� Ȯ��
        while (!coinBox.isEmpty()){
            // ���� ���̽��� ���� ���߿� ���� ���� ������
            Coin coin = coinBox.pop();
            System.out.println("���� ���� : " + coin.getValue() + "��");
        }
    }
}
