package experiment4;

abstract public class Employee {
    private String name;
    private String position;
    private int basicSalary;
    private double bonusRate;
    private double saleAmount;

    public Employee(String name, int basicSalary, double bonusRate, double saleAmount) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusRate = bonusRate;
        this.saleAmount = saleAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public double getSalary() {
        return this.basicSalary + this.bonusRate * this.saleAmount;
    }
}
