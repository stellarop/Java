package collection;

// LinkedList 는 List 구현 클래스이므로 ArrayList 와 사용 방법은 똑같지만 내부 구조는 다르다.
// ArrayList 는 내부 배열에 객체를 저장해서 인덱스로 관리하지만
// LinkedList 는 인접 참조를 링크해서 체인처럼 관리한다.
// LinkedList 에서 특정 인덱스의 객체를 제거하면 압뒤 링크만 변경되고 나머지 링크는 변경되지 않음
// 많은 객체 삭제와 삽입이 일어나는곳에선 ArrayList 보다 LinkedList 가 훨신 더 좋은 성능을 발휘한다.
// LinkedList 객체 삭제 시 ArrayList 처럼 인덱스가 앞으로 당겨지는게 아닌 삭제 후 두 값 새로 연결

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList / LinkedList 실행 성능 비교

// 끝에서부터 순차적으로 추가 / 삭제하는 경우 ArrayList 가 빠르지만
// 중간에 추가 / 삭제할 경우 앞뒤 링크 정보만 변경하면 되는 LinkedList 가 더 빠르다
// ArrayList 는 뒤쪽 인덱스들을 모두 1씩 증가 또는 감소시키는 시간이 필요하므로 처리 속도가 느리다.

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        // 스타트 시간 / 엔드 시간  변수 선언
        long startTime;
        long endTime;

        startTime = System.nanoTime();

        // ArrayList 10000번 돌기
        for(int i = 0; i < 10000; i++){
            list1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime) + " ns");

        startTime = System.nanoTime();

        // LinkedList 10000번 돌기
        for(int i = 0; i < 10000; i++){
            list2.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime) + " ns");
    }
}
