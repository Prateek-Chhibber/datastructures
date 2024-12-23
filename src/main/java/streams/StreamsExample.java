package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        //    Student name and there activities in a map
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentgpaPredicate = (student -> student.getGpa()>=3.9);

        Map<String, List> studentMap = StudentDataBase.getAllStudents().parallelStream()
                .peek((student) -> {
                    System.out.println(student);
                })
                .filter(studentPredicate)
                .filter(studentgpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);
    }

}
