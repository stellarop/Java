package collection;

// ArrayList 를 생성하고 필요한 객체들을 추가하는 것이 일반적이지만
// 고정된 객체들로 구성된 List 를 생성하려면 Arrays.AsList() 를 이용한다.


import java.util.Arrays;
import java.util.List;

// Arrays.AsList() 메서드
public class ArrayAsListExample {
    public static void main(String[] args) {

        // T 타입 파라미터에 맞게 asList() 의 매개값을 순차적으로 입력하거나 T[] 배열을
        // 매개값으로 주면 됨
        List<String> list1 = Arrays.asList("김세연","이연재","신용권");

        // list1 만큼 돈다
        for(String name : list1){
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1, 2, 3);

        for(int Value : list2){
            System.out.println(Value);
        }

    }
}
