package collection;

// key 로 삭제할 객체 - hashCode() 와 equals() 재정의

// HashMapExample2 에서 사용하는 class
public class Student {
    // 학번
    public int sno;
    // 이름
    public String name;

    // 생성자
    public Student(int sno, String name){
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object obj){

        if(obj instanceof Student){
            // student obj 비교
            Student student = (Student) obj;
            // Student class 에 있는 값과 map 안에 있는 값이 같다면! 값 반환
            return (sno == student.sno) && (name.equals(student.name));
        }else{
            // 아니면 false
            return false;
        }
    }

    public int hashCode(){
        return sno + name.hashCode();
    }
}
