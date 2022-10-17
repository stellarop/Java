package collection;

// LinkedList �� List ���� Ŭ�����̹Ƿ� ArrayList �� ��� ����� �Ȱ����� ���� ������ �ٸ���.
// ArrayList �� ���� �迭�� ��ü�� �����ؼ� �ε����� ����������
// LinkedList �� ���� ������ ��ũ�ؼ� ü��ó�� �����Ѵ�.
// LinkedList ���� Ư�� �ε����� ��ü�� �����ϸ� �е� ��ũ�� ����ǰ� ������ ��ũ�� ������� ����
// ���� ��ü ������ ������ �Ͼ�°����� ArrayList ���� LinkedList �� �ν� �� ���� ������ �����Ѵ�.
// LinkedList ��ü ���� �� ArrayList ó�� �ε����� ������ ������°� �ƴ� ���� �� �� �� ���� ����

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList / LinkedList ���� ���� ��

// ���������� ���������� �߰� / �����ϴ� ��� ArrayList �� ��������
// �߰��� �߰� / ������ ��� �յ� ��ũ ������ �����ϸ� �Ǵ� LinkedList �� �� ������
// ArrayList �� ���� �ε������� ��� 1�� ���� �Ǵ� ���ҽ�Ű�� �ð��� �ʿ��ϹǷ� ó�� �ӵ��� ������.

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        // ��ŸƮ �ð� / ���� �ð�  ���� ����
        long startTime;
        long endTime;

        startTime = System.nanoTime();

        // ArrayList 10000�� ����
        for(int i = 0; i < 10000; i++){
            list1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList �ɸ� �ð� : " + (endTime-startTime) + " ns");

        startTime = System.nanoTime();

        // LinkedList 10000�� ����
        for(int i = 0; i < 10000; i++){
            list2.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("LinkedList �ɸ� �ð� : " + (endTime-startTime) + " ns");
    }
}
