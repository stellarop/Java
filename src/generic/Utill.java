package generic;

// ���׸� �޼���� �Ű� Ÿ�԰� ���� Ÿ������ Ÿ�� �Ķ���͸� ���� �޼���
// ���� Ÿ�� �տ� <> �߰� �� Ÿ�� �Ķ���� ���, ���� Ÿ�԰� �Ű��� Ÿ������ Ÿ�� �Ķ���͸� �����

// ���׸� �޼���
public class Utill {
	public static <T> Box<T> boxing(T t){
		// ��ü ���� �� ���� ���׸� Ÿ�� ����
		Box<T> box = new Box<T>();
		// box.set �޼��� �� ���׷� ������ �ֱ�
		box.set(t);
		// ���� ������ ����
		return box;
	}
	
	// ���� Ŭ�������� �ش� Ÿ�� �Ķ���� �޾��ְ� ���ڿ� �� �� ����
	public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V> p2) {

		// p1�� key ���� p2 key ���� ���ڿ� ��
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		// p1�� value ���� p2 value ���� ���ڿ� ��
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		// �� boolean �� and ���� ����
		return keyCompare && valueCompare;
	}

	// ���ѵ� Ÿ�� �Ķ����<T extends �ֻ��� Ÿ��>
	// Ÿ�� �Ķ���Ϳ� �����Ǵ� ��ü���� Ÿ���� ���� Ÿ���̰ų� ���� Ÿ���� ����, ����Ŭ������ ����
	// �޼��� {} �� Ÿ�� �Ķ���� ������ ��� �����Ѱ� ���� Ÿ�� ���(�ʵ�, �޼���)�� ���ѵ�
	public static <T extends Number> int intCompare(T t1, T t2) {

		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		// v1 < v1 = -1
		// v1 > v1 = 1
		return Double.compare(v1, v2);
	}


}
