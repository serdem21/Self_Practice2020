package OFFICE_HOURS.Practice_12_23_2020_Inhertitance;

public class Tester extends Employee {

    public final static boolean isCool;

    static {
        isCool = true;
    }

    public Tester(String name, String jobTitle, String ID, char gender, double salary, boolean isFullTime) {
        super(name, jobTitle, ID, gender, salary, isFullTime);
    }

    public void foundBug() {
        System.out.println(jobTitle + " " + name + " found a bug");
    }
}