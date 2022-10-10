package generic;

// ���׸� Ÿ�� ��� Ŭ����
public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        // ChildProduct Ŭ���� ��ü ���� �� ���׸� Ÿ�� ����<T, M C> tv Ŭ����, �𵨸�, ȸ���
        ChildProduct<TV, String, String> product = new ChildProduct<>();
        // ��ǰ Ŭ���� �߰�
        product.setKind(new TV());
        // �𵨸� �߰�
        product.setModel("SmartTV");
        // ȸ��� �߰�
        product.setCompany("Samsung");

        // Storege �������̽��� impl Ŭ���� ��ü ����(���׸� Ÿ������ TV Ŭ���� ����)
        Storege<TV> storege = new Storegeimpl<TV>(100);
        // add �޼��忡 TV ��ü, �ε���
        storege.add(new TV(), 0);
        // tv ��ü�� 0 �ε���
        TV tv = storege.get(0);

        System.out.println("��ǰ Ŭ���� : " + product.getKind());
        System.out.println("��ǰ �𵨸� : " + product.getModel());
        System.out.println("��ǰ ȸ��� : " + product.getCompany());



    }

}
