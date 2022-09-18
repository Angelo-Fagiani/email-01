package it.develhope.email01.student;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1","Angelo","Fagiani","angelofag3095@gmail.com"),
            new Student("2","Dario","Bianchi","dario@gmail.com"),
            new Student("3","Lucia","Verdi","lucia@gmail.com"),
            new Student("4","Luca","Rossi","luca@gmail.com")
    );

    public Student getStudentById(String studentId){
        Optional<Student> studentFromDB = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        if (studentFromDB.isPresent()) return studentFromDB.get();
    return null;
    }
}
