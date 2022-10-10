package generic;

// 제네릭 클래스
// 부모 제네릭 클래스
public class Product<T,M> {
    private T kind;
    private M model;

    public T getKind(){return kind;}
    public M getModel(){return model;}

    public void setKind(T kind) {
        this.kind = kind;}
    public void setModel(M model){
        this.model = model;
    }

}

class TV{}
