package generic;

public class Storegeimpl<T> implements Storege<T>{
    private T[] array;

    public Storegeimpl(int capacity){
        this.array = (T[]) (new Object[capacity]);
    }

    @Override
    public void add(T item, int index){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

}
