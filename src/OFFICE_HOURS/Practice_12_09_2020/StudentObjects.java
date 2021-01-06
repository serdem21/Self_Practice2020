package OFFICE_HOURS.Practice_12_09_2020;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
       student1.setInfo("Sinan",39,'M');
    //    student1.schoolName = "Vefa Poyraz";   it s not prefer
       CybertekStudent.schoolName = "Vefa Poyraz"; // static from class



       CybertekStudent  student2 = new CybertekStudent();
       student2.setInfo("tayfun",28,'M');
        CybertekStudent.schoolName = "Lindenwood UNV"; // static from class

        System.out.println(student1);
        System.out.println(student2);


    }
}
