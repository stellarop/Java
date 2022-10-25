package collection;

import java.util.Comparator;

// Fruit 의 내림차순 정렬자
public class DescendingComparator implements Comparator<Fruit> {

    // compare 메서드는 비교하는 두 객체가 동등하면 0
    // 비교하는 값보다 앞에 오게 하려면 음수,
    // 비교하는 값보다 뒤에 오게 하려면 양수를 리턴한다
    @Override
    public int compare(Fruit o1, Fruit o2) {
        // 비교하는 가격이 적을 경우 뒤
        if(o1.price < o2.price){
            return 1;
            // 비교하는 가격이 동등하면 0
        }else if(o1.price == o2.price){
            return 0;
        }else{
            // 비교하는 가격이 클 경우 앞
            return -1;
        }

    }
}
