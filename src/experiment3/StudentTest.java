package experiment3;

import lesson3.Person;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("0121903490209","ZXH","IMIS");
        student.setTuition(4000);
        System.out.println("现在该学生学费为 "+student.getTuition());
        student.setTuition(6000);
        System.out.println("现在该学生学费为 "+student.getTuition());
    }
}