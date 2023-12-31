package methodreferences;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * Class::MethodName
     */
    static Consumer<Student> c1 = System.out::println;

    /**
     * Class::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("************");
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
