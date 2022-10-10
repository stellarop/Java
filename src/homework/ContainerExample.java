package homework;

import homework.Container;

public class ContainerExample {
    public static void main(String[] args) {
        /*
        Container<String> container1 = new Container<String>();
        container1.set("ȫ�浿");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(100);
        int value = container2.get();

        System.out.println("�̸� : " + str);
        System.out.println("���� : " + value);
        */
        Container<String, String> container1 = new Container<>();
        container1.set("ȫ�浿", "����");

        String key1 = container1.getKey();
        String value1 = container1.getValue();

        System.out.println("key1 : " + key1);
        System.out.println("value1 : " + value1);

        Container<String, Integer> container2 = new Container<>();
        container2.set("ȫ�浿", 35);

        String key2 = container2.getKey();
        int value2 = container2.getValue();

        System.out.println("key2 : " + key2);
        System.out.println("value2 : " + value2);
    }
}
