package lambdaExpression;

// ���ٽ��� �͸� �Լ��� �����ϱ� ���� ��
// ���ٽ��� ����ϴ� ����?
// => �ڹ� �ڵ尡 ���������� �÷����� ��Ҹ� ���͸��ϰų� �����ؼ� ���ϴ� ����� ���� ����
// ���ٽ��� ���´� �Ķ���͸� ���� �ڵ� ��������� ��Ÿ�� �� �͸� ���� ��ü�� ����
// ���ٽ�
public class MyFunctionlInterfaceExample {
    public static void main(String[] args) {

        // �������̽� ���� ���� (���ٽ��� �������̽� ������ ���Ե�)
        MyFunctionlInterface fi;


        /*
        // �Ķ���Ͱ� ���� ���ٽ�
        fi = () ->{
            String str = "method1 call";
            System.out.println(str);
        };
        fi.medhod();

        fi = () ->{
            System.out.println("method2 call");
        };
        fi.medhod();

        // ���๮�� �ϳ���� �߰�ȣ{}�� ���� ����
        fi = () -> System.out.println("method3 call");
        fi.medhod();
         */

        /*
        // �Ķ���Ͱ� �����ϴ� ���ٽ�
        fi = (x) ->{
            int sum = x * 5;
            System.out.println(sum);
        };
        fi.medhod(2);

        fi = (x) ->{
            System.out.println(x*5);
        };
        fi.medhod(2);

        // �Ķ���Ͱ� �ϳ��� �� ��ȣ() ���� ����
        fi = x ->{
            System.out.println(x*5);
        };
        fi.medhod(2);
        */

        /*
        // ���ϰ��� �ִ� ���ٽ�
        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        int sum = fi.medhod(2, 5);
        System.out.println(sum);

        fi = (x, y) ->{
            return x + y;
        };
        System.out.println(fi.medhod(2,5));

        // return���� ���� ��� �߰�ȣ{}�� return�� ���� ����
        fi = (x, y) -> x + y;
        System.out.println(fi.medhod(2,5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.medhod(2 ,5));

    }
    public static int sum(int x, int y){
        return (x + y);

         */
    }

}


