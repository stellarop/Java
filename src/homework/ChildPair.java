package homework;

// Pair2 클래스 상속 후 파라미터 받기
public class ChildPair<K,V> extends Pair2<K, V>{
    public ChildPair(K k, V v){
        // 파라미터 넣고 부모 메서드 실행(Pair2 get,set 메서드)
        super(k,v);
    }
}
