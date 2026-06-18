package trenningjava;

public class Manager extends Employee {
    private double commission;

    public Manager(double salary, double commission) {
        super(salary);
        this.commission = commission;
    }

    public double getSalary() {
        return super.getSalary() + commission;
    }
}