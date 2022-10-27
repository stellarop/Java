package collection;

import java.util.LinkedList;
import java.util.Queue;

// Queue
// ���Լ��� ������ ���� ���� ��ü�� ���� ���������� �ڷᱸ��.
public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();
        messageQueue.offer(new Message("sendMail", "�輼��"));
        messageQueue.offer(new Message("sendSMS", "�̿���"));
        messageQueue.offer(new Message("sendKakaoTalk","�鼺��"));

        // �޽��� ť�� ������� Ȯ��
        while (!messageQueue.isEmpty()){
            // �޽��� ť���� �� ���� �޽����� ������.
            Message message = messageQueue.poll();

            // ���� ������ �� �޽��� ���� ���ʴ�� ����Ѵ�.
            switch (message.command){
                case "sendMail" :
                    System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
                    break;
                case "sendSMS" :
                    System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
                    break;
                case "sendKakaoTalk" :
                    System.out.println(message.to + "�Կ��� ī���� �����ϴ�.");
                    break;
            }
        }
    }
}
