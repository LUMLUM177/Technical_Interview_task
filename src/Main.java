import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Student ivanov = new Student("Ivanov", 20);
        Student ivanov2 = new Student("Ivanov", 20);
        Set<Student> students = new HashSet();
        students.add(ivanov);
        students.add(ivanov2);
        System.out.println(students);

    }
}