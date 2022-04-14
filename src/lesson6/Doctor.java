package lesson6;

public class Doctor extends Person {
    private String speciality;
    private double salary;

    public Doctor(String name,  String speciality, double salary) {
        super(name);
        this.speciality = speciality;
        this.salary = salary;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + this.getName() + '\'' +
                ", speciality='" + speciality + '\'' +
                ", salary=" + salary +
                '}';
    }
}
