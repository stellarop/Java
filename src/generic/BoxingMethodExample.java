package generic;

// 제네릭 메서드 호출
public class BoxingMethodExample {
    public static void main(String[] args) {
        // Utill 안 boxing 메서드 타입 입력 후 boxing 파라미터 넣기
        Box<Integer> box1 = Utill.<Integer>boxing(100);
        // 파라미터로 넣은 데이터 가져오기
        int num = box1.get();

        Box<String> box2 = Utill.<String>boxing("test");
        String str = box2.get();

        // 출력
        System.out.println("Box : " + num);
        System.out.println("Box : " + str);
    }
}
