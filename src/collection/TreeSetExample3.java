package collection;

// TreeSet 이 가지고 있는 범위 검색과 관련된 메서드

// headSet(E toElement, boolean inclusive)
// 주어진 객체보다 낮은 객체들을 NavigableSet 으로 리턴
// 주어진 객체 포함 여부는 두 번째 매개값에 따라 달라진다.

// tailSet(E toElement, boolean inclusive)
// 주어진 객체보다 높은 객체들을 NavigableSet 으로 리턴
// 주어진 객체 포함 여부는 두 번째 매개값에 따라 달라진다.

// subSet(E fromElement, boolean fromInclusive, E toElement, boolean inclusive)
// 시작과 끝으로 주어진 객체 사이의 객체들을 NavigableSet 으로 리턴
// 시작과 끝 객체의 포함 여부는 두 번째, 네 번째 매개 값에 따라 달라진다.


import java.util.NavigableSet;
import java.util.TreeSet;

// 영어 단어 정렬, 범위 검색
public class TreeSetExample3 {
    public static void main(String[] args) {
        // treeSet 선언
        TreeSet<String> treeSet = new TreeSet<String>();

        // 객체 저장
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("[c ~ f 사이의 단어 검색]");

        NavigableSet<String> rangSet = treeSet.subSet
                // 시작 객체, 시작 객체의 포함 여부, 끝 객체, 끝 객체의 포함 여부
                ("c", true, "f", true);

        // rangSet 만큼 반복 후 해당 객체 찍는다.
        for(String word : rangSet){
            System.out.println(word);
        }
    }
}
