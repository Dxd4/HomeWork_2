package HomeWork;

public class Aspirant extends Student{
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        return averageMark == 5 ? 20000 : 18000;
    }
}
