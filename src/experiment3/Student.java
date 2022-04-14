package experiment3;

public class Student {
    String studentNumber;
    String studentName;
    String specialty;
    double tuition;

    public Student(String studentNumber, String studentName, String specialty) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.specialty = specialty;
    }

    public void setTuition(double tuition) {
        if (tuition >= 4500.0) {
            this.tuition = tuition;
        } else {
            System.out.println("学费不得低于4500元！");
        }
    }

    public double getTuition() {
        return tuition;
    }
}
