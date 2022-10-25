package collection;

// Comparable ���� class
public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o){

        // ���� ���̺��� ���� �� -1
        if(age<o.age){
            return -1;
            // ���� ���̶� ���� �� 0
        }else if(age == o.age){
            return 0;
        }else{
            // ���� ���̰� ������ 1
            return 1;
        }

    }
}
