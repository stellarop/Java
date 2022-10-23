package collection;

// HashTable 은 HashMap 과 동일한 내부 구조를 가지고 있다.
// HashTable 도 키로 사용할 객체는 hashCode() 와 equals() 메서드를
// 재정의해서 동등 객체가 될 조건을 정해야 한다.
// HashMap 과 차이점은 HashTable 은 동기화된 메서드로 구성되어 있기 때문에
// 멀티 쓰레드가 동시에 이 메서드를 실행할 수 없고 하나의 스레드가 실행을 완료해야만
// 다른 스레드를 실행할 수 있다.
// 그래서 멀티 쓰레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다 이것을 쓰레드가 안전하다 라고 말한다.

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// 아이디, 패스워드 검사
public class HashTableExample {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<String,String>();

        // 아이디, 패스워드 저장
        map.put("leeyeonjae", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("아이디와 패스워드를 입력해주세요.");

            System.out.println("아이디 : ");
            // 아이디 입력 받음
            String id = scanner.nextLine();

            System.out.println("패스워드 : ");
            // 패스워드 입력 받음
            String pwd = scanner.nextLine();
            System.out.println();

            // id인 key 가 있는지 확인
            if (map.containsKey(id)){
                // 입력한 id로 password 값 equals
                if (map.get(id).equals(pwd)){
                    // id, pwd 둘 다 맞으면 성공 처리
                    System.out.println("로그인 성공");
                    break;
                }else{
                    System.out.println("패스워드가 일치하지 않습니다.");
                }
            }else{
                System.out.println("아이디가 일치하지 않습니다.");
            }

        }
    }
}
