package collection;

// 큐를 이용한 메시지 클래스
public class Message {
    public String command;
    public String to;

    public Message(String command, String to){
        this.command = command;
        this.to = to;
    }
}
