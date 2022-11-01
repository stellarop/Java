package stream;

// StreamPipelinesExample 클래스 사용을 위한 Member 클래스
public class Member {
    public static int men = 0;
    public static int women = 1;

    private String name;
    private int sex;
    private int age;

    public Member(String name, int sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
