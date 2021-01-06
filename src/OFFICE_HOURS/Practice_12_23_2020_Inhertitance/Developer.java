package OFFICE_HOURS.Practice_12_23_2020_Inhertitance;

public class Developer extends Employee {


    public Developer(String name, String ID, String jobTitle, char gender, int age, boolean isFullTime) {
        super(name, ID, jobTitle, gender, age, isFullTime);
    }

    public void fixingBug() {
        System.out.println(jobTitle + " " + name + " is fixing bug");
    }
}