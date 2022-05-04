package experiment4;

public class FullTimeSales extends Employee{
    public FullTimeSales(String name, double saleAmount) {
        super(name, 3000, 0.05, saleAmount);
        this.setPosition("Full Time Sales");
    }
}
