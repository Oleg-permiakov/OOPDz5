package model;

public class Student extends User{
    protected int idStudent;

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public Student(String firstName, String secondName, String lastName, int idStudent) {
        super(firstName, secondName, lastName);
        this.idStudent = idStudent;
        
    }

    @Override
    public String toString() {
        return "Student {idStudent=" + idStudent + super.toString() + "}";
    }
    
}
