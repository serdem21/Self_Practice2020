package OFFICE_HOURS.Practice_12_23_2020_Inhertitance;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, String ID, String jobTitle, char gender, int age, boolean isFullTime) {
        super(name, ID, jobTitle, gender, age, isFullTime);
    }

    public void talkToClients(){
        System.out.println(jobTitle+" "+name+" is talking to the clients");
    }


}



