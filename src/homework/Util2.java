package homework;

public class Util2 {

    public static <K,V> V getValue1(Pair2<K,V> p1, K k) {

        if (p1.getKey().equals(k)) {

            return p1.getValue();
        }
        return null;
    }

    // P�� ���� �Ķ���� Pair2Ŭ���� ���
    // �޼��� ��ȯ Ÿ�� V�� ������ Ÿ�� P ��ü�� Key name�� �Ķ���ͷ� �޾��ش�
    public static <P extends Pair2<K, V>, K,V > V getValue2(P p, K k){
        if(p.getKey().equals(k)){
            return p.getValue();
        }else{
            return null;
        }
    }
}
