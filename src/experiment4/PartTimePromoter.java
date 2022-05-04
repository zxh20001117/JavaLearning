package experiment4;

public class PartTimePromoter extends Employee{
    private double hourlyPay = 50;
    private int hoursWorked;
    public PartTimePromoter(String name, int hoursWorked) {
        super(name, 0, 0, 0);
        this.setPosition("Part Time Promoter");
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary() {
        return hoursWorked* hourlyPay;
    }
}
