package com.amigoscode.tutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) throws Exception {
        if (studentRepository.findStudentByEmail(student.getEmail()).isPresent()) {
            throw new Exception("Email is taken!");
        }
        studentRepository.save(student);
    }

    public Student getStudent(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    public void deleteStudent(Long studentId) throws Exception {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new Exception("A student with " + studentId + " does not exists!");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional // The entity goes into a manage state
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository.findById(studentId).get();
        student.setName(name);
        student.setEmail(email);
    }
}

