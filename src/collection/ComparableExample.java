package collection;

// TreeSet, TreeMap 은 정렬을 위해 Comparable 을 구현한 객체를 요구하는데
// Integer, Double, String 모두 Comparable 인터페이스를 구현하고 있다.
// Comparable 에는 compareTo() 메서드가 정의되어 있기 때문에 사용자 정의 클래스에서는 이
// 메서드를 오버라이딩(재정의) 하여 리턴 값을 만든다.

import java.util.TreeSet;

// 사용자 정의 객체를 나이 순으로 정렬
public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        // TreeSet, TreeMap 객체에 값을 저장할 때 오름차순으로 정렬된다.
        treeSet.add(new Person("김세연", 21));
        treeSet.add(new Person("백소진", 28));
        treeSet.add(new Person("이연재", 24));

        // treeSet 객체 만큼 반복
        for(Person entry : treeSet){
            // compareTo 메서드로 나이 순으로 오름차순 정렬을 했기 때문에
            // 출력 시 나이가 오름차순으로 출력된다.
            System.out.println("이름 : " + entry.name + " | " + "나이 : " + entry.age);
        }

    }
}
