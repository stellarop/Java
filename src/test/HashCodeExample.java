package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashCodeExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student(1, "�輼��"));
        set.add(new Student(2, "�̿���"));
        set.add(new Student(1, "�鼺��"));

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.studentNum + " : " + student.name);
        }
    }
}
