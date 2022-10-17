package collection;

// Vector 는 ArrayList 와 동일한 내부 구조를 가지고 있다.
// Vector 를 생성하기 위해서는 저장할 객체 타입을 타입 파라미터로 표기하고 기본 생성자로 호출한다.
// ArrayList 와 다른점은 Vector 는 동기화(synchronized) 메서드로 구성되어 있기 때문에
// 멀티 쓰레드가 동시에 이 메서드들을 실행할 수 없고 하나의 쓰레드가 실행을 완료해야만
// 다른 쓰레드를 실행할 수 있다. 그래서 멀티 쓰레드 환경에서 안전하게 객체를 추가, 삭제할 수있다. 이
// 이것을 쓰레드가 안전(thread safe) 하다라고 말한다.

import java.util.List;
import java.util.Vector;

// Board 객체를 저장하는 Vector
public class VectorExample {
    public static void main(String[] args) {
        // Vector 선언
        List<Board> list = new Vector<Board>();

        // Board class 생성자 add 로 추가 
        list.add(new Board("제목1","내용1", "글쓴이1"));
        list.add(new Board("제목2","내용2", "글쓴이2"));
        list.add(new Board("제목3","내용3", "글쓴이3"));
        list.add(new Board("제목4","내용4", "글쓴이4"));
        list.add(new Board("제목5","내용5", "글쓴이5"));

        // 2번 인덱스(제목3) 삭제 (뒤 인덱스는 자동으로 1씩 앞으로 당겨진다.)
        list.remove(2);
        // 3번 인덱스(제목5) 삭제
        list.remove(3);

        // list 객체 만큼 돈다
        for(int i = 0; i < list.size(); i++){
            // Board 객체 변수에 list 객체 수 만큼 저장
            Board board = list.get(i);

            // 출력
            System.out.println("제목 : " + board.subject + ", 내용 : " + board.content
                    + ", 작성자 : " + board.writer);
        }

    }
}
