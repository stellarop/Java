package collection;

// Vector �� ArrayList �� ������ ���� ������ ������ �ִ�.
// Vector �� �����ϱ� ���ؼ��� ������ ��ü Ÿ���� Ÿ�� �Ķ���ͷ� ǥ���ϰ� �⺻ �����ڷ� ȣ���Ѵ�.
// ArrayList �� �ٸ����� Vector �� ����ȭ(synchronized) �޼���� �����Ǿ� �ֱ� ������
// ��Ƽ �����尡 ���ÿ� �� �޼������ ������ �� ���� �ϳ��� �����尡 ������ �Ϸ��ؾ߸�
// �ٸ� �����带 ������ �� �ִ�. �׷��� ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ������ ���ִ�. ��
// �̰��� �����尡 ����(thread safe) �ϴٶ�� ���Ѵ�.

import java.util.List;
import java.util.Vector;

// Board ��ü�� �����ϴ� Vector
public class VectorExample {
    public static void main(String[] args) {
        // Vector ����
        List<Board> list = new Vector<Board>();

        // Board class ������ add �� �߰� 
        list.add(new Board("����1","����1", "�۾���1"));
        list.add(new Board("����2","����2", "�۾���2"));
        list.add(new Board("����3","����3", "�۾���3"));
        list.add(new Board("����4","����4", "�۾���4"));
        list.add(new Board("����5","����5", "�۾���5"));

        // 2�� �ε���(����3) ���� (�� �ε����� �ڵ����� 1�� ������ �������.)
        list.remove(2);
        // 3�� �ε���(����5) ����
        list.remove(3);

        // list ��ü ��ŭ ����
        for(int i = 0; i < list.size(); i++){
            // Board ��ü ������ list ��ü �� ��ŭ ����
            Board board = list.get(i);

            // ���
            System.out.println("���� : " + board.subject + ", ���� : " + board.content
                    + ", �ۼ��� : " + board.writer);
        }

    }
}
