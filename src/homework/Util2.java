package homework;

public class Util2 {

    public static <K,V> V getValue1(Pair2<K,V> p1, K k) {

        if (p1.getKey().equals(k)) {

            return p1.getValue();
        }
        return null;
    }

    // P로 받은 파라미터 Pair2클래스 상속
    // 메서드 반환 타입 V에 지정된 타입 P 객체와 Key name을 파라미터로 받아준다
    public static <P extends Pair2<K, V>, K,V > V getValue2(P p, K k){
        if(p.getKey().equals(k)){
            return p.getValue();
        }else{
            return null;
        }
    }
}
