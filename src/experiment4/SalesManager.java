package experiment4;

public class SalesManager extends Employee {
    public SalesManager(String name, double salesAmount) {
        super(name, 5000, 0.01, salesAmount);
        this.setPosition("Sales Manager");
    }
}
