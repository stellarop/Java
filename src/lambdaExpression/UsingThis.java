package lambdaExpression;

// ���ٽ� ���� ��Ͽ��� Ŭ������ ����� �ʵ�� �޼��带 ���� ���� ���� ��� ����
// this Ű���� ���� ���� �ʿ�
// ���ٽĿ� this�� ���������� �����Ǵ� �͸� ��ü�� ������ �ƴ϶� ���ٽ��� ������ ��ü�� ����
// this ���
public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;


        void method(){
            MyFunctionlInterface fi = ()->{

                System.out.println("outterField : " + outterField);
                // �ٱ� ��ü�� ������ ��� ���ؼ��� Ŭ������.this�� ���
                System.out.println("outterField : " + UsingThis.this.outterField + "\n");

                System.out.println("innerField : " + innerField);
                // ���ٽ� ���ο��� this�� inner ��ü�� ����
                System.out.println("innerField : " + this.innerField);
            };
            fi.medhod();
        }
    }


}
