package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Student;

@Repository
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}