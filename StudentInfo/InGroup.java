package StudentInfo;

public class InGroup {
    private Group group;
    private Student student;
    
    public InGroup(Student student,Group group) {
        this.group = group;
        this.student = student;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student - " + student + " in group = " + group;
    }

    
    
}
