package com.example.main.service;

import java.util.List;

import com.example.main.entities.Student;

public interface StudentService 
{
    public boolean addStudentDetails(Student std);
    
    public List<Student> getAllStdDetails();
    public Student getStdDetail(long id);

    public boolean updateStdDetail(long id , float marks);
    
    public boolean deleteStdDetail(long id);


}

