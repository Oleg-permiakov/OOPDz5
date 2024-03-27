package model;

import java.util.ArrayList;
import java.util.List;

public class Educationalgroup extends User{
    
    private Teacher teacher;
    private List<Student> listStudents = new ArrayList<>();
    
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public Educationalgroup(String firstName, String secondName, String lastName, Teacher teacher,
            List<Student> listStudents) {
        super(firstName, secondName, lastName);
        this.teacher = teacher;
        this.listStudents = listStudents;
    }

 
    
}
    
        

