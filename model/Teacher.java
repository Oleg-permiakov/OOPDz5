package model;

public class Teacher extends User {
    private int idTeacher;

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Teacher(String firstName, String secondName, String lastName, int idTeacher) {
        super(firstName, secondName, lastName);
        this.idTeacher = idTeacher;
        
    }

    @Override
    public String toString() {
        return "Teacher {idTeacher=" + idTeacher + super.toString() + "}";
    }
    
}
