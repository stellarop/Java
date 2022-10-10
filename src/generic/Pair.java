package generic;

public class Pair<K,V> {
	private K key;
	private V value;
	
	// ���� Ŭ���� �����ڿ��� ���� �� set���� �ޱ�
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// �ʵ忡 ����� �� �ֱ�
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	// �ʵ忡 ����� �� ��������
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
