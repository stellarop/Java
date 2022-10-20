package collection;

// hashCode() 와 equals() 메서드 재정의
public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    // name, age 값이 같으면 true 리턴
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            return member.name.equals(name) &&(member.age == age);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        // name age 값이 같으면 동일한 hashCode 리턴
        return name.hashCode() + age;
    }
}
