package generic;

// 제네릭 타입 사용 클래스
public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        // ChildProduct 클래스 객체 생성 후 제네릭 타입 지정<T, M C> tv 클래스, 모델명, 회사명
        ChildProduct<TV, String, String> product = new ChildProduct<>();
        // 제품 클래스 추가
        product.setKind(new TV());
        // 모델명 추가
        product.setModel("SmartTV");
        // 회사명 추가
        product.setCompany("Samsung");

        // Storege 인터페이스에 impl 클래스 객체 대입(제네릭 타입으로 TV 클래스 지정)
        Storege<TV> storege = new Storegeimpl<TV>(100);
        // add 메서드에 TV 객체, 인덱스
        storege.add(new TV(), 0);
        // tv 객체에 0 인덱스
        TV tv = storege.get(0);

        System.out.println("제품 클래스 : " + product.getKind());
        System.out.println("제품 모델명 : " + product.getModel());
        System.out.println("제품 회사명 : " + product.getCompany());



    }

}
