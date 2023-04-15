package StudentInfo;

public class Student {
    String id_student;
    String fullname;

    public Student(String id_student, String fullname) {
        this.id_student = id_student;
        this.fullname = fullname;
    }

    public String getId_student() {
        return id_student;
    }

    public String getFullname() {
        return fullname;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Student "+ fullname +"["+ id_student +"]";
    }

    

    




    
    
}
