package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

// Iterator �� Stream ���� ó��
public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("�輼��","�̿���","�鼺��");

        // Iterator �̿�
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();

        // Stream �̿�
        // Stream �޼���� ��Ʈ�� ��ü�� ��� ���� stream.forEach
        // �޼��带 ���� �÷��� ��Ҹ� �ϳ��� �ֿܼ� ����Ѵ�.
        // forEach() �޼��嵵 Consumer �Լ��� �������̽� Ÿ���� �Ű����� �����Ƿ�
        // �÷����� ��Ҹ� �Һ��� �ڵ带 ���ٽ����� ����� �� �ִ�.
        Stream<String> stream =  list.stream();
        stream.forEach( name -> System.out.println(name));
    }
}
