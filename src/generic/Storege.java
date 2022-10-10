package generic;

// 제네릭 인터페이스
public interface Storege<T>{
    public void add(T item, int index);
    public T get(int index);
}
