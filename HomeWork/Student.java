package HomeWork;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    public double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    int getScholarship() {
        return averageMark == 5 ? 10000 : 8000;
    }
}