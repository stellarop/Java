package collection;

// Comparable 구현 class
public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o){

        // 기존 나이보다 많을 시 -1
        if(age<o.age){
            return -1;
            // 기존 나이랑 같을 시 0
        }else if(age == o.age){
            return 0;
        }else{
            // 기존 나이가 많을시 1
            return 1;
        }

    }
}
