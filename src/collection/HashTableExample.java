package collection;

// HashTable �� HashMap �� ������ ���� ������ ������ �ִ�.
// HashTable �� Ű�� ����� ��ü�� hashCode() �� equals() �޼��带
// �������ؼ� ���� ��ü�� �� ������ ���ؾ� �Ѵ�.
// HashMap �� �������� HashTable �� ����ȭ�� �޼���� �����Ǿ� �ֱ� ������
// ��Ƽ �����尡 ���ÿ� �� �޼��带 ������ �� ���� �ϳ��� �����尡 ������ �Ϸ��ؾ߸�
// �ٸ� �����带 ������ �� �ִ�.
// �׷��� ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ������ �� �ִ� �̰��� �����尡 �����ϴ� ��� ���Ѵ�.

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// ���̵�, �н����� �˻�
public class HashTableExample {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<String,String>();

        // ���̵�, �н����� ����
        map.put("leeyeonjae", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("���̵�� �н����带 �Է����ּ���.");

            System.out.println("���̵� : ");
            // ���̵� �Է� ����
            String id = scanner.nextLine();

            System.out.println("�н����� : ");
            // �н����� �Է� ����
            String pwd = scanner.nextLine();
            System.out.println();

            // id�� key �� �ִ��� Ȯ��
            if (map.containsKey(id)){
                // �Է��� id�� password �� equals
                if (map.get(id).equals(pwd)){
                    // id, pwd �� �� ������ ���� ó��
                    System.out.println("�α��� ����");
                    break;
                }else{
                    System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
                }
            }else{
                System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
            }

        }
    }
}
