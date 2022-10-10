package generic;

public class Pair<K,V> {
	private K key;
	private V value;
	
	// 메인 클래스 생성자에서 넣은 값 set으로 받기
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// 필드에 저장된 값 넣기
	public void setKey(K key) {
		this.key = key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	// 필드에 저장된 값 가져오기
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
