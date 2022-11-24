package listTask;

public class Students {
    private final String studentName;
    private final int studentAge;
    private final int studentGroup;

    public Students(String studentName, int studentAge, int studentGroup) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGroup = studentGroup;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public int getStudentGroup() {
        return studentGroup;
    }
}
