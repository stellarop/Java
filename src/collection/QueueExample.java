package collection;

import java.util.LinkedList;
import java.util.Queue;

// Queue
// 선입선출 구조로 먼저 넣은 객체가 먼저 빠져나가는 자료구조.
public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();
        messageQueue.offer(new Message("sendMail", "김세연"));
        messageQueue.offer(new Message("sendSMS", "이연재"));
        messageQueue.offer(new Message("sendKakaoTalk","백성현"));

        // 메시지 큐가 비었는지 확인
        while (!messageQueue.isEmpty()){
            // 메시지 큐에서 한 개의 메시지를 꺼낸다.
            Message message = messageQueue.poll();

            // 먼저 저장이 된 메시지 부터 차례대로 출력한다.
            switch (message.command){
                case "sendMail" :
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS" :
                    System.out.println(message.to + "님에게 SMS을 보냅니다.");
                    break;
                case "sendKakaoTalk" :
                    System.out.println(message.to + "님에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}
