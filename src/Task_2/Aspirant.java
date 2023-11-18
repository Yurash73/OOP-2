package Task_2;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        int salary = (this.averageMark == 5) ? 2500 : 2200;
        return salary;
    }
}
