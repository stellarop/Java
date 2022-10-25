package collection;

import java.util.TreeSet;

// 내림차순 정렬자를 사용하는 TreeSet
public class ComparatorExample {
    public static void main(String[] args) {
        // 내림차순 정렬자 제공
        TreeSet<Fruit> treeSet1 = new TreeSet<Fruit>(new DescendingComparator());

        // 저장될 때 가격을 기준으로 내침차순으로 정렬된다.
        treeSet1.add(new Fruit("포도", 3000));
        treeSet1.add(new Fruit("수박", 10000));
        treeSet1.add(new Fruit("딸기", 6000));

        // 내림차순 정렬
        for(Fruit fruit : treeSet1){
            System.out.println(fruit.name + " : " + fruit.price);
        }

    }
}
