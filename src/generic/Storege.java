package generic;

// ���׸� �������̽�
public interface Storege<T>{
    public void add(T item, int index);
    public T get(int index);
}
